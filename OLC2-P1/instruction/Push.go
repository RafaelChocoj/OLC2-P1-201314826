package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Push struct {
	//Expre  interfaces.Expresion
	Id     string
	ValAdd interfaces.Expresion
	Line   int
	Column int
}

func NewPush(id string /*expre interfaces.Expresion,*/, valAdd interfaces.Expresion, line int, column int) Push {

	exp := Push{id, valAdd, line, column}
	return exp
}

func (p Push) Ejecutar(env interface{}) interface{} {

	//var retornoExp interfaces.Symbol
	//retornoExp = p.Expre.EjecutarValor(env)

	var retornoExp interfaces.Symbol
	retornoExp = env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)

	if retornoExp.Tipo == interfaces.VECTOR {
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", "vector", interfaces.GetType(retornoExp.Tipo))
		err.NewError("Uso de Función incorrecta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	if retornoExp.IsMut == false {

		//desc := fmt.Sprintf("se esperaba %v se tiene %v", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("La variable '"+p.Id+"' es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	var ValAdd interfaces.Symbol
	ValAdd = p.ValAdd.EjecutarValor(env)

	//fmt.Println("()", interfaces.GetType(retornoExp.TipoVecCon), "-", interfaces.GetType(ValAdd.Tipo))
	//fmt.Println(reflect.TypeOf(retornoExp.Valor), "---", reflect.TypeOf(ValAdd.Valor))

	//fmt.Println("()", retornoExp.Valor.(interfaces.Symbol).Id, "-", ValAdd.Id)
	//fmt.Println(interfaces.GetType(retornoExp.Tipo), "-", interfaces.GetType(ValAdd.Tipo))
	if ValAdd.Tipo == retornoExp.TipoVecCon || retornoExp.Valor.(interfaces.Symbol).Id == ValAdd.Id {
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(retornoExp.TipoVecCon), interfaces.GetType(ValAdd.Tipo))
		err.NewError("Tipos incorrectos en vector "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	//fmt.Println(reflect.TypeOf(retornoExp.Valor), "---", reflect.TypeOf(ValAdd.Valor))

	retornoExp.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Add(ValAdd)

	//fmt.Println("--- ValAdd.Valor", ValAdd.Valor)
	//fmt.Println("--- ValAdd.Capacity", retornoExp.Capacity)
	//fmt.Println("--- retornoExp.Valor.(*arrayList.List).Len()", retornoExp.Valor.(*arrayList.List).Len())

	//fmt.Println("--- ValAdd.Id", retornoExp.Id)

	var newCap = 0
	if retornoExp.Valor.(interfaces.Symbol).Valor.(*arrayList.List).Len() > retornoExp.Capacity {
		if retornoExp.Capacity <= 0 {
			retornoExp.Capacity = 1
		}
		newCap = retornoExp.Capacity * 2
		retornoExp.Capacity = newCap

		//p.Expre.EjecutarValor(env).Capacity = newCap
	}

	//retornoExp.Capacity = 150

	//guardar variable variable
	/*sym := interfaces.Symbol{Id: retornoExp.Id, Tipo: retornoExp.Tipo,
	Valor: retornoExp, IsMut: retornoExp.IsMut, Capacity: retornoExp.Capacity, Line: retornoExp.Line,
	Column: retornoExp.Column}*/

	//fmt.Println("--- ****//Capacity", retornoExp.Capacity)

	env.(environment.Environment).AlterVariableVec(p.Id, retornoExp)

	return nil
}
