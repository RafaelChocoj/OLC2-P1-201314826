package environment

import "fmt"

type Error struct {
	descripcion string
	entorno     string
	line        int
	column      int
}

func NewError(descripcion string, entorno string, line int, column int) {
	err := Error{
		descripcion: descripcion, entorno: entorno,
		line: line, column: column,
	}

	ErrorList = append(ErrorList, err)

	printcon := fmt.Sprintf("ERROR: %s en (%d, %d)", err.descripcion, err.line, err.column) + "\n"
	Console += printcon
}

var ErrorList []Error
