package interfaces

type Symbol struct {
	Id    string
	Tipo  TipoExpresion
	Valor interface{}
	IsMut bool
	
	Line   int
	Column int
}

type Expresion interface {
	Ejecutar(env interface{}) Symbol
}

type Instruction interface {
	Ejecutar(env interface{}) interface{}
}

////
type InstructionExpresion interface {

	Ejecutar(env interface{}) 
}
