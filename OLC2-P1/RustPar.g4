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
  /*| declaracion ';' {$instr = $declaracion.instr}
  | if_instr {$instr = $if_instr.instr}*/
;

printconsola returns [interfaces.Instruction instr]
    : PRINT_CON PARIZQ expression PARDER {$instr = instruction.NewImprimir($expression.p)}
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
    //| opIz = expr_arit op=('*'|'/'|'%') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())} 
    | T_NUMBER DOSPUNTO op=POW PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | T_FLOAT DOSPUNTO op=POWF PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op=('*'|'/'|'%') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    //| opIz = expr_arit op= '%' opDe = expr_arit     {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    
    | opIz = expr_arit op=('<'|'<='|'>='|'>'|'=='|'!=') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())} 
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

    /*| ID { 
      $p = expresion.NewCallVariable($ID.text)}*/
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