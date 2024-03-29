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

	EntornoFun interface{}

	lLocal *arrayList.List
	lFunc  *arrayList.List

	eLocal interface{}
	eFunc  interface{}

	IdObje string
}

func NewFunction(id string, listaParams *arrayList.List, listaInstrucciones *arrayList.List, tipo interfaces.TipoExpresion, line int, column int, idObje string) Function {
	//funcSimbolo := entorno.NewSimboloFuncion(0, 0, nombre, tipo, listaParams)
	funcSymbol := interfaces.Symbol{Id: id, Tipo: tipo, Valor: nil, ListParams: listaParams}

	return Function{
		ListaInstrucciones: listaInstrucciones,
		ListaParamsDecl:    listaParams,
		Symbol:             funcSymbol,
		Line:               line,
		Column:             column,
		EntornoFun:         nil,

		lLocal: arrayList.New(),
		lFunc:  arrayList.New(),

		eLocal: nil,
		eFunc:  nil,

		IdObje: idObje,
	}
}

func (f Function) SaveEntorno(env interface{}) {
	f.EntornoFun = env

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

		//fmt.Println("++++++++++++++++reflect.TypeOf(l_declaraciones.GetValue(i)): ", reflect.TypeOf(l_declaraciones.GetValue(i)))

		//par_i := l_declaraciones.GetValue(i).(instruction.Declaration)
		if reflect.TypeOf(l_declaraciones.GetValue(i)) == reflect.TypeOf(instruction.Declaration{}) {
			par_i := l_declaraciones.GetValue(i).(instruction.Declaration)
			//par_i.Expresion = expre_list.GetValue(i).(interfaces.Expresion)
			par_i.Expresion = expre_list.GetValue(i).(interfaces.Expresion)
			par_i.Ejecutar(env)

		} else if reflect.TypeOf(l_declaraciones.GetValue(i)) == reflect.TypeOf(instruction.ArrayDeclaration{}) {
			par_i := l_declaraciones.GetValue(i).(instruction.ArrayDeclaration)
			//par_i.Expresion = expre_list.GetValue(i).(interfaces.Expresion)
			par_i.Expresion = expre_list.GetValue(i).(interfaces.Expresion)
			par_i.Ejecutar(env)

		} else {
			return false
		}

	}

	return true
}

func (f Function) SetReference(listLocal *arrayList.List, listFunc *arrayList.List, entLocal, entFunc environment.Environment) {
	f.lLocal = listLocal
	f.lFunc = listFunc
	f.eLocal = entLocal
	f.eFunc = entFunc

	//fmt.Println("1 listLocal : ", listLocal.Len())
	//fmt.Println("1 listFunc : ", listFunc.Len())

	//fmt.Println("1 entFunc : ", entFunc)
}
func (f Function) SaveReference(listLocal *arrayList.List, listFunc *arrayList.List, entLocal, entFunc environment.Environment) {
	//lista de id
	for i := 0; i < listLocal.Len(); i++ {
		//simbolo en fun
		tmpSym := entFunc.GetVariable(listFunc.GetValue(i).(string), f.Line, f.Column, entFunc.Nombre)
		//set nuew val
		entLocal.AlterVariable(listLocal.GetValue(i).(string), tmpSym)
	}
}

func (f Function) Ejecutar(env interface{}) interface{} {

	//fmt.Println("		estoy en funcion : ", f.Id)
	if env.(environment.Environment).Nombre == "main" {
		for _, s := range f.ListaInstrucciones.ToArray() {
			rest := s.(interfaces.Instruction).Ejecutar(env)

			//if env.(environment.Environment).Nombre != "main" {
			//	f.SaveReference(f.lLocal, f.lFunc, f.eLocal.(environment.Environment), f.eFunc.(environment.Environment))
			//}

			if rest != nil {

				if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {

					//fmt.Println("rest.(interfaces.Symbol).Tipo: ", rest.(interfaces.Symbol).Tipo)
					if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
						//fmt.Println("rest.(interfaces.Symbol).Id: ", rest.(interfaces.Symbol).Id)
						return rest
					}
				}
			}

		}
	}
	return nil

	/*for _, s := range f.ListaInstrucciones.ToArray() {
		//fmt.Println("EEEEJJJJEECCUTA")
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
				err.NewError("Tipos no coinciden en Retorno "+desc, env.(environment.Environment).Nombre, f.Line, f.Column)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}

			return valRetorno

		}
	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	*/
}
