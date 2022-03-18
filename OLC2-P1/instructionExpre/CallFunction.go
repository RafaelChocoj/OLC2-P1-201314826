package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type CallFunction struct {
	IdFun            string
	ListaExpresiones *arrayList.List

	Line   int
	Column int
}

func NewCallFunction(idfuncion string, listExpresiones *arrayList.List, line int, column int) CallFunction {
	return CallFunction{IdFun: idfuncion, ListaExpresiones: listExpresiones,
		Line: line, Column: column}
}

func (f CallFunction) EjecutarValor(env interface{}) interfaces.Symbol {

	fun_exist := env.(environment.Environment).ExistFunction(f.IdFun)
	//fmt.Println("La variable no existe: ", fun_exist)
	if !fun_exist {
		err.NewError("La función "+f.IdFun+" no existe en entorno "+env.(environment.Environment).Nombre,
			env.(environment.Environment).Nombre, f.Line, f.Column)
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}

	var tmpEnv environment.Environment
	tmpEnv = environment.NewEnvironment("function", env.(environment.Environment))

	funcion := env.(environment.Environment).GetFunction(f.IdFun).(interfaces.Function)

	plantFunc := interfaces.NewFunction(funcion.Id, funcion.ListaParamsDecl.Clone(), funcion.ListaInstrucciones.Clone(),
		funcion.Tipo, funcion.Line, funcion.Column)

	//parafun := plantFunc.EjecutarParametros(tmpEnv, f.ListaExpresiones)

	/*if !completo {
		return entorno.ValorType{Valor: -1, Tipo: entorno.NULL}
	}*/
	valfun := plantFunc.Ejecutar(tmpEnv)
	//fmt.Println("		valfun: ", valfun)
	//fmt.Println("		reflect.TypeOf(valfun): ", reflect.TypeOf(valfun))
	//fmt.Println("		reflect.TypeOf(interfaces.Symbol{{}): ", reflect.TypeOf(interfaces.Symbol{}))

	if (reflect.TypeOf(valfun) != reflect.TypeOf(interfaces.Symbol{})) {
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}

	return valfun.(interfaces.Symbol)
}
func (f CallFunction) Ejecutar(env interface{}) interface{} {

	f.EjecutarValor(env)
	return nil
}
