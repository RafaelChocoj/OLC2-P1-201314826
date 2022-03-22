package interfaces

import arrayList "github.com/colegno/arraylist"

type Symbol struct {
	Id    string
	Tipo  TipoExpresion
	Valor interface{}
	IsMut bool

	Line   int
	Column int

	TiposArr *arrayList.List

	ListParams *arrayList.List

	Capacity int
}

type Expresion interface {
	EjecutarValor(env interface{}) Symbol
}

type Instruction interface {
	Ejecutar(env interface{}) interface{}
}

////
type InstructionExpresion interface {
	Ejecutar(env interface{})
}
