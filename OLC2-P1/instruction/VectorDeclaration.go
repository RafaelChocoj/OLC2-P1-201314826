package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type VectorDeclaration struct {
	Id        string
	Tipos     interfaces.TipoExpresion
	Capacidad interfaces.Expresion
	IsMut     bool
	Line      int
	Column    int
}

func NewVectorDeclaration(id string, tipo interfaces.TipoExpresion, cap interfaces.Expresion, IsMut bool, line int, column int) VectorDeclaration {
	instr := VectorDeclaration{id, tipo, cap, IsMut, line, column}
	return instr
}
func (p VectorDeclaration) Ejecutar(env interface{}) interface{} {

	var capacidad int = 0
	if p.Capacidad != nil {
		var result interfaces.Symbol
		result = p.Capacidad.EjecutarValor(env)

		if result.Tipo != interfaces.INTEGER {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.INTEGER), interfaces.GetType(result.Tipo))
			err.NewError("Tipos no coinciden en Capacidad "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			return nil
		}

		capacidad = result.Valor.(int)
	} else {
		capacidad = 0
	}

	var tempExp *arrayList.List
	tempExp = arrayList.New()

	valvec := interfaces.Symbol{
		Id:       "",
		Tipo:     interfaces.VECTOR,
		Valor:    tempExp,
		Capacity: capacidad,
	}

	env.(environment.Environment).SaveVariable(p.Id, valvec, interfaces.VECTOR, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, capacidad)
	//fmt.Println("capacidad: ", capacidad)

	return nil
}
