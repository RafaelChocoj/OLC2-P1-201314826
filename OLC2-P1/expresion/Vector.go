package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

/*
tipo = 1 //let arr1: [&str; 2] = ["Hola", "Mundo"];
tipo = 2 //let arr1: [&str; 4] = ["Hola"; 4];
*/

type Vector struct {
	ListExp *arrayList.List

	Expresion interfaces.Expresion
	Tam       interfaces.Expresion

	TipoDec int

	Line   int
	Column int
}

func NewVector(list *arrayList.List, expresion interfaces.Expresion, tam interfaces.Expresion, tipoDec int, line int, column int) Vector {
	exp := Vector{list, expresion, tam, tipoDec, line, column}
	return exp
}

func (p Vector) EjecutarValor(env interface{}) interfaces.Symbol {

	var tempExp *arrayList.List
	tempExp = arrayList.New()

	tempType := p.ListExp.GetValue(0).(interfaces.Expresion).EjecutarValor(env).Tipo

	/*vector declarada con tipo y vector asignado*/
	if p.TipoDec == 1 {
		for _, s := range p.ListExp.ToArray() {
			valsym := s.(interfaces.Expresion).EjecutarValor(env)
			if valsym.Tipo == tempType {
				tempExp.Add(valsym)
			} else {
				//fmt.Println("Error en el tipo del vector")
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(tempType), interfaces.GetType(valsym.Tipo))
				err.NewError("Vector incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

			}

		}

		/*vector formato tipo;tam*/
	} else if p.TipoDec == 2 {
		res_tam := p.Tam.(interfaces.Expresion).EjecutarValor(env)

		var arrSize int
		if res_tam.Tipo == interfaces.INTEGER {
			arrSize = res_tam.Valor.(int)
		} else {
			desc := fmt.Sprintf("Se esperaba un '%v' se tiene '%v'", "i64", interfaces.GetType(res_tam.Tipo))
			err.NewError("Error en Size "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			//return false
		}
		//fmt.Println("		arrSize: ", arrSize)

		//for _, s := range arrSize {
		for i := 0; i < arrSize; i++ {
			//tempExp.Add(s.(interfaces.Expresion).EjecutarValor(env))
			tempExp.Add(p.Expresion.(interfaces.Expresion).EjecutarValor(env))
		}
	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.VECTOR,
		Valor: tempExp,
	}
}
