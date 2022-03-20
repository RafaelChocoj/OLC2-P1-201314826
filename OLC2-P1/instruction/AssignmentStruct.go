package instruction

import (
	"OLC2/environment"
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type AssignmentStruct struct {
	ListAccesStruct *arrayList.List
	Exp             interfaces.Expresion
	Line            int
	Column          int
}

func NewAssignmentStruct(listAccesStruct *arrayList.List, expr interfaces.Expresion, line int, column int) AssignmentStruct {
	instr := AssignmentStruct{listAccesStruct, expr, line, column}
	return instr
}

func (p AssignmentStruct) Ejecutar(env interface{}) interface{} {
	varres := p.Exp.EjecutarValor(env)

	env.(environment.Environment).UpdateStruct(p.ListAccesStruct, varres, p.Line, p.Column)
	return nil
}
