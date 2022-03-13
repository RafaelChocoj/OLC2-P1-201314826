package instruction

import (
	console "OLC2/environment"
	err "OLC2/environment"
	"OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"strings"

	arrayList "github.com/colegno/arraylist"
)

type Imprimir struct {
	//Expresion interfaces.Expresion
	L_Expresion *arrayList.List
	Line   int
	Column int
}

//func NewImprimir(val interfaces.Expresion) Imprimir {
func NewImprimir(val *arrayList.List, line int, column int) Imprimir {
	exp := Imprimir{val, line, column}
	return exp
}

func (p Imprimir) Ejecutar(env interface{}) interface{} {

	//format := fmt.Sprintf("%v", p.Values.GetValue(0).(interfaces.Expression).Ejecutar(ast, env).Valor)

	if p.L_Expresion.Len() > 1 {

		//format := fmt.Sprintf("%v", p.Values.GetValue(0).(interfaces.Expression).Ejecutar(ast, env).Valor)
		
		var result interfaces.Symbol
		result = p.L_Expresion.GetValue(0).(interfaces.Expresion).Ejecutar(env)
		format_str := fmt.Sprintf("%v", result.Valor) 
		
		p.L_Expresion.RemoveAtIndex(0)

		//fmt.Println("format_str: ", format_str)
		//fmt.Println("result.Tipo: ", interfaces.GetType(result.Tipo))

		noformat := strings.Count(format_str, "{}")
		//fmt.Println("noformat: ", noformat)
		//fmt.Println("p.L_Expresion.Len(): ", p.L_Expresion.Len())

		if noformat != p.L_Expresion.Len() {
			//fmt.Println("Formato y número de expresiones incorrecto")
			desc := fmt.Sprintf("format: '%v' parametros: '%v'", noformat, p.L_Expresion.Len())
			err.NewError("Formato y número de expresiones incorrecto, "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		}
		

		for _, exp := range p.L_Expresion.ToArray() {
			format_str = strings.Replace(format_str, "{}", fmt.Sprintf("%v", exp.(interfaces.Expresion).Ejecutar(env).Valor),1)
		}

		printcon := format_str + "\n"
		console.Console += printcon
		return nil
		/*printcon := fmt.Sprintf("%v", result.Valor) + "\n"
		console.Console += printcon*/
	}

	var result interfaces.Symbol
	result = p.L_Expresion.GetValue(0).(interfaces.Expresion).Ejecutar(env)

	fmt.Println("-result.Tipo: ", interfaces.GetType(result.Tipo))
	//fmt.Println(result.Valor)
	printcon := fmt.Sprintf("%v", result.Valor) + "\n"
	console.Console += printcon

	return nil
	//return result.Valor
}


/*func (p Imprimir) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	fmt.Println("result.Tipo: ", interfaces.GetType(result.Tipo))
	//fmt.Println(result.Valor)
	printcon := fmt.Sprintf("%v", result.Valor) + "\n"
	console.Console += printcon

	return result.Valor
}*/
