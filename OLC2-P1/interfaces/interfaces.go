package interfaces

type Symbol struct {
	Id    string
	Tipo  TipoExpresion
	Valor interface{}
}

type Expresion interface {
	//Ejecutar(env interface{}) Symbol
	Ejecutar() Symbol
}

type Instruction interface {
	//Ejecutar(env interface{}) interface{}
	Ejecutar() interface{}
}
