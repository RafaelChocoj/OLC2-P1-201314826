// Code generated from RustLex.g4 by ANTLR 4.9.3. DO NOT EDIT.

package parser

import (
	"fmt"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = unicode.IsLetter

var serializedLexerAtn = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 29, 166,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4,
	18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23,
	9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9,
	28, 4, 29, 9, 29, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2,
	3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7,
	3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 9, 6, 9, 99, 10, 9, 13, 9, 14, 9, 100,
	3, 10, 6, 10, 104, 10, 10, 13, 10, 14, 10, 105, 3, 10, 3, 10, 6, 10, 110,
	10, 10, 13, 10, 14, 10, 111, 3, 11, 3, 11, 7, 11, 116, 10, 11, 12, 11,
	14, 11, 119, 11, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 13, 3, 13, 3, 14, 3,
	14, 3, 15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 18, 3, 18,
	3, 19, 3, 19, 3, 20, 3, 20, 3, 21, 3, 21, 3, 22, 3, 22, 3, 23, 3, 23, 3,
	24, 3, 24, 3, 25, 3, 25, 3, 26, 3, 26, 3, 27, 3, 27, 3, 28, 6, 28, 158,
	10, 28, 13, 28, 14, 28, 159, 3, 28, 3, 28, 3, 29, 3, 29, 3, 29, 2, 2, 30,
	3, 3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23,
	13, 25, 14, 27, 15, 29, 16, 31, 17, 33, 18, 35, 19, 37, 20, 39, 21, 41,
	22, 43, 23, 45, 24, 47, 25, 49, 26, 51, 27, 53, 28, 55, 29, 57, 2, 3, 2,
	7, 3, 2, 50, 59, 3, 2, 48, 48, 3, 2, 36, 36, 6, 2, 11, 12, 15, 15, 34,
	34, 94, 94, 9, 2, 34, 35, 37, 37, 45, 45, 47, 48, 60, 60, 66, 66, 93, 95,
	2, 169, 2, 3, 3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3,
	2, 2, 2, 2, 11, 3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17,
	3, 2, 2, 2, 2, 19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2,
	25, 3, 2, 2, 2, 2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2,
	2, 33, 3, 2, 2, 2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2,
	2, 2, 41, 3, 2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 3, 2,
	2, 2, 2, 49, 3, 2, 2, 2, 2, 51, 3, 2, 2, 2, 2, 53, 3, 2, 2, 2, 2, 55, 3,
	2, 2, 2, 3, 59, 3, 2, 2, 2, 5, 68, 3, 2, 2, 2, 7, 72, 3, 2, 2, 2, 9, 76,
	3, 2, 2, 2, 11, 83, 3, 2, 2, 2, 13, 88, 3, 2, 2, 2, 15, 94, 3, 2, 2, 2,
	17, 98, 3, 2, 2, 2, 19, 103, 3, 2, 2, 2, 21, 113, 3, 2, 2, 2, 23, 122,
	3, 2, 2, 2, 25, 124, 3, 2, 2, 2, 27, 126, 3, 2, 2, 2, 29, 128, 3, 2, 2,
	2, 31, 131, 3, 2, 2, 2, 33, 134, 3, 2, 2, 2, 35, 136, 3, 2, 2, 2, 37, 138,
	3, 2, 2, 2, 39, 140, 3, 2, 2, 2, 41, 142, 3, 2, 2, 2, 43, 144, 3, 2, 2,
	2, 45, 146, 3, 2, 2, 2, 47, 148, 3, 2, 2, 2, 49, 150, 3, 2, 2, 2, 51, 152,
	3, 2, 2, 2, 53, 154, 3, 2, 2, 2, 55, 157, 3, 2, 2, 2, 57, 163, 3, 2, 2,
	2, 59, 60, 7, 114, 2, 2, 60, 61, 7, 116, 2, 2, 61, 62, 7, 107, 2, 2, 62,
	63, 7, 112, 2, 2, 63, 64, 7, 118, 2, 2, 64, 65, 7, 110, 2, 2, 65, 66, 7,
	112, 2, 2, 66, 67, 7, 35, 2, 2, 67, 4, 3, 2, 2, 2, 68, 69, 7, 107, 2, 2,
	69, 70, 7, 56, 2, 2, 70, 71, 7, 54, 2, 2, 71, 6, 3, 2, 2, 2, 72, 73, 7,
	104, 2, 2, 73, 74, 7, 56, 2, 2, 74, 75, 7, 54, 2, 2, 75, 8, 3, 2, 2, 2,
	76, 77, 7, 117, 2, 2, 77, 78, 7, 118, 2, 2, 78, 79, 7, 116, 2, 2, 79, 80,
	7, 107, 2, 2, 80, 81, 7, 112, 2, 2, 81, 82, 7, 105, 2, 2, 82, 10, 3, 2,
	2, 2, 83, 84, 7, 118, 2, 2, 84, 85, 7, 116, 2, 2, 85, 86, 7, 119, 2, 2,
	86, 87, 7, 103, 2, 2, 87, 12, 3, 2, 2, 2, 88, 89, 7, 104, 2, 2, 89, 90,
	7, 99, 2, 2, 90, 91, 7, 110, 2, 2, 91, 92, 7, 117, 2, 2, 92, 93, 7, 103,
	2, 2, 93, 14, 3, 2, 2, 2, 94, 95, 7, 99, 2, 2, 95, 96, 7, 117, 2, 2, 96,
	16, 3, 2, 2, 2, 97, 99, 9, 2, 2, 2, 98, 97, 3, 2, 2, 2, 99, 100, 3, 2,
	2, 2, 100, 98, 3, 2, 2, 2, 100, 101, 3, 2, 2, 2, 101, 18, 3, 2, 2, 2, 102,
	104, 9, 2, 2, 2, 103, 102, 3, 2, 2, 2, 104, 105, 3, 2, 2, 2, 105, 103,
	3, 2, 2, 2, 105, 106, 3, 2, 2, 2, 106, 107, 3, 2, 2, 2, 107, 109, 9, 3,
	2, 2, 108, 110, 9, 2, 2, 2, 109, 108, 3, 2, 2, 2, 110, 111, 3, 2, 2, 2,
	111, 109, 3, 2, 2, 2, 111, 112, 3, 2, 2, 2, 112, 20, 3, 2, 2, 2, 113, 117,
	7, 36, 2, 2, 114, 116, 10, 4, 2, 2, 115, 114, 3, 2, 2, 2, 116, 119, 3,
	2, 2, 2, 117, 115, 3, 2, 2, 2, 117, 118, 3, 2, 2, 2, 118, 120, 3, 2, 2,
	2, 119, 117, 3, 2, 2, 2, 120, 121, 7, 36, 2, 2, 121, 22, 3, 2, 2, 2, 122,
	123, 7, 48, 2, 2, 123, 24, 3, 2, 2, 2, 124, 125, 7, 61, 2, 2, 125, 26,
	3, 2, 2, 2, 126, 127, 7, 63, 2, 2, 127, 28, 3, 2, 2, 2, 128, 129, 7, 64,
	2, 2, 129, 130, 7, 63, 2, 2, 130, 30, 3, 2, 2, 2, 131, 132, 7, 62, 2, 2,
	132, 133, 7, 63, 2, 2, 133, 32, 3, 2, 2, 2, 134, 135, 7, 64, 2, 2, 135,
	34, 3, 2, 2, 2, 136, 137, 7, 62, 2, 2, 137, 36, 3, 2, 2, 2, 138, 139, 7,
	44, 2, 2, 139, 38, 3, 2, 2, 2, 140, 141, 7, 49, 2, 2, 141, 40, 3, 2, 2,
	2, 142, 143, 7, 45, 2, 2, 143, 42, 3, 2, 2, 2, 144, 145, 7, 47, 2, 2, 145,
	44, 3, 2, 2, 2, 146, 147, 7, 39, 2, 2, 147, 46, 3, 2, 2, 2, 148, 149, 7,
	42, 2, 2, 149, 48, 3, 2, 2, 2, 150, 151, 7, 43, 2, 2, 151, 50, 3, 2, 2,
	2, 152, 153, 7, 125, 2, 2, 153, 52, 3, 2, 2, 2, 154, 155, 7, 127, 2, 2,
	155, 54, 3, 2, 2, 2, 156, 158, 9, 5, 2, 2, 157, 156, 3, 2, 2, 2, 158, 159,
	3, 2, 2, 2, 159, 157, 3, 2, 2, 2, 159, 160, 3, 2, 2, 2, 160, 161, 3, 2,
	2, 2, 161, 162, 8, 28, 2, 2, 162, 56, 3, 2, 2, 2, 163, 164, 7, 94, 2, 2,
	164, 165, 9, 6, 2, 2, 165, 58, 3, 2, 2, 2, 8, 2, 100, 105, 111, 117, 159,
	3, 8, 2, 2,
}

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "'println!'", "'i64'", "'f64'", "'string'", "'true'", "'false'", "'as'",
	"", "", "", "'.'", "';'", "'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'",
	"'+'", "'-'", "'%'", "'('", "')'", "'{'", "'}'",
}

var lexerSymbolicNames = []string{
	"", "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", "AS",
	"NUMBER", "FLOAT", "STRING", "PUNTO", "PTCOMA", "IGUAL", "MAYORIGUAL",
	"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ",
	"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE",
}

var lexerRuleNames = []string{
	"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", "AS",
	"NUMBER", "FLOAT", "STRING", "PUNTO", "PTCOMA", "IGUAL", "MAYORIGUAL",
	"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ",
	"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "ESC_SEQ",
}

type RustLex struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

// NewRustLex produces a new lexer instance for the optional input antlr.CharStream.
//
// The *RustLex instance produced may be reused by calling the SetInputStream method.
// The initial lexer configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewRustLex(input antlr.CharStream) *RustLex {
	l := new(RustLex)
	lexerDeserializer := antlr.NewATNDeserializer(nil)
	lexerAtn := lexerDeserializer.DeserializeFromUInt16(serializedLexerAtn)
	lexerDecisionToDFA := make([]*antlr.DFA, len(lexerAtn.DecisionToState))
	for index, ds := range lexerAtn.DecisionToState {
		lexerDecisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	l.BaseLexer = antlr.NewBaseLexer(input)
	l.Interpreter = antlr.NewLexerATNSimulator(l, lexerAtn, lexerDecisionToDFA, antlr.NewPredictionContextCache())

	l.channelNames = lexerChannelNames
	l.modeNames = lexerModeNames
	l.RuleNames = lexerRuleNames
	l.LiteralNames = lexerLiteralNames
	l.SymbolicNames = lexerSymbolicNames
	l.GrammarFileName = "RustLex.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// RustLex tokens.
const (
	RustLexPRINT_CON  = 1
	RustLexT_NUMBER   = 2
	RustLexT_FLOAT    = 3
	RustLexT_STRING   = 4
	RustLexTRUE       = 5
	RustLexFALSE      = 6
	RustLexAS         = 7
	RustLexNUMBER     = 8
	RustLexFLOAT      = 9
	RustLexSTRING     = 10
	RustLexPUNTO      = 11
	RustLexPTCOMA     = 12
	RustLexIGUAL      = 13
	RustLexMAYORIGUAL = 14
	RustLexMENORIGUAL = 15
	RustLexMAYOR      = 16
	RustLexMENOR      = 17
	RustLexMUL        = 18
	RustLexDIV        = 19
	RustLexADD        = 20
	RustLexSUB        = 21
	RustLexMOD        = 22
	RustLexPARIZQ     = 23
	RustLexPARDER     = 24
	RustLexLLAVEIZQ   = 25
	RustLexLLAVEDER   = 26
	RustLexWHITESPACE = 27
)
