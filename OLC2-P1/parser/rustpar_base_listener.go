// Code generated from RustPar.g4 by ANTLR 4.9.3. DO NOT EDIT.

package parser // RustPar

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseRustParListener is a complete listener for a parse tree produced by RustPar.
type BaseRustParListener struct{}

var _ RustParListener = &BaseRustParListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseRustParListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseRustParListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseRustParListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseRustParListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStart is called when production start is entered.
func (s *BaseRustParListener) EnterStart(ctx *StartContext) {}

// ExitStart is called when production start is exited.
func (s *BaseRustParListener) ExitStart(ctx *StartContext) {}

// EnterInstrucciones is called when production instrucciones is entered.
func (s *BaseRustParListener) EnterInstrucciones(ctx *InstruccionesContext) {}

// ExitInstrucciones is called when production instrucciones is exited.
func (s *BaseRustParListener) ExitInstrucciones(ctx *InstruccionesContext) {}

// EnterInstruccion is called when production instruccion is entered.
func (s *BaseRustParListener) EnterInstruccion(ctx *InstruccionContext) {}

// ExitInstruccion is called when production instruccion is exited.
func (s *BaseRustParListener) ExitInstruccion(ctx *InstruccionContext) {}

// EnterPrintconsola is called when production printconsola is entered.
func (s *BaseRustParListener) EnterPrintconsola(ctx *PrintconsolaContext) {}

// ExitPrintconsola is called when production printconsola is exited.
func (s *BaseRustParListener) ExitPrintconsola(ctx *PrintconsolaContext) {}

// EnterDeclaracion is called when production declaracion is entered.
func (s *BaseRustParListener) EnterDeclaracion(ctx *DeclaracionContext) {}

// ExitDeclaracion is called when production declaracion is exited.
func (s *BaseRustParListener) ExitDeclaracion(ctx *DeclaracionContext) {}

// EnterIs_mut is called when production is_mut is entered.
func (s *BaseRustParListener) EnterIs_mut(ctx *Is_mutContext) {}

// ExitIs_mut is called when production is_mut is exited.
func (s *BaseRustParListener) ExitIs_mut(ctx *Is_mutContext) {}

// EnterAsignacion is called when production asignacion is entered.
func (s *BaseRustParListener) EnterAsignacion(ctx *AsignacionContext) {}

// ExitAsignacion is called when production asignacion is exited.
func (s *BaseRustParListener) ExitAsignacion(ctx *AsignacionContext) {}

// EnterIf_sent is called when production if_sent is entered.
func (s *BaseRustParListener) EnterIf_sent(ctx *If_sentContext) {}

// ExitIf_sent is called when production if_sent is exited.
func (s *BaseRustParListener) ExitIf_sent(ctx *If_sentContext) {}

// EnterList_elseif is called when production list_elseif is entered.
func (s *BaseRustParListener) EnterList_elseif(ctx *List_elseifContext) {}

// ExitList_elseif is called when production list_elseif is exited.
func (s *BaseRustParListener) ExitList_elseif(ctx *List_elseifContext) {}

// EnterElse_if is called when production else_if is entered.
func (s *BaseRustParListener) EnterElse_if(ctx *Else_ifContext) {}

// ExitElse_if is called when production else_if is exited.
func (s *BaseRustParListener) ExitElse_if(ctx *Else_ifContext) {}

// EnterBloque_inst is called when production bloque_inst is entered.
func (s *BaseRustParListener) EnterBloque_inst(ctx *Bloque_instContext) {}

// ExitBloque_inst is called when production bloque_inst is exited.
func (s *BaseRustParListener) ExitBloque_inst(ctx *Bloque_instContext) {}

// EnterTipos_var is called when production tipos_var is entered.
func (s *BaseRustParListener) EnterTipos_var(ctx *Tipos_varContext) {}

// ExitTipos_var is called when production tipos_var is exited.
func (s *BaseRustParListener) ExitTipos_var(ctx *Tipos_varContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseRustParListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseRustParListener) ExitExpression(ctx *ExpressionContext) {}

// EnterExpr_arit is called when production expr_arit is entered.
func (s *BaseRustParListener) EnterExpr_arit(ctx *Expr_aritContext) {}

// ExitExpr_arit is called when production expr_arit is exited.
func (s *BaseRustParListener) ExitExpr_arit(ctx *Expr_aritContext) {}

// EnterCasteo is called when production casteo is entered.
func (s *BaseRustParListener) EnterCasteo(ctx *CasteoContext) {}

// ExitCasteo is called when production casteo is exited.
func (s *BaseRustParListener) ExitCasteo(ctx *CasteoContext) {}

// EnterTipo_cast is called when production tipo_cast is entered.
func (s *BaseRustParListener) EnterTipo_cast(ctx *Tipo_castContext) {}

// ExitTipo_cast is called when production tipo_cast is exited.
func (s *BaseRustParListener) ExitTipo_cast(ctx *Tipo_castContext) {}

// EnterPrimitivo is called when production primitivo is entered.
func (s *BaseRustParListener) EnterPrimitivo(ctx *PrimitivoContext) {}

// ExitPrimitivo is called when production primitivo is exited.
func (s *BaseRustParListener) ExitPrimitivo(ctx *PrimitivoContext) {}

// EnterStrings is called when production strings is entered.
func (s *BaseRustParListener) EnterStrings(ctx *StringsContext) {}

// ExitStrings is called when production strings is exited.
func (s *BaseRustParListener) ExitStrings(ctx *StringsContext) {}
