package instructionExpre

import "OLC2/interfaces"

type StructContenido struct {
	Id  string
	Exp interfaces.Expresion
}

func NewStructContenido(id string, exp interfaces.Expresion) StructContenido {
	exp_str := StructContenido{Id: id, Exp: exp}
	return exp_str
}
