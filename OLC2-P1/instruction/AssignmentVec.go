package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type AssignmentVec struct {
	Id    string
	index interfaces.Expresion
	//Idstruct  string
	ListAccesStruct *arrayList.List
	Expresion       interfaces.Expresion
	Line            int
	Column          int
}

func NewAssignmentVec(id string, index interfaces.Expresion, listAccesStruct *arrayList.List, Expresion interfaces.Expresion, line int, column int) AssignmentVec {
	instr := AssignmentVec{id, index, listAccesStruct, Expresion, line, column}
	return instr
}

func (p AssignmentVec) Ejecutar(env interface{}) interface{} {

	result_mut := env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)
	if result_mut.Tipo == interfaces.NULL {
		return nil
	}
	if result_mut.IsMut == false {

		//desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("La variable "+p.Id+" es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	if result_mut.Tipo == interfaces.VECTOR {

		var index interfaces.Symbol
		index = p.index.EjecutarValor(env)

		var result interfaces.Symbol
		result = p.Expresion.EjecutarValor(env)

		if index.Tipo == interfaces.INTEGER {
		} else {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.INTEGER), interfaces.GetType(index.Tipo))
			err.NewError("Tipos no coinciden en av "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			return nil
		}

		//tempValue.(*arrayList.List).GetValue(index).(interfaces.Symbol)
		/////fmt.Println("---reflect.TypeOf(result_mut.valor)", reflect.TypeOf(result_mut.Valor.(interfaces.Symbol).Valor))
		valvec := result_mut.Valor.(interfaces.Symbol).Valor.(*arrayList.List)

		objec := valvec.GetValue(index.Valor.(int)).(interfaces.Symbol)
		//fmt.Println("---objec", objec)

		if objec.Tipo == interfaces.STRUCT {
		} else {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.STRUCT), interfaces.GetType(objec.Tipo))
			err.NewError("Tipos no coinciden "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			return nil
		}

		env.(environment.Environment).UpdateStructVector(p.ListAccesStruct, result, p.Line, p.Column, objec.Valor.(map[string]interfaces.Symbol))

		/*if variable, ok := objec.Valor.(map[string]interfaces.Symbol)[p.Idstruct]; ok {

			fmt.Println("---variable", variable)
			fmt.Println("***reflect.TypeOf(variable)", reflect.TypeOf(variable))
			fmt.Println("---variable.Valor", variable.Valor)
			variable.Valor = result.Valor
			fmt.Println("222 variable.Valor", variable.Valor)

			objec.Valor.(map[string]interfaces.Symbol)[p.Idstruct] = variable
			//objec.Valor[p.Idstruct] = value
			//return variable

		} else {
			err.NewError("No existe atributo '"+p.Idstruct+"' en struct", env.(environment.Environment).Nombre, p.Line, p.Column)
		}*/

	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.VECTOR), interfaces.GetType(result_mut.Tipo))
		err.NewError("Tipos no coinciden en Asignación Vector "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	return nil
}
