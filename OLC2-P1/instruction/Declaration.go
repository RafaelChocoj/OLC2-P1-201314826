package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	//"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Declaration struct {
	Id        string
	Tipo      interfaces.TipoExpresion
	Expresion interfaces.Expresion
	//IsArray   bool
	//IsStruct  bool
	IsMut  bool
	Line   int
	Column int
}

func NewDeclaration(id string, tipo interfaces.TipoExpresion, val interfaces.Expresion, IsMut bool /*, isArray bool, isStruct bool*/, line int, column int) Declaration {
	//fmt.Println("aaaaaarrrraayy				tipo: ", interfaces.GetType(tipo), " - ", id)
	instr := Declaration{id, tipo, val, IsMut /*, isArray, isStruct*/, line, column}
	return instr
}

func (p Declaration) Ejecutar(env interface{}) interface{} {

	//fmt.Println("aaaaaarrrraayy				tipo: ", interfaces.GetType(p.Tipo), " - ", p.Id)

	/*si es una declaracion sin valor, parametros*/
	if p.Expresion != nil {
		var result interfaces.Symbol
		result = p.Expresion.EjecutarValor(env)

		//fmt.Println("----p.IsMut: ", p.IsMut)
		//fmt.Println("result.Tipo: ", interfaces.GetType(result.Tipo))
		//fmt.Println("p.Tipo: ", interfaces.GetType(p.Tipo))

		if result.Tipo == interfaces.NULL {
			return nil
		}

		if result.Tipo == p.Tipo {
			env.(environment.Environment).SaveVariable(p.Id, result, p.Tipo, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil)
			/*} else if p.IsArray {
				env.(environment.Environment).SaveVariable(p.Id, result, interfaces.ARRAY)
			} else if p.IsStruct {
			env.(environment.Environment).SaveVariable(p.Id, result, interfaces.STRUCT)
			*/
		} else if p.Tipo == interfaces.NULL {

			if result.Tipo == interfaces.ARRAY {
				//fmt.Println("ES  ARRAY: ", interfaces.GetType(result.Tipo))
				//fmt.Println("-----reflect.TypeOf(result.Valor: ", reflect.TypeOf(result.Valor) )

				/*if p.IsArray_Valido(env, result.Valor.(*arrayList.List)) {
					//fmt.Println("TODO OK")
				} else {
					//fmt.Println("ERRR Los tipos no coinciden")
				}*/
			}
			/*no tiene tipo en asignacion, se le asigna el tipo de la expresion*/
			env.(environment.Environment).SaveVariable(p.Id, result, result.Tipo, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil)
		} else {
			//fmt.Println("Los tipos no coinciden")
			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
			err.NewError("Tipos no coinciden en Declaración "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		}

		//return result.Valor
	}
	return nil
}

func (p Declaration) IsArray_Valido(env interface{}, arrlist *arrayList.List) bool {

	fmt.Println("00000000000000 arr LEN			: ", arrlist.Len())
	//for _, arr := range arrlist.ToArray() {
	for i := 0; i < arrlist.Len(); i++ {
		arr := arrlist.GetValue(i)
		tipo_primer := arrlist.GetValue(0).(interfaces.Symbol).Tipo
		//fmt.Println("11111 arr 			: ", arr)
		expre_arr := arr.(interfaces.Symbol)
		fmt.Println("22222	type				: ", interfaces.GetType(expre_arr.Tipo))
		//fmt.Println("33333	len array			: ", expre_arr.Valor )
		if arr.(interfaces.Symbol).Tipo == interfaces.ARRAY {

			p.IsArray_Valido(env, arr.(interfaces.Symbol).Valor.(*arrayList.List))
		} else {
			fmt.Println("							Valor else: 				", expre_arr.Valor)
			/*validando valores del array si todos los elementos son iguales*/
			//fmt.Println("							tipo_primer: 				", tipo_primer)
			if tipo_primer != expre_arr.Tipo {

				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(tipo_primer), interfaces.GetType(expre_arr.Tipo))
				err.NewError("Array invalida "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
				return false
			}
		}
	}

	return true
}
