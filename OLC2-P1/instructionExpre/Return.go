package instructionExpre

import (
	"OLC2/interfaces"
	"fmt"
)

type Return struct {
	Tipo      interfaces.TipoExpresion
	ValReturn interfaces.Expresion
}

func NewReturn(tipo interfaces.TipoExpresion, salida interfaces.Expresion) Return {

	if salida != nil {
		return Return{
			Tipo:      tipo,
			ValReturn: salida,
		}
	}

	return Return{
		Tipo:      tipo,
		ValReturn: nil,
	}
}

func (r Return) Ejecutar(env interface{}) interface{} {

	fmt.Println("	r.Tipo: ", r.Tipo)
	if r.Tipo == interfaces.VOID {
		return interfaces.Symbol{Id: "", Tipo: interfaces.VOID, Valor: nil}
	}
	returnExpre := r.ValReturn.EjecutarValor(env)
	fmt.Println("	returnExpre: ", returnExpre)

	return returnExpre
}
