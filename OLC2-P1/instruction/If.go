package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type If struct {
	Condicion    interfaces.Expresion
	LB_Principal *arrayList.List
	LB_IfElse    *arrayList.List
	LB_Else      *arrayList.List
	Line         int
	Column       int
}

func NewIf(condicion interfaces.Expresion, lb_Principal *arrayList.List, lb_IfElse *arrayList.List, lb_Else *arrayList.List, line int, column int) If {
	return If{
		Condicion:    condicion,
		LB_Principal: lb_Principal,
		LB_IfElse:    lb_IfElse,
		LB_Else:      lb_Else,
		Line:         line,
		Column:       column,
	}
}

func (i If) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol
	result = i.Condicion.Ejecutar(env)
	//fmt.Println("----result.Valor: ", result.Valor)
	//fmt.Println("----result.Tipo: ", result.Tipo)

	if result.Tipo != interfaces.BOOLEAN {

		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(result.Tipo))
		err.NewError("Condición invalida "+desc, env.(environment.Environment).Nombre, i.Line, i.Column)
		return nil
		//return result.Valor
	}

	if result.Valor == true {

		var tmpEnv environment.Environment
		tmpEnv = environment.NewEnvironment("if", env.(environment.Environment))

		for _, s := range i.LB_Principal.ToArray() {
			s.(interfaces.Instruction).Ejecutar(tmpEnv)
		}

	} else {
		/*ELSE IF*/
		if i.LB_IfElse != nil {

			for _, s := range i.LB_IfElse.ToArray() {

				var elseif interfaces.Symbol
				//elseif = i.Condicion.Ejecutar(env)
				elseif = s.(If).Condicion.Ejecutar(env)
				//fmt.Println("-22222222222222---elseif.Valor: ", elseif.Valor)
				//fmt.Println("-22222222222222---elseif.Tipo: ", elseif.Tipo)

				if elseif.Tipo != interfaces.BOOLEAN {
					/////////////////////////////////////aqui
					desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(elseif.Tipo))
					err.NewError("Condición invalida "+desc, env.(environment.Environment).Nombre, s.(If).Line, s.(If).Column)
					return nil
				}

				if elseif.Valor == true {

					var tmpEnv_elseif environment.Environment
					tmpEnv_elseif = environment.NewEnvironment("else if", env.(environment.Environment))

					for _, sif := range s.(If).LB_Principal.ToArray() {
						sif.(interfaces.Instruction).Ejecutar(tmpEnv_elseif)
					}

					return nil

				}

			}

		}
		/*ELSE*/
		if i.LB_Else != nil {
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment("else", env.(environment.Environment))

			for _, s := range i.LB_Else.ToArray() {
				s.(interfaces.Instruction).Ejecutar(tmpEnv)
			}
		}
	}

	return nil
	//return result.Valor
}
