package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type Capacity struct {
	Expre  interfaces.Expresion
	Line   int
	Column int
}

func NewCapacity(Expre interfaces.Expresion, line int, column int) Capacity {

	exp := Capacity{Expre, line, column}
	return exp
}

func (p Capacity) EjecutarValor(env interface{}) interfaces.Symbol {

	var retornoExp interfaces.Symbol
	retornoExp = p.Expre.EjecutarValor(env)

	if retornoExp.Tipo == interfaces.VECTOR {

		//fmt.Println("---      reflect.TypeOf(retornoExp)..Valor", reflect.TypeOf(retornoExp.Valor))
		return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: retornoExp.Capacity}

	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", "array o vector", interfaces.GetType(retornoExp.Tipo))
		err.NewError("Uso de Función incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
}
