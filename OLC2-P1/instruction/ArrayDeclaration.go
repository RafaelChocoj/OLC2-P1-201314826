package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/expresion"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type ArrayDeclaration struct {
	Id        string
	Tipos     *arrayList.List
	Expresion interfaces.Expresion
	IsMut     bool
	Line      int
	Column    int
}

func NewArrayDeclaration(id string, tipo *arrayList.List, val interfaces.Expresion, IsMut bool /*, isArray bool, isStruct bool*/, line int, column int) ArrayDeclaration {
	instr := ArrayDeclaration{id, tipo, val, IsMut, line, column}
	return instr
}

func (p ArrayDeclaration) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol
	result = p.Expresion.EjecutarValor(env)
	//fmt.Println("resultresultresultresultresult", result)
	var temTipos *arrayList.List
	temTipos = arrayList.New()
	//fmt.Println("---         	  p.Tiposp.Tiposp.Tipos", p.Tipos)
	for _, indexs := range p.Tipos.ToArray() {
		res_exp := indexs.(interfaces.ArrayType).SizeA.(interfaces.Expresion).EjecutarValor(env)
		valprim := expresion.NewPrimitivo(res_exp.Valor, res_exp.Tipo, res_exp.Line, res_exp.Column)

		varTip := interfaces.NewArrayType(indexs.(interfaces.ArrayType).Tipo, valprim,
			indexs.(interfaces.ArrayType).Line, indexs.(interfaces.ArrayType).Column)
		temTipos.Add(varTip)
	}
	p.Tipos = temTipos

	//validar array
	if p.IsArray_Valido(env, result, p.Tipos.Clone()) {
		env.(environment.Environment).SaveVariable(p.Id, result, interfaces.ARRAY, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, p.Tipos)
		//fmt.Println("TODO OK")
	} else {
		//fmt.Println("Los tipos no coinciden")
		err.NewError("Error al crear Array", env.(environment.Environment).Nombre, p.Line, p.Column)
	}

	return nil
	//return result.Valor
}

func (p ArrayDeclaration) IsArray_Valido(env interface{}, arr1 interfaces.Symbol, l_tipo *arrayList.List) bool {
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
