package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Remove struct {
	Id        string
	Expresion interfaces.Expresion
	Line      int
	Column    int
}

func NewRemove(id string, exp interfaces.Expresion, line int, column int) Remove {
	expr := Remove{id, exp, line, column}
	return expr
}

func (p Remove) Ejecutar(env interface{}) interface{} {

	p.EjecutarValor(env)
	return nil
}

func (p Remove) EjecutarValor(env interface{}) interfaces.Symbol {

	var result, tmpSVec, tmpExp interfaces.Symbol
	var tmpList *arrayList.List
	tmpList = arrayList.New()
	tmpSVec = env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)
	tmpExp = p.Expresion.EjecutarValor(env) //indice

	if tmpSVec.Tipo == interfaces.VECTOR {
		if tmpExp.Tipo == interfaces.INTEGER {
			if tmpExp.Valor.(int) < tmpSVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() && tmpExp.Valor.(int) >= 0 {
				for i := 0; i < tmpSVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len(); i++ {

					if tmpExp.Valor.(int) == i {
						result = tmpSVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).GetValue(i).(interfaces.Symbol)
					} else {
						tmpList.Add(tmpSVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).GetValue(i))
					}
				}
			} else {
				err.NewError("Rango no permitido en vector", env.(environment.Environment).Nombre, p.Line, p.Column)
				return result
			}
		} else {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.VECTOR), interfaces.GetType(tmpSVec.Tipo))
			err.NewError("Uso de Función incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			return result
		}
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.VECTOR), interfaces.GetType(tmpSVec.Tipo))
		err.NewError("No se puede eliminar, "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return result
	}

	//remplace list
	tmpSVec.Valor = tmpList
	//return value delete
	env.(environment.Environment).AlterVariable(p.Id, tmpSVec)
	return result

}
