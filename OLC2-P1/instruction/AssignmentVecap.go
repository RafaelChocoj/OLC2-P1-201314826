package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type AssignmentVecap struct {
	Id        string
	Expresion interfaces.Expresion
	Line      int
	Column    int
}

func NewAssignmentVecap(id string, Expresion interfaces.Expresion, line int, column int) AssignmentVecap {
	instr := AssignmentVecap{id, Expresion, line, column}
	return instr
}

func (p AssignmentVecap) Ejecutar(env interface{}) interface{} {

	var retornoExp interfaces.Symbol
	retornoExp = env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)

	if retornoExp.Tipo == interfaces.VECTOR {
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", "vector", interfaces.GetType(retornoExp.Tipo))
		err.NewError("Uso de Función incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	/*if retornoExp.IsMut == false {

		//desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("La variable '"+p.Id+"' es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}*/

	var result interfaces.Symbol
	result = p.Expresion.EjecutarValor(env)

	if result.Tipo == interfaces.INTEGER {
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.INTEGER), interfaces.GetType(result.Tipo))
		err.NewError("Tipo incorrecto en capacidad "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	//fmt.Println("	cpa---**---	*retornoExp.TipoRet", interfaces.GetType(retornoExp.TipoRet))

	retornoExp.Capacity = result.Valor.(int)
	//retornoExp.Valor.(interfaces.Symbol).Capacity = result.Valor
	tempoval := retornoExp.Valor.(interfaces.Symbol)
	tempoval.Capacity = result.Valor.(int)
	//tempoval.TipoRet = retornoExp.TipoRet
	retornoExp.Valor = tempoval
	//fmt.Println("	new cap		*retornoExp.Capacity", retornoExp.Capacity)
	env.(environment.Environment).AlterVariableVec(p.Id, retornoExp) /// verificar
	return nil
}
