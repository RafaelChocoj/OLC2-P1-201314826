package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
)

type Return struct {
	//Tipo      interfaces.TipoExpresion
	ValReturn interfaces.Expresion
	Line      int
	Column    int
}

func NewReturn( /*tipo interfaces.TipoExpresion,*/ salida interfaces.Expresion, line int, column int) Return {

	if salida != nil {
		return Return{
			//Tipo:      tipo,
			ValReturn: salida,
			Line:      line, Column: column,
		}
	}

	return Return{
		//Tipo:      tipo,
		ValReturn: nil,
		Line:      line, Column: column,
	}
}

func (r Return) Ejecutar(env interface{}) interface{} {

	var returnExpre interfaces.Symbol
	if env.(environment.Environment).IsFunction() {
		//fmt.Println("	r.Tipo: ", r.Tipo)
		//if r.Tipo == interfaces.VOID {
		if r.ValReturn == nil {
			returnExpre = interfaces.Symbol{
				Line:    r.Line,
				Column:  r.Column,
				Id:      "RETURN",
				Tipo:    interfaces.VOID,
				TipoRet: interfaces.VOID,
				Valor:   nil,
			}
		} else {
			valexpre := r.ValReturn.EjecutarValor(env)
			//fmt.Println("	valexpre: ", valexpre.Valor)
			returnExpre = interfaces.Symbol{
				Line:   r.Line,
				Column: r.Column,
				Id:     "RETURN",
				//Tipo:   interfaces.RETURN,
				Tipo:    valexpre.Tipo,
				TipoRet: interfaces.RETURN,
				Valor:   valexpre.Valor,
			}
		}

	} else {
		err.NewError("La sentencia 'return' tiene que estar dentro de una función",
			env.(environment.Environment).Nombre, r.Line, r.Column)
	}
	return returnExpre
}
