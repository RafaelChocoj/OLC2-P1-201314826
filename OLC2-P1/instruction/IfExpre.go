package instruction

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type IfExpre struct {
	Condicion interfaces.Expresion

	LB_Principal *arrayList.List
	LB_IfElse    *arrayList.List
	LB_Else      *arrayList.List
	Line         int
	Column       int

	IsExpre     bool
	B_PrinExp   interfaces.Expresion
	B_IfElseExp *arrayList.List
	B_ElseExp   interfaces.Expresion
}

func NewIfExpre(condicion interfaces.Expresion, lb_Principal *arrayList.List, lb_IfElse *arrayList.List, lb_Else *arrayList.List, line int, column int,
	isExpre bool, b_PrinExp interfaces.Expresion, b_IfElseExp *arrayList.List, b_ElseExp interfaces.Expresion) IfExpre {

	return IfExpre{
		Condicion: condicion,

		LB_Principal: lb_Principal,
		LB_IfElse:    lb_IfElse,
		LB_Else:      lb_Else,
		Line:         line,
		Column:       column,

		IsExpre:     isExpre,
		B_PrinExp:   b_PrinExp,
		B_IfElseExp: b_IfElseExp,
		B_ElseExp:   b_ElseExp,
	}
}

func (i IfExpre) EjecutarValor(env interface{}) interfaces.Symbol {

	var resultado interface{}

	var result interfaces.Symbol
	result = i.Condicion.EjecutarValor(env)
	//fmt.Println("----result.Valor: ", result.Valor)
	//fmt.Println("----result.Tipo: ", result.Tipo)

	////fmt.Println("----------i.IsExpre: ", i.IsExpre)

	/***************ini validando tipos**********************/
	var valtypes = false
	var exp_dom interfaces.Symbol
	exp_dom = i.B_PrinExp.EjecutarValor(env)
	//fmt.Println("							 exp_dom.Valor: ", exp_dom.Valor)
	//fmt.Println("							 exp_dom.Tipo: ", exp_dom.Tipo)

	//ELSE IF
	if i.B_IfElseExp != nil {

		for _, s := range i.B_IfElseExp.ToArray() {

			var exp_elif interfaces.Symbol
			exp_elif = s.(IfExpre).B_PrinExp.EjecutarValor(env)
			//fmt.Println("							 		exp_elif.Valor: ", exp_elif.Valor)
			//fmt.Println("							 		exp_elif.Tipo: ", exp_elif.Tipo)

			if exp_dom.Tipo != exp_elif.Tipo {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(exp_dom.Tipo), interfaces.GetType(exp_elif.Tipo))
				err.NewError("Expresion no coinciden, "+desc, env.(environment.Environment).Nombre, s.(IfExpre).Line, s.(IfExpre).Column)
				valtypes = true
				//return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
			}

		}
	}
	var exp_else interfaces.Symbol
	exp_else = i.B_ElseExp.EjecutarValor(env)
	//fmt.Println("							 exp_else.Valor: ", exp_else.Valor)
	//fmt.Println("							 exp_else.Tipo: ", exp_else.Tipo)

	if exp_dom.Tipo != exp_else.Tipo {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(exp_dom.Tipo), interfaces.GetType(exp_else.Tipo))
		err.NewError("Expresion no coinciden, (else) "+desc, env.(environment.Environment).Nombre, i.Line, i.Column)
		valtypes = true
		//return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
	}

	if valtypes == true {
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
	}
	/***************fin validando tipos**********************/

	if result.Tipo != interfaces.BOOLEAN {

		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(result.Tipo))
		err.NewError("Condición invalida "+desc, env.(environment.Environment).Nombre, i.Line, i.Column)
		//return nil
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
	}

	if result.Valor == true {

		/*if i.IsExpre == false { //// si es if normal
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment("if", env.(environment.Environment))

			for _, s := range i.LB_Principal.ToArray() {
				s.(interfaces.Instruction).Ejecutar(tmpEnv)
			}

		} else if i.IsExpre == true {*/ //// si es if como expresion

		var res_exp interfaces.Symbol
		res_exp = i.B_PrinExp.EjecutarValor(env)
		fmt.Println("0000000 res_exp.Valor: ", res_exp.Valor)
		fmt.Println("0000000 res_exp.Tipo: ", res_exp.Tipo)
		return interfaces.Symbol{Id: "", Tipo: res_exp.Tipo, Valor: res_exp.Valor}

		/*}*/

	} else {
		////////ELSE IF
		if i.B_IfElseExp != nil {

			for _, s := range i.B_IfElseExp.ToArray() {

				var elseif interfaces.Symbol
				//elseif = i.Condicion.Ejecutar(env)
				elseif = s.(IfExpre).Condicion.EjecutarValor(env)
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

					/*var tmpEnv_elseif environment.Environment
					tmpEnv_elseif = environment.NewEnvironment("else if", env.(environment.Environment))

					for _, sif := range s.(IfExpre).LB_Principal.ToArray() {
						sif.(interfaces.Instruction).Ejecutar(tmpEnv_elseif)
					}

					//return nil
					return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}*/

					var res_ifelexp interfaces.Symbol
					res_ifelexp = s.(IfExpre).B_PrinExp.EjecutarValor(env)
					fmt.Println("0000000 res_exp.Valor: ", res_ifelexp.Valor)
					fmt.Println("0000000 res_exp.Tipo: ", res_ifelexp.Tipo)
					return interfaces.Symbol{Id: "", Tipo: res_ifelexp.Tipo, Valor: res_ifelexp.Valor}

				}

			}

		}

		//////ELSE

		/*if i.IsExpre == false { //// si es if normal

			if i.LB_Else != nil {
				var tmpEnv environment.Environment
				tmpEnv = environment.NewEnvironment("else", env.(environment.Environment))

				for _, s := range i.LB_Else.ToArray() {
					s.(interfaces.Instruction).Ejecutar(tmpEnv)
				}
			}

		} else if i.IsExpre == true {*/ //// si es if como expresion

		var res_exp interfaces.Symbol
		res_exp = i.B_ElseExp.EjecutarValor(env)
		fmt.Println("1111111 res_exp.Valor: ", res_exp.Valor)
		fmt.Println("1111111 res_exp.Tipo: ", res_exp.Tipo)
		return interfaces.Symbol{Id: "", Tipo: res_exp.Tipo, Valor: res_exp.Valor}

		/*}*/
	}

	//return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
}
