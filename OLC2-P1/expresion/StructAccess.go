package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type StructAccess struct {
	Struct interfaces.Expresion
	Id     string
	Line   int
	Column int
}

func NewStructAccess(strct interfaces.Expresion, id string, line int, column int) StructAccess {
	exp := StructAccess{strct, id, line, column}
	return exp
}

func (p StructAccess) EjecutarValor(env interface{}) interfaces.Symbol {

	var teStruct interfaces.Symbol
	teStruct = p.Struct.EjecutarValor(env)

	//fmt.Println("teStruct.Tipo", interfaces.GetType(teStruct.Tipo))
	//fmt.Println("interfaces.STRUCT", interfaces.GetType(interfaces.STRUCT))
	if teStruct.Tipo == interfaces.STRUCT {

		if variable, ok := teStruct.Valor.(map[string]interfaces.Symbol)[p.Id]; ok {
			return variable
		}
		err.NewError("No existe atributo '"+p.Id+"' en struct", env.(environment.Environment).Nombre, p.Line, p.Column)
		//return result
	} else {

		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.STRUCT), interfaces.GetType(teStruct.Tipo))
		err.NewError("No es struct "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

		//return result
	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.NULL,
		Valor: nil,
	}

}
