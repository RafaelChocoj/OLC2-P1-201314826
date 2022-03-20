package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
	"reflect"
	"strings"

	arrayList "github.com/colegno/arraylist"
)

type Loop struct {
	L_Instructions *arrayList.List

	Line   int
	Column int
}

func NewLoop(l_instructions *arrayList.List, line int, column int) Loop {
	loopInstr := Loop{l_instructions, line, column}
	return loopInstr
}

func (p Loop) EjecutarValor(env interface{}) interfaces.Symbol {

	limCont := 0
	isBreak := false
	var result interfaces.Symbol

	fmt.Println("entra aqui")

	for {
		limCont++
		var loopEnv environment.Environment
		loopEnv = environment.NewEnvironment("Loop", env.(environment.Environment))

		for _, s := range p.L_Instructions.ToArray() {

			//fmt.Println("fmt.Sprintf(, s)", fmt.Sprintf("%T", s))
			//return nil

			if strings.Contains(fmt.Sprintf("%T", s), "instruction") || strings.Contains(fmt.Sprintf("%T", s), "instructionExpre") {
				//result =
				rest := s.(interfaces.Instruction).Ejecutar(loopEnv)
				//fmt.Println("reflect.TypeOf.rest: ", reflect.TypeOf(rest))
				//fmt.Println("reflect.TypeOf.rest: ", rest.(interfaces.Symbol))

				if rest != nil {

					if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
						result = rest.(interfaces.Symbol)

						//fmt.Println("rest.(interfaces.Symbol).Tipo: ", rest.(interfaces.Symbol).Tipo)
						if rest.(interfaces.Symbol).Tipo == interfaces.BREAK {
							isBreak = true
							break
						}
						if rest.(interfaces.Symbol).Tipo == interfaces.CONTINUE {
							break
						}

					} else {
						fmt.Println("else reflect.TypeOf)rest): ", reflect.TypeOf(rest))
					}
				}
				/*} else if strings.Contains(fmt.Sprintf("%T", s), "expresion") {
				result = s.(interfaces.Expresion).EjecutarValor(loopEnv)
				if result.Tipo == interfaces.BREAK {
					isBreak = true
					break
				}
				if result.Tipo == interfaces.CONTINUE {
					break
				}*/
			} else {
				err.NewError("Error en instruccion o bloque ", env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}
		if isBreak == true {
			break
		}
		if limCont > 600 {
			err.NewError("se ha excedido el máximo de ciclos permitidos en 'Loop' ", env.(environment.Environment).Nombre, p.Line, p.Column)
			break
		}
	}
	//fmt.Println("result: ", result)
	return result

	//return nil
}

func (p Loop) Ejecutar(env interface{}) interface{} {
	p.EjecutarValor(env)
	return nil
}
