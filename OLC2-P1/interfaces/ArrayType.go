package interfaces

type ArrayType struct {
	Tipo TipoExpresion
	SizeA Expresion
	Line   int
	Column int
}

func NewArrayType(tipo TipoExpresion, size Expresion, line int, column int) ArrayType {
	exp := ArrayType{tipo, size, line, column}
	return exp
}
