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

func (p Assignment) Assignment_Array(env interface{}, arrlist interfaces.Symbol, indexs *arrayList.List, resul interfaces.Symbol) *arrayList.List {
	var tempExp *arrayList.List
	tempExp = arrayList.New()

	inx := indexs.GetValue(0)
	res_ind := inx.(interfaces.Expresion).Ejecutar(env)
	index := res_ind.Valor.(int)
	fmt.Println("-	index	: ", index)
	indexs.RemoveAtIndex(0)

	for i := 0; i < arrlist.Valor.(*arrayList.List).Len(); i++ {
		arr := arrlist.Valor.(*arrayList.List).GetValue(i)
		fmt.Println("iiiii: ", i)

		if index == i {

			////si es el ultimo index
			if indexs.Len() == 0 {
				fmt.Println("-		esto es el final xd: ", i)

				//fmt.Println("-		arr.(interfaces.Symbol): ", arr.(interfaces.Symbol))
				//sym := interfaces.Symbol{Id: arr.(interfaces.Symbol).Id, Tipo: arr.(interfaces.Symbol).Tipo,
				//	Valor: resul, IsMut: arr.(interfaces.Symbol).IsMut}
				fmt.Println("-		resul: ", resul)
				//fmt.Println("-		sym: ", sym)

				tempExp.Add(resul)

			} else {
				fmt.Println("-		----arr: ", arr)
				fmt.Println("							reflect.TypeOf(arr)", reflect.TypeOf(arr))
				fmt.Println("							reflect.TypeOf(arr.(interfaces.Symbol).Valor)", reflect.TypeOf(arr.(interfaces.Symbol).Valor))
				//var tempExp2 *arrayList.List
				//tempExp2 = arrayList.New()
				tempExp2 := p.Assignment_Array(env, arr.(interfaces.Symbol), indexs.Clone(), resul)
				sym := interfaces.Symbol{Id: arr.(interfaces.Symbol).Id, Tipo: arr.(interfaces.Symbol).Tipo,
					Valor: tempExp2, IsMut: arr.(interfaces.Symbol).IsMut}
				fmt.Println("							reflect.TypeOf(sym)", reflect.TypeOf(sym))
				fmt.Println("							reflect.TypeOf(sym.Valor)", reflect.TypeOf(sym.Valor))
				tempExp.Add(sym)
			}

		} else {
			fmt.Println("e		arr: ", arr)
			tempExp.Add(arr)
		}
	}

	return tempExp

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
		fmt.Println("---             -is array ", result_mut.Tipo)
		fmt.Println("---         	  reflect.TypeOf(result_mut)", reflect.TypeOf(result_mut))
		fmt.Println("---         	  reflect.TypeOf(result_mut.Valor)", reflect.TypeOf(result_mut.Valor))
		fmt.Println("---         	  result_mut.Valor", result_mut.Valor)

		var result interfaces.Symbol
		result = p.Expresion.Ejecutar(env)

		tempExp := p.Assignment_Array(env, result_mut.Valor.(interfaces.Symbol), p.Dimensiones, result)

		fmt.Println("LLLLLLLLLLLLUEGA a FINNNNN")
		fmt.Println("---         	  reflect.TypeOf(tempExp)", reflect.TypeOf(tempExp))
		fmt.Println("---         	  reflect.TypeOf(result_mut.Valor.(interfaces.Symbol).Valor)", reflect.TypeOf(result_mut.Valor.(interfaces.Symbol).Valor))
		//result_mut.Valor.(interfaces.Symbol).Valor.(*arrayList.List) = tempExp
		sym := interfaces.Symbol{Id: result_mut.Valor.(interfaces.Symbol).Id, Tipo: result_mut.Valor.(interfaces.Symbol).Tipo,
			Valor: tempExp, IsMut: result_mut.Valor.(interfaces.Symbol).IsMut}

		env.(environment.Environment).AlterVariable(p.Id, sym)

		fmt.Println("LLLLLLLLLLLLUEGA a FINNNNN 222")

		/*for _, inx := range p.Dimensiones.ToArray() {
		//fmt.Println("00000 inx 			: ", inx)

		res_ind := inx.(interfaces.Expresion).Ejecutar(env)
		index := res_ind.Valor.(int)
		fmt.Println("	index	: ", index)
		*/
		/*array_list := result_mut.Valor.(interfaces.Symbol).Valor.(*arrayList.List)
		//fmt.Println("	reflect.TypeOf(array_list)	: ", reflect.TypeOf(array_list))
		fmt.Println("	array_list	: ", array_list)

		fmt.Println("	reflect array_list.GetValue(index)	: ", reflect.TypeOf(array_list.GetValue(index)))

		var val_arr interfaces.Symbol
		val_arr = array_list.GetValue(index).(interfaces.Symbol)

		//val_arr = array_list.GetValue(index).(interfaces.Symbol)

		fmt.Println("	val_arr	: ", val_arr)
		fmt.Println("	val_arr.Tipo	: ", interfaces.GetType(val_arr.Tipo))
		fmt.Println("	val_arr.Valor	: ", val_arr.Valor)
		val_arr.Valor = "nosevs"
		fmt.Println("	val_arr.Valor 2222	: ", val_arr.Valor)
		fmt.Println("	array_list.GetValue(index).(interfaces.Symbol) 3333	: ", array_list.GetValue(index).(interfaces.Symbol).Valor)

		//env.(environment.Environment).AlterVariable(p.Id, result_mut)

		return val_arr.Valor*/

		///////////////

		//var res_arr interfaces.Symbol
		//res_arr := result_mut.Valor.(interfaces.Expresion).Ejecutar(env)
		//fmt.Println("res_arr	: ", res_arr)

		//arrval := result_mut.Valor.(*arrayList.List).GetValue(index).(interfaces.Symbol)
		//fmt.Println("	arrvalarrvalarrval	: ", arrval)
		/*}*/
		return nil //
	}

	var result interfaces.Symbol
	result = p.Expresion.Ejecutar(env)

	//fmt.Println("----reflect.TypeOf(result_mut.Tipo) ", reflect.TypeOf(result_mut.Tipo))
	//fmt.Println("----result_mut.Tipo ", result_mut.Tipo)
	//fmt.Println("----result.Tipo ", result.Tipo)
	if result_mut.Tipo == result.Tipo {

		env.(environment.Environment).AlterVariable(p.Id, result)

		//fmt.Println("-123123---p.Id ", p.Id)
		//fmt.Println("-123123---result.Valor ", result.Valor)

		return result.Valor
	} else {
		desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(result_mut.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}
}
