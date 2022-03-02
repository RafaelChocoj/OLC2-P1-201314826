package expresion

import (
	"OLC2/interfaces"
)

type Primitivo struct {
	Valor  interface{}
	Tipo   interfaces.TipoExpresion
	Line   int
	Column int
}

func (p Primitivo) Ejecutar( /*env interface{}*/ ) interfaces.Symbol {

	return interfaces.Symbol{
		Id:    "",
		Tipo:  p.Tipo,
		Valor: p.Valor,
	}
}

func NewPrimitivo(val interface{}, tipo interfaces.TipoExpresion, line int, column int) Primitivo {

	exp := Primitivo{val, tipo, line, column}
	return exp
}
