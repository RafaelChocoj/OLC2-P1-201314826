package expresion

import "OLC2/interfaces"

type Clone struct {
	Expre  interfaces.Expresion
	Line   int
	Column int
}

func NewClone(Expre interfaces.Expresion, line int, column int) Clone {
	expr := Clone{Expre, line, column}
	return expr
}

func (p Clone) EjecutarValor(env interface{}) interfaces.Symbol {
	var result interfaces.Symbol

	ExpClone := p.Expre.EjecutarValor(env)

	result = interfaces.Symbol{
		Id:    ExpClone.Id,
		Tipo:  ExpClone.Tipo,
		Valor: ExpClone.Valor,
		IsMut: ExpClone.IsMut,

		Line:   ExpClone.Line,
		Column: ExpClone.Column,

		TiposArr: ExpClone.TiposArr, ///.Clone(),

		ListParams: ExpClone.ListParams, //.Clone(),

		Capacity: ExpClone.Capacity,

		TipoRet:    ExpClone.TipoRet,
		RetObjeto:  ExpClone.RetObjeto,
		TipoVecCon: ExpClone.TipoVecCon,
	}

	return result
}
