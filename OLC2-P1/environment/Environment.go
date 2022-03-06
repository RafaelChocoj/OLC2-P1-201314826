package environment

import (
	//err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type Environment struct {
	Nombre string
	father interface{}
	Tabla  map[string]interfaces.Symbol
	//TablaFunciones map[string]interface{}
}

func NewEnvironment(nombre string, father interface{}) Environment {
	//Tabla := make(map[string]interface{})
	Tabla := make(map[string]interfaces.Symbol)
	env := Environment{nombre, father, Tabla}
	return env
}

func (env Environment) SaveVariable(id string, value interfaces.Symbol, tipo interfaces.TipoExpresion) {
	if variable, ok := env.Tabla[id]; ok {
		fmt.Println("La variable " + variable.Id + " ya existe")
		return
	}
	env.Tabla[id] = interfaces.Symbol{Id: id, Tipo: tipo, Valor: value}
}

func (env Environment) GetVariable(id string, Line int, Column int, nameentorno string) interfaces.Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			return variable
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}

	//fmt.Println("La variable no existe")
	NewError("La variable no existe en entorno "+nameentorno, nameentorno, Line, Column)

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}}
}

func (env Environment) AlterVariable(id string, value interfaces.Symbol) interfaces.Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			tmpEnv.Tabla[id] = interfaces.Symbol{Id: id, Tipo: variable.Tipo, Valor: value}
			return variable
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}

	fmt.Println("La variable no existe")
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: 0}}
}
