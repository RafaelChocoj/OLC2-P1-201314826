package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type IfExpre struct {
	Condicion    interfaces.Expresion
	LB_Principal *arrayList.List
	LB_IfElse    *arrayList.List
	LB_Else      *arrayList.List
	Line         int
	Column       int

	IsExpre   bool
	B_PrinExp interfaces.Expresion
	B_ElseExp interfaces.Expresion
}

func NewIfExpre(condicion interfaces.Expresion, lb_Principal *arrayList.List, lb_IfElse *arrayList.List, lb_Else *arrayList.List, line int, column int,
	isExpre bool, b_PrinExp interfaces.Expresion, b_ElseExp interfaces.Expresion) IfExpre {

	return IfExpre{
		Condicion:    condicion,
		LB_Principal: lb_Principal,
		LB_IfElse:    lb_IfElse,
		LB_Else:      lb_Else,
		Line:         line,
		Column:       column,

		IsExpre:   isExpre,
		B_PrinExp: b_PrinExp,
		B_ElseExp: b_ElseExp,
	}
}

func (i IfExpre) Ejecutar(env interface{}) interfaces.Symbol {

	var resultado interface{}

	var result interfaces.Symbol
	result = i.Condicion.Ejecutar(env)
	//fmt.Println("----result.Valor: ", result.Valor)
	//fmt.Println("----result.Tipo: ", result.Tipo)

	fmt.Println("----------i.IsExpre: ", i.IsExpre)

	if result.Tipo != interfaces.BOOLEAN {

		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(result.Tipo))
		err.NewError("Condición invalida "+desc, env.(environment.Environment).Nombre, i.Line, i.Column)
		//return nil
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
	}

	if result.Valor == true {

		if i.IsExpre == false { //// si es if normal
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment("if", env.(environment.Environment))

			for _, s := range i.LB_Principal.ToArray() {
				s.(interfaces.Instruction).Ejecutar(tmpEnv)
			}

		} else if i.IsExpre == true { //// si es if como expresion

			var res_exp interfaces.Symbol
			res_exp = i.B_PrinExp.Ejecutar(env)
			fmt.Println("0000000 res_exp.Valor: ", res_exp.Valor)
			fmt.Println("0000000 res_exp.Tipo: ", res_exp.Tipo)
			return interfaces.Symbol{Id: "", Tipo: res_exp.Tipo, Valor: res_exp.Valor}

		}

	} else {
		////////ELSE IF
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
					//return nil
					return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
				}

				if elseif.Valor == true {

					var tmpEnv_elseif environment.Environment
					tmpEnv_elseif = environment.NewEnvironment("else if", env.(environment.Environment))

					for _, sif := range s.(If).LB_Principal.ToArray() {
						sif.(interfaces.Instruction).Ejecutar(tmpEnv_elseif)
					}

					//return nil
					return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}

				}

			}

		}
		//////ELSE

		if i.IsExpre == false { //// si es if normal

			if i.LB_Else != nil {
				var tmpEnv environment.Environment
				tmpEnv = environment.NewEnvironment("else", env.(environment.Environment))

				for _, s := range i.LB_Else.ToArray() {
					s.(interfaces.Instruction).Ejecutar(tmpEnv)
				}
			}

		} else if i.IsExpre == true { //// si es if como expresion

			var res_exp interfaces.Symbol
			res_exp = i.B_ElseExp.Ejecutar(env)
			fmt.Println("1111111 res_exp.Valor: ", res_exp.Valor)
			fmt.Println("1111111 res_exp.Tipo: ", res_exp.Tipo)
			return interfaces.Symbol{Id: "", Tipo: res_exp.Tipo, Valor: res_exp.Valor}

		}
	}

	//return nil
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
}
