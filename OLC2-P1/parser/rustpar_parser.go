// Code generated from RustPar.g4 by ANTLR 4.9.3. DO NOT EDIT.

package parser // RustPar

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

import "OLC2/interfaces"
import "OLC2/expresion"
import "OLC2/instruction"
import arrayList "github.com/colegno/arraylist"

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 41, 162,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 3, 2, 3, 2, 3, 2, 3,
	3, 7, 3, 27, 10, 3, 12, 3, 14, 3, 30, 11, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 5, 7, 87, 10, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 7, 7, 114, 10, 7, 12, 7, 14, 7,
	117, 11, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 9,
	3, 9, 5, 9, 130, 10, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 143, 10, 10, 3, 11, 6, 11, 146, 10,
	11, 13, 11, 14, 11, 147, 3, 11, 3, 11, 5, 11, 152, 10, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 5, 11, 160, 10, 11, 3, 11, 2, 3, 12, 12, 2,
	4, 6, 8, 10, 12, 14, 16, 18, 20, 2, 6, 4, 2, 27, 28, 31, 31, 3, 2, 29,
	30, 3, 2, 21, 26, 3, 2, 12, 13, 2, 172, 2, 22, 3, 2, 2, 2, 4, 28, 3, 2,
	2, 2, 6, 33, 3, 2, 2, 2, 8, 37, 3, 2, 2, 2, 10, 43, 3, 2, 2, 2, 12, 86,
	3, 2, 2, 2, 14, 118, 3, 2, 2, 2, 16, 129, 3, 2, 2, 2, 18, 142, 3, 2, 2,
	2, 20, 159, 3, 2, 2, 2, 22, 23, 5, 4, 3, 2, 23, 24, 8, 2, 1, 2, 24, 3,
	3, 2, 2, 2, 25, 27, 5, 6, 4, 2, 26, 25, 3, 2, 2, 2, 27, 30, 3, 2, 2, 2,
	28, 26, 3, 2, 2, 2, 28, 29, 3, 2, 2, 2, 29, 31, 3, 2, 2, 2, 30, 28, 3,
	2, 2, 2, 31, 32, 8, 3, 1, 2, 32, 5, 3, 2, 2, 2, 33, 34, 5, 8, 5, 2, 34,
	35, 7, 19, 2, 2, 35, 36, 8, 4, 1, 2, 36, 7, 3, 2, 2, 2, 37, 38, 7, 3, 2,
	2, 38, 39, 7, 36, 2, 2, 39, 40, 5, 10, 6, 2, 40, 41, 7, 37, 2, 2, 41, 42,
	8, 5, 1, 2, 42, 9, 3, 2, 2, 2, 43, 44, 5, 12, 7, 2, 44, 45, 8, 6, 1, 2,
	45, 11, 3, 2, 2, 2, 46, 47, 8, 7, 1, 2, 47, 48, 7, 30, 2, 2, 48, 49, 5,
	12, 7, 14, 49, 50, 8, 7, 1, 2, 50, 87, 3, 2, 2, 2, 51, 52, 7, 4, 2, 2,
	52, 53, 7, 20, 2, 2, 53, 54, 7, 10, 2, 2, 54, 55, 7, 36, 2, 2, 55, 56,
	5, 12, 7, 2, 56, 57, 7, 18, 2, 2, 57, 58, 5, 12, 7, 2, 58, 59, 7, 37, 2,
	2, 59, 60, 8, 7, 1, 2, 60, 87, 3, 2, 2, 2, 61, 62, 7, 5, 2, 2, 62, 63,
	7, 20, 2, 2, 63, 64, 7, 11, 2, 2, 64, 65, 7, 36, 2, 2, 65, 66, 5, 12, 7,
	2, 66, 67, 7, 18, 2, 2, 67, 68, 5, 12, 7, 2, 68, 69, 7, 37, 2, 2, 69, 70,
	8, 7, 1, 2, 70, 87, 3, 2, 2, 2, 71, 72, 7, 34, 2, 2, 72, 73, 5, 12, 7,
	8, 73, 74, 8, 7, 1, 2, 74, 87, 3, 2, 2, 2, 75, 76, 5, 18, 10, 2, 76, 77,
	8, 7, 1, 2, 77, 87, 3, 2, 2, 2, 78, 79, 7, 36, 2, 2, 79, 80, 5, 10, 6,
	2, 80, 81, 7, 37, 2, 2, 81, 82, 8, 7, 1, 2, 82, 87, 3, 2, 2, 2, 83, 84,
	5, 14, 8, 2, 84, 85, 8, 7, 1, 2, 85, 87, 3, 2, 2, 2, 86, 46, 3, 2, 2, 2,
	86, 51, 3, 2, 2, 2, 86, 61, 3, 2, 2, 2, 86, 71, 3, 2, 2, 2, 86, 75, 3,
	2, 2, 2, 86, 78, 3, 2, 2, 2, 86, 83, 3, 2, 2, 2, 87, 115, 3, 2, 2, 2, 88,
	89, 12, 11, 2, 2, 89, 90, 9, 2, 2, 2, 90, 91, 5, 12, 7, 12, 91, 92, 8,
	7, 1, 2, 92, 114, 3, 2, 2, 2, 93, 94, 12, 10, 2, 2, 94, 95, 9, 3, 2, 2,
	95, 96, 5, 12, 7, 11, 96, 97, 8, 7, 1, 2, 97, 114, 3, 2, 2, 2, 98, 99,
	12, 9, 2, 2, 99, 100, 9, 4, 2, 2, 100, 101, 5, 12, 7, 10, 101, 102, 8,
	7, 1, 2, 102, 114, 3, 2, 2, 2, 103, 104, 12, 7, 2, 2, 104, 105, 7, 32,
	2, 2, 105, 106, 5, 12, 7, 8, 106, 107, 8, 7, 1, 2, 107, 114, 3, 2, 2, 2,
	108, 109, 12, 6, 2, 2, 109, 110, 7, 33, 2, 2, 110, 111, 5, 12, 7, 7, 111,
	112, 8, 7, 1, 2, 112, 114, 3, 2, 2, 2, 113, 88, 3, 2, 2, 2, 113, 93, 3,
	2, 2, 2, 113, 98, 3, 2, 2, 2, 113, 103, 3, 2, 2, 2, 113, 108, 3, 2, 2,
	2, 114, 117, 3, 2, 2, 2, 115, 113, 3, 2, 2, 2, 115, 116, 3, 2, 2, 2, 116,
	13, 3, 2, 2, 2, 117, 115, 3, 2, 2, 2, 118, 119, 7, 36, 2, 2, 119, 120,
	5, 10, 6, 2, 120, 121, 7, 9, 2, 2, 121, 122, 5, 16, 9, 2, 122, 123, 7,
	37, 2, 2, 123, 124, 8, 8, 1, 2, 124, 15, 3, 2, 2, 2, 125, 126, 7, 5, 2,
	2, 126, 130, 8, 9, 1, 2, 127, 128, 7, 4, 2, 2, 128, 130, 8, 9, 1, 2, 129,
	125, 3, 2, 2, 2, 129, 127, 3, 2, 2, 2, 130, 17, 3, 2, 2, 2, 131, 132, 7,
	14, 2, 2, 132, 143, 8, 10, 1, 2, 133, 134, 7, 15, 2, 2, 134, 143, 8, 10,
	1, 2, 135, 136, 5, 20, 11, 2, 136, 137, 8, 10, 1, 2, 137, 143, 3, 2, 2,
	2, 138, 139, 7, 7, 2, 2, 139, 143, 8, 10, 1, 2, 140, 141, 7, 8, 2, 2, 141,
	143, 8, 10, 1, 2, 142, 131, 3, 2, 2, 2, 142, 133, 3, 2, 2, 2, 142, 135,
	3, 2, 2, 2, 142, 138, 3, 2, 2, 2, 142, 140, 3, 2, 2, 2, 143, 19, 3, 2,
	2, 2, 144, 146, 7, 35, 2, 2, 145, 144, 3, 2, 2, 2, 146, 147, 3, 2, 2, 2,
	147, 145, 3, 2, 2, 2, 147, 148, 3, 2, 2, 2, 148, 149, 3, 2, 2, 2, 149,
	151, 7, 16, 2, 2, 150, 152, 9, 5, 2, 2, 151, 150, 3, 2, 2, 2, 151, 152,
	3, 2, 2, 2, 152, 153, 3, 2, 2, 2, 153, 160, 8, 11, 1, 2, 154, 155, 7, 16,
	2, 2, 155, 156, 9, 5, 2, 2, 156, 160, 8, 11, 1, 2, 157, 158, 7, 16, 2,
	2, 158, 160, 8, 11, 1, 2, 159, 145, 3, 2, 2, 2, 159, 154, 3, 2, 2, 2, 159,
	157, 3, 2, 2, 2, 160, 21, 3, 2, 2, 2, 11, 28, 86, 113, 115, 129, 142, 147,
	151, 159,
}
var literalNames = []string{
	"", "'println!'", "'i64'", "'f64'", "'string'", "'true'", "'false'", "'as'",
	"'pow'", "'powf'", "'.to_string()'", "'.to_owned()'", "", "", "", "'.'",
	"','", "';'", "'::'", "'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'",
	"'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'",
	"'{'", "'}'",
}
var symbolicNames = []string{
	"", "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", "AS",
	"POW", "POWF", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", "PUNTO",
	"COMA", "PTCOMA", "DOSPUNTO", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL",
	"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT",
	"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "L_COMMENT",
}

var ruleNames = []string{
	"start", "instrucciones", "instruccion", "printconsola", "expression",
	"expr_arit", "casteo", "tipo_cast", "primitivo", "strings",
}

type RustPar struct {
	*antlr.BaseParser
}

// NewRustPar produces a new parser instance for the optional input antlr.TokenStream.
//
// The *RustPar instance produced may be reused by calling the SetInputStream method.
// The initial parser configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewRustPar(input antlr.TokenStream) *RustPar {
	this := new(RustPar)
	deserializer := antlr.NewATNDeserializer(nil)
	deserializedATN := deserializer.DeserializeFromUInt16(parserATN)
	decisionToDFA := make([]*antlr.DFA, len(deserializedATN.DecisionToState))
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "RustPar.g4"

	return this
}

// RustPar tokens.
const (
	RustParEOF        = antlr.TokenEOF
	RustParPRINT_CON  = 1
	RustParT_NUMBER   = 2
	RustParT_FLOAT    = 3
	RustParT_STRING   = 4
	RustParTRUE       = 5
	RustParFALSE      = 6
	RustParAS         = 7
	RustParPOW        = 8
	RustParPOWF       = 9
	RustParTO_STRING  = 10
	RustParTO_OWNED   = 11
	RustParNUMBER     = 12
	RustParFLOAT      = 13
	RustParSTRING     = 14
	RustParPUNTO      = 15
	RustParCOMA       = 16
	RustParPTCOMA     = 17
	RustParDOSPUNTO   = 18
	RustParDISTINTO   = 19
	RustParIGUAL      = 20
	RustParMAYORIGUAL = 21
	RustParMENORIGUAL = 22
	RustParMAYOR      = 23
	RustParMENOR      = 24
	RustParMUL        = 25
	RustParDIV        = 26
	RustParADD        = 27
	RustParSUB        = 28
	RustParMOD        = 29
	RustParAND        = 30
	RustParOR         = 31
	RustParNOT        = 32
	RustParAMP        = 33
	RustParPARIZQ     = 34
	RustParPARDER     = 35
	RustParLLAVEIZQ   = 36
	RustParLLAVEDER   = 37
	RustParWHITESPACE = 38
	RustParL_COMMENT  = 39
)

// RustPar rules.
const (
	RustParRULE_start         = 0
	RustParRULE_instrucciones = 1
	RustParRULE_instruccion   = 2
	RustParRULE_printconsola  = 3
	RustParRULE_expression    = 4
	RustParRULE_expr_arit     = 5
	RustParRULE_casteo        = 6
	RustParRULE_tipo_cast     = 7
	RustParRULE_primitivo     = 8
	RustParRULE_strings       = 9
)

// IStartContext is an interface to support dynamic dispatch.
type IStartContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsStartContext differentiates from other interfaces.
	IsStartContext()
}

type StartContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	lista          *arrayList.List
	_instrucciones IInstruccionesContext
}

func NewEmptyStartContext() *StartContext {
	var p = new(StartContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_start
	return p
}

func (*StartContext) IsStartContext() {}

func NewStartContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StartContext {
	var p = new(StartContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_start

	return p
}

func (s *StartContext) GetParser() antlr.Parser { return s.parser }

func (s *StartContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *StartContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *StartContext) GetLista() *arrayList.List { return s.lista }

func (s *StartContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *StartContext) Instrucciones() IInstruccionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccionesContext)
}

func (s *StartContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StartContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StartContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterStart(s)
	}
}

func (s *StartContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitStart(s)
	}
}

func (p *RustPar) Start() (localctx IStartContext) {
	this := p
	_ = this

	localctx = NewStartContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, RustParRULE_start)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(20)

		var _x = p.Instrucciones()

		localctx.(*StartContext)._instrucciones = _x
	}
	localctx.(*StartContext).lista = localctx.(*StartContext).Get_instrucciones().GetL()

	return localctx
}

// IInstruccionesContext is an interface to support dynamic dispatch.
type IInstruccionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruccion returns the _instruccion rule contexts.
	Get_instruccion() IInstruccionContext

	// Set_instruccion sets the _instruccion rule contexts.
	Set_instruccion(IInstruccionContext)

	// GetE returns the e rule context list.
	GetE() []IInstruccionContext

	// SetE sets the e rule context list.
	SetE([]IInstruccionContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsInstruccionesContext differentiates from other interfaces.
	IsInstruccionesContext()
}

type InstruccionesContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	l            *arrayList.List
	_instruccion IInstruccionContext
	e            []IInstruccionContext
}

func NewEmptyInstruccionesContext() *InstruccionesContext {
	var p = new(InstruccionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_instrucciones
	return p
}

func (*InstruccionesContext) IsInstruccionesContext() {}

func NewInstruccionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionesContext {
	var p = new(InstruccionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_instrucciones

	return p
}

func (s *InstruccionesContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionesContext) Get_instruccion() IInstruccionContext { return s._instruccion }

func (s *InstruccionesContext) Set_instruccion(v IInstruccionContext) { s._instruccion = v }

func (s *InstruccionesContext) GetE() []IInstruccionContext { return s.e }

func (s *InstruccionesContext) SetE(v []IInstruccionContext) { s.e = v }

func (s *InstruccionesContext) GetL() *arrayList.List { return s.l }

func (s *InstruccionesContext) SetL(v *arrayList.List) { s.l = v }

func (s *InstruccionesContext) AllInstruccion() []IInstruccionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstruccionContext)(nil)).Elem())
	var tst = make([]IInstruccionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstruccionContext)
		}
	}

	return tst
}

func (s *InstruccionesContext) Instruccion(i int) IInstruccionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstruccionContext)
}

func (s *InstruccionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterInstrucciones(s)
	}
}

func (s *InstruccionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitInstrucciones(s)
	}
}

func (p *RustPar) Instrucciones() (localctx IInstruccionesContext) {
	this := p
	_ = this

	localctx = NewInstruccionesContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, RustParRULE_instrucciones)

	localctx.(*InstruccionesContext).l = arrayList.New()

	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(26)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == RustParPRINT_CON {
		{
			p.SetState(23)

			var _x = p.Instruccion()

			localctx.(*InstruccionesContext)._instruccion = _x
		}
		localctx.(*InstruccionesContext).e = append(localctx.(*InstruccionesContext).e, localctx.(*InstruccionesContext)._instruccion)

		p.SetState(28)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	listInt := localctx.(*InstruccionesContext).GetE()
	for _, e := range listInt {
		localctx.(*InstruccionesContext).l.Add(e.GetInstr())
	}
	//fmt.Printf("tipo %T",localctx.(*InstruccionesContext).GetE())

	return localctx
}

// IInstruccionContext is an interface to support dynamic dispatch.
type IInstruccionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printconsola returns the _printconsola rule contexts.
	Get_printconsola() IPrintconsolaContext

	// Set_printconsola sets the _printconsola rule contexts.
	Set_printconsola(IPrintconsolaContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsInstruccionContext differentiates from other interfaces.
	IsInstruccionContext()
}

type InstruccionContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	instr         interfaces.Instruction
	_printconsola IPrintconsolaContext
}

func NewEmptyInstruccionContext() *InstruccionContext {
	var p = new(InstruccionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_instruccion
	return p
}

func (*InstruccionContext) IsInstruccionContext() {}

func NewInstruccionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionContext {
	var p = new(InstruccionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_instruccion

	return p
}

func (s *InstruccionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionContext) Get_printconsola() IPrintconsolaContext { return s._printconsola }

func (s *InstruccionContext) Set_printconsola(v IPrintconsolaContext) { s._printconsola = v }

func (s *InstruccionContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *InstruccionContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *InstruccionContext) Printconsola() IPrintconsolaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrintconsolaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrintconsolaContext)
}

func (s *InstruccionContext) PTCOMA() antlr.TerminalNode {
	return s.GetToken(RustParPTCOMA, 0)
}

func (s *InstruccionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterInstruccion(s)
	}
}

func (s *InstruccionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitInstruccion(s)
	}
}

func (p *RustPar) Instruccion() (localctx IInstruccionContext) {
	this := p
	_ = this

	localctx = NewInstruccionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, RustParRULE_instruccion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(31)

		var _x = p.Printconsola()

		localctx.(*InstruccionContext)._printconsola = _x
	}
	{
		p.SetState(32)
		p.Match(RustParPTCOMA)
	}
	localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_printconsola().GetInstr()

	return localctx
}

// IPrintconsolaContext is an interface to support dynamic dispatch.
type IPrintconsolaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsPrintconsolaContext differentiates from other interfaces.
	IsPrintconsolaContext()
}

type PrintconsolaContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruction
	_expression IExpressionContext
}

func NewEmptyPrintconsolaContext() *PrintconsolaContext {
	var p = new(PrintconsolaContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_printconsola
	return p
}

func (*PrintconsolaContext) IsPrintconsolaContext() {}

func NewPrintconsolaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrintconsolaContext {
	var p = new(PrintconsolaContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_printconsola

	return p
}

func (s *PrintconsolaContext) GetParser() antlr.Parser { return s.parser }

func (s *PrintconsolaContext) Get_expression() IExpressionContext { return s._expression }

func (s *PrintconsolaContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *PrintconsolaContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *PrintconsolaContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *PrintconsolaContext) PRINT_CON() antlr.TerminalNode {
	return s.GetToken(RustParPRINT_CON, 0)
}

func (s *PrintconsolaContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *PrintconsolaContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *PrintconsolaContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *PrintconsolaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrintconsolaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrintconsolaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterPrintconsola(s)
	}
}

func (s *PrintconsolaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitPrintconsola(s)
	}
}

func (p *RustPar) Printconsola() (localctx IPrintconsolaContext) {
	this := p
	_ = this

	localctx = NewPrintconsolaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, RustParRULE_printconsola)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(35)
		p.Match(RustParPRINT_CON)
	}
	{
		p.SetState(36)
		p.Match(RustParPARIZQ)
	}
	{
		p.SetState(37)

		var _x = p.Expression()

		localctx.(*PrintconsolaContext)._expression = _x
	}
	{
		p.SetState(38)
		p.Match(RustParPARDER)
	}
	localctx.(*PrintconsolaContext).instr = instruction.NewImprimir(localctx.(*PrintconsolaContext).Get_expression().GetP())

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expr_arit returns the _expr_arit rule contexts.
	Get_expr_arit() IExpr_aritContext

	// Set_expr_arit sets the _expr_arit rule contexts.
	Set_expr_arit(IExpr_aritContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	p          interfaces.Expresion
	_expr_arit IExpr_aritContext
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) Get_expr_arit() IExpr_aritContext { return s._expr_arit }

func (s *ExpressionContext) Set_expr_arit(v IExpr_aritContext) { s._expr_arit = v }

func (s *ExpressionContext) GetP() interfaces.Expresion { return s.p }

func (s *ExpressionContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *ExpressionContext) Expr_arit() IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (p *RustPar) Expression() (localctx IExpressionContext) {
	this := p
	_ = this

	localctx = NewExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, RustParRULE_expression)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(41)

		var _x = p.expr_arit(0)

		localctx.(*ExpressionContext)._expr_arit = _x
	}
	localctx.(*ExpressionContext).p = localctx.(*ExpressionContext).Get_expr_arit().GetP()

	return localctx
}

// IExpr_aritContext is an interface to support dynamic dispatch.
type IExpr_aritContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetOp returns the op token.
	GetOp() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// GetOpIz returns the opIz rule contexts.
	GetOpIz() IExpr_aritContext

	// GetOpU returns the opU rule contexts.
	GetOpU() IExpr_aritContext

	// GetOpDe returns the opDe rule contexts.
	GetOpDe() IExpr_aritContext

	// Get_primitivo returns the _primitivo rule contexts.
	Get_primitivo() IPrimitivoContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_casteo returns the _casteo rule contexts.
	Get_casteo() ICasteoContext

	// SetOpIz sets the opIz rule contexts.
	SetOpIz(IExpr_aritContext)

	// SetOpU sets the opU rule contexts.
	SetOpU(IExpr_aritContext)

	// SetOpDe sets the opDe rule contexts.
	SetOpDe(IExpr_aritContext)

	// Set_primitivo sets the _primitivo rule contexts.
	Set_primitivo(IPrimitivoContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_casteo sets the _casteo rule contexts.
	Set_casteo(ICasteoContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsExpr_aritContext differentiates from other interfaces.
	IsExpr_aritContext()
}

type Expr_aritContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	opIz        IExpr_aritContext
	op          antlr.Token
	opU         IExpr_aritContext
	opDe        IExpr_aritContext
	_primitivo  IPrimitivoContext
	_expression IExpressionContext
	_casteo     ICasteoContext
}

func NewEmptyExpr_aritContext() *Expr_aritContext {
	var p = new(Expr_aritContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_expr_arit
	return p
}

func (*Expr_aritContext) IsExpr_aritContext() {}

func NewExpr_aritContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Expr_aritContext {
	var p = new(Expr_aritContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_expr_arit

	return p
}

func (s *Expr_aritContext) GetParser() antlr.Parser { return s.parser }

func (s *Expr_aritContext) GetOp() antlr.Token { return s.op }

func (s *Expr_aritContext) SetOp(v antlr.Token) { s.op = v }

func (s *Expr_aritContext) GetOpIz() IExpr_aritContext { return s.opIz }

func (s *Expr_aritContext) GetOpU() IExpr_aritContext { return s.opU }

func (s *Expr_aritContext) GetOpDe() IExpr_aritContext { return s.opDe }

func (s *Expr_aritContext) Get_primitivo() IPrimitivoContext { return s._primitivo }

func (s *Expr_aritContext) Get_expression() IExpressionContext { return s._expression }

func (s *Expr_aritContext) Get_casteo() ICasteoContext { return s._casteo }

func (s *Expr_aritContext) SetOpIz(v IExpr_aritContext) { s.opIz = v }

func (s *Expr_aritContext) SetOpU(v IExpr_aritContext) { s.opU = v }

func (s *Expr_aritContext) SetOpDe(v IExpr_aritContext) { s.opDe = v }

func (s *Expr_aritContext) Set_primitivo(v IPrimitivoContext) { s._primitivo = v }

func (s *Expr_aritContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Expr_aritContext) Set_casteo(v ICasteoContext) { s._casteo = v }

func (s *Expr_aritContext) GetP() interfaces.Expresion { return s.p }

func (s *Expr_aritContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *Expr_aritContext) SUB() antlr.TerminalNode {
	return s.GetToken(RustParSUB, 0)
}

func (s *Expr_aritContext) AllExpr_arit() []IExpr_aritContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem())
	var tst = make([]IExpr_aritContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpr_aritContext)
		}
	}

	return tst
}

func (s *Expr_aritContext) Expr_arit(i int) IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *Expr_aritContext) T_NUMBER() antlr.TerminalNode {
	return s.GetToken(RustParT_NUMBER, 0)
}

func (s *Expr_aritContext) DOSPUNTO() antlr.TerminalNode {
	return s.GetToken(RustParDOSPUNTO, 0)
}

func (s *Expr_aritContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *Expr_aritContext) COMA() antlr.TerminalNode {
	return s.GetToken(RustParCOMA, 0)
}

func (s *Expr_aritContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *Expr_aritContext) POW() antlr.TerminalNode {
	return s.GetToken(RustParPOW, 0)
}

func (s *Expr_aritContext) T_FLOAT() antlr.TerminalNode {
	return s.GetToken(RustParT_FLOAT, 0)
}

func (s *Expr_aritContext) POWF() antlr.TerminalNode {
	return s.GetToken(RustParPOWF, 0)
}

func (s *Expr_aritContext) NOT() antlr.TerminalNode {
	return s.GetToken(RustParNOT, 0)
}

func (s *Expr_aritContext) Primitivo() IPrimitivoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrimitivoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrimitivoContext)
}

func (s *Expr_aritContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Expr_aritContext) Casteo() ICasteoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICasteoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ICasteoContext)
}

func (s *Expr_aritContext) MUL() antlr.TerminalNode {
	return s.GetToken(RustParMUL, 0)
}

func (s *Expr_aritContext) DIV() antlr.TerminalNode {
	return s.GetToken(RustParDIV, 0)
}

func (s *Expr_aritContext) MOD() antlr.TerminalNode {
	return s.GetToken(RustParMOD, 0)
}

func (s *Expr_aritContext) ADD() antlr.TerminalNode {
	return s.GetToken(RustParADD, 0)
}

func (s *Expr_aritContext) MENOR() antlr.TerminalNode {
	return s.GetToken(RustParMENOR, 0)
}

func (s *Expr_aritContext) MENORIGUAL() antlr.TerminalNode {
	return s.GetToken(RustParMENORIGUAL, 0)
}

func (s *Expr_aritContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(RustParMAYOR, 0)
}

func (s *Expr_aritContext) MAYORIGUAL() antlr.TerminalNode {
	return s.GetToken(RustParMAYORIGUAL, 0)
}

func (s *Expr_aritContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(RustParIGUAL, 0)
}

func (s *Expr_aritContext) DISTINTO() antlr.TerminalNode {
	return s.GetToken(RustParDISTINTO, 0)
}

func (s *Expr_aritContext) AND() antlr.TerminalNode {
	return s.GetToken(RustParAND, 0)
}

func (s *Expr_aritContext) OR() antlr.TerminalNode {
	return s.GetToken(RustParOR, 0)
}

func (s *Expr_aritContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Expr_aritContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Expr_aritContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterExpr_arit(s)
	}
}

func (s *Expr_aritContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitExpr_arit(s)
	}
}

func (p *RustPar) Expr_arit() (localctx IExpr_aritContext) {
	return p.expr_arit(0)
}

func (p *RustPar) expr_arit(_p int) (localctx IExpr_aritContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpr_aritContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpr_aritContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 10
	p.EnterRecursionRule(localctx, 10, RustParRULE_expr_arit, _p)
	var _la int

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(84)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 1, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(45)

			var _m = p.Match(RustParSUB)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(46)

			var _x = p.expr_arit(12)

			localctx.(*Expr_aritContext).opU = _x
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpU().GetP(), "-", nil, true, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 2:
		{
			p.SetState(49)
			p.Match(RustParT_NUMBER)
		}
		{
			p.SetState(50)
			p.Match(RustParDOSPUNTO)
		}
		{
			p.SetState(51)

			var _m = p.Match(RustParPOW)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(52)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(53)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
		}
		{
			p.SetState(54)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(55)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
		}
		{
			p.SetState(56)
			p.Match(RustParPARDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetText()
			}
		}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 3:
		{
			p.SetState(59)
			p.Match(RustParT_FLOAT)
		}
		{
			p.SetState(60)
			p.Match(RustParDOSPUNTO)
		}
		{
			p.SetState(61)

			var _m = p.Match(RustParPOWF)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(62)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(63)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
		}
		{
			p.SetState(64)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(65)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
		}
		{
			p.SetState(66)
			p.Match(RustParPARDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetText()
			}
		}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 4:
		{
			p.SetState(69)

			var _m = p.Match(RustParNOT)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(70)

			var _x = p.expr_arit(6)

			localctx.(*Expr_aritContext).opU = _x
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpU().GetP(), "!", nil, true, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 5:
		{
			p.SetState(73)

			var _x = p.Primitivo()

			localctx.(*Expr_aritContext)._primitivo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_primitivo().GetP()

	case 6:
		{
			p.SetState(76)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(77)

			var _x = p.Expression()

			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(78)
			p.Match(RustParPARDER)
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_expression().GetP()

	case 7:
		{
			p.SetState(81)

			var _x = p.Casteo()

			localctx.(*Expr_aritContext)._casteo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_casteo().GetP()

	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(113)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(111)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(86)

				if !(p.Precpred(p.GetParserRuleContext(), 9)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 9)", ""))
				}
				{
					p.SetState(87)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<RustParMUL)|(1<<RustParDIV)|(1<<RustParMOD))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(88)

					var _x = p.expr_arit(10)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 2:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(91)

				if !(p.Precpred(p.GetParserRuleContext(), 8)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 8)", ""))
				}
				{
					p.SetState(92)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == RustParADD || _la == RustParSUB) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(93)

					var _x = p.expr_arit(9)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 3:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(96)

				if !(p.Precpred(p.GetParserRuleContext(), 7)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 7)", ""))
				}
				{
					p.SetState(97)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<RustParDISTINTO)|(1<<RustParIGUAL)|(1<<RustParMAYORIGUAL)|(1<<RustParMENORIGUAL)|(1<<RustParMAYOR)|(1<<RustParMENOR))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(98)

					var _x = p.expr_arit(8)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 4:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(101)

				if !(p.Precpred(p.GetParserRuleContext(), 5)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 5)", ""))
				}
				{
					p.SetState(102)

					var _m = p.Match(RustParAND)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(103)

					var _x = p.expr_arit(6)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 5:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(106)

				if !(p.Precpred(p.GetParserRuleContext(), 4)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 4)", ""))
				}
				{
					p.SetState(107)

					var _m = p.Match(RustParOR)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(108)

					var _x = p.expr_arit(5)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			}

		}
		p.SetState(115)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())
	}

	return localctx
}

// ICasteoContext is an interface to support dynamic dispatch.
type ICasteoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_PARIZQ returns the _PARIZQ token.
	Get_PARIZQ() antlr.Token

	// Set_PARIZQ sets the _PARIZQ token.
	Set_PARIZQ(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetTypec returns the typec rule contexts.
	GetTypec() ITipo_castContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetTypec sets the typec rule contexts.
	SetTypec(ITipo_castContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsCasteoContext differentiates from other interfaces.
	IsCasteoContext()
}

type CasteoContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	_PARIZQ     antlr.Token
	_expression IExpressionContext
	typec       ITipo_castContext
}

func NewEmptyCasteoContext() *CasteoContext {
	var p = new(CasteoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_casteo
	return p
}

func (*CasteoContext) IsCasteoContext() {}

func NewCasteoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CasteoContext {
	var p = new(CasteoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_casteo

	return p
}

func (s *CasteoContext) GetParser() antlr.Parser { return s.parser }

func (s *CasteoContext) Get_PARIZQ() antlr.Token { return s._PARIZQ }

func (s *CasteoContext) Set_PARIZQ(v antlr.Token) { s._PARIZQ = v }

func (s *CasteoContext) Get_expression() IExpressionContext { return s._expression }

func (s *CasteoContext) GetTypec() ITipo_castContext { return s.typec }

func (s *CasteoContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *CasteoContext) SetTypec(v ITipo_castContext) { s.typec = v }

func (s *CasteoContext) GetP() interfaces.Expresion { return s.p }

func (s *CasteoContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *CasteoContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *CasteoContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *CasteoContext) AS() antlr.TerminalNode {
	return s.GetToken(RustParAS, 0)
}

func (s *CasteoContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *CasteoContext) Tipo_cast() ITipo_castContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipo_castContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipo_castContext)
}

func (s *CasteoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CasteoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CasteoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterCasteo(s)
	}
}

func (s *CasteoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitCasteo(s)
	}
}

func (p *RustPar) Casteo() (localctx ICasteoContext) {
	this := p
	_ = this

	localctx = NewCasteoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, RustParRULE_casteo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(116)

		var _m = p.Match(RustParPARIZQ)

		localctx.(*CasteoContext)._PARIZQ = _m
	}
	{
		p.SetState(117)

		var _x = p.Expression()

		localctx.(*CasteoContext)._expression = _x
	}
	{
		p.SetState(118)
		p.Match(RustParAS)
	}
	{
		p.SetState(119)

		var _x = p.Tipo_cast()

		localctx.(*CasteoContext).typec = _x
	}
	{
		p.SetState(120)
		p.Match(RustParPARDER)
	}
	localctx.(*CasteoContext).p = expresion.NewCasteo(localctx.(*CasteoContext).Get_expression().GetP(), localctx.(*CasteoContext).GetTypec().GetTc(), (func() int {
		if localctx.(*CasteoContext).Get_PARIZQ() == nil {
			return 0
		} else {
			return localctx.(*CasteoContext).Get_PARIZQ().GetLine()
		}
	}()), localctx.(*CasteoContext).Get_PARIZQ().GetColumn())

	return localctx
}

// ITipo_castContext is an interface to support dynamic dispatch.
type ITipo_castContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetTc returns the tc attribute.
	GetTc() interfaces.TipoExpresion

	// SetTc sets the tc attribute.
	SetTc(interfaces.TipoExpresion)

	// IsTipo_castContext differentiates from other interfaces.
	IsTipo_castContext()
}

type Tipo_castContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	tc     interfaces.TipoExpresion
}

func NewEmptyTipo_castContext() *Tipo_castContext {
	var p = new(Tipo_castContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_tipo_cast
	return p
}

func (*Tipo_castContext) IsTipo_castContext() {}

func NewTipo_castContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Tipo_castContext {
	var p = new(Tipo_castContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_tipo_cast

	return p
}

func (s *Tipo_castContext) GetParser() antlr.Parser { return s.parser }

func (s *Tipo_castContext) GetTc() interfaces.TipoExpresion { return s.tc }

func (s *Tipo_castContext) SetTc(v interfaces.TipoExpresion) { s.tc = v }

func (s *Tipo_castContext) T_FLOAT() antlr.TerminalNode {
	return s.GetToken(RustParT_FLOAT, 0)
}

func (s *Tipo_castContext) T_NUMBER() antlr.TerminalNode {
	return s.GetToken(RustParT_NUMBER, 0)
}

func (s *Tipo_castContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Tipo_castContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Tipo_castContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterTipo_cast(s)
	}
}

func (s *Tipo_castContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitTipo_cast(s)
	}
}

func (p *RustPar) Tipo_cast() (localctx ITipo_castContext) {
	this := p
	_ = this

	localctx = NewTipo_castContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, RustParRULE_tipo_cast)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(127)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParT_FLOAT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(123)
			p.Match(RustParT_FLOAT)
		}
		localctx.(*Tipo_castContext).tc = interfaces.FLOAT

	case RustParT_NUMBER:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(125)
			p.Match(RustParT_NUMBER)
		}
		localctx.(*Tipo_castContext).tc = interfaces.INTEGER

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IPrimitivoContext is an interface to support dynamic dispatch.
type IPrimitivoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_FLOAT returns the _FLOAT token.
	Get_FLOAT() antlr.Token

	// Get_TRUE returns the _TRUE token.
	Get_TRUE() antlr.Token

	// Get_FALSE returns the _FALSE token.
	Get_FALSE() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_FLOAT sets the _FLOAT token.
	Set_FLOAT(antlr.Token)

	// Set_TRUE sets the _TRUE token.
	Set_TRUE(antlr.Token)

	// Set_FALSE sets the _FALSE token.
	Set_FALSE(antlr.Token)

	// Get_strings returns the _strings rule contexts.
	Get_strings() IStringsContext

	// Set_strings sets the _strings rule contexts.
	Set_strings(IStringsContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsPrimitivoContext differentiates from other interfaces.
	IsPrimitivoContext()
}

type PrimitivoContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	p        interfaces.Expresion
	_NUMBER  antlr.Token
	_FLOAT   antlr.Token
	_strings IStringsContext
	_TRUE    antlr.Token
	_FALSE   antlr.Token
}

func NewEmptyPrimitivoContext() *PrimitivoContext {
	var p = new(PrimitivoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_primitivo
	return p
}

func (*PrimitivoContext) IsPrimitivoContext() {}

func NewPrimitivoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrimitivoContext {
	var p = new(PrimitivoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_primitivo

	return p
}

func (s *PrimitivoContext) GetParser() antlr.Parser { return s.parser }

func (s *PrimitivoContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *PrimitivoContext) Get_FLOAT() antlr.Token { return s._FLOAT }

func (s *PrimitivoContext) Get_TRUE() antlr.Token { return s._TRUE }

func (s *PrimitivoContext) Get_FALSE() antlr.Token { return s._FALSE }

func (s *PrimitivoContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *PrimitivoContext) Set_FLOAT(v antlr.Token) { s._FLOAT = v }

func (s *PrimitivoContext) Set_TRUE(v antlr.Token) { s._TRUE = v }

func (s *PrimitivoContext) Set_FALSE(v antlr.Token) { s._FALSE = v }

func (s *PrimitivoContext) Get_strings() IStringsContext { return s._strings }

func (s *PrimitivoContext) Set_strings(v IStringsContext) { s._strings = v }

func (s *PrimitivoContext) GetP() interfaces.Expresion { return s.p }

func (s *PrimitivoContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *PrimitivoContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(RustParNUMBER, 0)
}

func (s *PrimitivoContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(RustParFLOAT, 0)
}

func (s *PrimitivoContext) Strings() IStringsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IStringsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IStringsContext)
}

func (s *PrimitivoContext) TRUE() antlr.TerminalNode {
	return s.GetToken(RustParTRUE, 0)
}

func (s *PrimitivoContext) FALSE() antlr.TerminalNode {
	return s.GetToken(RustParFALSE, 0)
}

func (s *PrimitivoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrimitivoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrimitivoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterPrimitivo(s)
	}
}

func (s *PrimitivoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitPrimitivo(s)
	}
}

func (p *RustPar) Primitivo() (localctx IPrimitivoContext) {
	this := p
	_ = this

	localctx = NewPrimitivoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, RustParRULE_primitivo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(140)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParNUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(129)

			var _m = p.Match(RustParNUMBER)

			localctx.(*PrimitivoContext)._NUMBER = _m
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(num, interfaces.INTEGER, (func() int {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_NUMBER().GetColumn())

	case RustParFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(131)

			var _m = p.Match(RustParFLOAT)

			localctx.(*PrimitivoContext)._FLOAT = _m
		}

		num, err := strconv.ParseFloat((func() string {
			if localctx.(*PrimitivoContext).Get_FLOAT() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_FLOAT().GetText()
			}
		}()), 64)
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(num, interfaces.FLOAT, (func() int {
			if localctx.(*PrimitivoContext).Get_FLOAT() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_FLOAT().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_FLOAT().GetColumn())

	case RustParSTRING, RustParAMP:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(133)

			var _x = p.Strings()

			localctx.(*PrimitivoContext)._strings = _x
		}
		localctx.(*PrimitivoContext).p = localctx.(*PrimitivoContext).Get_strings().GetP()

	case RustParTRUE:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(136)

			var _m = p.Match(RustParTRUE)

			localctx.(*PrimitivoContext)._TRUE = _m
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(true, interfaces.BOOLEAN, (func() int {
			if localctx.(*PrimitivoContext).Get_TRUE() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_TRUE().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())

	case RustParFALSE:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(138)

			var _m = p.Match(RustParFALSE)

			localctx.(*PrimitivoContext)._FALSE = _m
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(false, interfaces.BOOLEAN, (func() int {
			if localctx.(*PrimitivoContext).Get_FALSE() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_FALSE().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IStringsContext is an interface to support dynamic dispatch.
type IStringsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_STRING returns the _STRING token.
	Get_STRING() antlr.Token

	// Set_STRING sets the _STRING token.
	Set_STRING(antlr.Token)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsStringsContext differentiates from other interfaces.
	IsStringsContext()
}

type StringsContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	p       interfaces.Expresion
	_STRING antlr.Token
}

func NewEmptyStringsContext() *StringsContext {
	var p = new(StringsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_strings
	return p
}

func (*StringsContext) IsStringsContext() {}

func NewStringsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StringsContext {
	var p = new(StringsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_strings

	return p
}

func (s *StringsContext) GetParser() antlr.Parser { return s.parser }

func (s *StringsContext) Get_STRING() antlr.Token { return s._STRING }

func (s *StringsContext) Set_STRING(v antlr.Token) { s._STRING = v }

func (s *StringsContext) GetP() interfaces.Expresion { return s.p }

func (s *StringsContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *StringsContext) STRING() antlr.TerminalNode {
	return s.GetToken(RustParSTRING, 0)
}

func (s *StringsContext) AllAMP() []antlr.TerminalNode {
	return s.GetTokens(RustParAMP)
}

func (s *StringsContext) AMP(i int) antlr.TerminalNode {
	return s.GetToken(RustParAMP, i)
}

func (s *StringsContext) TO_STRING() antlr.TerminalNode {
	return s.GetToken(RustParTO_STRING, 0)
}

func (s *StringsContext) TO_OWNED() antlr.TerminalNode {
	return s.GetToken(RustParTO_OWNED, 0)
}

func (s *StringsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StringsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StringsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterStrings(s)
	}
}

func (s *StringsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitStrings(s)
	}
}

func (p *RustPar) Strings() (localctx IStringsContext) {
	this := p
	_ = this

	localctx = NewStringsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, RustParRULE_strings)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(157)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		p.SetState(143)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for ok := true; ok; ok = _la == RustParAMP {
			{
				p.SetState(142)
				p.Match(RustParAMP)
			}

			p.SetState(145)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(147)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}
		p.SetState(149)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(148)
				_la = p.GetTokenStream().LA(1)

				if !(_la == RustParTO_STRING || _la == RustParTO_OWNED) {
					p.GetErrorHandler().RecoverInline(p)
				} else {
					p.GetErrorHandler().ReportMatch(p)
					p.Consume()
				}
			}

		}

		str := (func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}()))-1]
		localctx.(*StringsContext).p = expresion.NewPrimitivo(str, interfaces.STR, (func() int {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*StringsContext).Get_STRING().GetLine()
			}
		}()), localctx.(*StringsContext).Get_STRING().GetColumn())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(152)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}
		{
			p.SetState(153)
			_la = p.GetTokenStream().LA(1)

			if !(_la == RustParTO_STRING || _la == RustParTO_OWNED) {
				p.GetErrorHandler().RecoverInline(p)
			} else {
				p.GetErrorHandler().ReportMatch(p)
				p.Consume()
			}
		}

		str := (func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}()))-1]
		localctx.(*StringsContext).p = expresion.NewPrimitivo(str, interfaces.STRING, (func() int {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*StringsContext).Get_STRING().GetLine()
			}
		}()), localctx.(*StringsContext).Get_STRING().GetColumn())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(155)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}

		str := (func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}()))-1]
		localctx.(*StringsContext).p = expresion.NewPrimitivo(str, interfaces.STR, (func() int {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*StringsContext).Get_STRING().GetLine()
			}
		}()), localctx.(*StringsContext).Get_STRING().GetColumn())

	}

	return localctx
}

func (p *RustPar) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 5:
		var t *Expr_aritContext = nil
		if localctx != nil {
			t = localctx.(*Expr_aritContext)
		}
		return p.Expr_arit_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *RustPar) Expr_arit_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 9)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 8)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 7)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 5)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 4)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
