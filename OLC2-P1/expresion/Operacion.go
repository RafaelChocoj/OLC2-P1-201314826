package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"math"
	"strconv"
)

/*var suma_dominante = [5][5]interfaces.TipoExpresion{
	//INTEGER			//FLOAT			   //STRING			  //BOOLEAN		   //NULL
	//INTEGER
	{interfaces.INTEGER, interfaces.FLOAT, interfaces.STRING, interfaces.NULL, interfaces.NULL},
	//FLOAT
	{interfaces.FLOAT, interfaces.FLOAT, interfaces.STRING, interfaces.NULL, interfaces.NULL},
	//STRING
	{interfaces.STRING, interfaces.STRING, interfaces.STRING, interfaces.STRING, interfaces.NULL},
	//BOOLEAN
	{interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL},
	//NULL
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}*/

/****ARITMETICAS***/
/*
horizontal segundo
vertical primero*/
var res_dominante = [8][8]interfaces.TipoExpresion{
	//INTEGER			//FLOAT			   //STRING			//STR		  //BOOLEAN		   //ARRAY		   		//VOID		   	//NULL
	//INTEGER
	{interfaces.INTEGER, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//FLOAT
	{interfaces.NULL, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STRING
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STR
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//BOOLEAN
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//ARRAY
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//VOID
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.VOID, interfaces.NULL},
	//NULL
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

/****RELACIONALES***/
/*
horizontal segundo
vertical primero*/
var rel_dominante = [8][8]interfaces.TipoExpresion{
	//INTEGER			//FLOAT			   //STRING			//STR		  //BOOLEAN		   //ARRAY		   		//VOID		   	//NULL
	//INTEGER
	{interfaces.INTEGER, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//FLOAT
	{interfaces.NULL, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STRING
	{interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STR
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.STR, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//BOOLEAN
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//ARRAY
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//VOID
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//NULL
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

var suma_dominante = [5][5]interfaces.TipoExpresion{
	//INTEGER			//FLOAT			   //STRING			  //BOOLEAN		   //NULL
	//INTEGER
	{interfaces.INTEGER, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//FLOAT
	{interfaces.NULL, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STRING
	{interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL},
	//BOOLEAN
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//NULL
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

/*var resta_dominante = [5][5]interfaces.TipoExpresion{
	{interfaces.INTEGER, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.FLOAT, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}*/

var resta_dominante = [5][5]interfaces.TipoExpresion{
	{interfaces.INTEGER, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

var multi_division_dominante = [5][5]interfaces.TipoExpresion{
	{interfaces.INTEGER, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.FLOAT, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

/*relacional_dominante := [5][5]interfaces.TipoExpresion{
	{interfaces.INTEGER, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.FLOAT, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}*/

type Aritmetica struct {
	Op1      interfaces.Expresion
	Operador string
	Op2      interfaces.Expresion
	Unario   bool
	Line     int
	Column   int
}

func NewOperacion(Op1 interfaces.Expresion, Operador string, Op2 interfaces.Expresion, unario bool, line int, column int) Aritmetica {

	exp := Aritmetica{Op1, Operador, Op2, unario, line, column}
	return exp
}

func (p Aritmetica) EjecutarValor(env interface{}) interfaces.Symbol {

	var retornoIzq interfaces.Symbol
	var retornoDer interfaces.Symbol

	if p.Unario == true {
		retornoIzq = p.Op1.EjecutarValor(env)
	} else {
		retornoIzq = p.Op1.EjecutarValor(env)
		retornoDer = p.Op2.EjecutarValor(env)
	}

	var resultado interface{}

	var dominante interfaces.TipoExpresion

	switch p.Operador {
	case "+":
		{
			//fmt.Println("retornoIzq.Tipo: ", interfaces.GetType(retornoIzq.Tipo))
			//fmt.Println("retornoDer.Tipo: ", interfaces.GetType(retornoDer.Tipo))

			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) + retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 + val2}
				//return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(float64) + retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: r1 + r2}
			} else {
				desc := fmt.Sprintf("'%v' con '%v'", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en suma "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "-":
		{
			//fmt.Println("p.Unario: ", p.Unario)
			//fmt.Println("retornoIzq.Valor: ", retornoIzq.Valor)
			if p.Unario {

				/*if retornoIzq.Tipo != interfaces.INTEGER && retornoIzq.Tipo != entorno.FLOAT {
					return interfaces.RetornoType{Tipo: interfaces.NULL, Valor: nil}
				}*/

				if retornoIzq.Tipo == interfaces.INTEGER {
					return interfaces.Symbol{Id: "", Tipo: retornoIzq.Tipo, Valor: -1 * retornoIzq.Valor.(int)}
				} else if retornoIzq.Tipo == interfaces.FLOAT {
					return interfaces.Symbol{Id: "", Tipo: retornoIzq.Tipo, Valor: -1 * retornoIzq.Valor.(float64)}
				}

			} else {
				dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

				if dominante == interfaces.INTEGER {

					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) - retornoDer.Valor.(int)}

				} else if dominante == interfaces.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 - val2}

				} else {
					desc := fmt.Sprintf("'%v' con '%v'", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
					err.NewError("Tipos incompatibles en resta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
					//fmt.Print("ERROR: No es posible restar")
				}
			}
		}

	case "*":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) * retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 * val2}

			} else {
				//fmt.Print("ERROR: No es posible Multiplicar")
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Multiplicación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "/":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				if retornoDer.Valor.(int) == 0 {
					err.NewError("No se pude dividir un número entre 0", env.(environment.Environment).Nombre, p.Line, p.Column)

				} else {
					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) / retornoDer.Valor.(int)}
				}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 / val2}

			} else {
				//fmt.Print("ERROR: No es posible Dividir")
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Divición "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "%":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				if retornoDer.Valor.(int) == 0 {
					err.NewError("No se pude dividir(%) un número entre 0", env.(environment.Environment).Nombre, p.Line, p.Column)

				} else {
					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) % retornoDer.Valor.(int)}
				}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)

				modval := math.Mod(val1, val2)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: modval}

			} else {
				//fmt.Print("ERROR: No es posible Dividir")
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Módulo "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "pow":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				val_pow := math.Pow(val1, val2)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: int(val_pow)}

			} else {
				desc := fmt.Sprintf("%v , %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en i64::pow "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case "powf":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.FLOAT {

				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				val_pow := math.Pow(val1, val2)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val_pow}
			} else {
				desc := fmt.Sprintf("%v , %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en f64::pow "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case "<":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) < retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 < val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) < retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 < r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 < r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (<) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case ">":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) > retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 > val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) > retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 > r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 > r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (>) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case "<=":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) <= retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 <= val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) <= retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 <= r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 <= r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (<=) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case ">=":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) >= retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 >= val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) >= retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 >= r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 >= r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (>=) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "==":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) == retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 == val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) == retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 == r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 == r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (==) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "!=":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) != retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 != val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) != retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 != r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 != r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (!=) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "&&":
		{

			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]
			//fmt.Println("retornoIzq.Valor: ", retornoIzq.Valor)
			//fmt.Println("retornoDer.Valor: ", retornoDer.Valor)
			//fmt.Println("dominante: ", dominante)

			if dominante == interfaces.BOOLEAN {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) && retornoDer.Valor.(bool)}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles Logicos (&&) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "||":
		{

			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.BOOLEAN {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) || retornoDer.Valor.(bool)}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles Logicos (||) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}
	case "!":
		{

			//fmt.Println("p.Unario ", p.Unario)
			if p.Unario {

				//fmt.Println("retornoIzq.Tipo: ", retornoIzq.Tipo)
				if retornoIzq.Tipo == interfaces.BOOLEAN {

					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: !retornoIzq.Valor.(bool)}

				} else {
					desc := fmt.Sprintf("%v ", interfaces.GetType(retornoIzq.Tipo))
					err.NewError("Tipos incompatibles Logicos (!) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
				}

			}

		}

	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
}
