package instructionExpre

import (
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type CallFunction struct {
	IdFun            string
	ListaExpresiones *arrayList.List
}

func NewCallFunction(idfuncion string, listExpresiones *arrayList.List) CallFunction {
	return CallFunction{IdFun: idfuncion, ListaExpresiones: listExpresiones}
}

func (p CallFunction) EjecutarValor(env interface{}) interfaces.Symbol {

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
}
func (m CallFunction) Ejecutar(env interface{}) interface{} {
	return nil
}
