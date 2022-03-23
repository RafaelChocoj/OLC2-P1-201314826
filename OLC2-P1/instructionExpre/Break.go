package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
)

type Break struct {
	Exp    interfaces.Expresion
	Line   int
	Column int
}

func NewBreak(exp interfaces.Expresion, line int, column int) Break {
	bre := Break{exp, line, column}
	return bre
}

func (p Break) Ejecutar(env interface{}) interface{} {
	var result interfaces.Symbol
	//validar ciclo entorno
	if env.(environment.Environment).IsLoopEnt() {
		if p.Exp == nil {

			result = interfaces.Symbol{
				Line:    p.Line,
				Column:  p.Column,
				Id:      "BREAK",
				Tipo:    interfaces.BREAK,
				TipoRet: interfaces.BREAK,
				Valor:   nil,
			}
			return result
		} else {

			varbreak := p.Exp.EjecutarValor(env)
			//fmt.Println("++++ varbreak: ", varbreak)
			result = interfaces.Symbol{
				Line:    p.Line,
				Column:  p.Column,
				Id:      "BREAK",
				Tipo:    varbreak.Tipo,
				TipoRet: interfaces.BREAK,
				Valor:   varbreak.Valor,
			}
		}
	} else {
		err.NewError("La sentencia 'break' tiene que estar dentro de un ciclo ",
			env.(environment.Environment).Nombre, p.Line, p.Column)
	}
	return result
}
