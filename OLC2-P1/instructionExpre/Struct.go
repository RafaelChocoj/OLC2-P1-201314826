package instructionExpre

import (
	"OLC2/environment"

	arrayList "github.com/colegno/arraylist"
)

type Struct struct {
	Id       string
	List_Atr *arrayList.List

	Line   int
	Column int
}

func NewStruct(id string, list *arrayList.List, line int, column int) Struct {
	instr := Struct{id, list, line, column}
	return instr
}

func (p Struct) Ejecutar(env interface{}) interface{} /*interfaces.Symbol*/ {

	env.(environment.Environment).SaveStruct(p.Id, p.List_Atr, true)
	return nil
	//return interfaces.Symbol{Id: "", Tipo: interfaces.STRUCT, Valor: p.List_Atr, IsMut: true, Line: p.Line, Column: p.Column}
}
