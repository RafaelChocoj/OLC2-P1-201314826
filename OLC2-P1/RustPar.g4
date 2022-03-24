parser grammar RustPar;



options {
  tokenVocab = RustLex;
}

@header {
    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
    import "OLC2/instructionExpre"
    import "OLC2/modules"
    import arrayList "github.com/colegno/arraylist"
}

/*original*/
/*start returns [*arrayList.List lista]
  : instrucciones {$lista = $instrucciones.l}
;*/

/*start returns [*arrayList.List lista]
  : list_Funciones {$lista = $list_Funciones.lista}
;*/

start returns [*arrayList.List lista]
  : list_globals {$lista = $list_globals.lista}
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

/*list_Funciones returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : lisfun =  list_Funciones funcion  {
                                          $lisfun.lista.Add( $funcion.instr)
                                          $lista =  $lisfun.lista
                                        }
    | funcion     { $lista.Add( $funcion.instr ) }
;*/

/*list_Funciones returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : lisfun =  list_Funciones itemMod  {
                                          $lisfun.lista.Add( $itemMod.instr)
                                          $lista =  $lisfun.lista
                                        }
    | itemMod     { $lista.Add( $itemMod.instr ) }
;*/

list_globals returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : lisfun =  list_globals in_global  {
                                          $lisfun.lista.Add( $in_global.globals)
                                          $lista =  $lisfun.lista
                                        }
    | in_global     { $lista.Add( $in_global.globals ) }
;

in_global returns[ interfaces.Instruction globals ]
    : funcion   {$globals = $funcion.instr}
    | module    { $globals = $module.modu }
    | newStruct {$globals = $newStruct.str} 
;

module returns[ interfaces.Instruction modu ]
: MODULO ID LLAVEIZQ bodyModule_l LLAVEDER  { 
        $modu = modules.NewModule( $ID.text, $bodyModule_l.mod_list, $MODULO.line, $MODULO.pos ) 
    }
;

bodyModule_l returns[*arrayList.List mod_list]
    : l_mod=bodyModule_l t_access module    {
                                            newmod := modules.NewModuleCont($t_access.modAccess, interfaces.MOD, $module.modu)
                                            $l_mod.mod_list.Add(newmod)
                                            $mod_list = $l_mod.mod_list
                                        }
    | l_mod=bodyModule_l t_access itemMod    {
                                            newmod := modules.NewModuleCont($t_access.modAccess, interfaces.INS, $itemMod.instr)
                                            $l_mod.mod_list.Add(newmod)
                                            $mod_list = $l_mod.mod_list
                                        }

    | t_access module   {
                            $mod_list = arrayList.New()
                            newmod := modules.NewModuleCont($t_access.modAccess, interfaces.MOD, $module.modu)
                            $mod_list.Add(newmod)
                        }
    | t_access itemMod {
                            $mod_list = arrayList.New()
                            newmod := modules.NewModuleCont($t_access.modAccess, interfaces.INS, $itemMod.instr)
                            $mod_list.Add(newmod)
                        }
;

t_access returns [interfaces.TipoAccess  modAccess]
    : PUBLIC  { $modAccess = interfaces.PUBLIC}
    |         { $modAccess = interfaces.PRIVATE}
;

itemMod returns[interfaces.Instruction instr]
    : funcion       {$instr = $funcion.instr}
    | newStruct     {$instr = $newStruct.str} 
;


funcion   returns [ interfaces.Instruction  instr]
@init{ listParams :=  arrayList.New() }
    : fn_main             {$instr =  $fn_main.instr}
    | FN  ID '(' ')' '->' tipos_var bloque_inst    { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, $tipos_var.tipo, $ID.line, $ID.pos, "" )}
    | FN  ID '(' ')' '->' VECN '<' idob=ID '>' bloque_inst    { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos,  $idob.text )}
    | FN  ID '(' ')' '->' idob=ID bloque_inst    { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos,  $idob.text )}

    | FN  ID '(' ')' bloque_inst                   { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos, "" )}
    | FN  ID '(' params_declar ')' bloque_inst     { $instr = instructionExpre.NewFunction($ID.text,$params_declar.lista,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos, "" )}

    | FN  ID '('  params_declar ')' '->' tipos_var bloque_inst   { $instr = instructionExpre.NewFunction($ID.text,$params_declar.lista, $bloque_inst.l,$tipos_var.tipo, $ID.line, $ID.pos, "" )}
    | FN  id=ID '('  params_declar ')' '->' VECN '<' idob=ID '>' bloque_inst   { $instr = instructionExpre.NewFunction($id.text,$params_declar.lista, $bloque_inst.l, interfaces.VECTOR, $id.line, $id.pos, $idob.text  )}
    | FN  id=ID '('  params_declar ')' '->' VECN '<' tipos_var '>' bloque_inst   { $instr = instructionExpre.NewFunction($id.text,$params_declar.lista, $bloque_inst.l, interfaces.VECTOR, $id.line, $id.pos, ""  )}
    | FN  id=ID '('  params_declar ')' '->' idob=ID bloque_inst   { $instr = instructionExpre.NewFunction($id.text,$params_declar.lista, $bloque_inst.l, interfaces.VOID, $id.line, $id.pos, $idob.text  )}
;



/*params_declar returns [*arrayList.List lista]
@init{
$lista =  arrayList.New()
}
    : listdec = params_declar ','  isMut=is_mut ID ':' tipos_var    {
                                                            listaIdes := arrayList.New()
                                                            listaIdes.Add(expresion.NewIdentificador($ID.text, $ID.line, $ID.pos ))
                                                            decl := instruction.NewDeclaration($ID.text, $tipos_var.tipo, nil, $isMut.mut, $ID.line, $ID.pos )
                                                            $listdec.lista.Add( decl )
                                                            $lista =  $listdec.lista
                                                        }
    | isMut=is_mut ID ':' tipos_var  {
                            listaIdes := arrayList.New()
                            listaIdes.Add(expresion.NewIdentificador($ID.text, $ID.line, $ID.pos ))
                            decl := instruction.NewDeclaration($ID.text, $tipos_var.tipo, nil, $isMut.mut, $ID.line, $ID.pos )
                            $lista.Add( decl)
                        }
    
;*/
params_declar returns [*arrayList.List lista]
@init{
$lista =  arrayList.New()
}
    : listdec = params_declar ','  declar_parametros    {
                                                            $listdec.lista.Add($declar_parametros.in_dec)
                                                            $lista =  $listdec.lista }
    | declar_parametros {   $lista.Add($declar_parametros.in_dec) }
;

declar_parametros returns [interfaces.Instruction in_dec]
    : isMut=is_mut ID ':' tipos_var {
                        listaIdes := arrayList.New()
                        listaIdes.Add(expresion.NewIdentificador($ID.text, $ID.line, $ID.pos ))
                        decl := instruction.NewDeclaration($ID.text, $tipos_var.tipo, nil, $isMut.mut, $ID.line, $ID.pos )
                        $in_dec = decl
                    }
    /*arrays*/
    //| isMut=is_mut ID ':' '&''mut' array_type {
    | ID ':' AMP MUT array_type {
                        listaIdes := arrayList.New()
                        listaIdes.Add(expresion.NewIdentificador($ID.text, $ID.line, $ID.pos ))
                        decl := instruction.NewArrayDeclaration($ID.text, $array_type.ty, nil, true, $ID.line, $ID.pos )
                        $in_dec = decl
                    }
    | id=ID ':' is_ref VECN '<' idob=ID '>' {
                        //listaIdes := arrayList.New()
                        //listaIdes.Add(expresion.NewIdentificador($id.text, $id.line, $id.pos ))
                        decl := instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $is_ref.ref, $id.line, $id.pos, nil, $idob.text)
                        $in_dec = decl
                    }
    | id=ID ':' is_ref VECN '<' tipos_var '>' {
                        //listaIdes := arrayList.New()
                        //listaIdes.Add(expresion.NewIdentificador($id.text, $id.line, $id.pos ))
                        decl := instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, nil, $is_ref.ref, $id.line, $id.pos, nil, "")
                        $in_dec = decl
                    }
    | id=ID ':' is_ref idstruct=ID { 
                            decl := instruction.NewDeclaration($id.text, interfaces.STRUCT, nil, $is_ref.ref, $id.line, $id.pos)
                            $in_dec = decl
                        }

    | isMut=is_mut id=ID ':' VECN '<' idob=ID '>' {
                        decl := instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $isMut.mut, $id.line, $id.pos, nil, $idob.text)
                        $in_dec = decl
                    }
                        
    /*| isMut=is_mut id=ID ':' VECN '<' idob=ID '>' {
                        //listaIdes := arrayList.New()
                        //listaIdes.Add(expresion.NewIdentificador($id.text, $id.line, $id.pos ))
                        decl := instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $isMut.mut, $id.line, $id.pos, nil, $idob.text)
                        $in_dec = decl
                    }
    | isMut=is_mut id=ID ':' VECN '<' tipos_var '>' {
                        //listaIdes := arrayList.New()
                        //listaIdes.Add(expresion.NewIdentificador($id.text, $id.line, $id.pos ))
                        decl := instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, nil, $isMut.mut, $id.line, $id.pos, nil, "")
                        $in_dec = decl
                    }*/
;


//funciones
fn_main returns[interfaces.Instruction instr]
@init{ listParams:= arrayList.New() }
    : FN MAIN '(' ')' bloque_inst
    { $instr = instructionExpre.NewFunction("main",listParams,$bloque_inst.l, interfaces.VOID, $MAIN.line, $MAIN.pos, "" )}
;

instruccion returns [interfaces.Instruction instr]
  : printconsola ';' {$instr = $printconsola.instr}
  | declaracion ';' {$instr = $declaracion.instr}
  | asignacion ';' {$instr = $asignacion.instr}

  | pushVec ';' {$instr = $pushVec.instr}

  | if_sent  {$instr = $if_sent.instr}
  | match_sent {$instr = $match_sent.instr}

  | loopB { $instr = $loopB.lop }
  | lWhile { $instr = $lWhile.lwh }
  | lForin { $instr = $lForin.lfor }
  

  | lBreak ';' { $instr = $lBreak.br }
  | lContinue ';' { $instr = $lContinue.cn }
  
  | newStruct  {$instr = $newStruct.str} 
  
  | callFunction ';' {$instr = $callFunction.instr} 
  | returnFun ';' {$instr = $returnFun.instr} 
  | callModulo ';' {$instr = $callModulo.instr} 

  | ID '.' REMOVE '(' expression ')' ';' { $instr = instructionExpre.NewRemove($ID.text, $expression.p, $ID.line, $ID.pos) }

;

instruccion_only returns [interfaces.Instruction instr]
  : printconsola /*';'*/ {$instr = $printconsola.instr}
  | declaracion /*';'*/ {$instr = $declaracion.instr}
  | asignacion /*';'*/ {$instr = $asignacion.instr}

  | pushVec  {$instr = $pushVec.instr}

  | if_sent  {$instr = $if_sent.instr}
  | match_sent {$instr = $match_sent.instr}

  | loopB { $instr = $loopB.lop }
  | lWhile { $instr = $lWhile.lwh }
  | lForin { $instr = $lForin.lfor }

  | lBreak  { $instr = $lBreak.br }
  | lContinue  { $instr = $lContinue.cn }
  
  //| newStruct  {$instr = $newStruct.str} 

  | callFunction {$instr = $callFunction.instr} 
  | returnFun  {$instr = $returnFun.instr}
  | callModulo {$instr = $callModulo.instr}

  | ID '.' REMOVE '(' expression ')' { $instr = instructionExpre.NewRemove($ID.text, $expression.p, $ID.line, $ID.pos) }
;

/*vector funciones*/
pushVec returns [interfaces.Instruction instr]
    : ID '.' PUSH '('val=expression')' {$instr = instruction.NewPush($ID.text, $val.p, $ID.line, $ID.pos  )}
    | ID '.' INSERT '(' val1=expression ',' val2=expression ')' { $instr = instruction.NewInsert($ID.text, $val1.p, $val2.p, $ID.line, $ID.pos) }
;
newStruct returns[interfaces.Instruction str]
: STRUCT ID LLAVEIZQ listdecStruct LLAVEDER { $str = instructionExpre.NewStruct($ID.text, $listdecStruct.l, $STRUCT.line, $STRUCT.pos) }
;

listdecStruct returns[*arrayList.List l]
: list=listdecStruct COMA id=ID ':' tipos_var {
                                        Str_atrib := interfaces.NewStructType($id.text, $tipos_var.tipo, "")
                                        $list.l.Add(Str_atrib);
                                        $l = $list.l;
                                    }
| list=listdecStruct COMA id=ID ':' idstru=ID {
                                        Str_atrib := interfaces.NewStructType($id.text, interfaces.NULL, $idstru.text)
                                        $list.l.Add(Str_atrib);
                                        $l = $list.l;
                                    }

| id=ID ':' tipos_var {
                    Str_atrib := interfaces.NewStructType($id.text, $tipos_var.tipo, "")
                    $l = arrayList.New();
                    $l.Add(Str_atrib);
                }
| id=ID ':' idstru=ID {
                    Str_atrib := interfaces.NewStructType($id.text, interfaces.NULL, $idstru.text)
                    $l = arrayList.New();
                    $l.Add(Str_atrib);
                }
;

//llamada a funcion
callFunction returns [interfaces.Instruction instr, interfaces.Expresion p]
    : ID '(' ')'    {
                        $instr = instructionExpre.NewCallFunction($ID.text, arrayList.New(), $ID.line, $ID.pos )
                        $p = instructionExpre.NewCallFunction($ID.text, arrayList.New(), $ID.line, $ID.pos )
                    }
    | ID '(' listParamsCall ')' {
                        $instr = instructionExpre.NewCallFunction($ID.text, $listParamsCall.l_e, $ID.line, $ID.pos )
                        $p = instructionExpre.NewCallFunction($ID.text, $listParamsCall.l_e, $ID.line, $ID.pos )
                    }
;

//llamada a modulo
callModulo returns [interfaces.Instruction instr, interfaces.Expresion p]
    : listModulec expression {
        $p = instructionExpre.NewModuleAccess($listModulec.lm, $expression.p, $listModulec.start.GetLine(),$listModulec.start.GetColumn() )
        $instr = instructionExpre.NewModuleAccess($listModulec.lm, $expression.p, $listModulec.start.GetLine(),$listModulec.start.GetColumn() )
    }
;

listModulec returns [*arrayList.List lm]
@init{  $lm = arrayList.New()   }
    : list = listModulec ID '::'    {
                                $list.lm.Add($ID.text)
                                $lm = $list.lm
                            }
    | ID '::'   {
                    $lm.Add($ID.text)
                }
;

returnFun returns [interfaces.Instruction instr]
    : RETURN                { $instr = instructionExpre.NewReturn(nil, $RETURN.line, $RETURN.pos )}
    | RETURN  expression    { $instr = instructionExpre.NewReturn($expression.p, $RETURN.line, $RETURN.pos )}
;

printconsola returns [interfaces.Instruction instr]
    : PRINT_CON PARIZQ listParams PARDER {$instr = instruction.NewImprimir($listParams.l_e, $PRINT_CON.line, localctx.(*PrintconsolaContext).Get_PRINT_CON().GetColumn() )}
    //: PRINT_CON PARIZQ expression PARDER {$instr = instruction.NewImprimir($expression.p)}
;

loopB returns [interfaces.Instruction lop, interfaces.Expresion p]
: LOOP bloque_inst  { 
                        $lop = instructionExpre.NewLoop($bloque_inst.l, $LOOP.line, $LOOP.pos )
                        $p = instructionExpre.NewLoop($bloque_inst.l, $LOOP.line, $LOOP.pos ) 
                    }
;

lWhile returns[interfaces.Instruction lwh]
: WHILE expression bloque_inst { $lwh = instruction.NewWhile($expression.p, $bloque_inst.l, $WHILE.line, $WHILE.pos ) }
;


lForin returns[interfaces.Instruction lfor]
: FOR ID IN expression bloque_inst { $lfor = instruction.NewForIn($ID.text, $expression.p, $bloque_inst.l, $FOR.line, $FOR.pos) }
;

lBreak returns[interfaces.Instruction br]
: BREAK { $br = instructionExpre.NewBreak(nil, $BREAK.line, $BREAK.pos) }
| BREAK expression { $br = instructionExpre.NewBreak($expression.p, $BREAK.line, $BREAK.pos ) }
;

lContinue returns[interfaces.Instruction cn]
: CONTINUE { $cn = instructionExpre.NewContinue($CONTINUE.line, $CONTINUE.pos) }
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


listParamsCall returns [*arrayList.List l_e]
@init{
    $l_e = arrayList.New()
}
    : list = listParamsCall ',' is_ref expression   {
                                    ref := instructionExpre.NewParameterBy($expression.p, $is_ref.ref)
                                    $list.l_e.Add(ref)
                                    $l_e = $list.l_e
                                }
    | is_ref expression    {   ref := instructionExpre.NewParameterBy($expression.p, $is_ref.ref)
                        $l_e.Add(ref)
                    }
;

is_ref returns [bool ref]
   : AMP MUT { $ref = true }
   | { $ref = false }
;

declaracion returns [interfaces.Instruction instr]
    : LET isMut=is_mut id=ID ':' tipos_var asig ='=' expression {
                        $instr = instruction.NewDeclaration($id.text, $tipos_var.tipo, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                      }
    | LET isMut=is_mut id=ID letid asig ='=' expression { 
                      $instr = instruction.NewDeclaration($id.text, interfaces.NULL, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                    }
    /*arrays*/
    | LET isMut=is_mut id=ID ':' array_type asig ='=' expression {
                      $instr = instruction.NewArrayDeclaration($id.text, $array_type.ty, $expression.p, $isMut.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                    }
    /*vectores*/
    /*| LET isMut=is_mut id=ID ':' VECN '<' tipos_var '>' '=' VECN '::' NEW {
                        $instr = instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, nil, $isMut.mut, $VECN.line, $VECN.pos, nil, "")
                    }*/ // antes
    | LET isMut=is_mut id=ID ':' vector_types '=' VECN '::' NEW {
                        $instr = instruction.NewVectorDeclaration($id.text, $vector_types.tipo, nil, $isMut.mut, $VECN.line, $VECN.pos, nil, "")
                    }
    /*| LET isMut=is_mut id=ID ':' VECN '<' idob=ID '>' '=' VECN '::' NEW {
                        $instr = instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $isMut.mut, $VECN.line, $VECN.pos, nil, $idob.text)
                    }*/ // antes
    | LET isMut=is_mut id=ID ':' VECN '<' idob=ID '>' '=' VECN '::' NEW {
                        $instr = instruction.NewVectorDeclaration($id.text, interfaces.STRUCT, nil, $isMut.mut, $VECN.line, $VECN.pos, nil, $idob.text)
                    }
    | LET isMut=is_mut id=ID ':' VECN '<' tipos_var '>' '=' VECN '::' CAPACITY '('expression')' {
                        $instr = instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, $expression.p, $isMut.mut, $VECN.line, $VECN.pos, nil, "")
                    }
    | LET isMut=is_mut id=ID ':' VECN '<' idob=ID '>' '=' VECN '::' CAPACITY '('expression')' {
                        $instr = instruction.NewVectorDeclaration($id.text, interfaces.NULL, $expression.p, $isMut.mut, $VECN.line, $VECN.pos, nil, $idob.text)
                    }

    | LET isMut=is_mut id=ID ':' VECN '<' idob=ID '>' '=' expression {
                        $instr = instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $isMut.mut, $VECN.line, $VECN.pos, $expression.p, $idob.text)
                    }
    | LET isMut=is_mut id=ID ':' VECN '<' tipos_var '>' '=' expression {
                        $instr = instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, nil, $isMut.mut, $VECN.line, $VECN.pos, $expression.p, "")
                    }
;

is_mut returns [bool mut]
   : MUT { $mut = true }
   |
;

letid returns []
   : ':' ID
   |
;

vector_types returns [interfaces.TipoExpresion tipo]
    : VECN '<' vector_types '>' { $tipo = interfaces.VECTOR }
    | VECN '<' tipos_var '>' { $tipo = $tipos_var.tipo }
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

| CORIZQ tipos_var ']'  {
                                      nType := interfaces.NewArrayType($tipos_var.tipo, nil, $CORIZQ.line, $CORIZQ.pos )
                                      $ty.Add(nType)
                                    }
;

asignacion returns [interfaces.Instruction instr]
    : id=ID '=' expression {$instr = instruction.NewAssignment($id.text,$expression.p, nil, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}
    /*array asignacion*/
    | id=ID list_index '=' expression {$instr = instruction.NewAssignment($id.text,$expression.p, $list_index.lista, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}

    /*struct asignacion*/
    | l_AccessStruct '=' expression { $instr = instruction.NewAssignmentStruct($l_AccessStruct.l, $expression.p, $l_AccessStruct.start.GetLine(),$l_AccessStruct.start.GetColumn()) }

    /*vector asignacion*/
    //| id=ID '[' index=expression ']' '.'idstr=ID'=' val=expression {$instr = instruction.NewAssignmentVec($id.text, $index.p, $idstr.text, $val.p, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}
    | id=ID '[' index=expression ']' '.' l_AccessStruct '=' val=expression {$instr = instruction.NewAssignmentVec($id.text, $index.p, $l_AccessStruct.l, $val.p, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}

    | id=ID '=' VECN '::' CAPACITY '('expression')' {
                        $instr = instruction.NewAssignmentVecap($id.text, $expression.p, $id.line, $id.pos)
                }

;

l_AccessStruct returns[*arrayList.List l]
: list=l_AccessStruct '.' ID {
                                   $list.l.Add($ID.text)
                                   $l = $list.l
                                  }
| ID {
            $l = arrayList.New()
            $l.Add($ID.text)
}
;

list_index returns[*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    :  listi = list_index index_array {
                                      $listi.lista.Add($index_array.index)
                                      $lista = $listi.lista
                                  }
    |  index_array  {$lista.Add($index_array.index)}
;

index_array   returns [interfaces.Expresion index]
    :   '[' expression ']'  {$index = $expression.p}
;

//  IF
if_sent  returns [interfaces.Instruction instr]
    : IF expression bloque_inst  {$instr = instruction.NewIf($expression.p, $bloque_inst.l, nil,nil, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst ELSE  belse = bloque_inst   {$instr = instruction.NewIf($expression.p,$bprin.l,nil,$belse.l, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst list_elseif {
        $instr = instruction.NewIf($expression.p,$bprin.l,$list_elseif.lista, nil, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )
    }
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
match_sent  returns [interfaces.Instruction instr, interfaces.Expresion p]
    : MATCH expression LLAVEIZQ brazos = match_brazos LLAVEDER {
                        $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, nil, nil, $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
      }
    | MATCH expression LLAVEIZQ brazos = match_brazos '_' th='=>' bloque_inst ','? LLAVEDER {
                          $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, $bloque_inst.l, nil, $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
      }
    | MATCH expression LLAVEIZQ brazos = match_brazos '_' th='=>' instruccion_only ',' LLAVEDER {
                          $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, nil,  $instruccion_only.instr,  $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
      }

    /*match expresiones*/
    | MATCH exp=expression LLAVEIZQ brazosexp = match_brazos_exp LLAVEDER {
                        $p = instructionExpre.NewMatch($exp.p, $brazosexp.l_brazos, nil, nil, $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, true )
      }
    | MATCH exp=expression LLAVEIZQ brazosexp = match_brazos_exp '_' th='=>' exp_= expression ',' LLAVEDER {
                        $p = instructionExpre.NewMatch($exp.p, $brazosexp.l_brazos, nil,  nil,  $MATCH.line, localctx.(*Match_sentContext).Get_MATCH().GetColumn(), $exp_.p, true )
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

match_brazos_exp returns [*arrayList.List l_brazos]
@init{
    $l_brazos = arrayList.New()
}
    : listb = match_brazos_exp matchbrazo_exp   {
                                    $listb.l_brazos.Add($matchbrazo_exp.brazo)
                                    $l_brazos = $listb.l_brazos
                                }
    | matchbrazo_exp {$l_brazos.Add($matchbrazo_exp.brazo)}
;

matchbrazo returns [instructionExpre.BrazoMatch brazo]
    : listaOpciones th='=>' bloque_inst ','? { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, $bloque_inst.l, nil, $th.line, localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) }
    | listaOpciones th='=>' instruccion_only ',' { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, nil,  $instruccion_only.instr, $th.line, localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) }
    
    //: listaOpciones '=>' ((bloque_inst | instruccion) ',')? { $instr = expresion.NewArray($listaOpciones.lisop, $bloque_inst.l ) }
    //| listaOpciones '=>' (expression ',')? { $instr = expresion.NewArray($listaOpciones.lisop, $expression.p) }
;

matchbrazo_exp returns [instructionExpre.BrazoMatch brazo]
    : listaOpciones th='=>' expression ',' { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, nil,  nil, $th.line, localctx.(*Matchbrazo_expContext).GetTh().GetColumn(), $expression.p ) }
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
    | STRUCT {$tipo = interfaces.STRUCT}
    | T_CHAT {$tipo = interfaces.CHAR}

    | T_ARRAY {$tipo = interfaces.ARRAY}
    | T_VECTOR {$tipo = interfaces.VECTOR}

    | USIZE { $tipo = interfaces.INTEGER }
    
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
    /*funciones primitivas */

    /*rango for */
    | e_ini=expression '.''.' e_fin=expression { $p = expresion.NewRangeF($e_ini.p, $e_fin.p, $e_ini.start.GetLine(),$e_ini.start.GetColumn() ) }

    //| exp=expression '.' CLONE { $p = expresion.NewClone($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
    | exp=expression '.' ABS { $p = expresion.NewAbs($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
    | exp=expression '.' SQRT { $p = expresion.NewSqrt($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
    //| exp=expression TO_STRING { $p = expresion.NewToString($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
    //| exp=expression TO_OWNED { $p = expresion.NewToString($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
;

/*len_f returns[interfaces.Expresion p]
    : exp=expression '.' LEN {$p = expresion.NewLen($exp.p, $exp.start.GetLine(), $exp.start.GetColumn()  )}
;*/

expr_arit returns[interfaces.Expresion p]
    : op='-' opU = expr_arit {$p = expresion.NewOperacion($opU.p,"-",nil,true, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    
    //pow
    | T_NUMBER DOSPUNTO op=POW PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | T_FLOAT DOSPUNTO op=POWF PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op=('*'|'/'|'%') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    //| opIz = expr_arit op= '%' opDe = expr_arit     {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    
    /*len*/
    | opIz=expr_arit '.' LEN {$p = expresion.NewLen($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn()  )}

    | opIz = expr_arit op=('+'|'-') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}

    | opIz = expr_arit op=('<'|'<='|'>'|'>='|'=='|'!=') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())} 
    
    
    /*Relacional NOT*/
    | op='!' opU = expr_arit {$p = expresion.NewOperacion($opU.p,"!",nil,true, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    /* Relacional AND | OR*/
    | opIz = expr_arit op='&&' opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op='||' opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    
    | opIz=expr_arit '.' CLONE { $p = expresion.NewClone($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn() ) }
    | opIz=expr_arit TO_STRING { $p = expresion.NewToString($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn() ) }
    | opIz=expr_arit TO_OWNED { $p = expresion.NewToString($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn() ) }

    | ID '.' CONTAINS '(''&' val=expression')' {$p = expresion.NewContains($ID.text, $val.p, $ID.line, $ID.pos  )}

    | ID '.' CAPF {$p = expresion.NewCapacity($ID.text, $ID.line, $ID.pos  )}
     /*vector*/
    | VEC CORIZQ exp = expression ';' tam = expression CORDER { $p = expresion.NewVector(nil, $exp.p, $tam.p, 2, $CORIZQ.line, $CORIZQ.pos ) }
    | VEC CORIZQ live=listParams CORDER { $p = expresion.NewVector($live.l_e, nil, nil, 1, $CORIZQ.line, $CORIZQ.pos ) }

    /*array*/
    | CORIZQ exp = expression ';' tam = expression CORDER { $p = expresion.NewArray(nil, $exp.p, $tam.p, 2, $CORIZQ.line, $CORIZQ.pos ) }
    | CORIZQ listParams CORDER {    $p = expresion.NewArray($listParams.l_e, nil, nil, 1, $CORIZQ.line, $CORIZQ.pos ) }
    
    /*struct*/
    | ID LLAVEIZQ l_StructExp LLAVEDER { $p = instructionExpre.NewStructExpre($ID.text, $l_StructExp.l, $ID.line, $ID.pos ) }

    | primitivo {$p = $primitivo.p}
    | PARIZQ expression PARDER {$p = $expression.p}
    | casteo {$p = $casteo.p} 
    | if_exp {$p = $if_exp.p}
    | match_sent {$p = $match_sent.p}
    //| match_sent {$p = $match_sent.instr.(interfaces.Expresion)}

    | loopB { $p = $loopB.p }

    | callFunction {$p = $callFunction.p} 
    | callModulo {$p = $callModulo.p} 

    | ID '.' REMOVE '(' expression ')' { $p = instructionExpre.NewRemove($ID.text, $expression.p, $ID.line, $ID.pos) }

    


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
  | USIZE {$tc = interfaces.INTEGER}
;

l_StructExp returns[*arrayList.List l]
: list=l_StructExp COMA ID ':' expression {
                                        Str_ep := instructionExpre.NewStructContenido($ID.text, $expression.p)
                                        $list.l.Add(Str_ep);
                                        $l = $list.l;
                                    }
| ID ':' expression{
                    Str_ep := instructionExpre.NewStructContenido($ID.text, $expression.p)
                    $l = arrayList.New();
                    $l.Add(Str_ep);
                }
;

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

    | CHAR {
                chr := $CHAR.text
                $p = expresion.NewPrimitivo(chr[1:len(chr)-1],interfaces.CHAR, $CHAR.line, $CHAR.pos)
                }
    /*| ID { 
      $p = expresion.NewIdentificador($ID.text, $ID.line, localctx.(*PrimitivoContext).Get_ID().GetColumn() )}*/

    | TRUE  { $p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, $TRUE.line, localctx.(*PrimitivoContext).Get_TRUE().GetColumn())}
    | FALSE { $p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, $FALSE.line, localctx.(*PrimitivoContext).Get_FALSE().GetColumn())}
    | list=listIDArray { $p = $list.p}
;

listIDArray returns[interfaces.Expresion p]
    : list = listIDArray CORIZQ expression CORDER { $p = expresion.NewArrayAccess($list.p, $expression.p, $CORIZQ.line, $CORIZQ.pos ) }
    | list = listIDArray '.' ID { $p = expresion.NewStructAccess($list.p, $ID.text, $list.start.GetLine(), $list.start.GetColumn() )  }
    | ID { 
      $p = expresion.NewIdentificador($ID.text, $ID.line, localctx.(*ListIDArrayContext).Get_ID().GetColumn() )}
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