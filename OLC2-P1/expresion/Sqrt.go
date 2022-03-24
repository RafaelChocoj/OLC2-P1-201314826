package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"math"
)

type Sqrt struct {
	Expre  interfaces.Expresion
	Line   int
	Column int
}

func NewSqrt(Expre interfaces.Expresion, line int, column int) Sqrt {
	expr := Sqrt{Expre, line, column}
	return expr
}

func (p Sqrt) EjecutarValor(env interface{}) interfaces.Symbol {

	var result interfaces.Symbol
	ExpSqrt := p.Expre.EjecutarValor(env)

	if ExpSqrt.Tipo == interfaces.FLOAT {

		result = interfaces.Symbol{
			Line:   p.Line,
			Column: p.Column,
			Id:     "",
			Tipo:   ExpSqrt.Tipo,
			Valor:  math.Sqrt(ExpSqrt.Valor.(float64)),
		}
	} else {
		desc := fmt.Sprintf("se esperaba 'f64' se tiene '%v'", interfaces.GetType(ExpSqrt.Tipo))
		err.NewError("Tipos no coinciden "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return ExpSqrt
	}

	return result

}
