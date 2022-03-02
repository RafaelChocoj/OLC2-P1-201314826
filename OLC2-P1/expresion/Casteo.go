package expresion

import (
	"OLC2/interfaces"
	"fmt"
	"strconv"
)

type Casteo struct {
	Expre interfaces.Expresion
	Tipo  interfaces.TipoExpresion
	/*Line   int
	Column int*/
}

func NewCasteo(Expre interfaces.Expresion, Tipo interfaces.TipoExpresion /*, line int, column int*/) Casteo {

	//fmt.Println("entra en new casteo")
	exp := Casteo{Expre, Tipo /*, line, column*/}
	return exp
}

func (p Casteo) Ejecutar( /*env interface{}*/ ) interfaces.Symbol {

	var retornoExp interfaces.Symbol
	retornoExp = p.Expre.Ejecutar( /*env*/ )
	var resultado interface{}

	fmt.Println("retornoExp.Valor: ", retornoExp.Valor)
	fmt.Println("retornoExp.Tipo: ", retornoExp.Tipo)
	fmt.Println("p.Tipo: ", p.Tipo)
	//fmt.Println("interfaces.FLOAT: ", interfaces.FLOAT)

	if p.Tipo == interfaces.FLOAT {

		valexp, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoExp.Valor), 64)
		return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: valexp}

	} else if p.Tipo == interfaces.INTEGER { //dominante

		//entero, float y boolean
		if retornoExp.Tipo == interfaces.INTEGER || retornoExp.Tipo == interfaces.FLOAT {
			valexp, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoExp.Valor), 64)
			return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: int(valexp)}

		} else if retornoExp.Tipo == interfaces.BOOLEAN {

			//fmt.Println("retornoExp.Valor: ", retornoExp.Valor)
			//return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: retornoExp.Valor.(int)}
		}
	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
}
