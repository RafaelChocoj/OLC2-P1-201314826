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
}

func NewMatch(expre interfaces.Expresion, list_Brazos *arrayList.List, defLB_Instrucciones *arrayList.List, defInstruc interfaces.Instruction, line int, column int) Match {

	return Match{
		Expre:       expre,
		List_Brazos: list_Brazos,

		DefLB_Instrucciones: defLB_Instrucciones,
		DefInstruc:          defInstruc,

		Line:   line,
		Column: column,
	}
}

func (m Match) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol
	result = m.Expre.Ejecutar(env)
	fmt.Println("----result.Valor: ", result.Valor)
	//fmt.Println("----result.Tipo: ", result.Tipo)

	/*lista de brazos*/
	/*for _, s := range m.List_Brazos.ToArray() {

	}*/

	//var tmpEnv_brazo environment.Environment
	//tmpEnv_brazo = environment.NewEnvironment("match brazo", env.(environment.Environment))

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

			} else {
				//desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(result.Tipo))
				err.NewError("Las coincidencias deben de ser primitivas " /*+desc*/, env.(environment.Environment).Nombre, bz.(BrazoMatch).Line, bz.(BrazoMatch).Column)
				valtypes = true
				//return nil
			}

		}
	}

	if valtypes == true {
		return nil
		//return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
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

				/*es lista de instrucciones*/
				if bz.(BrazoMatch).LB_Instrucciones != nil {

					for _, s := range bz.(BrazoMatch).LB_Instrucciones.ToArray() {
						s.(interfaces.Instruction).Ejecutar(tmpEnv)
					}
				}
				/*si es solo una instruccion*/
				if bz.(BrazoMatch).Instruc != nil {
					bz.(BrazoMatch).Instruc.Ejecutar(tmpEnv)
				}
				break
			}
		}

	}

	if encontrado == false {
		//fmt.Println("////////////////// no tiene coincidencias"
		var tmpEnv environment.Environment
		tmpEnv = environment.NewEnvironment("Match brazo", env.(environment.Environment))

		/*es lista de instrucciones*/
		if m.DefLB_Instrucciones != nil {

			for _, sdef := range m.DefLB_Instrucciones.ToArray() {
				sdef.(interfaces.Instruction).Ejecutar(tmpEnv)
			}
		}

		/*si es solo una instruccion*/
		if m.DefInstruc != nil {
			m.DefInstruc.Ejecutar(tmpEnv)
		}

	}
	/***********************/

	return nil

}
