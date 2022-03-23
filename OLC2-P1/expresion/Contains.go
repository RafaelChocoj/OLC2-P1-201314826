package expresion

import (
	"OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Contains struct {
	Id     string
	Expre  interfaces.Expresion
	Line   int
	Column int
}

func NewContains(Id string, Expre interfaces.Expresion, line int, column int) Contains {

	exp := Contains{Id, Expre, line, column}
	return exp
}

func (p Contains) EjecutarValor(env interface{}) interfaces.Symbol {

	var tmpSymbol interfaces.Symbol
	tmpSymbol = env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)

	var tmpExp interfaces.Symbol
	tmpExp = p.Expre.EjecutarValor(env)

	if tmpSymbol.Tipo == interfaces.VECTOR {
		//validar tipo de vector con expression
		/*if tmpSymbol.TipoRet != nil {

		}*/
		if tmpExp.Tipo == tmpSymbol.TipoRet {
			//recorrer expresion
			for _, s := range tmpSymbol.Valor.(interfaces.Symbol).Valor.(*arrayList.List).ToArray() {
				if s.(interfaces.Symbol).Valor == tmpExp.Valor {
					return interfaces.Symbol{Line: p.Line, Column: p.Column, Tipo: interfaces.BOOLEAN, Valor: true}
				}
			}
			return interfaces.Symbol{Line: p.Line, Column: p.Column, Tipo: interfaces.BOOLEAN, Valor: false}
		} else {
			fmt.Println("Tipo de expression incorrecta")
			return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
		}
	} else {
		fmt.Println("Solo se puede hacer Contains sobre vectores")
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}

}
