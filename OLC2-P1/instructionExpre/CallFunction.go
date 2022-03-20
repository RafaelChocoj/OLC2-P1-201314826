package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/expresion"
	"OLC2/interfaces"
	"fmt"
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

func (f CallFunction) ParametsExpre(env interface{}, expre_list *arrayList.List) *arrayList.List {

	var listExprePar *arrayList.List
	listExprePar = arrayList.New()
	for i := 0; i < expre_list.Len(); i++ {
		expre := expre_list.GetValue(i).(interfaces.Expresion)
		valpar := expre.EjecutarValor(env)
		//fmt.Println("++++++++++++++++reflect.TypeOf( expre_list.GetValue(i)): ", reflect.TypeOf(expre_list.GetValue(i)))

		valprim := expresion.NewPrimitivo(valpar.Valor, valpar.Tipo, valpar.Line, valpar.Column)
		listExprePar.Add(valprim)
		//fmt.Println(i, "**	valprim.Valor:", valprim.Valor)
		//fmt.Println(i, "**	valpar:", reflect.TypeOf(valpar))

	}
	return listExprePar

	/*l_declaraciones := f.ListaParamsDecl.Clone()

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
			par_i.Expresion = expre_list.GetValue(i).(interfaces.Expresion)
			par_i.Ejecutar(env)

		} else if reflect.TypeOf(l_declaraciones.GetValue(i)) == reflect.TypeOf(instruction.ArrayDeclaration{}) {
			par_i := l_declaraciones.GetValue(i).(instruction.ArrayDeclaration)
			par_i.Expresion = expre_list.GetValue(i).(interfaces.Expresion)
			par_i.Ejecutar(env)

		} else {
			return false
		}

	}

	return true
	*/
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
	//tmpEnv = environment.NewEnvironment("function", env.(environment.Environment))
	tmpEnv = environment.NewEnvironment("function", env.(environment.Environment).GetFather())

	funcion := env.(environment.Environment).GetFunction(f.IdFun).(Function)

	plantFunc := NewFunction(funcion.Id, funcion.ListaParamsDecl.Clone(), funcion.ListaInstrucciones.Clone(),
		funcion.Tipo, funcion.Line, funcion.Column)

	/*var tmpEnv environment.Environment
	tmpEnv = funcion.EntornoFun.(environment.Environment)*/
	listexprePar := f.ParametsExpre(env, f.ListaExpresiones)
	//fmt.Println("******************************************")

	//parafun := plantFunc.EjecutarParamets(tmpEnv, f.ListaExpresiones)
	parafun := plantFunc.EjecutarParamets(tmpEnv, listexprePar)
	//fmt.Println("		000parafun: ", parafun)
	if !parafun {
		fmt.Println("algun error ", parafun)
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}
	valfun := plantFunc.Ejecutar(tmpEnv)

	//fmt.Println("		reflect.TypeOf(valfun): ", reflect.TypeOf(valfun))
	//fmt.Println("		reflect.TypeOf(interfaces.Symbol{{}): ", reflect.TypeOf(interfaces.Symbol{}))

	if (reflect.TypeOf(valfun) != reflect.TypeOf(interfaces.Symbol{})) {
		fmt.Println("no es un return valuido", valfun)
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}

	return valfun.(interfaces.Symbol)
	//return valfun.(interfaces.Symbol)
}
func (f CallFunction) Ejecutar(env interface{}) interface{} {

	f.EjecutarValor(env)
	return nil
}
