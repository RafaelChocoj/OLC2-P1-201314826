package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type Assignment struct {
	Id        string
	Expresion interfaces.Expresion
	Line      int
	Column    int
}

func NewAssignment(id string, val interfaces.Expresion, line int, column int) Assignment {
	instr := Assignment{id, val, line, column}
	return instr
}

func (p Assignment) Ejecutar(env interface{}) interface{} {

	//result_mut := env.(environment.Environment).GetVariableMut(p.Id)
	result_mut := env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)
	//fmt.Println("-es mutableresult_mut ", result_mut.IsMut)

	if result_mut.Tipo == interfaces.NULL {
		return nil
	}
	if result_mut.IsMut == false {

		//desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("La variable "+p.Id+" es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	//fmt.Println("----reflect.TypeOf(result_mut.Tipo) ", reflect.TypeOf(result_mut.Tipo))
	//fmt.Println("----result_mut.Tipo ", result_mut.Tipo)
	//fmt.Println("----result.Tipo ", result.Tipo)
	if result_mut.Tipo == result.Tipo {

		env.(environment.Environment).AlterVariable(p.Id, result)

		//fmt.Println("-123123---p.Id ", p.Id)
		//fmt.Println("-123123---result.Valor ", result.Valor)

		return result.Valor
	} else {
		desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(result_mut.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}
}
