package interfaces

import (
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Function struct {
	Symbol
	ListaParamsDecl    *arrayList.List
	ListaInstrucciones *arrayList.List
}

func NewFunction(id string, listaParams *arrayList.List, listaInstrucciones *arrayList.List, tipo TipoExpresion) Function {
	//funcSimbolo := entorno.NewSimboloFuncion(0, 0, nombre, tipo, listaParams)
	funcSymbol := Symbol{Id: id, Tipo: tipo, Valor: nil, ListParams: listaParams}

	return Function{
		ListaInstrucciones: listaInstrucciones,
		ListaParamsDecl:    listaParams,
		Symbol:             funcSymbol,
	}
}

func (f Function) Ejecutar(env interface{}) interface{} {

	for _, s := range f.ListaInstrucciones.ToArray() {
		valorInst := s.(Instruction).Ejecutar(env)
		//typeRetFun := f.Tipo

		fmt.Println("valorInst: ", valorInst)

		if valorInst != nil {
			//fmt.Println("	reflect.TypeOf(valorInst): ", reflect.TypeOf(valorInst))
			//fmt.Println("	reflect.TypeOf(Symbol{}): ", reflect.TypeOf(Symbol{}))

			/*if reflect.TypeOf(valorInstruccion) != reflect.TypeOf(entorno.ValorType{}) {
				fmt.Println("Error en función, se esperaba un retorno valido")
				return entorno.ValorType{Tipo: entorno.NULL, Valor: -1}
			}*/

		}
	}

	return Symbol{Id: "", Tipo: NULL, Valor: nil}
}
