package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type ForIn struct {
	Id     string
	Exp    interfaces.Expresion
	Inst   *arrayList.List
	Line   int
	Column int
}

func NewForIn(id string, exp interfaces.Expresion, inst *arrayList.List, line int, column int) ForIn {
	forin := ForIn{id, exp, inst, line, column}
	return forin
}

func (p ForIn) Ejecutar(env interface{}) interface{} {

	Isbreak := false
	var result interfaces.Symbol
	var arr *arrayList.List
	//si es tipo array

	////fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.ARRAY), interfaces.GetType(p.Exp.EjecutarValor(env).Tipo))
	//fmt.Println("p.Exp.EjecutarValor(env).Tipo: ", interfaces.GetType(p.Exp.EjecutarValor(env).Tipo))
	//fmt.Println("interfaces.ARRAY: ", interfaces.GetType(interfaces.ARRAY))

	if p.Exp.EjecutarValor(env).Tipo == interfaces.ARRAY {
		//se extrae la lista
		arr = p.Exp.EjecutarValor(env).Valor.(*arrayList.List)

		//fmt.Println("arr: ", arr)
		//se recorre
		for _, s := range arr.ToArray() {
			//crendo entorno
			var loopEnv environment.Environment
			loopEnv = environment.NewEnvironment("Forin", env.(environment.Environment))
			//agregando variable al entorno
			////fmt.Println("s: ", s)

			loopEnv.SaveVariable(p.Id, s.(interfaces.Symbol), interfaces.ARRAY, true, p.Line, p.Column, env.(environment.Environment).Nombre, nil, 0)

			//instrucciones
			for _, b := range p.Inst.ToArray() {
				rest := b.(interfaces.Instruction).Ejecutar(loopEnv)
				if rest != nil {
					if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
						if rest.(interfaces.Symbol).Tipo == interfaces.BREAK {
							Isbreak = true
							break
						}
						if rest.(interfaces.Symbol).Tipo == interfaces.CONTINUE {
							break
						}
						if rest.(interfaces.Symbol).Tipo == interfaces.RETURN {
							return result
						}
					}
				}
			}
			if Isbreak == true {
				break
			}
		}
	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.ARRAY), interfaces.GetType(p.Exp.EjecutarValor(env).Tipo))
		err.NewError("No es arreglo "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	return nil

}
