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

	Expresion interfaces.Expresion
	IdVector  string
}

func NewVectorDeclaration(id string, tipo interfaces.TipoExpresion, cap interfaces.Expresion, IsMut bool, line int, column int,
	expresion interfaces.Expresion, idVector string) VectorDeclaration {
	instr := VectorDeclaration{id, tipo, cap, IsMut, line, column, expresion, idVector}
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
	var valvec interfaces.Symbol

	if p.Expresion != nil {

		reval2 := p.Expresion.EjecutarValor(env)
		if reval2.Tipo == interfaces.VECTOR {

			for _, s := range reval2.Valor.(interfaces.Symbol).Valor.(*arrayList.List).ToArray() {

				if p.Tipos == interfaces.NULL {
					if p.IdVector == s.(interfaces.Symbol).Id {
						continue
					}
				}
				if s.(interfaces.Symbol).Tipo != p.Tipos {
					desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(p.Tipos), interfaces.GetType(s.(interfaces.Symbol).Tipo))
					err.NewError("Tipos no coinciden en epresion "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
					return nil
				}
			}
			valvec = interfaces.Symbol{
				Id:       p.IdVector,
				Tipo:     interfaces.VECTOR,
				Valor:    reval2.Valor,
				Capacity: capacidad,
				IsMut:    p.IsMut,
				TipoRet:  p.Tipos,
			}

		} else {

			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.VECTOR), interfaces.GetType(reval2.Tipo))
			err.NewError("Tipos no coinciden en epresion "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			return nil
		}

	} else {

		valvec = interfaces.Symbol{
			Id:       p.IdVector,
			Tipo:     interfaces.VECTOR,
			Valor:    tempExp,
			Capacity: capacidad,
			IsMut:    p.IsMut,
			TipoRet:  p.Tipos,
		}
	}

	env.(environment.Environment).SaveVariable(p.Id, valvec, interfaces.VECTOR, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, capacidad)
	//fmt.Println("capacidad: ", capacidad)

	return nil
}
