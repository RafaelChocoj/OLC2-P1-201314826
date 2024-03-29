// Code generated from RustPar.g4 by ANTLR 4.9.3. DO NOT EDIT.

package parser // RustPar

import "github.com/antlr/antlr4/runtime/Go/antlr"

// RustParListener is a complete listener for a parse tree produced by RustPar.
type RustParListener interface {
	antlr.ParseTreeListener

	// EnterStart is called when entering the start production.
	EnterStart(c *StartContext)

	// EnterInstrucciones is called when entering the instrucciones production.
	EnterInstrucciones(c *InstruccionesContext)

	// EnterList_globals is called when entering the list_globals production.
	EnterList_globals(c *List_globalsContext)

	// EnterIn_global is called when entering the in_global production.
	EnterIn_global(c *In_globalContext)

	// EnterModule is called when entering the module production.
	EnterModule(c *ModuleContext)

	// EnterBodyModule_l is called when entering the bodyModule_l production.
	EnterBodyModule_l(c *BodyModule_lContext)

	// EnterT_access is called when entering the t_access production.
	EnterT_access(c *T_accessContext)

	// EnterItemMod is called when entering the itemMod production.
	EnterItemMod(c *ItemModContext)

	// EnterFuncion is called when entering the funcion production.
	EnterFuncion(c *FuncionContext)

	// EnterParams_declar is called when entering the params_declar production.
	EnterParams_declar(c *Params_declarContext)

	// EnterDeclar_parametros is called when entering the declar_parametros production.
	EnterDeclar_parametros(c *Declar_parametrosContext)

	// EnterFn_main is called when entering the fn_main production.
	EnterFn_main(c *Fn_mainContext)

	// EnterInstruccion is called when entering the instruccion production.
	EnterInstruccion(c *InstruccionContext)

	// EnterInstruccion_only is called when entering the instruccion_only production.
	EnterInstruccion_only(c *Instruccion_onlyContext)

	// EnterPushVec is called when entering the pushVec production.
	EnterPushVec(c *PushVecContext)

	// EnterNewStruct is called when entering the newStruct production.
	EnterNewStruct(c *NewStructContext)

	// EnterListdecStruct is called when entering the listdecStruct production.
	EnterListdecStruct(c *ListdecStructContext)

	// EnterCallFunction is called when entering the callFunction production.
	EnterCallFunction(c *CallFunctionContext)

	// EnterCallModulo is called when entering the callModulo production.
	EnterCallModulo(c *CallModuloContext)

	// EnterListModulec is called when entering the listModulec production.
	EnterListModulec(c *ListModulecContext)

	// EnterReturnFun is called when entering the returnFun production.
	EnterReturnFun(c *ReturnFunContext)

	// EnterPrintconsola is called when entering the printconsola production.
	EnterPrintconsola(c *PrintconsolaContext)

	// EnterLoopB is called when entering the loopB production.
	EnterLoopB(c *LoopBContext)

	// EnterLWhile is called when entering the lWhile production.
	EnterLWhile(c *LWhileContext)

	// EnterLForin is called when entering the lForin production.
	EnterLForin(c *LForinContext)

	// EnterLBreak is called when entering the lBreak production.
	EnterLBreak(c *LBreakContext)

	// EnterLContinue is called when entering the lContinue production.
	EnterLContinue(c *LContinueContext)

	// EnterListParams is called when entering the listParams production.
	EnterListParams(c *ListParamsContext)

	// EnterListParamsCall is called when entering the listParamsCall production.
	EnterListParamsCall(c *ListParamsCallContext)

	// EnterIs_ref is called when entering the is_ref production.
	EnterIs_ref(c *Is_refContext)

	// EnterDeclaracion is called when entering the declaracion production.
	EnterDeclaracion(c *DeclaracionContext)

	// EnterIs_mut is called when entering the is_mut production.
	EnterIs_mut(c *Is_mutContext)

	// EnterLetid is called when entering the letid production.
	EnterLetid(c *LetidContext)

	// EnterVector_types is called when entering the vector_types production.
	EnterVector_types(c *Vector_typesContext)

	// EnterArray_type is called when entering the array_type production.
	EnterArray_type(c *Array_typeContext)

	// EnterAsignacion is called when entering the asignacion production.
	EnterAsignacion(c *AsignacionContext)

	// EnterL_AccessStruct is called when entering the l_AccessStruct production.
	EnterL_AccessStruct(c *L_AccessStructContext)

	// EnterList_index is called when entering the list_index production.
	EnterList_index(c *List_indexContext)

	// EnterIndex_array is called when entering the index_array production.
	EnterIndex_array(c *Index_arrayContext)

	// EnterIf_sent is called when entering the if_sent production.
	EnterIf_sent(c *If_sentContext)

	// EnterIf_exp is called when entering the if_exp production.
	EnterIf_exp(c *If_expContext)

	// EnterList_elseif is called when entering the list_elseif production.
	EnterList_elseif(c *List_elseifContext)

	// EnterList_elseif_exp is called when entering the list_elseif_exp production.
	EnterList_elseif_exp(c *List_elseif_expContext)

	// EnterElse_if is called when entering the else_if production.
	EnterElse_if(c *Else_ifContext)

	// EnterElse_if_exp is called when entering the else_if_exp production.
	EnterElse_if_exp(c *Else_if_expContext)

	// EnterMatch_sent is called when entering the match_sent production.
	EnterMatch_sent(c *Match_sentContext)

	// EnterMatch_brazos is called when entering the match_brazos production.
	EnterMatch_brazos(c *Match_brazosContext)

	// EnterMatch_brazos_exp is called when entering the match_brazos_exp production.
	EnterMatch_brazos_exp(c *Match_brazos_expContext)

	// EnterMatchbrazo is called when entering the matchbrazo production.
	EnterMatchbrazo(c *MatchbrazoContext)

	// EnterMatchbrazo_exp is called when entering the matchbrazo_exp production.
	EnterMatchbrazo_exp(c *Matchbrazo_expContext)

	// EnterListaOpciones is called when entering the listaOpciones production.
	EnterListaOpciones(c *ListaOpcionesContext)

	// EnterBloque_inst is called when entering the bloque_inst production.
	EnterBloque_inst(c *Bloque_instContext)

	// EnterBloque_exp is called when entering the bloque_exp production.
	EnterBloque_exp(c *Bloque_expContext)

	// EnterTipos_var is called when entering the tipos_var production.
	EnterTipos_var(c *Tipos_varContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpr_arit is called when entering the expr_arit production.
	EnterExpr_arit(c *Expr_aritContext)

	// EnterCasteo is called when entering the casteo production.
	EnterCasteo(c *CasteoContext)

	// EnterTipo_cast is called when entering the tipo_cast production.
	EnterTipo_cast(c *Tipo_castContext)

	// EnterL_StructExp is called when entering the l_StructExp production.
	EnterL_StructExp(c *L_StructExpContext)

	// EnterPrimitivo is called when entering the primitivo production.
	EnterPrimitivo(c *PrimitivoContext)

	// EnterListIDArray is called when entering the listIDArray production.
	EnterListIDArray(c *ListIDArrayContext)

	// EnterStrings is called when entering the strings production.
	EnterStrings(c *StringsContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitInstrucciones is called when exiting the instrucciones production.
	ExitInstrucciones(c *InstruccionesContext)

	// ExitList_globals is called when exiting the list_globals production.
	ExitList_globals(c *List_globalsContext)

	// ExitIn_global is called when exiting the in_global production.
	ExitIn_global(c *In_globalContext)

	// ExitModule is called when exiting the module production.
	ExitModule(c *ModuleContext)

	// ExitBodyModule_l is called when exiting the bodyModule_l production.
	ExitBodyModule_l(c *BodyModule_lContext)

	// ExitT_access is called when exiting the t_access production.
	ExitT_access(c *T_accessContext)

	// ExitItemMod is called when exiting the itemMod production.
	ExitItemMod(c *ItemModContext)

	// ExitFuncion is called when exiting the funcion production.
	ExitFuncion(c *FuncionContext)

	// ExitParams_declar is called when exiting the params_declar production.
	ExitParams_declar(c *Params_declarContext)

	// ExitDeclar_parametros is called when exiting the declar_parametros production.
	ExitDeclar_parametros(c *Declar_parametrosContext)

	// ExitFn_main is called when exiting the fn_main production.
	ExitFn_main(c *Fn_mainContext)

	// ExitInstruccion is called when exiting the instruccion production.
	ExitInstruccion(c *InstruccionContext)

	// ExitInstruccion_only is called when exiting the instruccion_only production.
	ExitInstruccion_only(c *Instruccion_onlyContext)

	// ExitPushVec is called when exiting the pushVec production.
	ExitPushVec(c *PushVecContext)

	// ExitNewStruct is called when exiting the newStruct production.
	ExitNewStruct(c *NewStructContext)

	// ExitListdecStruct is called when exiting the listdecStruct production.
	ExitListdecStruct(c *ListdecStructContext)

	// ExitCallFunction is called when exiting the callFunction production.
	ExitCallFunction(c *CallFunctionContext)

	// ExitCallModulo is called when exiting the callModulo production.
	ExitCallModulo(c *CallModuloContext)

	// ExitListModulec is called when exiting the listModulec production.
	ExitListModulec(c *ListModulecContext)

	// ExitReturnFun is called when exiting the returnFun production.
	ExitReturnFun(c *ReturnFunContext)

	// ExitPrintconsola is called when exiting the printconsola production.
	ExitPrintconsola(c *PrintconsolaContext)

	// ExitLoopB is called when exiting the loopB production.
	ExitLoopB(c *LoopBContext)

	// ExitLWhile is called when exiting the lWhile production.
	ExitLWhile(c *LWhileContext)

	// ExitLForin is called when exiting the lForin production.
	ExitLForin(c *LForinContext)

	// ExitLBreak is called when exiting the lBreak production.
	ExitLBreak(c *LBreakContext)

	// ExitLContinue is called when exiting the lContinue production.
	ExitLContinue(c *LContinueContext)

	// ExitListParams is called when exiting the listParams production.
	ExitListParams(c *ListParamsContext)

	// ExitListParamsCall is called when exiting the listParamsCall production.
	ExitListParamsCall(c *ListParamsCallContext)

	// ExitIs_ref is called when exiting the is_ref production.
	ExitIs_ref(c *Is_refContext)

	// ExitDeclaracion is called when exiting the declaracion production.
	ExitDeclaracion(c *DeclaracionContext)

	// ExitIs_mut is called when exiting the is_mut production.
	ExitIs_mut(c *Is_mutContext)

	// ExitLetid is called when exiting the letid production.
	ExitLetid(c *LetidContext)

	// ExitVector_types is called when exiting the vector_types production.
	ExitVector_types(c *Vector_typesContext)

	// ExitArray_type is called when exiting the array_type production.
	ExitArray_type(c *Array_typeContext)

	// ExitAsignacion is called when exiting the asignacion production.
	ExitAsignacion(c *AsignacionContext)

	// ExitL_AccessStruct is called when exiting the l_AccessStruct production.
	ExitL_AccessStruct(c *L_AccessStructContext)

	// ExitList_index is called when exiting the list_index production.
	ExitList_index(c *List_indexContext)

	// ExitIndex_array is called when exiting the index_array production.
	ExitIndex_array(c *Index_arrayContext)

	// ExitIf_sent is called when exiting the if_sent production.
	ExitIf_sent(c *If_sentContext)

	// ExitIf_exp is called when exiting the if_exp production.
	ExitIf_exp(c *If_expContext)

	// ExitList_elseif is called when exiting the list_elseif production.
	ExitList_elseif(c *List_elseifContext)

	// ExitList_elseif_exp is called when exiting the list_elseif_exp production.
	ExitList_elseif_exp(c *List_elseif_expContext)

	// ExitElse_if is called when exiting the else_if production.
	ExitElse_if(c *Else_ifContext)

	// ExitElse_if_exp is called when exiting the else_if_exp production.
	ExitElse_if_exp(c *Else_if_expContext)

	// ExitMatch_sent is called when exiting the match_sent production.
	ExitMatch_sent(c *Match_sentContext)

	// ExitMatch_brazos is called when exiting the match_brazos production.
	ExitMatch_brazos(c *Match_brazosContext)

	// ExitMatch_brazos_exp is called when exiting the match_brazos_exp production.
	ExitMatch_brazos_exp(c *Match_brazos_expContext)

	// ExitMatchbrazo is called when exiting the matchbrazo production.
	ExitMatchbrazo(c *MatchbrazoContext)

	// ExitMatchbrazo_exp is called when exiting the matchbrazo_exp production.
	ExitMatchbrazo_exp(c *Matchbrazo_expContext)

	// ExitListaOpciones is called when exiting the listaOpciones production.
	ExitListaOpciones(c *ListaOpcionesContext)

	// ExitBloque_inst is called when exiting the bloque_inst production.
	ExitBloque_inst(c *Bloque_instContext)

	// ExitBloque_exp is called when exiting the bloque_exp production.
	ExitBloque_exp(c *Bloque_expContext)

	// ExitTipos_var is called when exiting the tipos_var production.
	ExitTipos_var(c *Tipos_varContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpr_arit is called when exiting the expr_arit production.
	ExitExpr_arit(c *Expr_aritContext)

	// ExitCasteo is called when exiting the casteo production.
	ExitCasteo(c *CasteoContext)

	// ExitTipo_cast is called when exiting the tipo_cast production.
	ExitTipo_cast(c *Tipo_castContext)

	// ExitL_StructExp is called when exiting the l_StructExp production.
	ExitL_StructExp(c *L_StructExpContext)

	// ExitPrimitivo is called when exiting the primitivo production.
	ExitPrimitivo(c *PrimitivoContext)

	// ExitListIDArray is called when exiting the listIDArray production.
	ExitListIDArray(c *ListIDArrayContext)

	// ExitStrings is called when exiting the strings production.
	ExitStrings(c *StringsContext)
}
