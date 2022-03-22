package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Push struct {
	Expre  interfaces.Expresion
	ValAdd interfaces.Expresion
	Line   int
	Column int
}

func NewPush(expre interfaces.Expresion, valAdd interfaces.Expresion, line int, column int) Push {

	exp := Push{expre, valAdd, line, column}
	return exp
}

func (p Push) Ejecutar(env interface{}) interface{} {

	var retornoExp interfaces.Symbol
	retornoExp = p.Expre.EjecutarValor(env)

	if retornoExp.Tipo == interfaces.VECTOR {
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", "array o vector", interfaces.GetType(retornoExp.Tipo))
		err.NewError("Uso de Función incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	if retornoExp.IsMut == false {

		//desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("La variable "+"p.Id"+" es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	var ValAdd interfaces.Symbol
	ValAdd = p.ValAdd.EjecutarValor(env)

	retornoExp.Valor.(*arrayList.List).Add(ValAdd)

	//fmt.Println("--- ValAdd.Valor", ValAdd.Valor)
	fmt.Println("--- ValAdd.Capacity", retornoExp.Capacity)
	fmt.Println("--- retornoExp.Valor.(*arrayList.List).Len()", retornoExp.Valor.(*arrayList.List).Len())

	fmt.Println("--- ValAdd.Id", retornoExp.Id)

	var newCap = 0
	if retornoExp.Valor.(*arrayList.List).Len() > retornoExp.Capacity {
		if retornoExp.Capacity <= 0 {
			retornoExp.Capacity = 1
		}
		newCap = retornoExp.Capacity * 2
		retornoExp.Capacity = newCap
		//p.Expre.EjecutarValor(env).Capacity = newCap
	}

	fmt.Println("--- retornoExp.Capacity", retornoExp.Capacity)

	return nil
}
