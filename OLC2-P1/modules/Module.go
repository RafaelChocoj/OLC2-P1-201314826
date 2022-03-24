package modules

import (
	"OLC2/environment"
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Module struct {
	IdMod    string
	ListBody *arrayList.List
	Line     int
	Column   int
}

func NewModule(idmod string, listbody *arrayList.List, line int, column int) Module {
	inst := Module{idmod, listbody, line, column}
	return inst
}

func (p Module) Ejecutar(env interface{}) interface{} {

	result := interfaces.SymbolModule{IdMod: p.IdMod, Body: p.ListBody, Line: p.Line, Column: p.Column}
	env.(environment.Environment).SaveModule(p.IdMod, result)

	//fmt.Println("base de datos ", p.IdMod)
	return nil
}
