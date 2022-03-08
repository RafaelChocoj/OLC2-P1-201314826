parser grammar RustPar;



options {
  tokenVocab = RustLex;
}

@header {
    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
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
;

printconsola returns [interfaces.Instruction instr]
    : PRINT_CON PARIZQ expression PARDER {$instr = instruction.NewImprimir($expression.p)}
;

declaracion returns [interfaces.Instruction instr]
    : LET isMut=is_mut id=ID ':' tipos_var asig ='=' expression {
                        $instr = instruction.NewDeclaration($id.text, $tipos_var.tipo, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                      }
    | LET isMut=is_mut id=ID asig ='=' expression {
                      $instr = instruction.NewDeclaration($id.text, interfaces.NULL, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                    }
;

is_mut returns [bool mut]
   : MUT { $mut = true }
   |
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

list_elseif returns [*arrayList.List lista]
@init{ $lista = arrayList.New()}
: list += else_if+ {
                    listInt := localctx.(*List_elseifContext).GetList()
                    for _, e := range listInt {
                        $lista.Add(e.GetInstr())
                    }
                    }
;

else_if returns [interfaces.Instruction instr]
    : ELSE IF expression bloque_inst  {$instr = instruction.NewIf($expression.p,$bloque_inst.l,nil,nil, $ELSE.line, localctx.(*Else_ifContext).Get_ELSE().GetColumn() )}
;

bloque_inst returns [ *arrayList.List  l]
    : LLAVEIZQ instrucciones LLAVEDER   {$l = $instrucciones.l }
    | LLAVEIZQ LLAVEDER   {$l = arrayList.New()}
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

    | primitivo {$p = $primitivo.p}
    | PARIZQ expression PARDER {$p = $expression.p}
    | casteo {$p = $casteo.p} 
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