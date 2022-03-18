package instruction

import (
	"OLC2/environment"
	console "OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"strings"

	//"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Imprimir struct {
	//Expresion interfaces.Expresion
	L_Expresion *arrayList.List
	Line        int
	Column      int
}

//func NewImprimir(val interfaces.Expresion) Imprimir {
func NewImprimir(val *arrayList.List, line int, column int) Imprimir {
	exp := Imprimir{val, line, column}
	return exp
}

func (p Imprimir) PrintArray(env interface{}, arrlist *arrayList.List) string {

	array_format := ""
	//fmt.Println("00000 arrlist: ", arrlist)
	//fmt.Println("22222 arrlistLen(): ", arrlist.Len())

	array_format = array_format + "["
	//for _, arr := range arrlist.ToArray() {
	for i := 0; i < arrlist.Len(); i++ {
		arr := arrlist.GetValue(i)
		//fmt.Println("00000 arr 			: ", arr)
		//fmt.Println("00000	type				: ", interfaces.GetType(arr.(interfaces.Symbol).Tipo))

		expre_print := arr.(interfaces.Symbol)

		if arr.(interfaces.Symbol).Tipo == interfaces.ARRAY {
			//fmt.Println("	1111111expre_print.Tipo: 				", interfaces.GetType(expre_print.Tipo) )

			/*var coma = "";
			if arr.(interfaces.Symbol).Valor.(*arrayList.List).Len() > 0 {
				coma = ", "
			}*/
			getres := p.PrintArray(env, arr.(interfaces.Symbol).Valor.(*arrayList.List))
			//fmt.Println("	1getresgetresgetres: 				", getres )
			array_format = array_format + getres
		} else {
			//fmt.Println("	1111111expre_print.Valor else: 				", expre_print.Valor )

			var coma = ""
			if i < (arrlist.Len() - 1) {
				coma = ", "
			}
			if arr.(interfaces.Symbol).Tipo == interfaces.STRING || arr.(interfaces.Symbol).Tipo == interfaces.STR {
				array_format = array_format + fmt.Sprintf("\"%v\"", expre_print.Valor) + coma
			} else {
				array_format = array_format + fmt.Sprintf("%v", expre_print.Valor) + coma
			}

		}
	}
	array_format = array_format + "]" //+ ", "
	//fmt.Println("-array_format-", array_format)
	return array_format
}

func (p Imprimir) Ejecutar(env interface{}) interface{} {

	//format := fmt.Sprintf("%v", p.Values.GetValue(0).(interfaces.Expression).EjecutarValor(ast, env).Valor)

	if p.L_Expresion.Len() > 1 {

		//format := fmt.Sprintf("%v", p.Values.GetValue(0).(interfaces.Expression).EjecutarValor(ast, env).Valor)

		var result interfaces.Symbol
		result = p.L_Expresion.GetValue(0).(interfaces.Expresion).EjecutarValor(env)
		format_str := fmt.Sprintf("%v", result.Valor)

		p.L_Expresion.RemoveAtIndex(0)

		//fmt.Println("format_str: ", format_str)
		//fmt.Println("result.Tipo: ", interfaces.GetType(result.Tipo))

		noformat := strings.Count(format_str, "{}") + strings.Count(format_str, "{:?}")
		//fmt.Println("noformat: ", noformat)
		//fmt.Println("p.L_Expresion.Len(): ", p.L_Expresion.Len())

		if noformat != p.L_Expresion.Len() {
			//fmt.Println("Formato y número de expresiones incorrecto")
			desc := fmt.Sprintf("format: '%v' parametros: '%v'", noformat, p.L_Expresion.Len())
			err.NewError("Formato y número de expresiones incorrecto, "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		}

		for _, exp := range p.L_Expresion.ToArray() {
			expre_print := exp.(interfaces.Expresion).EjecutarValor(env)
			//fmt.Println("-----expre_print.Tipo: ", interfaces.GetType(expre_print.Tipo) )
			//fmt.Println("-----reflect.TypeOf(expre_print.Valor: ", reflect.TypeOf(expre_print.Valor) )

			if expre_print.Tipo == interfaces.ARRAY {
				str_arr := p.PrintArray(env, expre_print.Valor.(*arrayList.List))
				str_arr = strings.ReplaceAll(str_arr, "][", "], [")
				//fmt.Println("str_arr: ", str_arr)

				format_str = strings.Replace(format_str, "{:?}", str_arr, 1)

			} else {
				format_str = strings.Replace(format_str, "{}", fmt.Sprintf("%v", expre_print.Valor), 1)
			}
		}

		printcon := format_str + "\n"
		console.Console += printcon
		return nil
		/*printcon := fmt.Sprintf("%v", result.Valor) + "\n"
		console.Console += printcon*/
	}

	var result interfaces.Symbol
	result = p.L_Expresion.GetValue(0).(interfaces.Expresion).EjecutarValor(env)

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
