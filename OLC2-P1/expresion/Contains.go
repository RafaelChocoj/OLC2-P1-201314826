package expresion

import (
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Contains struct {
	Expre1 interfaces.Expresion
	Expre2 interfaces.Expresion
	Line   int
	Column int
}

func NewContains(Expre1 interfaces.Expresion, Expre2 interfaces.Expresion, line int, column int) Contains {

	exp := Contains{Expre1, Expre2, line, column}
	return exp
}

func (p Contains) EjecutarValor(env interface{}) interfaces.Symbol {

	var ret1 interfaces.Symbol
	ret1 = p.Expre1.EjecutarValor(env)

	var ret2 interfaces.Symbol
	ret2 = p.Expre2.EjecutarValor(env)

	fmt.Println("---     contains", ret1.Valor.(*arrayList.List).Contains(&ret2))

	fmt.Println("*******************************")
	fmt.Println("---      ret1.Valor", ret1.Valor.(*arrayList.List))
	fmt.Println("---      ret2", &ret2)

	if ret1.Valor == ret2.Valor {
		fmt.Println("**iguales")
	} else {
		fmt.Println("**no iguales")
	}

	/*if retornoExp.Tipo == interfaces.VECTOR {

		//fmt.Println("---      reflect.TypeOf(retornoExp)..Valor", reflect.TypeOf(retornoExp.Valor))
		return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: retornoExp.Capacity}

	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", "array o vector", interfaces.GetType(retornoExp.Tipo))
		err.NewError("Uso de Función incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
	}*/

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
}
