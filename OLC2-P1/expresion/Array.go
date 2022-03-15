package expresion

import (
	//err "OLC2/environment"
	"OLC2/interfaces"
	//"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Array struct {
	ListExp *arrayList.List
	Line   int
	Column int
}

func NewArray(list *arrayList.List, line int, column int) Array {
	exp := Array{list, line, column}
	return exp
}

func (p Array) Ejecutar(env interface{}) interfaces.Symbol {

	var tempExp *arrayList.List
	tempExp = arrayList.New()

	for _, s := range p.ListExp.ToArray() {
		tempExp.Add(s.(interfaces.Expresion).Ejecutar(env))
	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.ARRAY,
		Valor: tempExp,
	}
}