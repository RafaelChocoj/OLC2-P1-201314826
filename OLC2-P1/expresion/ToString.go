package expresion

import (
	"OLC2/interfaces"
	"fmt"
)

type ToString struct {
	Expre  interfaces.Expresion
	Line   int
	Column int
}

func NewToString(Expre interfaces.Expresion, line int, column int) ToString {
	expr := ToString{Expre, line, column}
	return expr
}

func (p ToString) EjecutarValor(env interface{}) interfaces.Symbol {

	var result interfaces.Symbol
	Exp := p.Expre.EjecutarValor(env)

	result = interfaces.Symbol{
		Line:   p.Line,
		Column: p.Column,
		Id:     "",
		Tipo:   interfaces.STRING,
		Valor:  fmt.Sprintf("%v", Exp.Valor),
	}

	return result

}
