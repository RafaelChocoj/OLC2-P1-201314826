package expresion

import (
	"OLC2/environment"
	"OLC2/interfaces"
)

type Identificador struct {
	Id     string
	Line   int
	Column int
}

func NewIdentificador(id string, line int, column int) Identificador {
	exp := Identificador{Id: id, Line: line, Column: column}
	return exp
}

func (p Identificador) EjecutarValor(env interface{}) interfaces.Symbol {

	result := env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)

	//fmt.Println("**result.Capacity****", result.Capacity)
	//fmt.Println("**result.Valor.(interfaces.Symbol).Capacity****", result.Valor.(interfaces.Symbol).Capacity)
	return result.Valor.(interfaces.Symbol)
}
