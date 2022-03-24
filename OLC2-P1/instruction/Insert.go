package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Insert struct {
	Id   string
	Exp1 interfaces.Expresion
	Exp2 interfaces.Expresion

	Line   int
	Column int
}

func NewInsert(id string, exp1, exp2 interfaces.Expresion, line int, column int) Insert {
	instr := Insert{id, exp1, exp2, line, column}
	return instr
}

func (p Insert) Ejecutar(env interface{}) interface{} {

	var tmpSyVec interfaces.Symbol
	var tmpArr *arrayList.List
	tmpSyVec = env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)
	tmpExp1 := p.Exp1.EjecutarValor(env) //index
	tmpExp2 := p.Exp2.EjecutarValor(env) //val
	tmpArr = arrayList.New()
	if tmpSyVec.Tipo == interfaces.VECTOR {
		if (tmpExp2.Tipo == tmpSyVec.TipoVecCon || tmpExp2.Id == tmpSyVec.Valor.(interfaces.Symbol).Id) && tmpExp1.Tipo == interfaces.INTEGER {

			if tmpSyVec.IsMut {
			} else {
				err.NewError("La variable '"+p.Id+"' es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
				return nil
			}

			/*if tmpExp1.Valor.(int) == tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() {
				tmpArr.Add(tmpExp2)

				///
				if (tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() + 1) > tmpSyVec.Capacity {
					var newCap = 0
					if tmpSyVec.Capacity <= 0 {
						tmpSyVec.Capacity = 1
					}
					newCap = tmpSyVec.Capacity * 2
					tmpSyVec.Capacity = newCap

				}
				///
			} else {*/

			if tmpExp1.Valor.(int) <= tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() && tmpExp1.Valor.(int) >= 0 {
				//fmt.Println("index tmpExp1.Valor.(int) ", tmpExp1.Valor.(int))
				//fmt.Println("tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len()  ", tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len())

				/*if tmpExp1.Valor.(int) == 0 && tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() == 0 {
					tmpArr.Add(tmpExp2)
					fmt.Println("inserto 0 ")
				}*/
				for i := 0; i <= tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len(); i++ {
					//fmt.Println("			i: ", i, " - index: ", tmpExp1.Valor.(int))
					if tmpExp1.Valor.(int) == i {
						tmpArr.Add(tmpExp2)

						//fmt.Println("i: insertando", i)
						if i < tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() {
							tmpArr.Add(tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).GetValue(i))
						}

						//fmt.Println("tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len()", tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len())
						//fmt.Println("tmpSyVec.Capacity", tmpSyVec.Capacity)
						if (tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() + 1) > tmpSyVec.Capacity {
							var newCap = 0
							if tmpSyVec.Capacity <= 0 {
								tmpSyVec.Capacity = 1
							}
							newCap = tmpSyVec.Capacity * 2
							tmpSyVec.Capacity = newCap

						}

					} else {
						//fmt.Println("			i: ", i, " inserto???")
						tmpArr.Add(tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).GetValue(i))
					}

				}
			} else {
				desc := fmt.Sprintf("se quiere insertar en '%v' len vector '%v'", tmpExp1.Valor.(int), tmpSyVec.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len())
				err.NewError("Rango no permitido en vector "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
				return nil
			}
			//}
		} else {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.VECTOR), interfaces.GetType(tmpSyVec.Tipo))
			err.NewError("Uso de Función incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

			return nil
		}
	} else {
		err.NewError("No es 'vector', solo insert solo para vectores", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}
	//remplazar lista
	tmpSyVec.Valor = tmpArr
	//fmt.Println("tmpSyVec: ", reflect.TypeOf(tmpSyVec.Valor))

	//env.(environment.Environment).AlterVariableVec(p.Id, tmpSyVec)
	env.(environment.Environment).AlterVariable(p.Id, tmpSyVec)

	return nil
}
