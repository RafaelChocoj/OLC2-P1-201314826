package expresion

import (
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
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

var res_dominante = [5][5]interfaces.TipoExpresion{
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

func (p Aritmetica) Ejecutar( /*env interface{}*/ ) interfaces.Symbol {

	var retornoIzq interfaces.Symbol
	var retornoDer interfaces.Symbol

	if p.Unario == true {
		retornoIzq = p.Op1.Ejecutar( /*env*/ )
	} else {
		retornoIzq = p.Op1.Ejecutar( /*env*/ )
		retornoDer = p.Op2.Ejecutar( /*env*/ )
	}

	var resultado interface{}

	var dominante interfaces.TipoExpresion

	switch p.Operador {
	case "+":
		{

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
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en suma "+desc, "suma", p.Line, p.Column)
			}

		}

	case "-":
		{
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
					desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
					err.NewError("Tipos incompatibles en resta "+desc, "resta", p.Line, p.Column)
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
				err.NewError("Tipos incompatibles en Multiplicación "+desc, "Multiplicación", p.Line, p.Column)
			}

		}

	case "/":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) / retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 / val2}

			} else {
				//fmt.Print("ERROR: No es posible Dividir")
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Divición "+desc, "Divición", p.Line, p.Column)
			}

		}

		/*case "<":
			{
				dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

				if dominante == interfaces.INTEGER {

					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) < retornoDer.Valor.(int)}

				} else if dominante == interfaces.FLOAT {
					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) < retornoDer.Valor.(float64)}

				} else {
					fmt.Print("ERROR: No es posible comparar <")
				}
			}

		case ">":
			{
				dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

				if dominante == interfaces.INTEGER {

					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) > retornoDer.Valor.(int)}

				} else if dominante == interfaces.FLOAT {
					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) > retornoDer.Valor.(float64)}

				} else {
					fmt.Print("ERROR: No es posible comparar <")
				}
			}

		case "<=":
			{
				dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

				if dominante == interfaces.INTEGER {

					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) <= retornoDer.Valor.(int)}

				} else if dominante == interfaces.FLOAT {
					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) <= retornoDer.Valor.(float64)}

				} else {
					fmt.Print("ERROR: No es posible comparar <")
				}
			}

		case ">=":
			{
				dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

				if dominante == interfaces.INTEGER {

					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) >= retornoDer.Valor.(int)}

				} else if dominante == interfaces.FLOAT {
					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) >= retornoDer.Valor.(float64)}

				} else {
					fmt.Print("ERROR: No es posible comparar <")
				}
			}*/
	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
}
