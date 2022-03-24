package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type StructExpre struct {
	Id       string
	List_Exp *arrayList.List

	Line   int
	Column int
}

func NewStructExpre(id string, list_Exp *arrayList.List, line int, column int) StructExpre {
	exp := StructExpre{id, list_Exp, line, column}
	return exp
}

func (p StructExpre) EjecutarValor(env interface{}) interfaces.Symbol {

	var valor map[string]interfaces.Symbol
	var result interfaces.Symbol
	var tExpStr *arrayList.List
	tExpStr = arrayList.New()
	//se guarda el listado de valores nuevos
	for _, s := range p.List_Exp.ToArray() {
		tExpStr.Add(s)
	}
	reStruct := env.(environment.Environment).GetStruct(p.Id, p.Line, p.Column)

	//fmt.Println("esultStruct.Tipo: ", interfaces.GetType(reStruct.Tipo))
	if reStruct.Tipo == interfaces.NULL {
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}
	//todo bien struck
	if reStruct.Tipo == interfaces.STRUCT {
		//tamaño
		if reStruct.Valor.(*arrayList.List).Len() == p.List_Exp.Len() {
			valor = make(map[string]interfaces.Symbol)
			var contAtrib = 0
			//run
			for _, strAlm := range reStruct.Valor.(*arrayList.List).ToArray() { //StructType
				//values
				for _, strEnt := range p.List_Exp.ToArray() { // StructContentido
					//equasl
					if strAlm.(interfaces.StructType).Id == strEnt.(StructContenido).Id {
						tempVal := strEnt.(StructContenido).Exp.(interfaces.Expresion).EjecutarValor(env)
						if strAlm.(interfaces.StructType).Tipo == tempVal.Tipo {
							contAtrib++
							tempVal.IsMut = true
							valor[strAlm.(interfaces.StructType).Id] = tempVal
							break
							/*si es struck pero con id*/
						} else if strAlm.(interfaces.StructType).Tipo == interfaces.NULL {

							if strAlm.(interfaces.StructType).IdStruct == tempVal.Id {
								contAtrib++
								tempVal.IsMut = true
								valor[strAlm.(interfaces.StructType).Id] = tempVal
								break
							} else {
								desc := fmt.Sprintf("'%v' se esperaba '%v' se tiene '%v'", tempVal.Id, interfaces.GetType(strAlm.(interfaces.StructType).Tipo), interfaces.GetType(tempVal.Tipo))
								err.NewError("El ID no es struct "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

								return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
							}

						} else {

							desc := fmt.Sprintf("'%v' se esperaba '%v' se tiene '%v'", p.Id, interfaces.GetType(strAlm.(interfaces.StructType).Tipo), interfaces.GetType(tempVal.Tipo))
							err.NewError("Tipos no coninciden en struct "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

							return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
						}
					}
				}
			}
			//struc valido
			if p.List_Exp.Len() == contAtrib {

				result = interfaces.Symbol{Id: p.Id, Tipo: interfaces.STRUCT, Valor: valor, Line: p.Line, Column: p.Column, IsMut: true}
			} else {
				err.NewError("Faltan atributos que asignar dentro del struct '"+p.Id+"'", env.(environment.Environment).Nombre, p.Line, p.Column)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}
		} else {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", reStruct.Valor.(*arrayList.List).Len(), p.List_Exp.Len())
			err.NewError("La Cantidad de atributos en el struct es incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

			return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}

		}
	}
	return result
}
