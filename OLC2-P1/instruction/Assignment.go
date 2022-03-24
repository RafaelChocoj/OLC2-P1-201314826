package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Assignment struct {
	Id          string
	Expresion   interfaces.Expresion
	Dimensiones *arrayList.List
	Line        int
	Column      int
}

func NewAssignment(id string, val interfaces.Expresion, dimensiones *arrayList.List, line int, column int) Assignment {
	instr := Assignment{id, val, dimensiones, line, column}
	return instr
}

func (p Assignment) IsArray_Valido(env interface{}, arr1 interfaces.Symbol, l_tipo *arrayList.List) bool {
	a_valido := true
	ar_noelementos := 0
	arrType := l_tipo.GetValue(l_tipo.Len() - 1)
	res_exp := arrType.(interfaces.ArrayType).SizeA.(interfaces.Expresion).EjecutarValor(env)
	var arrSize int

	if res_exp.Tipo == interfaces.INTEGER {
		arrSize = res_exp.Valor.(int)
	} else {
		desc := fmt.Sprintf("Se esperaba un '%v' se tiene '%v'", "i64", interfaces.GetType(res_exp.Tipo))
		err.NewError("Error en Size "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return false
	}
	l_tipo.RemoveAtIndex(l_tipo.Len() - 1)

	for _, arr := range arr1.Valor.(*arrayList.List).ToArray() {
		if arrType.(interfaces.ArrayType).Tipo != arr.(interfaces.Symbol).Tipo {
			/// si los tipos son diferentes

			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(arrType.(interfaces.ArrayType).Tipo), interfaces.GetType(arr.(interfaces.Symbol).Tipo))
			//fmt.Println("***array*tipo es diferente de array t symbol: ",  desc)
			err.NewError("Array invalida "+desc, env.(environment.Environment).Nombre, arrType.(interfaces.ArrayType).Line, arrType.(interfaces.ArrayType).Column)

			return false
		}
		if arr.(interfaces.Symbol).Tipo == interfaces.ARRAY {
			a_valido = p.IsArray_Valido(env, arr.(interfaces.Symbol), l_tipo.Clone())
			if !a_valido {
				//fmt.Println("**a_valido: ", a_valido )
				return a_valido
			}
		}
		ar_noelementos++
	}

	if ar_noelementos == arrSize && a_valido {
		return true
	}
	//fmt.Println("**tamaños incorrectos ", "arrSize: ",arrSize, "ar_noelementos: ", ar_noelementos )
	desc := fmt.Sprintf("Size del Array '%v' Cantidad de elementos '%v'", arrSize, ar_noelementos)
	err.NewError("Tamaños incorrectos "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
	return false
}

func (p Assignment) Assignment_Array(env interface{}, arrlist interfaces.Symbol, indexs *arrayList.List, resul interfaces.Symbol) (*arrayList.List, bool) {
	var tempExp *arrayList.List
	tempExp = arrayList.New()

	inx := indexs.GetValue(0)
	res_ind := inx.(interfaces.Expresion).EjecutarValor(env)
	index := res_ind.Valor.(int)
	//	fmt.Println("-	index	: ", index)
	indexs.RemoveAtIndex(0)

	for i := 0; i < arrlist.Valor.(*arrayList.List).Len(); i++ {
		arr := arrlist.Valor.(*arrayList.List).GetValue(i)
		//		fmt.Println("iiiii: ", i)

		if index == i {

			////si es el ultimo index
			if indexs.Len() == 0 {
				//				fmt.Println("--------------------------------esto es el final xd: ", i)

				//fmt.Println("-		arr.(interfaces.Symbol).Tipo: ", arr.(interfaces.Symbol).Tipo)
				//				fmt.Println("-		resul.Tipo: ", resul.Tipo)
				if arr.(interfaces.Symbol).Tipo == resul.Tipo {
					//sym := interfaces.Symbol{Id: arr.(interfaces.Symbol).Id, Tipo: arr.(interfaces.Symbol).Tipo,
					//	Valor: resul, IsMut: arr.(interfaces.Symbol).IsMut}

					if resul.Tipo == interfaces.ARRAY {
						fmt.Println("						reflect.TypeOf(resul.Valor)", reflect.TypeOf(resul.Valor))
						if resul.Valor.(*arrayList.List).Len() != arr.(interfaces.Symbol).Valor.(*arrayList.List).Len() {
							//fmt.Println(" error en dimensiones")
							desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", arr.(interfaces.Symbol).Valor.(*arrayList.List).Len(), resul.Valor.(*arrayList.List).Len())
							err.NewError("Error en Dimensiones de Array "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
							return nil, false
						}
					}

					//					fmt.Println("-		resul: ", resul)
					tempExp.Add(resul)

				} else {
					desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(arr.(interfaces.Symbol).Tipo), interfaces.GetType(resul.Tipo))
					err.NewError("1: Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
					return nil, false
				}

			} else {
				//				fmt.Println("-		----arr: ", arr)
				//fmt.Println("							reflect.TypeOf(arr)", reflect.TypeOf(arr))
				//fmt.Println("							reflect.TypeOf(arr.(interfaces.Symbol).Valor)", reflect.TypeOf(arr.(interfaces.Symbol).Valor))
				tempExp2, is_Correct := p.Assignment_Array(env, arr.(interfaces.Symbol), indexs.Clone(), resul)
				if is_Correct == false {
					return nil, false
				}
				sym := interfaces.Symbol{Id: arr.(interfaces.Symbol).Id, Tipo: arr.(interfaces.Symbol).Tipo,
					Valor: tempExp2, IsMut: arr.(interfaces.Symbol).IsMut}
				//fmt.Println("							reflect.TypeOf(sym)", reflect.TypeOf(sym))
				//fmt.Println("							reflect.TypeOf(sym.Valor)", reflect.TypeOf(sym.Valor))
				tempExp.Add(sym)
			}

		} else {
			//			fmt.Println("e		arr: ", arr)
			tempExp.Add(arr)
		}
	}

	return tempExp, true

}
func (p Assignment) Ejecutar(env interface{}) interface{} {

	//result_mut := env.(environment.Environment).GetVariableMut(p.Id)
	result_mut := env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)
	//fmt.Println("-es mutableresult_mut ", result_mut.IsMut)

	if result_mut.Tipo == interfaces.NULL {
		return nil
	}
	if result_mut.IsMut == false {

		//desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("La variable "+p.Id+" es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	if result_mut.Tipo == interfaces.ARRAY {
		fmt.Println("++++++++++++++++++++++-is array ", result_mut.Tipo)
		//fmt.Println("---         	  reflect.TypeOf(result_mut)", reflect.TypeOf(result_mut))
		//fmt.Println("---         	  reflect.TypeOf(result_mut.Valor)", reflect.TypeOf(result_mut.Valor))

		if p.Dimensiones == nil {
			/*var tamar *arrayList.List
			tamar = arrayList.New()
			p.Dimensiones = tamar

			prim := expresion.NewPrimitivo(0, interfaces.INTEGER, 0, 0)
			p.Dimensiones.Add(prim)*/
			//			fmt.Println("---         	  result_mut.TiposArr", result_mut.TiposArr)

			var result interfaces.Symbol
			result = p.Expresion.EjecutarValor(env)

			if result_mut.Tipo == result.Tipo {
			} else {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(result_mut.Tipo), interfaces.GetType(result.Tipo))
				err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
				return nil
			}

			/*validano array*/
			if result_mut.TiposArr != nil {
				if p.IsArray_Valido(env, result, result_mut.TiposArr) {
				} else {
					return nil
				}
			}

			env.(environment.Environment).AlterVariable(p.Id, result)
			return nil
		}
		//		fmt.Println("---         	  result_mut.Valor", p.Dimensiones.Len())

		var result interfaces.Symbol
		result = p.Expresion.EjecutarValor(env)

		tempExp, is_Correct := p.Assignment_Array(env, result_mut.Valor.(interfaces.Symbol), p.Dimensiones, result)

		//		fmt.Println("LLLLLLLLLLLLUEGA a FINNNNN")
		if is_Correct == false {
			return nil
		}

		//fmt.Println("---         	  reflect.TypeOf(tempExp)", reflect.TypeOf(tempExp))
		//fmt.Println("---         	  reflect.TypeOf(result_mut.Valor.(interfaces.Symbol).Valor)", reflect.TypeOf(result_mut.Valor.(interfaces.Symbol).Valor))
		sym := interfaces.Symbol{Id: result_mut.Valor.(interfaces.Symbol).Id, Tipo: result_mut.Valor.(interfaces.Symbol).Tipo,
			Valor: tempExp, IsMut: result_mut.Valor.(interfaces.Symbol).IsMut /*tamarr*/}

		/*validano array*/
		if result_mut.TiposArr != nil {
			if p.IsArray_Valido(env, sym, result_mut.TiposArr.Clone()) {
			} else {
				//fmt.Println("hay err y va en nil")
				return nil
			}
		}
		env.(environment.Environment).AlterVariable(p.Id, sym)

		fmt.Println("LLLLLLLLLLLLUEGA a FINNNNN 222")

		return nil //
	}

	var result interfaces.Symbol
	result = p.Expresion.EjecutarValor(env)

	//fmt.Println("----reflect.TypeOf(result_mut.Tipo) ", reflect.TypeOf(result_mut.Tipo))
	//fmt.Println("----result_mut.Tipo ", result_mut.Tipo)
	//fmt.Println("----result.Tipo ", result.Tipo)
	if result_mut.Tipo == result.Tipo {

		env.(environment.Environment).AlterVariable(p.Id, result)

		//fmt.Println("-123123---p.Id ", p.Id)
		//fmt.Println("-123123---result.Valor ", result.Valor)

		return nil
		//return result.Valor
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(result_mut.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

		//fmt.Println("reflect.TypeOf(result_mut.Tipo) ", reflect.TypeOf(result_mut))
		//fmt.Println("reflect.TypeOf(result.Tipo) ", reflect.TypeOf(result))

		//fmt.Println(" result_mut.Tipo ", result_mut.Tipo)
		//fmt.Println(" result.Tipo ", result.Tipo)

		return nil
	}
}
