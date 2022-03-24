package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/expresion"
	"OLC2/instruction"
	"OLC2/interfaces"
	"fmt"
	"reflect"
	"strings"

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
}

func (f CallFunction) EjecutarValor(env interface{}) interfaces.Symbol {

	listIdRef := arrayList.New()
	listIdNew := arrayList.New()

	fun_exist := env.(environment.Environment).ExistFunction(f.IdFun)
	//fmt.Println("La variable no existe: ", fun_exist)
	if !fun_exist {
		err.NewError("La función "+f.IdFun+" no existe en entorno "+env.(environment.Environment).Nombre+" o no es accesible",
			env.(environment.Environment).Nombre, f.Line, f.Column)
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}
	/////fmt.Println("						f.IdFun: ", f.IdFun, "env: ", env.(environment.Environment).Nombre)
	var tmpEnv environment.Environment

	//tmpEnv = environment.NewEnvironment("Function", env.(environment.Environment)) ////******
	if strings.Contains(env.(environment.Environment).Nombre, "Module") {
		//fmt.Println("es modulo ")
		tmpEnv = environment.NewEnvironment("Function", env.(environment.Environment))
	} else {
		tmpEnv = environment.NewEnvironment("Function", env.(environment.Environment).GetFather(env))
	}

	funcion := env.(environment.Environment).GetFunction(f.IdFun).(Function)
	list_decla := funcion.ListaParamsDecl.Clone()
	if list_decla.Len() != f.ListaExpresiones.Len() {
		//fmt.Println("Error en variables")
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", funcion.ListaParamsDecl.Len(), f.ListaExpresiones.Len())
		err.NewError("Cantidad de parametros en función incorrectos "+desc, env.(environment.Environment).Nombre, f.Line, f.Column)
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}
	for i := 0; i < list_decla.Len(); i++ {

		//var var_decla interface{}
		//fmt.Println("-------------------reflect.TypeOf(list_decla.GetValue(i)): ", reflect.TypeOf(list_decla.GetValue(i)))

		if reflect.TypeOf(list_decla.GetValue(i)) == reflect.TypeOf(instruction.Declaration{}) {

			var_decla := list_decla.GetValue(i).(instruction.Declaration)
			/*****/
			//var_decla = list_decla.GetValue(i).(instruction.Declaration)
			idNewVar := var_decla.Id
			typeNewVar := var_decla.Tipo
			lin := var_decla.Line
			col := var_decla.Column
			//symNewVar := f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(env)
			var symNewVar interfaces.Symbol
			if strings.Contains(env.(environment.Environment).Nombre, "Module") {

				symNewVar = f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(err.Main_Env)
			} else {
				symNewVar = f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(env)
			}

			//fmt.Println("	symNewVar", symNewVar)
			//fmt.Println("	idNewVar", idNewVar)
			//fmt.Println("	symNewVar.Tipo", symNewVar.Tipo)

			if typeNewVar == symNewVar.Tipo {

				if f.ListaExpresiones.GetValue(i).(ParameterBy).IsRef && (typeNewVar == interfaces.ARRAY || typeNewVar == interfaces.VECTOR) {
					listIdRef.Add(symNewVar.Id)
					listIdNew.Add(idNewVar)

					//fmt.Println("		*symNewVar.Id", symNewVar.Id)
					//fmt.Println("			*idNewVar", idNewVar)
				}

				tmpEnv.SaveVariable(idNewVar, symNewVar, typeNewVar, var_decla.IsMut, var_decla.Line, var_decla.Column, tmpEnv.Nombre, nil, 0)

			} else {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(symNewVar.Tipo), interfaces.GetType(typeNewVar))
				err.NewError("Tipos invalidos "+desc, tmpEnv.Nombre, lin, col)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}

			/*****/
		} else if reflect.TypeOf(list_decla.GetValue(i)) == reflect.TypeOf(instruction.ArrayDeclaration{}) {
			var_decla := list_decla.GetValue(i).(instruction.ArrayDeclaration)

			/*****/
			//var_decla = list_decla.GetValue(i).(instruction.Declaration)
			idNewVar := var_decla.Id
			typeNewVar := var_decla.Tipos
			lin := var_decla.Line
			col := var_decla.Column
			//symNewVar := f.ListaExpresiones.Clone().GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(env)
			var symNewVar interfaces.Symbol
			if strings.Contains(env.(environment.Environment).Nombre, "Module") {

				symNewVar = f.ListaExpresiones.Clone().GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(err.Main_Env)
			} else {
				symNewVar = f.ListaExpresiones.Clone().GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(env)
			}

			var idref string
			if reflect.TypeOf(f.ListaExpresiones.GetValue(i).(ParameterBy).Expre) == reflect.TypeOf(expresion.Identificador{}) {
				identificador := f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(expresion.Identificador)
				idref = identificador.Id
				//fmt.Println("++++++++++++++++identificador.Id", identificador.Id)

			} else {
				idref = ""
			}

			//fmt.Println("	symNewVar", symNewVar.Valor)

			if interfaces.ARRAY == symNewVar.Tipo {

				if f.ListaExpresiones.Clone().GetValue(i).(ParameterBy).IsRef && (symNewVar.Tipo == interfaces.ARRAY || symNewVar.Tipo == interfaces.VECTOR) {
					//fmt.Println("	symNewVar.Tipo", interfaces.GetType(symNewVar.Tipo))

					//listIdRef.Add(symNewVar.Id)
					listIdRef.Add(idref)
					listIdNew.Add(idNewVar)
					//fmt.Println("		*symNewVar.Id", idref)
					//fmt.Println("			*idNewVar", idNewVar)

					//symNewVar.Id = idNewVar
				}

				tmpEnv.SaveVariable(idNewVar, symNewVar, symNewVar.Tipo, var_decla.IsMut, var_decla.Line, var_decla.Column, tmpEnv.Nombre, typeNewVar, 0)

			} else {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.ARRAY), interfaces.GetType(symNewVar.Tipo))
				err.NewError("Tipos invalidos "+desc, tmpEnv.Nombre, lin, col)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}

			/*****/
		} else if reflect.TypeOf(list_decla.GetValue(i)) == reflect.TypeOf(instruction.VectorDeclaration{}) {
			var_decla := list_decla.GetValue(i).(instruction.VectorDeclaration)

			/*****/
			//var_decla = list_decla.GetValue(i).(instruction.Declaration)
			idNewVar := var_decla.Id
			//typeNewVar := var_decla.Tipos
			//typeObjecVector := var_decla.IdVector
			lin := var_decla.Line
			col := var_decla.Column

			//var tmpMain environment.Environment
			//tmpMain = env.(environment.Environment).GetFather(env)
			var symNewVar interfaces.Symbol
			if strings.Contains(env.(environment.Environment).Nombre, "Module") {

				symNewVar = f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(err.Main_Env)
			} else {
				symNewVar = f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(interfaces.Expresion).EjecutarValor(env)
			}

			//fmt.Println("	=================== env actual: ", env.(environment.Environment).Nombre)
			//fmt.Println("	=== env padre name: ", tmpMain.Nombre)
			//fmt.Println("	=== env main name: ", err.Main_Env.Nombre)
			//fmt.Println("	=== interfaces.GetType(symNewVar.Tipo)", interfaces.GetType(symNewVar.Tipo))

			//var identificador = expresion.Identificador{}
			var idref string
			//fmt.Println("++++++++++++++++reflect.TypeOf(f.ListaExpresiones.GetValue(i)  ",
			//reflect.TypeOf(f.ListaExpresiones.GetValue(i).(ParameterBy).Expre))

			if reflect.TypeOf(f.ListaExpresiones.GetValue(i).(ParameterBy).Expre) == reflect.TypeOf(expresion.Identificador{}) {
				identificador := f.ListaExpresiones.GetValue(i).(ParameterBy).Expre.(expresion.Identificador)
				idref = identificador.Id
				//fmt.Println("++++++++++++++++identificador.Id", identificador.Id)

			} else {
				idref = ""
			}
			//fmt.Println("	idNewVar", idNewVar)
			//fmt.Println("	 idref", idref)
			//fmt.Println("-	var_decla.IdVector", var_decla.IdVector)

			if interfaces.VECTOR == symNewVar.Tipo {

				if f.ListaExpresiones.GetValue(i).(ParameterBy).IsRef && (symNewVar.Tipo == interfaces.ARRAY || symNewVar.Tipo == interfaces.VECTOR) {
					//fmt.Println("x	symNewVar.Tipo", interfaces.GetType(symNewVar.Tipo))

					//listIdRef.Add(symNewVar.Id)
					listIdRef.Add(idref)
					listIdNew.Add(idNewVar)

					fmt.Println("		*symNewVar.Id", idref)
					fmt.Println("			*idNewVar", idNewVar)

					//symNewVar.Id = idNewVar
				}
				symNewVar.RetObjeto = var_decla.IdVector
				//symNewVar.TipoRet = var_decla.TipoRet
				/////fmt.Println("	---**---	*symNewVar.TipoVecCon", interfaces.GetType(symNewVar.TipoVecCon))

				tmpEnv.SaveVariableVec(idNewVar, symNewVar, symNewVar.Tipo, var_decla.IsMut, var_decla.Line, var_decla.Column, tmpEnv.Nombre, nil, var_decla.IdVector)

			} else {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.VECTOR), interfaces.GetType(symNewVar.Tipo))
				err.NewError("Tipos invalidos "+desc, tmpEnv.Nombre, lin, col)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}

			/****/
		} else {
			err.NewError("Error en tipos ", env.(environment.Environment).Nombre, f.Line, f.Column)
			return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
		}

	}

	//funcion.SetReference(listIdRef, listIdNew, env.(environment.Environment), tmpEnv)

	/*rest := funcion.Ejecutar(tmpEnv)
	if rest != nil {
		if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
			//fmt.Println("222rest.(interfaces.Symbol).Tipo: ", rest.(interfaces.Symbol).Tipo)
			//f.SaveReference(listIdRef, listIdNew, env.(environment.Environment), tmpEnv)
			if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
				//fmt.Println(" 22 rest.(interfaces.Symbol).Id: ", rest.(interfaces.Symbol).Id)
				return rest.(interfaces.Symbol)
			}
		}
	}*/

	for _, s := range funcion.ListaInstrucciones.ToArray() {
		rest := s.(interfaces.Instruction).Ejecutar(tmpEnv)

		//fmt.Println("env.(environment.Environment).Nombre: ", env.(environment.Environment).Nombre)
		//fmt.Println("tmpEnv: ", tmpEnv.Nombre)
		f.SaveReference(listIdRef, listIdNew, env.(environment.Environment), tmpEnv)

		if rest != nil {

			if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {

				var restsym interfaces.Symbol
				restsym = rest.(interfaces.Symbol)

				//fmt.Println("call rest.(interfaces.Symbol).Tipo: ", interfaces.GetType(rest.(interfaces.Symbol).Tipo))
				//fmt.Println("funcion.Tipo: ", funcion.Tipo)
				//fmt.Println("call rest.(interfaces.Symbol).Valor: ", rest.(interfaces.Symbol).Valor)

				if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {

					//fmt.Println("funcion.IdObje: ", funcion.IdObje)
					//fmt.Println("rest.(interfaces.Symbol).RetObjeto: ", rest.(interfaces.Symbol).RetObjeto)

					//fmt.Println("funcion.Tipo: ", interfaces.GetType(funcion.Tipo))
					//fmt.Println("rest.(interfaces.Symbol).Tipo: ", interfaces.GetType(rest.(interfaces.Symbol).Tipo))

					//rest.(interfaces.Symbol).TipoRet = interfaces.NULL
					restsym.TipoRet = interfaces.NULL
					if funcion.Tipo == rest.(interfaces.Symbol).Tipo || funcion.IdObje == rest.(interfaces.Symbol).RetObjeto {
						//fmt.Println("		--restsym ret: ", interfaces.GetType(restsym.Tipo))
						//return rest.(interfaces.Symbol)
						return restsym

					} else {
						desc := fmt.Sprintf("se esperaba '%v' se tiene '%v', objeto '%v'", interfaces.GetType(funcion.Tipo), interfaces.GetType(rest.(interfaces.Symbol).Tipo), funcion.IdObje)
						err.NewError("Tipos no coinciden en Return "+desc, env.(environment.Environment).Nombre, f.Line, f.Column)
						return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
					}

				}
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

func (f CallFunction) SaveReference(listLocal *arrayList.List, listFunc *arrayList.List, entLocal environment.Environment, entFunc environment.Environment) {
	//lista de id
	//fmt.Println(" listLocal.Len(): ", listLocal.Len())
	//fmt.Println("env actu: ", entLocal.Nombre, "env in: ", entLocal.Nombre)
	for i := 0; i < listLocal.Len(); i++ {
		//simbolo en fun
		tmpSym := entFunc.GetVariable(listFunc.GetValue(i).(string), f.Line, f.Column, entFunc.Nombre)
		//fmt.Println("tmpSym: ", tmpSym.Valor)
		//fmt.Println("listLocal.GetValue(i): ", listLocal.GetValue(i))
		//fmt.Println("tmpSym: ", tmpSym.Valor)

		//set nuew val
		entLocal.AlterVariable(listLocal.GetValue(i).(string), tmpSym.Valor.(interfaces.Symbol))
	}
}

func (f CallFunction) Ejecutar(env interface{}) interface{} {

	res := f.EjecutarValor(env)
	return res
}
