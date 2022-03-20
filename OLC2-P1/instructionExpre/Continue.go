package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
)

type Continue struct {
	Line   int
	Column int
}

func NewContinue(line int, column int) Continue {
	con := Continue{line, column}
	return con
}

func (p Continue) Ejecutar(env interface{}) interface{} {
	var result interfaces.Symbol
	//validar ciclo entorno
	if env.(environment.Environment).IsLoopEnt() {
		result = interfaces.Symbol{
			Line:   p.Line,
			Column: p.Column,
			Id:     "CONTINUE",
			Tipo:   interfaces.CONTINUE,
			Valor:  nil,
		}
	} else {
		err.NewError("La sentencia 'continue' tiene que estar dentro de un ciclo ",
			env.(environment.Environment).Nombre, p.Line, p.Column)
	}
	return result
}
