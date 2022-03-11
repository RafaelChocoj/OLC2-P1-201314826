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

	// EnterInstruccion is called when entering the instruccion production.
	EnterInstruccion(c *InstruccionContext)

	// EnterInstruccion_only is called when entering the instruccion_only production.
	EnterInstruccion_only(c *Instruccion_onlyContext)

	// EnterPrintconsola is called when entering the printconsola production.
	EnterPrintconsola(c *PrintconsolaContext)

	// EnterDeclaracion is called when entering the declaracion production.
	EnterDeclaracion(c *DeclaracionContext)

	// EnterIs_mut is called when entering the is_mut production.
	EnterIs_mut(c *Is_mutContext)

	// EnterAsignacion is called when entering the asignacion production.
	EnterAsignacion(c *AsignacionContext)

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

	// EnterMatchbrazo is called when entering the matchbrazo production.
	EnterMatchbrazo(c *MatchbrazoContext)

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

	// EnterPrimitivo is called when entering the primitivo production.
	EnterPrimitivo(c *PrimitivoContext)

	// EnterStrings is called when entering the strings production.
	EnterStrings(c *StringsContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitInstrucciones is called when exiting the instrucciones production.
	ExitInstrucciones(c *InstruccionesContext)

	// ExitInstruccion is called when exiting the instruccion production.
	ExitInstruccion(c *InstruccionContext)

	// ExitInstruccion_only is called when exiting the instruccion_only production.
	ExitInstruccion_only(c *Instruccion_onlyContext)

	// ExitPrintconsola is called when exiting the printconsola production.
	ExitPrintconsola(c *PrintconsolaContext)

	// ExitDeclaracion is called when exiting the declaracion production.
	ExitDeclaracion(c *DeclaracionContext)

	// ExitIs_mut is called when exiting the is_mut production.
	ExitIs_mut(c *Is_mutContext)

	// ExitAsignacion is called when exiting the asignacion production.
	ExitAsignacion(c *AsignacionContext)

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

	// ExitMatchbrazo is called when exiting the matchbrazo production.
	ExitMatchbrazo(c *MatchbrazoContext)

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

	// ExitPrimitivo is called when exiting the primitivo production.
	ExitPrimitivo(c *PrimitivoContext)

	// ExitStrings is called when exiting the strings production.
	ExitStrings(c *StringsContext)
}
