package instruction

import (
	console "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type Imprimir struct {
	Expresion interfaces.Expresion
}

func NewImprimir(val interfaces.Expresion) Imprimir {
	exp := Imprimir{val}
	return exp
}

func (p Imprimir) Ejecutar( /*env interface{}*/ ) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar( /*env*/ )

	fmt.Println("result.Tipo: ", interfaces.GetType(result.Tipo))
	//fmt.Println(result.Valor)
	printcon := fmt.Sprintf("%v", result.Valor) + "\n"
	console.Console += printcon

	return result.Valor
}
