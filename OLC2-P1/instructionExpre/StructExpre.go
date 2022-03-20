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
	var tempExp *arrayList.List
	tempExp = arrayList.New()
	//se guarda el listado de valores nuevos
	for _, s := range p.List_Exp.ToArray() {
		tempExp.Add(s)
	}
	//se obtiene la estructura guardada
	resultStruct := env.(environment.Environment).GetStruct(p.Id, p.Line, p.Column)

	//fmt.Println("esultStruct.Tipo: ", interfaces.GetType(resultStruct.Tipo))
	if resultStruct.Tipo == interfaces.NULL {
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}
	//se valida si existe struct
	if resultStruct.Tipo == interfaces.STRUCT {
		//Validar tamaño y que cada tipo coincida con el struct existente
		if resultStruct.Valor.(*arrayList.List).Len() == p.List_Exp.Len() {
			valor = make(map[string]interfaces.Symbol)
			//contador de definiciones
			var contAtrib = 0
			//recorrer el struct almacenado
			for _, strAlm := range resultStruct.Valor.(*arrayList.List).ToArray() { //StructType
				//recorrer los valores
				for _, strEnt := range p.List_Exp.ToArray() { // StructContentido
					//si tipos iguales
					if strAlm.(interfaces.StructType).Id == strEnt.(StructContenido).Id {
						tempVal := strEnt.(StructContenido).Exp.(interfaces.Expresion).EjecutarValor(env)
						if strAlm.(interfaces.StructType).Tipo == tempVal.Tipo {
							contAtrib++
							valor[strAlm.(interfaces.StructType).Id] = tempVal
							break
						} else {

							desc := fmt.Sprintf("'%v' se esperaba '%v' se tiene '%v'", p.Id, interfaces.GetType(strAlm.(interfaces.StructType).Tipo), interfaces.GetType(tempVal.Tipo))
							err.NewError("Tipos no coninciden en struct "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

							return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
						}
					}
				}
			}
			//si es valido, guardarlo
			if p.List_Exp.Len() == contAtrib {

				result = interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			} else {
				err.NewError("Faltan atributos que asignar dentro del struct '"+p.Id+"'", env.(environment.Environment).Nombre, p.Line, p.Column)
				return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
			}
		} else {
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", resultStruct.Valor.(*arrayList.List).Len(), p.List_Exp.Len())
			err.NewError("La Cantidad de atributos en el struct es incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

			return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}

		}
	}
	return result
}
