package interfaces

import (
	//"OLC2/environment"

	"fmt"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Function struct {
	Symbol
	ListaParamsDecl    *arrayList.List
	ListaInstrucciones *arrayList.List

	Line   int
	Column int
}

func NewFunction(id string, listaParams *arrayList.List, listaInstrucciones *arrayList.List, tipo TipoExpresion, line int, column int) Function {
	//funcSimbolo := entorno.NewSimboloFuncion(0, 0, nombre, tipo, listaParams)
	funcSymbol := Symbol{Id: id, Tipo: tipo, Valor: nil, ListParams: listaParams}

	return Function{
		ListaInstrucciones: listaInstrucciones,
		ListaParamsDecl:    listaParams,
		Symbol:             funcSymbol,
		Line:               line,
		Column:             column,
	}
}

func (f Function) Ejecutar(env interface{}) interface{} {

	for _, s := range f.ListaInstrucciones.ToArray() {
		valorInst := s.(Instruction).Ejecutar(env)
		//typeRetFun := f.Tipo

		//fmt.Println("valorInst: ", valorInst)

		if valorInst != nil {
			fmt.Println("	reflect.TypeOf(valorInst): ", reflect.TypeOf(valorInst))
			fmt.Println("	reflect.TypeOf(Symbol{}): ", reflect.TypeOf(Symbol{}))

			if reflect.TypeOf(valorInst) != reflect.TypeOf(Symbol{}) {
				//fmt.Println("Error en función, se esperaba un retorno valido")
				//err.NewError("Error en función, se esperaba un retorno valido ", env.(environment.Environment).Nombre, f.Line, f.Column)
				return Symbol{Id: "", Tipo: NULL, Valor: nil}
			}

		}
	}

	return Symbol{Id: "", Tipo: NULL, Valor: nil}
}
