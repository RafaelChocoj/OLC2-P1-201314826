package environment

import (
	//err "OLC2/environment"
	"OLC2/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Environment struct {
	Nombre         string
	father         interface{}
	Tabla          map[string]interfaces.Symbol
	TablaFunciones map[string]interface{}
	TablaStructs   map[string]interfaces.Symbol
	//TablaFunciones map[string]interface{}
}

func (env Environment) GetFather() interface{} {
	return env.father
}
func NewEnvironment(nombre string, father interface{}) Environment {
	//Tabla := make(map[string]interface{})
	Tabla := make(map[string]interfaces.Symbol)
	TablaFunciones := make(map[string]interface{})
	TablaStructs := make(map[string]interfaces.Symbol)
	env := Environment{nombre, father, Tabla, TablaFunciones, TablaStructs}
	return env
}

func (env Environment) SaveVariable(id string, value interfaces.Symbol, tipo interfaces.TipoExpresion, isMut bool, Line int, Column int, nameentorno string, tipos *arrayList.List) {
	if variable, ok := env.Tabla[id]; ok {
		//fmt.Println("La variable " + variable.Id + " ya existe")
		NewError("La variable "+variable.Id+" ya declarada en entorno "+nameentorno, nameentorno, Line, Column)
		return
	}
	env.Tabla[id] = interfaces.Symbol{Id: id, Tipo: tipo, Valor: value, IsMut: isMut, Line: Line, Column: Column, TiposArr: tipos}
}

///save struct
func (env Environment) SaveStruct(id string, value *arrayList.List, isMut bool) {
	if structs, ok := env.TablaStructs[id]; ok {
		//fmt.Println("La variable " + variable.Id + " ya existe")
		NewError("El struct"+structs.Id+" ya declarada en entorno "+env.Nombre, env.Nombre, 0, 0)
		return
	}
	env.TablaStructs[id] = interfaces.Symbol{Id: id, Tipo: interfaces.STRUCT, Valor: value, IsMut: isMut, Line: 0, Column: 0}
}

func (env Environment) GetVariable(id string, Line int, Column int, nameentorno string) interfaces.Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			//fmt.Println("variable.Id ", variable.Id, "entorno: ", nameentorno)
			return variable
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}

	//fmt.Println("La variable no existe")
	NewError("La variable "+id+" no existe en entorno "+nameentorno, nameentorno, Line, Column)

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}}
}

func (env Environment) GetVariableMut(id string) interfaces.Symbol {

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

	//NewError("La variable no existe en entorno "+nameentorno, nameentorno, Line, Column)
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}}
}

/////get struck
func (env Environment) GetStruct(id string, Line int, Column int) interfaces.Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if structv, ok := tmpEnv.TablaStructs[id]; ok {
			//fmt.Println("structv.Id ", structv.Id, "entorno: ", nameentorno)
			return structv
		}
		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}

	//fmt.Println("La struct no existe")
	NewError("El struct '"+id+"' no existe en entorno "+env.Nombre, env.Nombre, Line, Column)
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}}
}

func (env Environment) AlterVariable(id string, value interfaces.Symbol) interfaces.Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			tmpEnv.Tabla[id] = interfaces.Symbol{Id: id, Tipo: variable.Tipo, Valor: value, IsMut: variable.IsMut, TiposArr: variable.TiposArr}
			//fmt.Println("variable.IsMutvariable.IsMutvariable.IsMutvariable.IsMut: ", variable.IsMut)
			//fmt.Println("00variable.Id: ", variable.Id)
			return variable
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}

	fmt.Println("La variable no existe")
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}}
}

/********gunciones*************/
//func (env Environment) SaveFuncion(id string, value interfaces.Symbol, tipo interfaces.TipoExpresion, isMut bool, Line int, Column int, nameentorno string, tipos *arrayList.List) {
func (env Environment) SaveFuncion(id string, symb interface{}, Line int, Column int /*, tipo interfaces.TipoExpresion, isMut bool, nameentorno string, tipos *arrayList.List*/) {
	if _, ok := env.TablaFunciones[id]; ok {
		//fmt.Println("La variable " + variable.Id + " ya existe")
		//NewError("La función "+id+" ya declarada en entorno "+nameentorno, nameentorno, Line, Column)
		NewError("La función '"+id+"' ya declarada en entorno "+env.Nombre, env.Nombre, Line, Column)
		return
	}
	env.TablaFunciones[id] = symb
	//env.TablaFunciones[id] = interfaces.Symbol{Id: id, Tipo: tipo, Valor: value, IsMut: isMut, Line: Line, Column: Column, TiposArr: tipos}
}

func (env Environment) ExistFunction(id string) bool {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if _, ok := tmpEnv.TablaFunciones[id]; ok {
			return true
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}
	return false
}

func (env Environment) GetFunction(id string) interface{} {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.TablaFunciones[id]; ok {
			return variable
		}
		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}

	//NewError("La variable no existe en entorno "+nameentorno, nameentorno, Line, Column)
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: nil}}
}
