package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type Declaration struct {
	Id        string
	Tipo      interfaces.TipoExpresion
	Expresion interfaces.Expresion
	//IsArray   bool
	//IsStruct  bool
	IsMut  bool
	Line   int
	Column int
}

func NewDeclaration(id string, tipo interfaces.TipoExpresion, val interfaces.Expresion, IsMut bool /*, isArray bool, isStruct bool*/, line int, column int) Declaration {
	instr := Declaration{id, tipo, val, IsMut /*, isArray, isStruct*/, line, column}
	return instr
}

func (p Declaration) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	//fmt.Println("----p.IsMut: ", p.IsMut)
	//fmt.Println("result.Tipo: ", result.Tipo)
	//fmt.Println("p.Tipo: ", p.Tipo)

	if result.Tipo == p.Tipo {
		env.(environment.Environment).SaveVariable(p.Id, result, p.Tipo, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre)
		/*} else if p.IsArray {
			env.(environment.Environment).SaveVariable(p.Id, result, interfaces.ARRAY)
		} else if p.IsStruct {
		env.(environment.Environment).SaveVariable(p.Id, result, interfaces.STRUCT)
		*/
	} else if p.Tipo == interfaces.NULL {
		/*no tiene tipo en asignacion, se le asigna el tipo de la expresion*/
		env.(environment.Environment).SaveVariable(p.Id, result, result.Tipo, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre)
	} else {
		//fmt.Println("Los tipos no coinciden")
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
	}

	return result.Valor
}
