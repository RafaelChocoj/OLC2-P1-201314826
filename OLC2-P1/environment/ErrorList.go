package environment

import (
	"fmt"
	"time"
)

type Error struct {
	Descripcion string
	Entorno     string
	Line        int
	Column      int
	Fecha       string
}

func NewError(descripcion string, entorno string, line int, column int) {
	ahora := time.Now()
	//fechastr := fmt.Sprintf("%v", ahora.Day()) + "/" + fmt.Sprintf("%v", ahora.Month()) + "/" + fmt.Sprintf("%v", ahora.Year())
	fechastr := ahora.Format("02/01/2006 15:04:05")
	err := Error{
		Descripcion: descripcion, Entorno: entorno,
		Line: line, Column: column, Fecha: fechastr,
	}

	ErrorList = append(ErrorList, err)
	//ErrorList.Add(err)

	printcon := fmt.Sprintf("ERROR: %s en (%d, %d)", err.Descripcion, err.Line, err.Column) + "\n"
	Console += printcon
}

var ErrorList []Error
var SymbolList []Symbol
var Main_Env Environment

type Symbol struct {
	Id       string
	TipoSym  string
	TipoDato string
	Entorno  string
	Line     int
	Column   int
}

func NewSymbol(Id string, TipoSym string, TipoDato string, entorno string, line int, column int) {
	sym := Symbol{
		Id, TipoSym, TipoDato, entorno,
		line, column,
	}

	SymbolList = append(SymbolList, sym)
}
