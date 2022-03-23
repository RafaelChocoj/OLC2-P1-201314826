package instructionExpre

import (
	"OLC2/environment"
	err "OLC2/environment"
	"OLC2/expresion"
	"OLC2/interfaces"
	"fmt"
	"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Match struct {
	Expre       interfaces.Expresion
	List_Brazos *arrayList.List

	DefLB_Instrucciones *arrayList.List
	DefInstruc          interfaces.Instruction

	Line   int
	Column int

	DefExpre interfaces.Expresion
	IsExpre  bool
}

func NewMatch(expre interfaces.Expresion, list_Brazos *arrayList.List, defLB_Instrucciones *arrayList.List, defInstruc interfaces.Instruction, line int, column int,
	defExpre interfaces.Expresion, isExpre bool) Match {

	return Match{
		Expre:       expre,
		List_Brazos: list_Brazos,

		DefLB_Instrucciones: defLB_Instrucciones,
		DefInstruc:          defInstruc,

		Line:     line,
		Column:   column,
		DefExpre: defExpre,
		IsExpre:  isExpre,
	}
}

func (m Match) Ejecutar(env interface{}) interface{} {

	res := m.EjecutarValor(env)

	//fmt.Println("antes de retorno")
	return res
}

func (m Match) EjecutarValor(env interface{}) interfaces.Symbol {

	//var resultado interface{}
	var result_exp interfaces.Symbol
	//fmt.Println("----entra en match: ", m.IsExpre)

	var result interfaces.Symbol
	result = m.Expre.EjecutarValor(env)
	//fmt.Println("----result.Valor: ", result.Valor)
	//fmt.Println("----result.Tipo: ", result.Tipo)

	var istrue = false
	var isfalse = false

	/*verificando el mismo tipo*/
	var valtypes = false
	for _, bz := range m.List_Brazos.ToArray() {
		list_cons := bz.(BrazoMatch).Concidencias
		//fmt.Println("----bz.(BrazoMatch).Concidencias: ", list_cons)
		//bz.(interfaces.Instruction).Ejecutar(tmpEnv_brazo)

		for _, lcon := range list_cons.ToArray() {
			//var res interfaces.Symbol

			//fmt.Println("------reflect.TypeOf(lcon): ", reflect.TypeOf(lcon))
			//fmt.Println("------reflect.TypeOf(expresion.Primitivo): ", reflect.TypeOf(expresion.Primitivo{}))

			if reflect.TypeOf(lcon) == reflect.TypeOf(expresion.Primitivo{}) {
				expre := lcon.(expresion.Primitivo)
				//fmt.Println("------lcon.(expresion.Primitivo): ", expre.Valor)
				//fmt.Println("------------lcon.(expresion.Primitivo): ", expre.Tipo)

				if result.Tipo != expre.Tipo {
					desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(result.Tipo), interfaces.GetType(expre.Tipo))
					err.NewError("Expresion no coinciden, "+desc, env.(environment.Environment).Nombre, expre.Line, expre.Column)
					//return nil
					valtypes = true
					//return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
				}

				//if expre.Valor == result.Valor {
				if result.Tipo == interfaces.BOOLEAN {
					if expre.Valor == true {
						istrue = true
					}
					if expre.Valor == false {
						isfalse = true
					}
				}
				//}

			} else {
				//desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(result.Tipo))
				err.NewError("Las coincidencias deben de ser primitivas " /*+desc*/, env.(environment.Environment).Nombre, bz.(BrazoMatch).Line, bz.(BrazoMatch).Column)
				valtypes = true
				//return nil
			}

		}
	}

	if (istrue == true && isfalse == true) && result.Tipo == interfaces.BOOLEAN {

		if m.DefLB_Instrucciones != nil || m.DefInstruc != nil {
			err.NewError("Brazos cubiertos en booleano, sin necesidad de '_' ", env.(environment.Environment).Nombre, m.Line, m.Column)
			valtypes = true
		}
	}

	if (result.Tipo == interfaces.BOOLEAN) && m.DefLB_Instrucciones == nil && m.DefInstruc == nil {
		if (istrue == false && isfalse == true) || (istrue == true && isfalse == false) {
			err.NewError("Brazo booleano no cubierto ", env.(environment.Environment).Nombre, m.Line, m.Column)
			valtypes = true
		}

	}

	if valtypes == true {
		//return nil
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	}

	/***************************/

	encontrado := false
	for _, bz := range m.List_Brazos.ToArray() {
		list_cons := bz.(BrazoMatch).Concidencias
		//fmt.Println("----bz.(BrazoMatch).Concidencias: ", list_cons)
		//bz.(interfaces.Instruction).Ejecutar(tmpEnv_brazo)

		/////execute
		for _, lcon := range list_cons.ToArray() {
			expre := lcon.(expresion.Primitivo)

			if expre.Valor == result.Valor {
				//fmt.Println("*************esIGUAL: ", result.Valor)
				encontrado = true

				var tmpEnv environment.Environment
				tmpEnv = environment.NewEnvironment("Match brazo", env.(environment.Environment))
				if m.IsExpre == false {

					/*es lista de instrucciones*/
					if bz.(BrazoMatch).LB_Instrucciones != nil {

						for _, s := range bz.(BrazoMatch).LB_Instrucciones.ToArray() {
							rest := s.(interfaces.Instruction).Ejecutar(tmpEnv)
							if rest != nil {
								if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
									//fmt.Println("rest.(interfaces.Symbol).Tipo: ", interfaces.GetType(rest.(interfaces.Symbol).Tipo))
									if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
										return rest.(interfaces.Symbol)
									}
								}
							}

						}
					}
					/*si es solo una instruccion*/
					if bz.(BrazoMatch).Instruc != nil {
						rest := bz.(BrazoMatch).Instruc.Ejecutar(tmpEnv)
						if rest != nil {
							if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
								//fmt.Println("rest.(interfaces.Symbol).Tipo: ", interfaces.GetType(rest.(interfaces.Symbol).Tipo))
								if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
									return rest.(interfaces.Symbol)
								}
							}
						}
					}
				} else if m.IsExpre == true {

					/*si es una expresion*/
					if bz.(BrazoMatch).B_Exp != nil {
						result_exp = bz.(BrazoMatch).B_Exp.EjecutarValor(tmpEnv)
					}

				}
				break
			}
		}

	}

	if encontrado == false {
		//sfmt.Println("////////////////// no tiene coincidencias")
		var tmpEnv environment.Environment
		tmpEnv = environment.NewEnvironment("Match brazo", env.(environment.Environment))

		if m.IsExpre == false {
			/*es lista de instrucciones*/
			if m.DefLB_Instrucciones != nil {

				for _, sdef := range m.DefLB_Instrucciones.ToArray() {
					rest := sdef.(interfaces.Instruction).Ejecutar(tmpEnv)

					if rest != nil {
						if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
							//fmt.Println("rest.(interfaces.Symbol).Tipo: ", interfaces.GetType(rest.(interfaces.Symbol).Tipo))
							if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
								return rest.(interfaces.Symbol)
							}
						}
					}
				}
			}

			/*si es solo una instruccion*/
			if m.DefInstruc != nil {
				rest := m.DefInstruc.Ejecutar(tmpEnv)
				if rest != nil {
					if reflect.TypeOf(rest) == reflect.TypeOf(interfaces.Symbol{}) {
						//fmt.Println("rest.(interfaces.Symbol).Tipo: ", interfaces.GetType(rest.(interfaces.Symbol).Tipo))
						if rest.(interfaces.Symbol).TipoRet == interfaces.BREAK || rest.(interfaces.Symbol).TipoRet == interfaces.CONTINUE || rest.(interfaces.Symbol).TipoRet == interfaces.RETURN {
							return rest.(interfaces.Symbol)
						}
					}
				}
			}

		} else if m.IsExpre == true {

			if m.DefExpre != nil {
				result_exp = m.DefExpre.EjecutarValor(tmpEnv)
			}

		}

	}
	/***********************/

	return result_exp
	//return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}
	//return nil

}
