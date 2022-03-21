package instructionExpre

import (
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type BrazoMatch struct {
	Concidencias     *arrayList.List
	LB_Instrucciones *arrayList.List
	Instruc          interfaces.Instruction
	Line             int
	Column           int

	B_Exp interfaces.Expresion
}

func NewBrazoMatch(concidencias *arrayList.List, lb_Instrucciones *arrayList.List, instruc interfaces.Instruction, line int, column int, b_Exp interfaces.Expresion) BrazoMatch {

	return BrazoMatch{
		Concidencias:     concidencias,
		LB_Instrucciones: lb_Instrucciones,
		Instruc:          instruc,
		Line:             line,
		Column:           column,
		B_Exp:            b_Exp,
	}
}

/*func (i BrazoMatch) Ejecutar(env interface{}) interface{} {

	//fmt.Println("----i.Concidencias: ", i.Concidencias)
	//fmt.Println("----i.LB_Instrucciones: ", i.LB_Instrucciones)

	return nil
}*/
