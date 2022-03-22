package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"strconv"
)

type Casteo struct {
	Expre  interfaces.Expresion
	Tipo   interfaces.TipoExpresion
	Line   int
	Column int
}

func NewCasteo(Expre interfaces.Expresion, Tipo interfaces.TipoExpresion, line int, column int) Casteo {

	//fmt.Println("entra en new casteo")
	exp := Casteo{Expre, Tipo, line, column}
	return exp
}

func (p Casteo) EjecutarValor(env interface{}) interfaces.Symbol {

	var retornoExp interfaces.Symbol
	retornoExp = p.Expre.EjecutarValor(env)
	var resultado interface{}

	//fmt.Println("=======================================p.Line: ", p.Line)

	//fmt.Println("retornoExp.Valor: ", retornoExp.Valor)
	//fmt.Println("retornoExp.Tipo: ", retornoExp.Tipo)
	//fmt.Println("p.Tipo: ", p.Tipo)

	if p.Tipo == interfaces.FLOAT {

		//entero, float
		if retornoExp.Tipo == interfaces.INTEGER || retornoExp.Tipo == interfaces.FLOAT {
			valexp, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoExp.Valor), 64)
			return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: valexp}

		} else {
			desc := fmt.Sprintf("%v a %v", interfaces.GetType(retornoExp.Tipo), interfaces.GetType(p.Tipo))
			err.NewError("No se puede castear de "+desc, "casteo", p.Line, p.Column)
		}

	} else if p.Tipo == interfaces.INTEGER { //dominante

		//entero, float y boolean
		if retornoExp.Tipo == interfaces.INTEGER || retornoExp.Tipo == interfaces.FLOAT {
			valexp, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoExp.Valor), 64)
			return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: int(valexp)}

		} else if retornoExp.Tipo == interfaces.BOOLEAN {

			var booleanval int
			if retornoExp.Valor == true {
				booleanval = 1
			} else if retornoExp.Valor == false {
				booleanval = 0
			}
			return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: booleanval}

		} else {
			desc := fmt.Sprintf("%v a %v", interfaces.GetType(retornoExp.Tipo), interfaces.GetType(p.Tipo))
			err.NewError("No se puede castear de "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		}
	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
}
