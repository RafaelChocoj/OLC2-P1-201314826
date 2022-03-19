package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/instruction"
	"OLC2/interfaces"
	"fmt"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Function struct {
	interfaces.Symbol
	ListaParamsDecl    *arrayList.List
	ListaInstrucciones *arrayList.List

	Line   int
	Column int
}

func NewFunction(id string, listaParams *arrayList.List, listaInstrucciones *arrayList.List, tipo interfaces.TipoExpresion, line int, column int) Function {
	//funcSimbolo := entorno.NewSimboloFuncion(0, 0, nombre, tipo, listaParams)
	funcSymbol := interfaces.Symbol{Id: id, Tipo: tipo, Valor: nil, ListParams: listaParams}

	return Function{
		ListaInstrucciones: listaInstrucciones,
		ListaParamsDecl:    listaParams,
		Symbol:             funcSymbol,
		Line:               line,
		Column:             column,
	}
}

func (f Function) EjecutarParamets(env interface{}, expre_list *arrayList.List) bool {

	l_declaraciones := f.ListaParamsDecl.Clone()

	//fmt.Println("**	", expre_list)
	//fmt.Println("**	", l_declaraciones)

	if l_declaraciones.Len() != expre_list.Len() {
		//fmt.Println("Error en variables")
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", l_declaraciones.Len(), expre_list.Len())
		err.NewError("Cantidad de parametros en función incorrectos "+desc, env.(environment.Environment).Nombre, f.Line, f.Column)
		return false
	}

	for i := 0; i < l_declaraciones.Len(); i++ {
		par_i := l_declaraciones.GetValue(i).(instruction.Declaration)
		par_i.Expresion = expre_list.GetValue(i).(interfaces.Expresion)

		par_i.Ejecutar(env)
	}

	return true
}
func (f Function) Ejecutar(env interface{}) interface{} {

	for _, s := range f.ListaInstrucciones.ToArray() {
		valorInst := s.(interfaces.Instruction).Ejecutar(env)

		//fmt.Println("valorInst: ", valorInst)

		if valorInst != nil {
			//fmt.Println("	reflect.TypeOf(valorInst): ", reflect.TypeOf(valorInst))
			//fmt.Println("	reflect.TypeOf(Symbol{}): ", reflect.TypeOf(interfaces.Symbol{}))

			if reflect.TypeOf(valorInst) != reflect.TypeOf(interfaces.Symbol{}) {
				//fmt.Println("Error en función, se esperaba un retorno valido")
				err.NewError("Error en función, se esperaba un retorno valido ", env.(environment.Environment).Nombre, f.Line, f.Column)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}

			typeFun := f.Tipo
			valRetorno := valorInst.(interfaces.Symbol)

			fmt.Println("valRetorno.Tipo", valRetorno.Tipo)
			fmt.Println("typeFun", typeFun)

			if typeFun != valRetorno.Tipo {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(typeFun), interfaces.GetType(valRetorno.Tipo))
				err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, f.Line, f.Column)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}

			return valRetorno

		}
	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
}
