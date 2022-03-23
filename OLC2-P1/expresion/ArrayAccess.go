package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type ArrayAccess struct {
	Array  interfaces.Expresion
	Index  interfaces.Expresion
	Line   int
	Column int
}

func NewArrayAccess(array interfaces.Expresion, index interfaces.Expresion, line int, column int) ArrayAccess {
	exp := ArrayAccess{array, index, line, column}
	return exp
}

func (p ArrayAccess) EjecutarValor(env interface{}) interfaces.Symbol {

	var tempArray interfaces.Symbol
	tempArray = p.Array.EjecutarValor(env)

	//fmt.Println("--tempArray: ", tempArray)

	if tempArray.Tipo == interfaces.ARRAY || tempArray.Tipo == interfaces.VECTOR {
		var tempIndex interfaces.Symbol
		tempIndex = p.Index.EjecutarValor(env)

		var index int

		if tempIndex.Tipo == interfaces.INTEGER {
			index = tempIndex.Valor.(int)
		} else {
			desc := fmt.Sprintf("Se esperaba un '%v' se tiene '%v'", "i64", interfaces.GetType(tempIndex.Tipo))
			err.NewError("Error en Index "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

			return interfaces.Symbol{
				Id:    "",
				Tipo:  interfaces.NULL,
				Valor: nil,
			}
		}

		if index < 0 {
			desc := fmt.Sprintf(" se tiene '%v'", index)
			err.NewError("Index negativo "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

			return interfaces.Symbol{
				Id:    "",
				Tipo:  interfaces.NULL,
				Valor: nil,
			}

		}

		//fmt.Println("------tempIndex: ", tempIndex)

		var tempValue interface{}
		tempValue = tempArray.Valor
		//fmt.Println("------tempValue: ", tempValue)

		size_arr := tempValue.(*arrayList.List).Len()
		//fmt.Println("size_arr: ", size_arr)
		//fmt.Println("tempIndex.Valor: ", tempIndex.Valor)

		if index > (size_arr - 1) {
			desc := fmt.Sprintf("index '%v' en array Size '%v'", index, size_arr)
			err.NewError("desbordamiento de memoria, "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

			return interfaces.Symbol{
				Id:    "",
				Tipo:  interfaces.NULL,
				Valor: nil,
			}
		}

		return tempValue.(*arrayList.List).GetValue(index).(interfaces.Symbol)
	} else {
		//fmt.Println("no es arreglo")
		desc := fmt.Sprintf("'%v' o '%v' se tiene '%v'", interfaces.GetType(interfaces.ARRAY), interfaces.GetType(interfaces.VECTOR), interfaces.GetType(tempArray.Tipo))
		err.NewError("Se esperaba "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.NULL,
		Valor: nil,
	}
}
