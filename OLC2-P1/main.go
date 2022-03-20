package main

import (
	//"OLC2/environment"

	"OLC2/environment"
	console "OLC2/environment"
	"OLC2/instructionExpre"
	"OLC2/interfaces"
	"OLC2/parser"
	"fmt"
	"reflect"

	"github.com/antlr/antlr4/runtime/Go/antlr"
	arrayList "github.com/colegno/arraylist"
)

type TreeShapeListener struct {
	*parser.BaseRustParListener
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitStart(ctx *parser.StartContext) {
	result := ctx.GetLista()

	/*original ini*/
	/*var globalEnv environment.Environment
	globalEnv = environment.NewEnvironment("GLOBAL", nil)

	for _, s := range result.ToArray() {
		s.(interfaces.Instruction).Ejecutar(globalEnv)
	}*/
	/*original fin*/

	/*************************/
	var globalEnv environment.Environment
	globalEnv = environment.NewEnvironment("GLOBAL", nil)

	List_Funcs := arrayList.New()
	for _, s := range result.ToArray() {
		//fmt.Println("******reflect.TypeOf(s)", reflect.TypeOf(s))

		if reflect.TypeOf(s) == reflect.TypeOf(instructionExpre.Function{}) {

			//fmt.Println("**	globalEnv- ", globalEnv)
			//var funEnv environment.Environment
			//funEnv = environment.NewEnvironment("function", globalEnv)
			//fmt.Println("**				funEnv- ", funEnv)

			//s.(instructionExpre.Function).SaveEntorno(funEnv)
			//fmt.Println("**	s.(instructionExpre.Function).EntornoFun- ", s.(instructionExpre.Function).EntornoFun)

			List_Funcs.Add(s.(instructionExpre.Function))
			//s.(interfaces.Instruction).Ejecutar(globalEnv)
			//globalEnv.SaveFuncion(s.(instructionExpre.Function).Id, "s", 1, 2)
			globalEnv.SaveFuncion(s.(instructionExpre.Function).Id, s, s.(instructionExpre.Function).Line, s.(instructionExpre.Function).Column)

		}
	}

	/*corriendo main*/
	var mainEnv environment.Environment
	mainEnv = environment.NewEnvironment("main", globalEnv)
	for _, s := range List_Funcs.ToArray() {

		if s.(instructionExpre.Function).Id == "main" {
			s.(interfaces.Instruction).Ejecutar(mainEnv)
		}
	}

	fmt.Println("******")
	fmt.Println(console.Console)

}

func main() {

	// Setup the input
	//is := antlr.NewInputStream("\"El resultado es: \" + (10+5+5+5+5+5)")

	//is, _ := antlr.NewFileStream("entrada.txt")
	is, _ := antlr.NewFileStream("entrada_fun.txt")

	// Create the Lexer
	lexer := parser.NewRustLex(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	// Create the Parser
	p := parser.NewRustPar(stream)

	p.BuildParseTrees = true
	tree := p.Start()

	antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)

}
