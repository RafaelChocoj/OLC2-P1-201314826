package expresion

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type RangeF struct {
	Exp_ini interfaces.Expresion
	Exp_fin interfaces.Expresion
	Tipo    interfaces.TipoExpresion
	Line    int
	Column  int
}

func NewRangeF(e_ini interfaces.Expresion, e_fin interfaces.Expresion, line int, column int) RangeF {
	exp := RangeF{e_ini, e_fin, interfaces.INTEGER, line, column}
	return exp
}

func (p RangeF) EjecutarValor(env interface{}) interfaces.Symbol {

	var val1, val2 interfaces.Symbol
	var array *arrayList.List
	array = arrayList.New()
	val1 = p.Exp_ini.EjecutarValor(env)
	val2 = p.Exp_fin.EjecutarValor(env)
	p.Tipo = val1.Tipo

	if (val1.Valor.(int) < val2.Valor.(int)) && (val1.Tipo == interfaces.INTEGER) && (val2.Tipo == interfaces.INTEGER) {

		var tmpSym interfaces.Symbol
		inival := val1.Valor.(int)

		tmpSym = interfaces.Symbol{
			Line:   p.Line,
			Column: p.Column,
			Id:     "",
			Tipo:   interfaces.INTEGER,
			Valor:  inival,
			IsMut:  true,
		}
		array.Add(tmpSym)

		for {
			inival++
			if inival < val2.Valor.(int) {
				tmpSym = interfaces.Symbol{
					Line:   p.Line,
					Column: p.Column,
					Id:     "",
					Tipo:   interfaces.INTEGER,
					Valor:  inival,
					IsMut:  true,
				}
				array.Add(tmpSym)
			} else {
				break
			}
		}

	} else {

		desc := fmt.Sprintf("valor inicial '%v' valor final '%v'", val1.Valor, val2.Valor)
		err.NewError("Indices incorrectos en Forin "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
	}

	return interfaces.Symbol{
		Line:   p.Line,
		Column: p.Column,
		Id:     "",
		Tipo:   interfaces.ARRAY,
		Valor:  array,
		IsMut:  false,
	}
}
