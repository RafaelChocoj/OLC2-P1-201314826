parser grammar RustPar;



options {
  tokenVocab = RustLex;
}

@header {
    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
    import "OLC2/instructionExpre"
    import arrayList "github.com/colegno/arraylist"
}

start returns [*arrayList.List lista]
  : instrucciones {$lista = $instrucciones.l}
;

instrucciones returns [*arrayList.List l]
  @init{
    $l =  arrayList.New()
  }
  : e +=instruccion*  {
      listInt := localctx.(*InstruccionesContext).GetE()
      		for _, e := range listInt {
            $l.Add(e.GetInstr())
          }
          //fmt.Printf("tipo %T",localctx.(*InstruccionesContext).GetE())
    }
;

instruccion returns [interfaces.Instruction instr]
  : printconsola ';' {$instr = $printconsola.instr}
  | declaracion ';' {$instr = $declaracion.instr}
  | asignacion ';' {$instr = $asignacion.instr}
  | if_sent  {$instr = $if_sent.instr}
  | match_sent {$instr = $match_sent.instr}
;

instruccion_only returns [interfaces.Instruction instr]
  : printconsola /*';'*/ {$instr = $printconsola.instr}
  | declaracion /*';'*/ {$instr = $declaracion.instr}
  | asignacion /*';'*/ {$instr = $asignacion.instr}
  | if_sent  {$instr = $if_sent.instr}
  | match_sent {$instr = $match_sent.instr}
;

printconsola returns [interfaces.Instruction instr]
    : PRINT_CON PARIZQ listParams PARDER {$instr = instruction.NewImprimir($listParams.l_e, $PRINT_CON.line, localctx.(*PrintconsolaContext).Get_PRINT_CON().GetColumn() )}
    //: PRINT_CON PARIZQ expression PARDER {$instr = instruction.NewImprimir($expression.p)}
;

listParams returns [*arrayList.List l_e]
@init{
    $l_e = arrayList.New()
}
    : list = listParams ',' expression   {
                                    $list.l_e.Add($expression.p)
                                    $l_e = $list.l_e
                                }
    | expression {$l_e.Add($expression.p)}
;

declaracion returns [interfaces.Instruction instr]
    : LET isMut=is_mut id=ID ':' tipos_var asig ='=' expression {
                        $instr = instruction.NewDeclaration($id.text, $tipos_var.tipo, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                      }
    | LET isMut=is_mut id=ID asig ='=' expression {
                      $instr = instruction.NewDeclaration($id.text, interfaces.NULL, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                    }
    /*arrays*/
    | LET isMut=is_mut id=ID ':' array_type asig ='=' expression {
                      $instr = instruction.NewArrayDeclaration($id.text, $array_type.ty, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                    }
;

is_mut returns [bool mut]
   : MUT { $mut = true }
   |
;

array_type returns [*arrayList.List ty]
@init{
    $ty = arrayList.New()
}
: CORIZQ array_type ';' expression ']' {
                                        nType := interfaces.NewArrayType(interfaces.ARRAY, $expression.p, $CORIZQ.line, $CORIZQ.pos )
                                        $array_type.ty.Add(nType)
                                        $ty = $array_type.ty
                                    }
| CORIZQ tipos_var ';' expression ']'  {
                                      nType := interfaces.NewArrayType($tipos_var.tipo, $expression.p, $CORIZQ.line, $CORIZQ.pos )
                                      $ty.Add(nType)
                                    }
;

asignacion returns [interfaces.Instruction instr]
    : id=ID '=' expression {$instr = instruction.NewAssignment($id.text,$expression.p, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}
;

//  IF
if_sent  returns [interfaces.Instruction instr]
    : IF expression bloque_inst  {$instr = instruction.NewIf($expression.p, $bloque_inst.l, nil,nil, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst ELSE  belse = bloque_inst   {$instr = instruction.NewIf($expression.p,$bprin.l,nil,$belse.l, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst list_elseif ELSE  belse = bloque_inst {
        $instr = instruction.NewIf($expression.p,$bprin.l,$list_elseif.lista, $belse.l, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )
    }
;

//  IF as EXPRESION
if_exp returns [interfaces.Expresion p]
    : IF expression bprin_e = bloque_exp ELSE  belse_e = bloque_exp {$p = instruction.NewIfExpre($expression.p, nil ,nil, nil, $IF.line, localctx.(*If_expContext).Get_IF().GetColumn(), true, $bprin_e.p, nil, $belse_e.p )}
    | IF expression bprin_e = bloque_exp list_elseif_exp ELSE  belse_e = bloque_exp {
        $p = instruction.NewIfExpre($expression.p,nil,nil, nil, $IF.line, localctx.(*If_expContext).Get_IF().GetColumn(), true, $bprin_e.p, $list_elseif_exp.lista,  $belse_e.p )
    }
;

list_elseif returns [*arrayList.List lista]
@init{ $lista = arrayList.New()}
: list += else_if+ {
                    listInt := localctx.(*List_elseifContext).GetList()
                    for _, e := range listInt {
                        $lista.Add(e.GetInstr())
                    }
                    }
;

list_elseif_exp returns [*arrayList.List lista]
@init{ $lista = arrayList.New()}
: list += else_if_exp+ {
                    listInt := localctx.(*List_elseif_expContext).GetList()
                    for _, e := range listInt {
                        $lista.Add(e.GetP())
                    }
                    }
;

else_if returns [interfaces.Instruction instr]
    : ELSE IF expression bloque_inst  {$instr = instruction.NewIf($expression.p,$bloque_inst.l,nil,nil, $ELSE.line, localctx.(*Else_ifContext).Get_ELSE().GetColumn() )}
;

else_if_exp returns [interfaces.Expresion p]
    : ELSE IF expression bloque_exp  {$p = instruction.NewIfExpre($expression.p,nil,nil,nil, $ELSE.line, localctx.(*Else_if_expContext).Get_ELSE().GetColumn(), true, $bloque_exp.p, nil, nil )}
;

/*if_sent  returns [interfaces.Instruction instr]
    : IF expression bloque_inst  {$instr = instruction.NewIf($expression.p, $bloque_inst.l, nil,nil, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst ELSE  belse = bloque_inst   {$instr = instruction.NewIf($expression.p,$bprin.l,nil,$belse.l, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst list_elseif ELSE  belse = bloque_inst {
        $instr = instruction.NewIf($expression.p,$bprin.l,$list_elseif.lista, $belse.l, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )
    }
; */
//  MATCH
match_sent  returns [interfaces.Instruction instr]
    : MATCH expression LLAVEIZQ brazos = match_brazos LLAVEDER {
                        $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, nil, nil, $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
      }
    | MATCH expression LLAVEIZQ brazos = match_brazos '_' th='=>' bloque_inst ',' LLAVEDER {
                          $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, $bloque_inst.l, nil, $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
      }
    | MATCH expression LLAVEIZQ brazos = match_brazos '_' th='=>' instruccion_only ',' LLAVEDER {
                          $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, nil,  $instruccion_only.instr,  $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
      }

;

match_brazos returns [*arrayList.List l_brazos]
@init{
    $l_brazos = arrayList.New()
}
    : listb = match_brazos matchbrazo   {
                                    $listb.l_brazos.Add($matchbrazo.brazo)
                                    $l_brazos = $listb.l_brazos
                                }
    | matchbrazo {$l_brazos.Add($matchbrazo.brazo)}
;

matchbrazo returns [instructionExpre.BrazoMatch brazo]
    : listaOpciones th='=>' bloque_inst ',' { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, $bloque_inst.l, nil, $th.line, localctx.(*MatchbrazoContext).GetTh().GetColumn() ) }
    | listaOpciones th='=>' instruccion_only ',' { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, nil,  $instruccion_only.instr, $th.line, localctx.(*MatchbrazoContext).GetTh().GetColumn() ) }
    
    //: listaOpciones '=>' ((bloque_inst | instruccion) ',')? { $instr = expresion.NewArray($listaOpciones.lisop, $bloque_inst.l ) }
    //| listaOpciones '=>' (expression ',')? { $instr = expresion.NewArray($listaOpciones.lisop, $expression.p) }
;

listaOpciones returns [*arrayList.List lisop]
@init{
    $lisop = arrayList.New()
}
    : list = listaOpciones '|' primitivo  {
                                            $list.lisop.Add( $primitivo.p )
                                            $lisop =  $list.lisop
                                          }
    | primitivo   {
                    $lisop.Add( $primitivo.p )
                  }
;

bloque_inst returns [ *arrayList.List  l]
    : LLAVEIZQ instrucciones LLAVEDER   {$l = $instrucciones.l }
    | LLAVEIZQ LLAVEDER   {$l = arrayList.New()}
;

bloque_exp returns [interfaces.Expresion p]
    : LLAVEIZQ expression LLAVEDER   {$p = $expression.p}
;



tipos_var returns[interfaces.TipoExpresion tipo]
    : T_NUMBER {$tipo = interfaces.INTEGER}
    | T_STRING  {$tipo = interfaces.STRING}
    | T_FLOAT {$tipo = interfaces.FLOAT}
    | T_BOOL  {$tipo = interfaces.BOOLEAN}
    | T_STR {$tipo = interfaces.STR}
    //| VOIDTYPE  {$tipo = interfaces.VOID}
;

/*instruccion returns [interfaces.Instruction instr]
  : CONSOLE '.' LOG PARIZQ expression PARDER ';' {$instr = instruction.NewImprimir($expression.p)}
  | P_NUMBER id=ID '=' expression ';'{$instr = instruction.NewDeclaration($id.text,interfaces.INTEGER,$expression.p)}
  | P_IF PARIZQ expression PARDER LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewIf($expression.p, $instrucciones.l)}
  | P_WHILE PARIZQ expression PARDER LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewWhile($expression.p, $instrucciones.l)}
  
;*/

expression returns[interfaces.Expresion p]
    : expr_arit    {$p = $expr_arit.p}
    //| if_exp {$p = $if_exp.p}
;

expr_arit returns[interfaces.Expresion p]
    : op='-' opU = expr_arit {$p = expresion.NewOperacion($opU.p,"-",nil,true, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    //pow
    | T_NUMBER DOSPUNTO op=POW PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | T_FLOAT DOSPUNTO op=POWF PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op=('*'|'/'|'%') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    //| opIz = expr_arit op= '%' opDe = expr_arit     {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}

    | opIz = expr_arit op=('<'|'<='|'>'|'>='|'=='|'!=') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())} 
    
    /*Relacional NOT*/
    | op='!' opU = expr_arit {$p = expresion.NewOperacion($opU.p,"!",nil,true, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    /* Relacional AND | OR*/
    | opIz = expr_arit op='&&' opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op='||' opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    /*array*/
    | CORIZQ listParams CORDER { $p = expresion.NewArray($listParams.l_e, $CORIZQ.line, $CORIZQ.pos ) }
    | primitivo {$p = $primitivo.p}
    | PARIZQ expression PARDER {$p = $expression.p}
    | casteo {$p = $casteo.p} 
    | if_exp {$p = $if_exp.p}
    //| match_sent {$p = $match_sent.instr.(interfaces.Expresion)}
;

/*casteo returns[interfaces.Expresion p]
  : PARIZQ expression AS Tipo_cast PARDER {$p = expresion.NewCasteo($expression.p, interfaces.FLOAT)}
;*/

casteo returns[interfaces.Expresion p]
  : PARIZQ expression AS typec = tipo_cast PARDER {$p = expresion.NewCasteo($expression.p, $typec.tc, $PARIZQ.line, localctx.(*CasteoContext).Get_PARIZQ().GetColumn() )}
;

tipo_cast returns[interfaces.TipoExpresion tc]
  : T_FLOAT {$tc = interfaces.FLOAT}
  | T_NUMBER {$tc = interfaces.INTEGER} 
;



/*expr_arit returns[interfaces.Expresion p]
    : opIz = expr_arit op=('*'|'/') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}     
    | opIz = expr_arit op=('<'|'<='|'>='|'>') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}     
    | primitivo {$p = $primitivo.p} 
    | PARIZQ expression PARDER {$p = $expression.p}
;*/
primitivo returns[interfaces.Expresion p]
    :NUMBER {
            	num,err := strconv.Atoi($NUMBER.text)
                if err!= nil{
                    fmt.Println(err)
                }
            $p = expresion.NewPrimitivo(num,interfaces.INTEGER, $NUMBER.line, localctx.(*PrimitivoContext).Get_NUMBER().GetColumn())
      } 
    | FLOAT {
              num,err := strconv.ParseFloat($FLOAT.text,64)
              if err!= nil{
                  fmt.Println(err)
              }
              $p = expresion.NewPrimitivo (num,interfaces.FLOAT, $FLOAT.line, localctx.(*PrimitivoContext).Get_FLOAT().GetColumn())
      }

    | strings {$p = $strings.p} 

    | ID { 
      $p = expresion.NewIdentificador($ID.text, $ID.line, localctx.(*PrimitivoContext).Get_ID().GetColumn() )}

    | TRUE  { $p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, $TRUE.line, localctx.(*PrimitivoContext).Get_TRUE().GetColumn())}
    | FALSE { $p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, $FALSE.line, localctx.(*PrimitivoContext).Get_FALSE().GetColumn())}
;


strings returns[interfaces.Expresion p]
    : AMP+ STRING (TO_STRING|TO_OWNED)? { 
      str:= $STRING.text[1:len($STRING.text)-1]
      $p = expresion.NewPrimitivo(str,interfaces.STR, $STRING.line, localctx.(*StringsContext).Get_STRING().GetColumn())}
    
    | STRING (TO_STRING|TO_OWNED) { 
      str:= $STRING.text[1:len($STRING.text)-1]
      $p = expresion.NewPrimitivo(str,interfaces.STRING, $STRING.line, localctx.(*StringsContext).Get_STRING().GetColumn())}

    | STRING { 
      str:= $STRING.text[1:len($STRING.text)-1]
      $p = expresion.NewPrimitivo(str,interfaces.STR, $STRING.line, localctx.(*StringsContext).Get_STRING().GetColumn())}
    
;