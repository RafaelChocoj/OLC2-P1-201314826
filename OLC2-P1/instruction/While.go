package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"reflect"
	"strings"

	arrayList "github.com/colegno/arraylist"
)

type While struct {
	Condition interfaces.Expresion
	Bloque    *arrayList.List
	Line      int
	Column    int
}

func NewWhile(condition interfaces.Expresion, bloque *arrayList.List, line int, column int) While {
	whil := While{condition, bloque, line, column}
	return whil
}

func (p While) Ejecutar(env interface{}) interface{} {

	limCont := 0
	isBreak := false
	var result interfaces.Symbol

	for {
		limCont++
		result = p.Condition.EjecutarValor(env)

		if result.Valor == true {

			var whileEnv environment.Environment
			whileEnv = environment.NewEnvironment("While", env.(environment.Environment))

			for _, s := range p.Bloque.ToArray() {
				if strings.Contains(fmt.Sprintf("%T", s), "instruction") || strings.Contains(fmt.Sprintf("%T", s), "instructionExpre") {
					rest := s.(interfaces.Instruction).Ejecutar(whileEnv)

					if rest != nil {
						if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
							if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK {
								isBreak = true
								if rest.(interfaces.Symbol).Valor != nil {
									//fmt.Println("No se permite retornar valor mediante un Break en un While")
									err.NewError("No se permite retornar valor mediante un 'break' en un While", env.(environment.Environment).Nombre, p.Line, p.Column)
								}
								break
							}
							if rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE {
								break
							}
							if rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
								return rest
							}
						}
					}
					/*} else if strings.Contains(fmt.Sprintf("%T", s), "expressions") {
					result := s.(interfaces.Expresion).EjecutarValor(whileEnv)
					if result.Tipo == interfaces.BREAK { //BREAK
						isBreak = true
						if result.Valor != nil {
							fmt.Println("No se permite retornar valor mediante un Break en un While")
						}
						break
					}
					if result.Tipo == interfaces.CONTINUE {
						break
					}*/
				} else {
					//fmt.Println("error en bloque")
					err.NewError("Ocurrió error en instrucciones de while :"+fmt.Sprintf("%T", s), env.(environment.Environment).Nombre, p.Line, p.Column)
				}
			}
			if isBreak == true {
				break
			}
		} else {
			break
		}
		if limCont >= 2500 {
			//fmt.Println("StackOverflowError: se ha excedido el máximo de ciclos permitidos")
			err.NewError("se ha excedido el máximo de ciclos permitidos en 'While' ", env.(environment.Environment).Nombre, p.Line, p.Column)
			break
		}
	}

	return nil
	//return result
}
