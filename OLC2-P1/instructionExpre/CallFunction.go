package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/expresion"
	"OLC2/instruction"
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

	listIdRef := arrayList.New()
	listIdNew := arrayList.New()

	fun_exist := env.(environment.Environment).ExistFunction(f.IdFun)
	//fmt.Println("La variable no existe: ", fun_exist)
	if !fun_exist {
		err.NewError("La función "+f.IdFun+" no existe en entorno "+env.(environment.Environment).Nombre,
			env.(environment.Environment).Nombre, f.Line, f.Column)
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}

	var tmpEnv environment.Environment
	tmpEnv = environment.NewEnvironment("Function", env.(environment.Environment).GetFather(env))

	funcion := env.(environment.Environment).GetFunction(f.IdFun).(Function)
	list_decla := funcion.ListaParamsDecl.Clone()
	if list_decla.Len() != f.ListaExpresiones.Len() {
		//fmt.Println("Error en variables")
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", funcion.ListaParamsDecl.Len(), f.ListaExpresiones.Len())
		err.NewError("Cantidad de parametros en función incorrectos "+desc, env.(environment.Environment).Nombre, f.Line, f.Column)
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}
	for i := 0; i < list_decla.Len(); i++ {

		var_decla := list_decla.GetValue(i).(instruction.Declaration)
		idNewVar := var_decla.Id
		typeNewVar := var_decla.Tipo
		symNewVar := f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(env)

		//fmt.Println("	symNewVar", symNewVar)
		//fmt.Println("	idNewVar", idNewVar)
		//fmt.Println("	symNewVar.Tipo", symNewVar.Tipo)
		lin := var_decla.Line
		col := var_decla.Column
		if typeNewVar == symNewVar.Tipo {

			if f.ListaExpresiones.GetValue(i).(ParameterBy).IsRef && (typeNewVar == interfaces.ARRAY || typeNewVar == interfaces.VECTOR) {
				listIdRef.Add(symNewVar.Id)
				listIdNew.Add(idNewVar)
			}

			tmpEnv.SaveVariable(idNewVar, symNewVar, typeNewVar, var_decla.IsMut, var_decla.Line, var_decla.Column, tmpEnv.Nombre, nil, 0)

		} else {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(symNewVar.Tipo), interfaces.GetType(typeNewVar))
			err.NewError("Tipos invalidos "+desc, tmpEnv.Nombre, lin, col)
			return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
		}
	}

	rest := funcion.Ejecutar(tmpEnv)
	if rest != nil {
		if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
			//fmt.Println("222rest.(interfaces.Symbol).Tipo: ", rest.(interfaces.Symbol).Tipo)
			if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
				//fmt.Println(" 22 rest.(interfaces.Symbol).Id: ", rest.(interfaces.Symbol).Id)
				return rest.(interfaces.Symbol)
			}
		}
	}

	/*plantFunc := NewFunction(funcion.Id, funcion.ListaParamsDecl.Clone(), funcion.ListaInstrucciones.Clone(),
		funcion.Tipo, funcion.Line, funcion.Column)

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
	*/

	//return valfun.(interfaces.Symbol)
	//return valfun.(interfaces.Symbol)
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
}
func (f CallFunction) Ejecutar(env interface{}) interface{} {

	res := f.EjecutarValor(env)
	return res
}
