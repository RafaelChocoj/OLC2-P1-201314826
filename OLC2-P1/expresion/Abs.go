package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"math"
)

type Abs struct {
	Expre  interfaces.Expresion
	Line   int
	Column int
}

func NewAbs(Expre interfaces.Expresion, line int, column int) Abs {
	expr := Abs{Expre, line, column}
	return expr
}

func (p Abs) EjecutarValor(env interface{}) interfaces.Symbol {

	var result interfaces.Symbol
	ExpAbso := p.Expre.EjecutarValor(env)

	if ExpAbso.Tipo == interfaces.INTEGER {

		result = interfaces.Symbol{
			Line:   p.Line,
			Column: p.Column,
			Id:     "",
			Tipo:   ExpAbso.Tipo,
			Valor:  int(math.Abs(float64(ExpAbso.Valor.(int)))),
		}
	} else if ExpAbso.Tipo == interfaces.FLOAT {

		result = interfaces.Symbol{
			Line:   p.Line,
			Column: p.Column,
			Id:     "",
			Tipo:   ExpAbso.Tipo,
			Valor:  math.Abs(ExpAbso.Valor.(float64)),
		}
	} else {
		desc := fmt.Sprintf("se esperaba 'i64 o f64' se tiene '%v'", interfaces.GetType(ExpAbso.Tipo))
		err.NewError("Tipos no coinciden "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return ExpAbso
	}

	return result

}
