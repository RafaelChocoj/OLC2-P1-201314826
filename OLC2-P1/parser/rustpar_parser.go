// Code generated from RustPar.g4 by ANTLR 4.9.3. DO NOT EDIT.

package parser // RustPar

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

import "OLC2/interfaces"
import "OLC2/expresion"
import "OLC2/instruction"
import "OLC2/instructionExpre"
import arrayList "github.com/colegno/arraylist"

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 56, 474,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4,
	29, 9, 29, 4, 30, 9, 30, 3, 2, 3, 2, 3, 2, 3, 3, 7, 3, 65, 10, 3, 12, 3,
	14, 3, 68, 11, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 5, 4,
	90, 10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 5, 5, 107, 10, 5, 3, 6, 3, 6, 3, 6, 3, 6,
	3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 7, 7,
	124, 10, 7, 12, 7, 14, 7, 127, 11, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3,
	8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3,
	8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 5, 8, 154, 10, 8, 3, 9, 3,
	9, 3, 9, 5, 9, 159, 10, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3,
	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 175, 10, 10,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 202, 10, 12, 3, 13, 3, 13, 3, 13, 3,
	13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13,
	3, 13, 5, 13, 219, 10, 13, 3, 14, 6, 14, 222, 10, 14, 13, 14, 14, 14, 223,
	3, 14, 3, 14, 3, 15, 6, 15, 229, 10, 15, 13, 15, 14, 15, 230, 3, 15, 3,
	15, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 17, 3, 17,
	3, 17, 3, 17, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3,
	18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18,
	3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 5,
	18, 276, 10, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19,
	7, 19, 286, 10, 19, 12, 19, 14, 19, 289, 11, 19, 3, 20, 3, 20, 3, 20, 3,
	20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 5, 20, 303,
	10, 20, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21,
	7, 21, 314, 10, 21, 12, 21, 14, 21, 317, 11, 21, 3, 22, 3, 22, 3, 22, 3,
	22, 3, 22, 3, 22, 3, 22, 3, 22, 5, 22, 327, 10, 22, 3, 23, 3, 23, 3, 23,
	3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3,
	24, 3, 24, 5, 24, 344, 10, 24, 3, 25, 3, 25, 3, 25, 3, 26, 3, 26, 3, 26,
	3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3,
	26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26,
	3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3,
	26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26,
	3, 26, 3, 26, 3, 26, 5, 26, 397, 10, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3,
	26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26,
	3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 7,
	26, 424, 10, 26, 12, 26, 14, 26, 427, 11, 26, 3, 27, 3, 27, 3, 27, 3, 27,
	3, 27, 3, 27, 3, 27, 3, 28, 3, 28, 3, 28, 3, 28, 5, 28, 440, 10, 28, 3,
	29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29,
	3, 29, 3, 29, 5, 29, 455, 10, 29, 3, 30, 6, 30, 458, 10, 30, 13, 30, 14,
	30, 459, 3, 30, 3, 30, 5, 30, 464, 10, 30, 3, 30, 3, 30, 3, 30, 3, 30,
	3, 30, 3, 30, 5, 30, 472, 10, 30, 3, 30, 2, 6, 12, 36, 40, 50, 31, 2, 4,
	6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42,
	44, 46, 48, 50, 52, 54, 56, 58, 2, 6, 4, 2, 40, 41, 44, 44, 3, 2, 42, 43,
	3, 2, 34, 39, 3, 2, 20, 21, 2, 496, 2, 60, 3, 2, 2, 2, 4, 66, 3, 2, 2,
	2, 6, 89, 3, 2, 2, 2, 8, 106, 3, 2, 2, 2, 10, 108, 3, 2, 2, 2, 12, 114,
	3, 2, 2, 2, 14, 153, 3, 2, 2, 2, 16, 158, 3, 2, 2, 2, 18, 174, 3, 2, 2,
	2, 20, 176, 3, 2, 2, 2, 22, 201, 3, 2, 2, 2, 24, 218, 3, 2, 2, 2, 26, 221,
	3, 2, 2, 2, 28, 228, 3, 2, 2, 2, 30, 234, 3, 2, 2, 2, 32, 240, 3, 2, 2,
	2, 34, 275, 3, 2, 2, 2, 36, 277, 3, 2, 2, 2, 38, 302, 3, 2, 2, 2, 40, 304,
	3, 2, 2, 2, 42, 326, 3, 2, 2, 2, 44, 328, 3, 2, 2, 2, 46, 343, 3, 2, 2,
	2, 48, 345, 3, 2, 2, 2, 50, 396, 3, 2, 2, 2, 52, 428, 3, 2, 2, 2, 54, 439,
	3, 2, 2, 2, 56, 454, 3, 2, 2, 2, 58, 471, 3, 2, 2, 2, 60, 61, 5, 4, 3,
	2, 61, 62, 8, 2, 1, 2, 62, 3, 3, 2, 2, 2, 63, 65, 5, 6, 4, 2, 64, 63, 3,
	2, 2, 2, 65, 68, 3, 2, 2, 2, 66, 64, 3, 2, 2, 2, 66, 67, 3, 2, 2, 2, 67,
	69, 3, 2, 2, 2, 68, 66, 3, 2, 2, 2, 69, 70, 8, 3, 1, 2, 70, 5, 3, 2, 2,
	2, 71, 72, 5, 10, 6, 2, 72, 73, 7, 27, 2, 2, 73, 74, 8, 4, 1, 2, 74, 90,
	3, 2, 2, 2, 75, 76, 5, 14, 8, 2, 76, 77, 7, 27, 2, 2, 77, 78, 8, 4, 1,
	2, 78, 90, 3, 2, 2, 2, 79, 80, 5, 20, 11, 2, 80, 81, 7, 27, 2, 2, 81, 82,
	8, 4, 1, 2, 82, 90, 3, 2, 2, 2, 83, 84, 5, 22, 12, 2, 84, 85, 8, 4, 1,
	2, 85, 90, 3, 2, 2, 2, 86, 87, 5, 34, 18, 2, 87, 88, 8, 4, 1, 2, 88, 90,
	3, 2, 2, 2, 89, 71, 3, 2, 2, 2, 89, 75, 3, 2, 2, 2, 89, 79, 3, 2, 2, 2,
	89, 83, 3, 2, 2, 2, 89, 86, 3, 2, 2, 2, 90, 7, 3, 2, 2, 2, 91, 92, 5, 10,
	6, 2, 92, 93, 8, 5, 1, 2, 93, 107, 3, 2, 2, 2, 94, 95, 5, 14, 8, 2, 95,
	96, 8, 5, 1, 2, 96, 107, 3, 2, 2, 2, 97, 98, 5, 20, 11, 2, 98, 99, 8, 5,
	1, 2, 99, 107, 3, 2, 2, 2, 100, 101, 5, 22, 12, 2, 101, 102, 8, 5, 1, 2,
	102, 107, 3, 2, 2, 2, 103, 104, 5, 34, 18, 2, 104, 105, 8, 5, 1, 2, 105,
	107, 3, 2, 2, 2, 106, 91, 3, 2, 2, 2, 106, 94, 3, 2, 2, 2, 106, 97, 3,
	2, 2, 2, 106, 100, 3, 2, 2, 2, 106, 103, 3, 2, 2, 2, 107, 9, 3, 2, 2, 2,
	108, 109, 7, 3, 2, 2, 109, 110, 7, 49, 2, 2, 110, 111, 5, 12, 7, 2, 111,
	112, 7, 50, 2, 2, 112, 113, 8, 6, 1, 2, 113, 11, 3, 2, 2, 2, 114, 115,
	8, 7, 1, 2, 115, 116, 5, 48, 25, 2, 116, 117, 8, 7, 1, 2, 117, 125, 3,
	2, 2, 2, 118, 119, 12, 4, 2, 2, 119, 120, 7, 26, 2, 2, 120, 121, 5, 48,
	25, 2, 121, 122, 8, 7, 1, 2, 122, 124, 3, 2, 2, 2, 123, 118, 3, 2, 2, 2,
	124, 127, 3, 2, 2, 2, 125, 123, 3, 2, 2, 2, 125, 126, 3, 2, 2, 2, 126,
	13, 3, 2, 2, 2, 127, 125, 3, 2, 2, 2, 128, 129, 7, 18, 2, 2, 129, 130,
	5, 16, 9, 2, 130, 131, 7, 33, 2, 2, 131, 132, 7, 29, 2, 2, 132, 133, 5,
	46, 24, 2, 133, 134, 7, 30, 2, 2, 134, 135, 5, 48, 25, 2, 135, 136, 8,
	8, 1, 2, 136, 154, 3, 2, 2, 2, 137, 138, 7, 18, 2, 2, 138, 139, 5, 16,
	9, 2, 139, 140, 7, 33, 2, 2, 140, 141, 7, 30, 2, 2, 141, 142, 5, 48, 25,
	2, 142, 143, 8, 8, 1, 2, 143, 154, 3, 2, 2, 2, 144, 145, 7, 18, 2, 2, 145,
	146, 5, 16, 9, 2, 146, 147, 7, 33, 2, 2, 147, 148, 7, 29, 2, 2, 148, 149,
	5, 18, 10, 2, 149, 150, 7, 30, 2, 2, 150, 151, 5, 48, 25, 2, 151, 152,
	8, 8, 1, 2, 152, 154, 3, 2, 2, 2, 153, 128, 3, 2, 2, 2, 153, 137, 3, 2,
	2, 2, 153, 144, 3, 2, 2, 2, 154, 15, 3, 2, 2, 2, 155, 156, 7, 19, 2, 2,
	156, 159, 8, 9, 1, 2, 157, 159, 3, 2, 2, 2, 158, 155, 3, 2, 2, 2, 158,
	157, 3, 2, 2, 2, 159, 17, 3, 2, 2, 2, 160, 161, 7, 53, 2, 2, 161, 162,
	5, 18, 10, 2, 162, 163, 7, 27, 2, 2, 163, 164, 5, 48, 25, 2, 164, 165,
	7, 54, 2, 2, 165, 166, 8, 10, 1, 2, 166, 175, 3, 2, 2, 2, 167, 168, 7,
	53, 2, 2, 168, 169, 5, 46, 24, 2, 169, 170, 7, 27, 2, 2, 170, 171, 5, 48,
	25, 2, 171, 172, 7, 54, 2, 2, 172, 173, 8, 10, 1, 2, 173, 175, 3, 2, 2,
	2, 174, 160, 3, 2, 2, 2, 174, 167, 3, 2, 2, 2, 175, 19, 3, 2, 2, 2, 176,
	177, 7, 33, 2, 2, 177, 178, 7, 30, 2, 2, 178, 179, 5, 48, 25, 2, 179, 180,
	8, 11, 1, 2, 180, 21, 3, 2, 2, 2, 181, 182, 7, 9, 2, 2, 182, 183, 5, 48,
	25, 2, 183, 184, 5, 42, 22, 2, 184, 185, 8, 12, 1, 2, 185, 202, 3, 2, 2,
	2, 186, 187, 7, 9, 2, 2, 187, 188, 5, 48, 25, 2, 188, 189, 5, 42, 22, 2,
	189, 190, 7, 10, 2, 2, 190, 191, 5, 42, 22, 2, 191, 192, 8, 12, 1, 2, 192,
	202, 3, 2, 2, 2, 193, 194, 7, 9, 2, 2, 194, 195, 5, 48, 25, 2, 195, 196,
	5, 42, 22, 2, 196, 197, 5, 26, 14, 2, 197, 198, 7, 10, 2, 2, 198, 199,
	5, 42, 22, 2, 199, 200, 8, 12, 1, 2, 200, 202, 3, 2, 2, 2, 201, 181, 3,
	2, 2, 2, 201, 186, 3, 2, 2, 2, 201, 193, 3, 2, 2, 2, 202, 23, 3, 2, 2,
	2, 203, 204, 7, 9, 2, 2, 204, 205, 5, 48, 25, 2, 205, 206, 5, 44, 23, 2,
	206, 207, 7, 10, 2, 2, 207, 208, 5, 44, 23, 2, 208, 209, 8, 13, 1, 2, 209,
	219, 3, 2, 2, 2, 210, 211, 7, 9, 2, 2, 211, 212, 5, 48, 25, 2, 212, 213,
	5, 44, 23, 2, 213, 214, 5, 28, 15, 2, 214, 215, 7, 10, 2, 2, 215, 216,
	5, 44, 23, 2, 216, 217, 8, 13, 1, 2, 217, 219, 3, 2, 2, 2, 218, 203, 3,
	2, 2, 2, 218, 210, 3, 2, 2, 2, 219, 25, 3, 2, 2, 2, 220, 222, 5, 30, 16,
	2, 221, 220, 3, 2, 2, 2, 222, 223, 3, 2, 2, 2, 223, 221, 3, 2, 2, 2, 223,
	224, 3, 2, 2, 2, 224, 225, 3, 2, 2, 2, 225, 226, 8, 14, 1, 2, 226, 27,
	3, 2, 2, 2, 227, 229, 5, 32, 17, 2, 228, 227, 3, 2, 2, 2, 229, 230, 3,
	2, 2, 2, 230, 228, 3, 2, 2, 2, 230, 231, 3, 2, 2, 2, 231, 232, 3, 2, 2,
	2, 232, 233, 8, 15, 1, 2, 233, 29, 3, 2, 2, 2, 234, 235, 7, 10, 2, 2, 235,
	236, 7, 9, 2, 2, 236, 237, 5, 48, 25, 2, 237, 238, 5, 42, 22, 2, 238, 239,
	8, 16, 1, 2, 239, 31, 3, 2, 2, 2, 240, 241, 7, 10, 2, 2, 241, 242, 7, 9,
	2, 2, 242, 243, 5, 48, 25, 2, 243, 244, 5, 44, 23, 2, 244, 245, 8, 17,
	1, 2, 245, 33, 3, 2, 2, 2, 246, 247, 7, 11, 2, 2, 247, 248, 5, 48, 25,
	2, 248, 249, 7, 51, 2, 2, 249, 250, 5, 36, 19, 2, 250, 251, 7, 52, 2, 2,
	251, 252, 8, 18, 1, 2, 252, 276, 3, 2, 2, 2, 253, 254, 7, 11, 2, 2, 254,
	255, 5, 48, 25, 2, 255, 256, 7, 51, 2, 2, 256, 257, 5, 36, 19, 2, 257,
	258, 7, 32, 2, 2, 258, 259, 7, 31, 2, 2, 259, 260, 5, 42, 22, 2, 260, 261,
	7, 26, 2, 2, 261, 262, 7, 52, 2, 2, 262, 263, 8, 18, 1, 2, 263, 276, 3,
	2, 2, 2, 264, 265, 7, 11, 2, 2, 265, 266, 5, 48, 25, 2, 266, 267, 7, 51,
	2, 2, 267, 268, 5, 36, 19, 2, 268, 269, 7, 32, 2, 2, 269, 270, 7, 31, 2,
	2, 270, 271, 5, 8, 5, 2, 271, 272, 7, 26, 2, 2, 272, 273, 7, 52, 2, 2,
	273, 274, 8, 18, 1, 2, 274, 276, 3, 2, 2, 2, 275, 246, 3, 2, 2, 2, 275,
	253, 3, 2, 2, 2, 275, 264, 3, 2, 2, 2, 276, 35, 3, 2, 2, 2, 277, 278, 8,
	19, 1, 2, 278, 279, 5, 38, 20, 2, 279, 280, 8, 19, 1, 2, 280, 287, 3, 2,
	2, 2, 281, 282, 12, 4, 2, 2, 282, 283, 5, 38, 20, 2, 283, 284, 8, 19, 1,
	2, 284, 286, 3, 2, 2, 2, 285, 281, 3, 2, 2, 2, 286, 289, 3, 2, 2, 2, 287,
	285, 3, 2, 2, 2, 287, 288, 3, 2, 2, 2, 288, 37, 3, 2, 2, 2, 289, 287, 3,
	2, 2, 2, 290, 291, 5, 40, 21, 2, 291, 292, 7, 31, 2, 2, 292, 293, 5, 42,
	22, 2, 293, 294, 7, 26, 2, 2, 294, 295, 8, 20, 1, 2, 295, 303, 3, 2, 2,
	2, 296, 297, 5, 40, 21, 2, 297, 298, 7, 31, 2, 2, 298, 299, 5, 8, 5, 2,
	299, 300, 7, 26, 2, 2, 300, 301, 8, 20, 1, 2, 301, 303, 3, 2, 2, 2, 302,
	290, 3, 2, 2, 2, 302, 296, 3, 2, 2, 2, 303, 39, 3, 2, 2, 2, 304, 305, 8,
	21, 1, 2, 305, 306, 5, 56, 29, 2, 306, 307, 8, 21, 1, 2, 307, 315, 3, 2,
	2, 2, 308, 309, 12, 4, 2, 2, 309, 310, 7, 12, 2, 2, 310, 311, 5, 56, 29,
	2, 311, 312, 8, 21, 1, 2, 312, 314, 3, 2, 2, 2, 313, 308, 3, 2, 2, 2, 314,
	317, 3, 2, 2, 2, 315, 313, 3, 2, 2, 2, 315, 316, 3, 2, 2, 2, 316, 41, 3,
	2, 2, 2, 317, 315, 3, 2, 2, 2, 318, 319, 7, 51, 2, 2, 319, 320, 5, 4, 3,
	2, 320, 321, 7, 52, 2, 2, 321, 322, 8, 22, 1, 2, 322, 327, 3, 2, 2, 2,
	323, 324, 7, 51, 2, 2, 324, 325, 7, 52, 2, 2, 325, 327, 8, 22, 1, 2, 326,
	318, 3, 2, 2, 2, 326, 323, 3, 2, 2, 2, 327, 43, 3, 2, 2, 2, 328, 329, 7,
	51, 2, 2, 329, 330, 5, 48, 25, 2, 330, 331, 7, 52, 2, 2, 331, 332, 8, 23,
	1, 2, 332, 45, 3, 2, 2, 2, 333, 334, 7, 4, 2, 2, 334, 344, 8, 24, 1, 2,
	335, 336, 7, 6, 2, 2, 336, 344, 8, 24, 1, 2, 337, 338, 7, 5, 2, 2, 338,
	344, 8, 24, 1, 2, 339, 340, 7, 7, 2, 2, 340, 344, 8, 24, 1, 2, 341, 342,
	7, 8, 2, 2, 342, 344, 8, 24, 1, 2, 343, 333, 3, 2, 2, 2, 343, 335, 3, 2,
	2, 2, 343, 337, 3, 2, 2, 2, 343, 339, 3, 2, 2, 2, 343, 341, 3, 2, 2, 2,
	344, 47, 3, 2, 2, 2, 345, 346, 5, 50, 26, 2, 346, 347, 8, 25, 1, 2, 347,
	49, 3, 2, 2, 2, 348, 349, 8, 26, 1, 2, 349, 350, 7, 43, 2, 2, 350, 351,
	5, 50, 26, 16, 351, 352, 8, 26, 1, 2, 352, 397, 3, 2, 2, 2, 353, 354, 7,
	4, 2, 2, 354, 355, 7, 28, 2, 2, 355, 356, 7, 16, 2, 2, 356, 357, 7, 49,
	2, 2, 357, 358, 5, 50, 26, 2, 358, 359, 7, 26, 2, 2, 359, 360, 5, 50, 26,
	2, 360, 361, 7, 50, 2, 2, 361, 362, 8, 26, 1, 2, 362, 397, 3, 2, 2, 2,
	363, 364, 7, 5, 2, 2, 364, 365, 7, 28, 2, 2, 365, 366, 7, 17, 2, 2, 366,
	367, 7, 49, 2, 2, 367, 368, 5, 50, 26, 2, 368, 369, 7, 26, 2, 2, 369, 370,
	5, 50, 26, 2, 370, 371, 7, 50, 2, 2, 371, 372, 8, 26, 1, 2, 372, 397, 3,
	2, 2, 2, 373, 374, 7, 47, 2, 2, 374, 375, 5, 50, 26, 10, 375, 376, 8, 26,
	1, 2, 376, 397, 3, 2, 2, 2, 377, 378, 7, 53, 2, 2, 378, 379, 5, 12, 7,
	2, 379, 380, 7, 54, 2, 2, 380, 381, 8, 26, 1, 2, 381, 397, 3, 2, 2, 2,
	382, 383, 5, 56, 29, 2, 383, 384, 8, 26, 1, 2, 384, 397, 3, 2, 2, 2, 385,
	386, 7, 49, 2, 2, 386, 387, 5, 48, 25, 2, 387, 388, 7, 50, 2, 2, 388, 389,
	8, 26, 1, 2, 389, 397, 3, 2, 2, 2, 390, 391, 5, 52, 27, 2, 391, 392, 8,
	26, 1, 2, 392, 397, 3, 2, 2, 2, 393, 394, 5, 24, 13, 2, 394, 395, 8, 26,
	1, 2, 395, 397, 3, 2, 2, 2, 396, 348, 3, 2, 2, 2, 396, 353, 3, 2, 2, 2,
	396, 363, 3, 2, 2, 2, 396, 373, 3, 2, 2, 2, 396, 377, 3, 2, 2, 2, 396,
	382, 3, 2, 2, 2, 396, 385, 3, 2, 2, 2, 396, 390, 3, 2, 2, 2, 396, 393,
	3, 2, 2, 2, 397, 425, 3, 2, 2, 2, 398, 399, 12, 13, 2, 2, 399, 400, 9,
	2, 2, 2, 400, 401, 5, 50, 26, 14, 401, 402, 8, 26, 1, 2, 402, 424, 3, 2,
	2, 2, 403, 404, 12, 12, 2, 2, 404, 405, 9, 3, 2, 2, 405, 406, 5, 50, 26,
	13, 406, 407, 8, 26, 1, 2, 407, 424, 3, 2, 2, 2, 408, 409, 12, 11, 2, 2,
	409, 410, 9, 4, 2, 2, 410, 411, 5, 50, 26, 12, 411, 412, 8, 26, 1, 2, 412,
	424, 3, 2, 2, 2, 413, 414, 12, 9, 2, 2, 414, 415, 7, 45, 2, 2, 415, 416,
	5, 50, 26, 10, 416, 417, 8, 26, 1, 2, 417, 424, 3, 2, 2, 2, 418, 419, 12,
	8, 2, 2, 419, 420, 7, 46, 2, 2, 420, 421, 5, 50, 26, 9, 421, 422, 8, 26,
	1, 2, 422, 424, 3, 2, 2, 2, 423, 398, 3, 2, 2, 2, 423, 403, 3, 2, 2, 2,
	423, 408, 3, 2, 2, 2, 423, 413, 3, 2, 2, 2, 423, 418, 3, 2, 2, 2, 424,
	427, 3, 2, 2, 2, 425, 423, 3, 2, 2, 2, 425, 426, 3, 2, 2, 2, 426, 51, 3,
	2, 2, 2, 427, 425, 3, 2, 2, 2, 428, 429, 7, 49, 2, 2, 429, 430, 5, 48,
	25, 2, 430, 431, 7, 15, 2, 2, 431, 432, 5, 54, 28, 2, 432, 433, 7, 50,
	2, 2, 433, 434, 8, 27, 1, 2, 434, 53, 3, 2, 2, 2, 435, 436, 7, 5, 2, 2,
	436, 440, 8, 28, 1, 2, 437, 438, 7, 4, 2, 2, 438, 440, 8, 28, 1, 2, 439,
	435, 3, 2, 2, 2, 439, 437, 3, 2, 2, 2, 440, 55, 3, 2, 2, 2, 441, 442, 7,
	22, 2, 2, 442, 455, 8, 29, 1, 2, 443, 444, 7, 23, 2, 2, 444, 455, 8, 29,
	1, 2, 445, 446, 5, 58, 30, 2, 446, 447, 8, 29, 1, 2, 447, 455, 3, 2, 2,
	2, 448, 449, 7, 33, 2, 2, 449, 455, 8, 29, 1, 2, 450, 451, 7, 13, 2, 2,
	451, 455, 8, 29, 1, 2, 452, 453, 7, 14, 2, 2, 453, 455, 8, 29, 1, 2, 454,
	441, 3, 2, 2, 2, 454, 443, 3, 2, 2, 2, 454, 445, 3, 2, 2, 2, 454, 448,
	3, 2, 2, 2, 454, 450, 3, 2, 2, 2, 454, 452, 3, 2, 2, 2, 455, 57, 3, 2,
	2, 2, 456, 458, 7, 48, 2, 2, 457, 456, 3, 2, 2, 2, 458, 459, 3, 2, 2, 2,
	459, 457, 3, 2, 2, 2, 459, 460, 3, 2, 2, 2, 460, 461, 3, 2, 2, 2, 461,
	463, 7, 24, 2, 2, 462, 464, 9, 5, 2, 2, 463, 462, 3, 2, 2, 2, 463, 464,
	3, 2, 2, 2, 464, 465, 3, 2, 2, 2, 465, 472, 8, 30, 1, 2, 466, 467, 7, 24,
	2, 2, 467, 468, 9, 5, 2, 2, 468, 472, 8, 30, 1, 2, 469, 470, 7, 24, 2,
	2, 470, 472, 8, 30, 1, 2, 471, 457, 3, 2, 2, 2, 471, 466, 3, 2, 2, 2, 471,
	469, 3, 2, 2, 2, 472, 59, 3, 2, 2, 2, 27, 66, 89, 106, 125, 153, 158, 174,
	201, 218, 223, 230, 275, 287, 302, 315, 326, 343, 396, 423, 425, 439, 454,
	459, 463, 471,
}
var literalNames = []string{
	"", "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", "'if'",
	"'else'", "'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'",
	"'let'", "'mut'", "'.to_string()'", "'.to_owned()'", "", "", "", "'.'",
	"','", "';'", "'::'", "':'", "'='", "'=>'", "'_'", "", "'!='", "'=='",
	"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'",
	"'||'", "'!'", "'&'", "'('", "')'", "'{'", "'}'", "'['", "']'",
}
var symbolicNames = []string{
	"", "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR",
	"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET",
	"MUT", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", "PUNTO", "COMA",
	"PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", "GUIONB", "ID",
	"DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL",
	"DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP", "PARIZQ", "PARDER",
	"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", "L_COMMENT",
}

var ruleNames = []string{
	"start", "instrucciones", "instruccion", "instruccion_only", "printconsola",
	"listParams", "declaracion", "is_mut", "array_type", "asignacion", "if_sent",
	"if_exp", "list_elseif", "list_elseif_exp", "else_if", "else_if_exp", "match_sent",
	"match_brazos", "matchbrazo", "listaOpciones", "bloque_inst", "bloque_exp",
	"tipos_var", "expression", "expr_arit", "casteo", "tipo_cast", "primitivo",
	"strings",
}

type RustPar struct {
	*antlr.BaseParser
}

// NewRustPar produces a new parser instance for the optional input antlr.TokenStream.
//
// The *RustPar instance produced may be reused by calling the SetInputStream method.
// The initial parser configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewRustPar(input antlr.TokenStream) *RustPar {
	this := new(RustPar)
	deserializer := antlr.NewATNDeserializer(nil)
	deserializedATN := deserializer.DeserializeFromUInt16(parserATN)
	decisionToDFA := make([]*antlr.DFA, len(deserializedATN.DecisionToState))
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "RustPar.g4"

	return this
}

// RustPar tokens.
const (
	RustParEOF        = antlr.TokenEOF
	RustParPRINT_CON  = 1
	RustParT_NUMBER   = 2
	RustParT_FLOAT    = 3
	RustParT_STRING   = 4
	RustParT_BOOL     = 5
	RustParT_STR      = 6
	RustParIF         = 7
	RustParELSE       = 8
	RustParMATCH      = 9
	RustParMTOR       = 10
	RustParTRUE       = 11
	RustParFALSE      = 12
	RustParAS         = 13
	RustParPOW        = 14
	RustParPOWF       = 15
	RustParLET        = 16
	RustParMUT        = 17
	RustParTO_STRING  = 18
	RustParTO_OWNED   = 19
	RustParNUMBER     = 20
	RustParFLOAT      = 21
	RustParSTRING     = 22
	RustParPUNTO      = 23
	RustParCOMA       = 24
	RustParPTCOMA     = 25
	RustParDOSPUNTO   = 26
	RustParDPUNTO2    = 27
	RustParASIGNACION = 28
	RustParMTHEN      = 29
	RustParGUIONB     = 30
	RustParID         = 31
	RustParDISTINTO   = 32
	RustParIGUAL      = 33
	RustParMAYORIGUAL = 34
	RustParMENORIGUAL = 35
	RustParMAYOR      = 36
	RustParMENOR      = 37
	RustParMUL        = 38
	RustParDIV        = 39
	RustParADD        = 40
	RustParSUB        = 41
	RustParMOD        = 42
	RustParAND        = 43
	RustParOR         = 44
	RustParNOT        = 45
	RustParAMP        = 46
	RustParPARIZQ     = 47
	RustParPARDER     = 48
	RustParLLAVEIZQ   = 49
	RustParLLAVEDER   = 50
	RustParCORIZQ     = 51
	RustParCORDER     = 52
	RustParWHITESPACE = 53
	RustParL_COMMENT  = 54
)

// RustPar rules.
const (
	RustParRULE_start            = 0
	RustParRULE_instrucciones    = 1
	RustParRULE_instruccion      = 2
	RustParRULE_instruccion_only = 3
	RustParRULE_printconsola     = 4
	RustParRULE_listParams       = 5
	RustParRULE_declaracion      = 6
	RustParRULE_is_mut           = 7
	RustParRULE_array_type       = 8
	RustParRULE_asignacion       = 9
	RustParRULE_if_sent          = 10
	RustParRULE_if_exp           = 11
	RustParRULE_list_elseif      = 12
	RustParRULE_list_elseif_exp  = 13
	RustParRULE_else_if          = 14
	RustParRULE_else_if_exp      = 15
	RustParRULE_match_sent       = 16
	RustParRULE_match_brazos     = 17
	RustParRULE_matchbrazo       = 18
	RustParRULE_listaOpciones    = 19
	RustParRULE_bloque_inst      = 20
	RustParRULE_bloque_exp       = 21
	RustParRULE_tipos_var        = 22
	RustParRULE_expression       = 23
	RustParRULE_expr_arit        = 24
	RustParRULE_casteo           = 25
	RustParRULE_tipo_cast        = 26
	RustParRULE_primitivo        = 27
	RustParRULE_strings          = 28
)

// IStartContext is an interface to support dynamic dispatch.
type IStartContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsStartContext differentiates from other interfaces.
	IsStartContext()
}

type StartContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	lista          *arrayList.List
	_instrucciones IInstruccionesContext
}

func NewEmptyStartContext() *StartContext {
	var p = new(StartContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_start
	return p
}

func (*StartContext) IsStartContext() {}

func NewStartContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StartContext {
	var p = new(StartContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_start

	return p
}

func (s *StartContext) GetParser() antlr.Parser { return s.parser }

func (s *StartContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *StartContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *StartContext) GetLista() *arrayList.List { return s.lista }

func (s *StartContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *StartContext) Instrucciones() IInstruccionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccionesContext)
}

func (s *StartContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StartContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StartContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterStart(s)
	}
}

func (s *StartContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitStart(s)
	}
}

func (p *RustPar) Start() (localctx IStartContext) {
	this := p
	_ = this

	localctx = NewStartContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, RustParRULE_start)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(58)

		var _x = p.Instrucciones()

		localctx.(*StartContext)._instrucciones = _x
	}
	localctx.(*StartContext).lista = localctx.(*StartContext).Get_instrucciones().GetL()

	return localctx
}

// IInstruccionesContext is an interface to support dynamic dispatch.
type IInstruccionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruccion returns the _instruccion rule contexts.
	Get_instruccion() IInstruccionContext

	// Set_instruccion sets the _instruccion rule contexts.
	Set_instruccion(IInstruccionContext)

	// GetE returns the e rule context list.
	GetE() []IInstruccionContext

	// SetE sets the e rule context list.
	SetE([]IInstruccionContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsInstruccionesContext differentiates from other interfaces.
	IsInstruccionesContext()
}

type InstruccionesContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	l            *arrayList.List
	_instruccion IInstruccionContext
	e            []IInstruccionContext
}

func NewEmptyInstruccionesContext() *InstruccionesContext {
	var p = new(InstruccionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_instrucciones
	return p
}

func (*InstruccionesContext) IsInstruccionesContext() {}

func NewInstruccionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionesContext {
	var p = new(InstruccionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_instrucciones

	return p
}

func (s *InstruccionesContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionesContext) Get_instruccion() IInstruccionContext { return s._instruccion }

func (s *InstruccionesContext) Set_instruccion(v IInstruccionContext) { s._instruccion = v }

func (s *InstruccionesContext) GetE() []IInstruccionContext { return s.e }

func (s *InstruccionesContext) SetE(v []IInstruccionContext) { s.e = v }

func (s *InstruccionesContext) GetL() *arrayList.List { return s.l }

func (s *InstruccionesContext) SetL(v *arrayList.List) { s.l = v }

func (s *InstruccionesContext) AllInstruccion() []IInstruccionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstruccionContext)(nil)).Elem())
	var tst = make([]IInstruccionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstruccionContext)
		}
	}

	return tst
}

func (s *InstruccionesContext) Instruccion(i int) IInstruccionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstruccionContext)
}

func (s *InstruccionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterInstrucciones(s)
	}
}

func (s *InstruccionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitInstrucciones(s)
	}
}

func (p *RustPar) Instrucciones() (localctx IInstruccionesContext) {
	this := p
	_ = this

	localctx = NewInstruccionesContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, RustParRULE_instrucciones)

	localctx.(*InstruccionesContext).l = arrayList.New()

	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(64)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<RustParPRINT_CON)|(1<<RustParIF)|(1<<RustParMATCH)|(1<<RustParLET)|(1<<RustParID))) != 0 {
		{
			p.SetState(61)

			var _x = p.Instruccion()

			localctx.(*InstruccionesContext)._instruccion = _x
		}
		localctx.(*InstruccionesContext).e = append(localctx.(*InstruccionesContext).e, localctx.(*InstruccionesContext)._instruccion)

		p.SetState(66)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	listInt := localctx.(*InstruccionesContext).GetE()
	for _, e := range listInt {
		localctx.(*InstruccionesContext).l.Add(e.GetInstr())
	}
	//fmt.Printf("tipo %T",localctx.(*InstruccionesContext).GetE())

	return localctx
}

// IInstruccionContext is an interface to support dynamic dispatch.
type IInstruccionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printconsola returns the _printconsola rule contexts.
	Get_printconsola() IPrintconsolaContext

	// Get_declaracion returns the _declaracion rule contexts.
	Get_declaracion() IDeclaracionContext

	// Get_asignacion returns the _asignacion rule contexts.
	Get_asignacion() IAsignacionContext

	// Get_if_sent returns the _if_sent rule contexts.
	Get_if_sent() IIf_sentContext

	// Get_match_sent returns the _match_sent rule contexts.
	Get_match_sent() IMatch_sentContext

	// Set_printconsola sets the _printconsola rule contexts.
	Set_printconsola(IPrintconsolaContext)

	// Set_declaracion sets the _declaracion rule contexts.
	Set_declaracion(IDeclaracionContext)

	// Set_asignacion sets the _asignacion rule contexts.
	Set_asignacion(IAsignacionContext)

	// Set_if_sent sets the _if_sent rule contexts.
	Set_if_sent(IIf_sentContext)

	// Set_match_sent sets the _match_sent rule contexts.
	Set_match_sent(IMatch_sentContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsInstruccionContext differentiates from other interfaces.
	IsInstruccionContext()
}

type InstruccionContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	instr         interfaces.Instruction
	_printconsola IPrintconsolaContext
	_declaracion  IDeclaracionContext
	_asignacion   IAsignacionContext
	_if_sent      IIf_sentContext
	_match_sent   IMatch_sentContext
}

func NewEmptyInstruccionContext() *InstruccionContext {
	var p = new(InstruccionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_instruccion
	return p
}

func (*InstruccionContext) IsInstruccionContext() {}

func NewInstruccionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionContext {
	var p = new(InstruccionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_instruccion

	return p
}

func (s *InstruccionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionContext) Get_printconsola() IPrintconsolaContext { return s._printconsola }

func (s *InstruccionContext) Get_declaracion() IDeclaracionContext { return s._declaracion }

func (s *InstruccionContext) Get_asignacion() IAsignacionContext { return s._asignacion }

func (s *InstruccionContext) Get_if_sent() IIf_sentContext { return s._if_sent }

func (s *InstruccionContext) Get_match_sent() IMatch_sentContext { return s._match_sent }

func (s *InstruccionContext) Set_printconsola(v IPrintconsolaContext) { s._printconsola = v }

func (s *InstruccionContext) Set_declaracion(v IDeclaracionContext) { s._declaracion = v }

func (s *InstruccionContext) Set_asignacion(v IAsignacionContext) { s._asignacion = v }

func (s *InstruccionContext) Set_if_sent(v IIf_sentContext) { s._if_sent = v }

func (s *InstruccionContext) Set_match_sent(v IMatch_sentContext) { s._match_sent = v }

func (s *InstruccionContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *InstruccionContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *InstruccionContext) Printconsola() IPrintconsolaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrintconsolaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrintconsolaContext)
}

func (s *InstruccionContext) PTCOMA() antlr.TerminalNode {
	return s.GetToken(RustParPTCOMA, 0)
}

func (s *InstruccionContext) Declaracion() IDeclaracionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDeclaracionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDeclaracionContext)
}

func (s *InstruccionContext) Asignacion() IAsignacionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAsignacionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAsignacionContext)
}

func (s *InstruccionContext) If_sent() IIf_sentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IIf_sentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IIf_sentContext)
}

func (s *InstruccionContext) Match_sent() IMatch_sentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatch_sentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatch_sentContext)
}

func (s *InstruccionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterInstruccion(s)
	}
}

func (s *InstruccionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitInstruccion(s)
	}
}

func (p *RustPar) Instruccion() (localctx IInstruccionContext) {
	this := p
	_ = this

	localctx = NewInstruccionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, RustParRULE_instruccion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(87)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParPRINT_CON:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(69)

			var _x = p.Printconsola()

			localctx.(*InstruccionContext)._printconsola = _x
		}
		{
			p.SetState(70)
			p.Match(RustParPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_printconsola().GetInstr()

	case RustParLET:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(73)

			var _x = p.Declaracion()

			localctx.(*InstruccionContext)._declaracion = _x
		}
		{
			p.SetState(74)
			p.Match(RustParPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_declaracion().GetInstr()

	case RustParID:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(77)

			var _x = p.Asignacion()

			localctx.(*InstruccionContext)._asignacion = _x
		}
		{
			p.SetState(78)
			p.Match(RustParPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_asignacion().GetInstr()

	case RustParIF:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(81)

			var _x = p.If_sent()

			localctx.(*InstruccionContext)._if_sent = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_if_sent().GetInstr()

	case RustParMATCH:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(84)

			var _x = p.Match_sent()

			localctx.(*InstruccionContext)._match_sent = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_match_sent().GetInstr()

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IInstruccion_onlyContext is an interface to support dynamic dispatch.
type IInstruccion_onlyContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_printconsola returns the _printconsola rule contexts.
	Get_printconsola() IPrintconsolaContext

	// Get_declaracion returns the _declaracion rule contexts.
	Get_declaracion() IDeclaracionContext

	// Get_asignacion returns the _asignacion rule contexts.
	Get_asignacion() IAsignacionContext

	// Get_if_sent returns the _if_sent rule contexts.
	Get_if_sent() IIf_sentContext

	// Get_match_sent returns the _match_sent rule contexts.
	Get_match_sent() IMatch_sentContext

	// Set_printconsola sets the _printconsola rule contexts.
	Set_printconsola(IPrintconsolaContext)

	// Set_declaracion sets the _declaracion rule contexts.
	Set_declaracion(IDeclaracionContext)

	// Set_asignacion sets the _asignacion rule contexts.
	Set_asignacion(IAsignacionContext)

	// Set_if_sent sets the _if_sent rule contexts.
	Set_if_sent(IIf_sentContext)

	// Set_match_sent sets the _match_sent rule contexts.
	Set_match_sent(IMatch_sentContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsInstruccion_onlyContext differentiates from other interfaces.
	IsInstruccion_onlyContext()
}

type Instruccion_onlyContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	instr         interfaces.Instruction
	_printconsola IPrintconsolaContext
	_declaracion  IDeclaracionContext
	_asignacion   IAsignacionContext
	_if_sent      IIf_sentContext
	_match_sent   IMatch_sentContext
}

func NewEmptyInstruccion_onlyContext() *Instruccion_onlyContext {
	var p = new(Instruccion_onlyContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_instruccion_only
	return p
}

func (*Instruccion_onlyContext) IsInstruccion_onlyContext() {}

func NewInstruccion_onlyContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Instruccion_onlyContext {
	var p = new(Instruccion_onlyContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_instruccion_only

	return p
}

func (s *Instruccion_onlyContext) GetParser() antlr.Parser { return s.parser }

func (s *Instruccion_onlyContext) Get_printconsola() IPrintconsolaContext { return s._printconsola }

func (s *Instruccion_onlyContext) Get_declaracion() IDeclaracionContext { return s._declaracion }

func (s *Instruccion_onlyContext) Get_asignacion() IAsignacionContext { return s._asignacion }

func (s *Instruccion_onlyContext) Get_if_sent() IIf_sentContext { return s._if_sent }

func (s *Instruccion_onlyContext) Get_match_sent() IMatch_sentContext { return s._match_sent }

func (s *Instruccion_onlyContext) Set_printconsola(v IPrintconsolaContext) { s._printconsola = v }

func (s *Instruccion_onlyContext) Set_declaracion(v IDeclaracionContext) { s._declaracion = v }

func (s *Instruccion_onlyContext) Set_asignacion(v IAsignacionContext) { s._asignacion = v }

func (s *Instruccion_onlyContext) Set_if_sent(v IIf_sentContext) { s._if_sent = v }

func (s *Instruccion_onlyContext) Set_match_sent(v IMatch_sentContext) { s._match_sent = v }

func (s *Instruccion_onlyContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *Instruccion_onlyContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *Instruccion_onlyContext) Printconsola() IPrintconsolaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrintconsolaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrintconsolaContext)
}

func (s *Instruccion_onlyContext) Declaracion() IDeclaracionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDeclaracionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDeclaracionContext)
}

func (s *Instruccion_onlyContext) Asignacion() IAsignacionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAsignacionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAsignacionContext)
}

func (s *Instruccion_onlyContext) If_sent() IIf_sentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IIf_sentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IIf_sentContext)
}

func (s *Instruccion_onlyContext) Match_sent() IMatch_sentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatch_sentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatch_sentContext)
}

func (s *Instruccion_onlyContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Instruccion_onlyContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Instruccion_onlyContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterInstruccion_only(s)
	}
}

func (s *Instruccion_onlyContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitInstruccion_only(s)
	}
}

func (p *RustPar) Instruccion_only() (localctx IInstruccion_onlyContext) {
	this := p
	_ = this

	localctx = NewInstruccion_onlyContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, RustParRULE_instruccion_only)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(104)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParPRINT_CON:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(89)

			var _x = p.Printconsola()

			localctx.(*Instruccion_onlyContext)._printconsola = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_printconsola().GetInstr()

	case RustParLET:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(92)

			var _x = p.Declaracion()

			localctx.(*Instruccion_onlyContext)._declaracion = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_declaracion().GetInstr()

	case RustParID:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(95)

			var _x = p.Asignacion()

			localctx.(*Instruccion_onlyContext)._asignacion = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_asignacion().GetInstr()

	case RustParIF:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(98)

			var _x = p.If_sent()

			localctx.(*Instruccion_onlyContext)._if_sent = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_if_sent().GetInstr()

	case RustParMATCH:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(101)

			var _x = p.Match_sent()

			localctx.(*Instruccion_onlyContext)._match_sent = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_match_sent().GetInstr()

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IPrintconsolaContext is an interface to support dynamic dispatch.
type IPrintconsolaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_PRINT_CON returns the _PRINT_CON token.
	Get_PRINT_CON() antlr.Token

	// Set_PRINT_CON sets the _PRINT_CON token.
	Set_PRINT_CON(antlr.Token)

	// Get_listParams returns the _listParams rule contexts.
	Get_listParams() IListParamsContext

	// Set_listParams sets the _listParams rule contexts.
	Set_listParams(IListParamsContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsPrintconsolaContext differentiates from other interfaces.
	IsPrintconsolaContext()
}

type PrintconsolaContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruction
	_PRINT_CON  antlr.Token
	_listParams IListParamsContext
}

func NewEmptyPrintconsolaContext() *PrintconsolaContext {
	var p = new(PrintconsolaContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_printconsola
	return p
}

func (*PrintconsolaContext) IsPrintconsolaContext() {}

func NewPrintconsolaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrintconsolaContext {
	var p = new(PrintconsolaContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_printconsola

	return p
}

func (s *PrintconsolaContext) GetParser() antlr.Parser { return s.parser }

func (s *PrintconsolaContext) Get_PRINT_CON() antlr.Token { return s._PRINT_CON }

func (s *PrintconsolaContext) Set_PRINT_CON(v antlr.Token) { s._PRINT_CON = v }

func (s *PrintconsolaContext) Get_listParams() IListParamsContext { return s._listParams }

func (s *PrintconsolaContext) Set_listParams(v IListParamsContext) { s._listParams = v }

func (s *PrintconsolaContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *PrintconsolaContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *PrintconsolaContext) PRINT_CON() antlr.TerminalNode {
	return s.GetToken(RustParPRINT_CON, 0)
}

func (s *PrintconsolaContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *PrintconsolaContext) ListParams() IListParamsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListParamsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListParamsContext)
}

func (s *PrintconsolaContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *PrintconsolaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrintconsolaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrintconsolaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterPrintconsola(s)
	}
}

func (s *PrintconsolaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitPrintconsola(s)
	}
}

func (p *RustPar) Printconsola() (localctx IPrintconsolaContext) {
	this := p
	_ = this

	localctx = NewPrintconsolaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, RustParRULE_printconsola)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(106)

		var _m = p.Match(RustParPRINT_CON)

		localctx.(*PrintconsolaContext)._PRINT_CON = _m
	}
	{
		p.SetState(107)
		p.Match(RustParPARIZQ)
	}
	{
		p.SetState(108)

		var _x = p.listParams(0)

		localctx.(*PrintconsolaContext)._listParams = _x
	}
	{
		p.SetState(109)
		p.Match(RustParPARDER)
	}
	localctx.(*PrintconsolaContext).instr = instruction.NewImprimir(localctx.(*PrintconsolaContext).Get_listParams().GetL_e(), (func() int {
		if localctx.(*PrintconsolaContext).Get_PRINT_CON() == nil {
			return 0
		} else {
			return localctx.(*PrintconsolaContext).Get_PRINT_CON().GetLine()
		}
	}()), localctx.(*PrintconsolaContext).Get_PRINT_CON().GetColumn())

	return localctx
}

// IListParamsContext is an interface to support dynamic dispatch.
type IListParamsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IListParamsContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetList sets the list rule contexts.
	SetList(IListParamsContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetL_e returns the l_e attribute.
	GetL_e() *arrayList.List

	// SetL_e sets the l_e attribute.
	SetL_e(*arrayList.List)

	// IsListParamsContext differentiates from other interfaces.
	IsListParamsContext()
}

type ListParamsContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	l_e         *arrayList.List
	list        IListParamsContext
	_expression IExpressionContext
}

func NewEmptyListParamsContext() *ListParamsContext {
	var p = new(ListParamsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_listParams
	return p
}

func (*ListParamsContext) IsListParamsContext() {}

func NewListParamsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListParamsContext {
	var p = new(ListParamsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_listParams

	return p
}

func (s *ListParamsContext) GetParser() antlr.Parser { return s.parser }

func (s *ListParamsContext) GetList() IListParamsContext { return s.list }

func (s *ListParamsContext) Get_expression() IExpressionContext { return s._expression }

func (s *ListParamsContext) SetList(v IListParamsContext) { s.list = v }

func (s *ListParamsContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ListParamsContext) GetL_e() *arrayList.List { return s.l_e }

func (s *ListParamsContext) SetL_e(v *arrayList.List) { s.l_e = v }

func (s *ListParamsContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ListParamsContext) COMA() antlr.TerminalNode {
	return s.GetToken(RustParCOMA, 0)
}

func (s *ListParamsContext) ListParams() IListParamsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListParamsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListParamsContext)
}

func (s *ListParamsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListParamsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListParamsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterListParams(s)
	}
}

func (s *ListParamsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitListParams(s)
	}
}

func (p *RustPar) ListParams() (localctx IListParamsContext) {
	return p.listParams(0)
}

func (p *RustPar) listParams(_p int) (localctx IListParamsContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListParamsContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListParamsContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 10
	p.EnterRecursionRule(localctx, 10, RustParRULE_listParams, _p)

	localctx.(*ListParamsContext).l_e = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(113)

		var _x = p.Expression()

		localctx.(*ListParamsContext)._expression = _x
	}
	localctx.(*ListParamsContext).l_e.Add(localctx.(*ListParamsContext).Get_expression().GetP())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(123)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListParamsContext(p, _parentctx, _parentState)
			localctx.(*ListParamsContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_listParams)
			p.SetState(116)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(117)
				p.Match(RustParCOMA)
			}
			{
				p.SetState(118)

				var _x = p.Expression()

				localctx.(*ListParamsContext)._expression = _x
			}

			localctx.(*ListParamsContext).GetList().GetL_e().Add(localctx.(*ListParamsContext).Get_expression().GetP())
			localctx.(*ListParamsContext).l_e = localctx.(*ListParamsContext).GetList().GetL_e()

		}
		p.SetState(125)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())
	}

	return localctx
}

// IDeclaracionContext is an interface to support dynamic dispatch.
type IDeclaracionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetId returns the id token.
	GetId() antlr.Token

	// GetAsig returns the asig token.
	GetAsig() antlr.Token

	// SetId sets the id token.
	SetId(antlr.Token)

	// SetAsig sets the asig token.
	SetAsig(antlr.Token)

	// GetIsMut returns the isMut rule contexts.
	GetIsMut() IIs_mutContext

	// Get_tipos_var returns the _tipos_var rule contexts.
	Get_tipos_var() ITipos_varContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_array_type returns the _array_type rule contexts.
	Get_array_type() IArray_typeContext

	// SetIsMut sets the isMut rule contexts.
	SetIsMut(IIs_mutContext)

	// Set_tipos_var sets the _tipos_var rule contexts.
	Set_tipos_var(ITipos_varContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_array_type sets the _array_type rule contexts.
	Set_array_type(IArray_typeContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsDeclaracionContext differentiates from other interfaces.
	IsDeclaracionContext()
}

type DeclaracionContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruction
	isMut       IIs_mutContext
	id          antlr.Token
	_tipos_var  ITipos_varContext
	asig        antlr.Token
	_expression IExpressionContext
	_array_type IArray_typeContext
}

func NewEmptyDeclaracionContext() *DeclaracionContext {
	var p = new(DeclaracionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_declaracion
	return p
}

func (*DeclaracionContext) IsDeclaracionContext() {}

func NewDeclaracionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclaracionContext {
	var p = new(DeclaracionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_declaracion

	return p
}

func (s *DeclaracionContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclaracionContext) GetId() antlr.Token { return s.id }

func (s *DeclaracionContext) GetAsig() antlr.Token { return s.asig }

func (s *DeclaracionContext) SetId(v antlr.Token) { s.id = v }

func (s *DeclaracionContext) SetAsig(v antlr.Token) { s.asig = v }

func (s *DeclaracionContext) GetIsMut() IIs_mutContext { return s.isMut }

func (s *DeclaracionContext) Get_tipos_var() ITipos_varContext { return s._tipos_var }

func (s *DeclaracionContext) Get_expression() IExpressionContext { return s._expression }

func (s *DeclaracionContext) Get_array_type() IArray_typeContext { return s._array_type }

func (s *DeclaracionContext) SetIsMut(v IIs_mutContext) { s.isMut = v }

func (s *DeclaracionContext) Set_tipos_var(v ITipos_varContext) { s._tipos_var = v }

func (s *DeclaracionContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *DeclaracionContext) Set_array_type(v IArray_typeContext) { s._array_type = v }

func (s *DeclaracionContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *DeclaracionContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *DeclaracionContext) LET() antlr.TerminalNode {
	return s.GetToken(RustParLET, 0)
}

func (s *DeclaracionContext) DPUNTO2() antlr.TerminalNode {
	return s.GetToken(RustParDPUNTO2, 0)
}

func (s *DeclaracionContext) Tipos_var() ITipos_varContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipos_varContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipos_varContext)
}

func (s *DeclaracionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *DeclaracionContext) Is_mut() IIs_mutContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IIs_mutContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IIs_mutContext)
}

func (s *DeclaracionContext) ID() antlr.TerminalNode {
	return s.GetToken(RustParID, 0)
}

func (s *DeclaracionContext) ASIGNACION() antlr.TerminalNode {
	return s.GetToken(RustParASIGNACION, 0)
}

func (s *DeclaracionContext) Array_type() IArray_typeContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArray_typeContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArray_typeContext)
}

func (s *DeclaracionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclaracionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclaracionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterDeclaracion(s)
	}
}

func (s *DeclaracionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitDeclaracion(s)
	}
}

func (p *RustPar) Declaracion() (localctx IDeclaracionContext) {
	this := p
	_ = this

	localctx = NewDeclaracionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, RustParRULE_declaracion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(151)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 4, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(126)
			p.Match(RustParLET)
		}
		{
			p.SetState(127)

			var _x = p.Is_mut()

			localctx.(*DeclaracionContext).isMut = _x
		}
		{
			p.SetState(128)

			var _m = p.Match(RustParID)

			localctx.(*DeclaracionContext).id = _m
		}
		{
			p.SetState(129)
			p.Match(RustParDPUNTO2)
		}
		{
			p.SetState(130)

			var _x = p.Tipos_var()

			localctx.(*DeclaracionContext)._tipos_var = _x
		}
		{
			p.SetState(131)

			var _m = p.Match(RustParASIGNACION)

			localctx.(*DeclaracionContext).asig = _m
		}
		{
			p.SetState(132)

			var _x = p.Expression()

			localctx.(*DeclaracionContext)._expression = _x
		}

		localctx.(*DeclaracionContext).instr = instruction.NewDeclaration((func() string {
			if localctx.(*DeclaracionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*DeclaracionContext).GetId().GetText()
			}
		}()), localctx.(*DeclaracionContext).Get_tipos_var().GetTipo(), localctx.(*DeclaracionContext).Get_expression().GetP(), localctx.(*DeclaracionContext).GetIsMut().GetMut(), (func() int {
			if localctx.(*DeclaracionContext).GetAsig() == nil {
				return 0
			} else {
				return localctx.(*DeclaracionContext).GetAsig().GetLine()
			}
		}()), localctx.(*DeclaracionContext).GetAsig().GetColumn())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(135)
			p.Match(RustParLET)
		}
		{
			p.SetState(136)

			var _x = p.Is_mut()

			localctx.(*DeclaracionContext).isMut = _x
		}
		{
			p.SetState(137)

			var _m = p.Match(RustParID)

			localctx.(*DeclaracionContext).id = _m
		}
		{
			p.SetState(138)

			var _m = p.Match(RustParASIGNACION)

			localctx.(*DeclaracionContext).asig = _m
		}
		{
			p.SetState(139)

			var _x = p.Expression()

			localctx.(*DeclaracionContext)._expression = _x
		}

		localctx.(*DeclaracionContext).instr = instruction.NewDeclaration((func() string {
			if localctx.(*DeclaracionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*DeclaracionContext).GetId().GetText()
			}
		}()), interfaces.NULL, localctx.(*DeclaracionContext).Get_expression().GetP(), localctx.(*DeclaracionContext).GetIsMut().GetMut(), (func() int {
			if localctx.(*DeclaracionContext).GetAsig() == nil {
				return 0
			} else {
				return localctx.(*DeclaracionContext).GetAsig().GetLine()
			}
		}()), localctx.(*DeclaracionContext).GetAsig().GetColumn())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(142)
			p.Match(RustParLET)
		}
		{
			p.SetState(143)

			var _x = p.Is_mut()

			localctx.(*DeclaracionContext).isMut = _x
		}
		{
			p.SetState(144)

			var _m = p.Match(RustParID)

			localctx.(*DeclaracionContext).id = _m
		}
		{
			p.SetState(145)
			p.Match(RustParDPUNTO2)
		}
		{
			p.SetState(146)

			var _x = p.Array_type()

			localctx.(*DeclaracionContext)._array_type = _x
		}
		{
			p.SetState(147)

			var _m = p.Match(RustParASIGNACION)

			localctx.(*DeclaracionContext).asig = _m
		}
		{
			p.SetState(148)

			var _x = p.Expression()

			localctx.(*DeclaracionContext)._expression = _x
		}

		localctx.(*DeclaracionContext).instr = instruction.NewArrayDeclaration((func() string {
			if localctx.(*DeclaracionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*DeclaracionContext).GetId().GetText()
			}
		}()), localctx.(*DeclaracionContext).Get_array_type().GetTy(), localctx.(*DeclaracionContext).Get_expression().GetP(), localctx.(*DeclaracionContext).GetIsMut().GetMut(), (func() int {
			if localctx.(*DeclaracionContext).GetAsig() == nil {
				return 0
			} else {
				return localctx.(*DeclaracionContext).GetAsig().GetLine()
			}
		}()), localctx.(*DeclaracionContext).GetAsig().GetColumn())

	}

	return localctx
}

// IIs_mutContext is an interface to support dynamic dispatch.
type IIs_mutContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetMut returns the mut attribute.
	GetMut() bool

	// SetMut sets the mut attribute.
	SetMut(bool)

	// IsIs_mutContext differentiates from other interfaces.
	IsIs_mutContext()
}

type Is_mutContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	mut    bool
}

func NewEmptyIs_mutContext() *Is_mutContext {
	var p = new(Is_mutContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_is_mut
	return p
}

func (*Is_mutContext) IsIs_mutContext() {}

func NewIs_mutContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Is_mutContext {
	var p = new(Is_mutContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_is_mut

	return p
}

func (s *Is_mutContext) GetParser() antlr.Parser { return s.parser }

func (s *Is_mutContext) GetMut() bool { return s.mut }

func (s *Is_mutContext) SetMut(v bool) { s.mut = v }

func (s *Is_mutContext) MUT() antlr.TerminalNode {
	return s.GetToken(RustParMUT, 0)
}

func (s *Is_mutContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Is_mutContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Is_mutContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterIs_mut(s)
	}
}

func (s *Is_mutContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitIs_mut(s)
	}
}

func (p *RustPar) Is_mut() (localctx IIs_mutContext) {
	this := p
	_ = this

	localctx = NewIs_mutContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, RustParRULE_is_mut)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(156)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParMUT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(153)
			p.Match(RustParMUT)
		}
		localctx.(*Is_mutContext).mut = true

	case RustParID:
		p.EnterOuterAlt(localctx, 2)

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IArray_typeContext is an interface to support dynamic dispatch.
type IArray_typeContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_CORIZQ returns the _CORIZQ token.
	Get_CORIZQ() antlr.Token

	// Set_CORIZQ sets the _CORIZQ token.
	Set_CORIZQ(antlr.Token)

	// Get_array_type returns the _array_type rule contexts.
	Get_array_type() IArray_typeContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_tipos_var returns the _tipos_var rule contexts.
	Get_tipos_var() ITipos_varContext

	// Set_array_type sets the _array_type rule contexts.
	Set_array_type(IArray_typeContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_tipos_var sets the _tipos_var rule contexts.
	Set_tipos_var(ITipos_varContext)

	// GetTy returns the ty attribute.
	GetTy() *arrayList.List

	// SetTy sets the ty attribute.
	SetTy(*arrayList.List)

	// IsArray_typeContext differentiates from other interfaces.
	IsArray_typeContext()
}

type Array_typeContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	ty          *arrayList.List
	_CORIZQ     antlr.Token
	_array_type IArray_typeContext
	_expression IExpressionContext
	_tipos_var  ITipos_varContext
}

func NewEmptyArray_typeContext() *Array_typeContext {
	var p = new(Array_typeContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_array_type
	return p
}

func (*Array_typeContext) IsArray_typeContext() {}

func NewArray_typeContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Array_typeContext {
	var p = new(Array_typeContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_array_type

	return p
}

func (s *Array_typeContext) GetParser() antlr.Parser { return s.parser }

func (s *Array_typeContext) Get_CORIZQ() antlr.Token { return s._CORIZQ }

func (s *Array_typeContext) Set_CORIZQ(v antlr.Token) { s._CORIZQ = v }

func (s *Array_typeContext) Get_array_type() IArray_typeContext { return s._array_type }

func (s *Array_typeContext) Get_expression() IExpressionContext { return s._expression }

func (s *Array_typeContext) Get_tipos_var() ITipos_varContext { return s._tipos_var }

func (s *Array_typeContext) Set_array_type(v IArray_typeContext) { s._array_type = v }

func (s *Array_typeContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Array_typeContext) Set_tipos_var(v ITipos_varContext) { s._tipos_var = v }

func (s *Array_typeContext) GetTy() *arrayList.List { return s.ty }

func (s *Array_typeContext) SetTy(v *arrayList.List) { s.ty = v }

func (s *Array_typeContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(RustParCORIZQ, 0)
}

func (s *Array_typeContext) Array_type() IArray_typeContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArray_typeContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArray_typeContext)
}

func (s *Array_typeContext) PTCOMA() antlr.TerminalNode {
	return s.GetToken(RustParPTCOMA, 0)
}

func (s *Array_typeContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Array_typeContext) CORDER() antlr.TerminalNode {
	return s.GetToken(RustParCORDER, 0)
}

func (s *Array_typeContext) Tipos_var() ITipos_varContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipos_varContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipos_varContext)
}

func (s *Array_typeContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Array_typeContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Array_typeContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterArray_type(s)
	}
}

func (s *Array_typeContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitArray_type(s)
	}
}

func (p *RustPar) Array_type() (localctx IArray_typeContext) {
	this := p
	_ = this

	localctx = NewArray_typeContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, RustParRULE_array_type)

	localctx.(*Array_typeContext).ty = arrayList.New()

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(172)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 6, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(158)

			var _m = p.Match(RustParCORIZQ)

			localctx.(*Array_typeContext)._CORIZQ = _m
		}
		{
			p.SetState(159)

			var _x = p.Array_type()

			localctx.(*Array_typeContext)._array_type = _x
		}
		{
			p.SetState(160)
			p.Match(RustParPTCOMA)
		}
		{
			p.SetState(161)

			var _x = p.Expression()

			localctx.(*Array_typeContext)._expression = _x
		}
		{
			p.SetState(162)
			p.Match(RustParCORDER)
		}

		nType := interfaces.NewArrayType(interfaces.ARRAY, localctx.(*Array_typeContext).Get_expression().GetP(), (func() int {
			if localctx.(*Array_typeContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*Array_typeContext).Get_CORIZQ().GetLine()
			}
		}()), (func() int {
			if localctx.(*Array_typeContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*Array_typeContext).Get_CORIZQ().GetColumn()
			}
		}()))
		localctx.(*Array_typeContext).Get_array_type().GetTy().Add(nType)
		localctx.(*Array_typeContext).ty = localctx.(*Array_typeContext).Get_array_type().GetTy()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(165)

			var _m = p.Match(RustParCORIZQ)

			localctx.(*Array_typeContext)._CORIZQ = _m
		}
		{
			p.SetState(166)

			var _x = p.Tipos_var()

			localctx.(*Array_typeContext)._tipos_var = _x
		}
		{
			p.SetState(167)
			p.Match(RustParPTCOMA)
		}
		{
			p.SetState(168)

			var _x = p.Expression()

			localctx.(*Array_typeContext)._expression = _x
		}
		{
			p.SetState(169)
			p.Match(RustParCORDER)
		}

		nType := interfaces.NewArrayType(localctx.(*Array_typeContext).Get_tipos_var().GetTipo(), localctx.(*Array_typeContext).Get_expression().GetP(), (func() int {
			if localctx.(*Array_typeContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*Array_typeContext).Get_CORIZQ().GetLine()
			}
		}()), (func() int {
			if localctx.(*Array_typeContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*Array_typeContext).Get_CORIZQ().GetColumn()
			}
		}()))
		localctx.(*Array_typeContext).ty.Add(nType)

	}

	return localctx
}

// IAsignacionContext is an interface to support dynamic dispatch.
type IAsignacionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetId returns the id token.
	GetId() antlr.Token

	// SetId sets the id token.
	SetId(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsAsignacionContext differentiates from other interfaces.
	IsAsignacionContext()
}

type AsignacionContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruction
	id          antlr.Token
	_expression IExpressionContext
}

func NewEmptyAsignacionContext() *AsignacionContext {
	var p = new(AsignacionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_asignacion
	return p
}

func (*AsignacionContext) IsAsignacionContext() {}

func NewAsignacionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AsignacionContext {
	var p = new(AsignacionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_asignacion

	return p
}

func (s *AsignacionContext) GetParser() antlr.Parser { return s.parser }

func (s *AsignacionContext) GetId() antlr.Token { return s.id }

func (s *AsignacionContext) SetId(v antlr.Token) { s.id = v }

func (s *AsignacionContext) Get_expression() IExpressionContext { return s._expression }

func (s *AsignacionContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *AsignacionContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *AsignacionContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *AsignacionContext) ASIGNACION() antlr.TerminalNode {
	return s.GetToken(RustParASIGNACION, 0)
}

func (s *AsignacionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AsignacionContext) ID() antlr.TerminalNode {
	return s.GetToken(RustParID, 0)
}

func (s *AsignacionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AsignacionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AsignacionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterAsignacion(s)
	}
}

func (s *AsignacionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitAsignacion(s)
	}
}

func (p *RustPar) Asignacion() (localctx IAsignacionContext) {
	this := p
	_ = this

	localctx = NewAsignacionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, RustParRULE_asignacion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(174)

		var _m = p.Match(RustParID)

		localctx.(*AsignacionContext).id = _m
	}
	{
		p.SetState(175)
		p.Match(RustParASIGNACION)
	}
	{
		p.SetState(176)

		var _x = p.Expression()

		localctx.(*AsignacionContext)._expression = _x
	}
	localctx.(*AsignacionContext).instr = instruction.NewAssignment((func() string {
		if localctx.(*AsignacionContext).GetId() == nil {
			return ""
		} else {
			return localctx.(*AsignacionContext).GetId().GetText()
		}
	}()), localctx.(*AsignacionContext).Get_expression().GetP(), (func() int {
		if localctx.(*AsignacionContext).GetId() == nil {
			return 0
		} else {
			return localctx.(*AsignacionContext).GetId().GetLine()
		}
	}()), localctx.(*AsignacionContext).GetId().GetColumn())

	return localctx
}

// IIf_sentContext is an interface to support dynamic dispatch.
type IIf_sentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_bloque_inst returns the _bloque_inst rule contexts.
	Get_bloque_inst() IBloque_instContext

	// GetBprin returns the bprin rule contexts.
	GetBprin() IBloque_instContext

	// GetBelse returns the belse rule contexts.
	GetBelse() IBloque_instContext

	// Get_list_elseif returns the _list_elseif rule contexts.
	Get_list_elseif() IList_elseifContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_bloque_inst sets the _bloque_inst rule contexts.
	Set_bloque_inst(IBloque_instContext)

	// SetBprin sets the bprin rule contexts.
	SetBprin(IBloque_instContext)

	// SetBelse sets the belse rule contexts.
	SetBelse(IBloque_instContext)

	// Set_list_elseif sets the _list_elseif rule contexts.
	Set_list_elseif(IList_elseifContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsIf_sentContext differentiates from other interfaces.
	IsIf_sentContext()
}

type If_sentContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	instr        interfaces.Instruction
	_IF          antlr.Token
	_expression  IExpressionContext
	_bloque_inst IBloque_instContext
	bprin        IBloque_instContext
	belse        IBloque_instContext
	_list_elseif IList_elseifContext
}

func NewEmptyIf_sentContext() *If_sentContext {
	var p = new(If_sentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_if_sent
	return p
}

func (*If_sentContext) IsIf_sentContext() {}

func NewIf_sentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *If_sentContext {
	var p = new(If_sentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_if_sent

	return p
}

func (s *If_sentContext) GetParser() antlr.Parser { return s.parser }

func (s *If_sentContext) Get_IF() antlr.Token { return s._IF }

func (s *If_sentContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *If_sentContext) Get_expression() IExpressionContext { return s._expression }

func (s *If_sentContext) Get_bloque_inst() IBloque_instContext { return s._bloque_inst }

func (s *If_sentContext) GetBprin() IBloque_instContext { return s.bprin }

func (s *If_sentContext) GetBelse() IBloque_instContext { return s.belse }

func (s *If_sentContext) Get_list_elseif() IList_elseifContext { return s._list_elseif }

func (s *If_sentContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *If_sentContext) Set_bloque_inst(v IBloque_instContext) { s._bloque_inst = v }

func (s *If_sentContext) SetBprin(v IBloque_instContext) { s.bprin = v }

func (s *If_sentContext) SetBelse(v IBloque_instContext) { s.belse = v }

func (s *If_sentContext) Set_list_elseif(v IList_elseifContext) { s._list_elseif = v }

func (s *If_sentContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *If_sentContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *If_sentContext) IF() antlr.TerminalNode {
	return s.GetToken(RustParIF, 0)
}

func (s *If_sentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *If_sentContext) AllBloque_inst() []IBloque_instContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IBloque_instContext)(nil)).Elem())
	var tst = make([]IBloque_instContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IBloque_instContext)
		}
	}

	return tst
}

func (s *If_sentContext) Bloque_inst(i int) IBloque_instContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_instContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IBloque_instContext)
}

func (s *If_sentContext) ELSE() antlr.TerminalNode {
	return s.GetToken(RustParELSE, 0)
}

func (s *If_sentContext) List_elseif() IList_elseifContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IList_elseifContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IList_elseifContext)
}

func (s *If_sentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *If_sentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *If_sentContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterIf_sent(s)
	}
}

func (s *If_sentContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitIf_sent(s)
	}
}

func (p *RustPar) If_sent() (localctx IIf_sentContext) {
	this := p
	_ = this

	localctx = NewIf_sentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, RustParRULE_if_sent)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(199)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(179)

			var _m = p.Match(RustParIF)

			localctx.(*If_sentContext)._IF = _m
		}
		{
			p.SetState(180)

			var _x = p.Expression()

			localctx.(*If_sentContext)._expression = _x
		}
		{
			p.SetState(181)

			var _x = p.Bloque_inst()

			localctx.(*If_sentContext)._bloque_inst = _x
		}
		localctx.(*If_sentContext).instr = instruction.NewIf(localctx.(*If_sentContext).Get_expression().GetP(), localctx.(*If_sentContext).Get_bloque_inst().GetL(), nil, nil, (func() int {
			if localctx.(*If_sentContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*If_sentContext).Get_IF().GetLine()
			}
		}()), localctx.(*If_sentContext).Get_IF().GetColumn())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(184)

			var _m = p.Match(RustParIF)

			localctx.(*If_sentContext)._IF = _m
		}
		{
			p.SetState(185)

			var _x = p.Expression()

			localctx.(*If_sentContext)._expression = _x
		}
		{
			p.SetState(186)

			var _x = p.Bloque_inst()

			localctx.(*If_sentContext).bprin = _x
		}
		{
			p.SetState(187)
			p.Match(RustParELSE)
		}
		{
			p.SetState(188)

			var _x = p.Bloque_inst()

			localctx.(*If_sentContext).belse = _x
		}
		localctx.(*If_sentContext).instr = instruction.NewIf(localctx.(*If_sentContext).Get_expression().GetP(), localctx.(*If_sentContext).GetBprin().GetL(), nil, localctx.(*If_sentContext).GetBelse().GetL(), (func() int {
			if localctx.(*If_sentContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*If_sentContext).Get_IF().GetLine()
			}
		}()), localctx.(*If_sentContext).Get_IF().GetColumn())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(191)

			var _m = p.Match(RustParIF)

			localctx.(*If_sentContext)._IF = _m
		}
		{
			p.SetState(192)

			var _x = p.Expression()

			localctx.(*If_sentContext)._expression = _x
		}
		{
			p.SetState(193)

			var _x = p.Bloque_inst()

			localctx.(*If_sentContext).bprin = _x
		}
		{
			p.SetState(194)

			var _x = p.List_elseif()

			localctx.(*If_sentContext)._list_elseif = _x
		}
		{
			p.SetState(195)
			p.Match(RustParELSE)
		}
		{
			p.SetState(196)

			var _x = p.Bloque_inst()

			localctx.(*If_sentContext).belse = _x
		}

		localctx.(*If_sentContext).instr = instruction.NewIf(localctx.(*If_sentContext).Get_expression().GetP(), localctx.(*If_sentContext).GetBprin().GetL(), localctx.(*If_sentContext).Get_list_elseif().GetLista(), localctx.(*If_sentContext).GetBelse().GetL(), (func() int {
			if localctx.(*If_sentContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*If_sentContext).Get_IF().GetLine()
			}
		}()), localctx.(*If_sentContext).Get_IF().GetColumn())

	}

	return localctx
}

// IIf_expContext is an interface to support dynamic dispatch.
type IIf_expContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_IF returns the _IF token.
	Get_IF() antlr.Token

	// Set_IF sets the _IF token.
	Set_IF(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetBprin_e returns the bprin_e rule contexts.
	GetBprin_e() IBloque_expContext

	// GetBelse_e returns the belse_e rule contexts.
	GetBelse_e() IBloque_expContext

	// Get_list_elseif_exp returns the _list_elseif_exp rule contexts.
	Get_list_elseif_exp() IList_elseif_expContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetBprin_e sets the bprin_e rule contexts.
	SetBprin_e(IBloque_expContext)

	// SetBelse_e sets the belse_e rule contexts.
	SetBelse_e(IBloque_expContext)

	// Set_list_elseif_exp sets the _list_elseif_exp rule contexts.
	Set_list_elseif_exp(IList_elseif_expContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsIf_expContext differentiates from other interfaces.
	IsIf_expContext()
}

type If_expContext struct {
	*antlr.BaseParserRuleContext
	parser           antlr.Parser
	p                interfaces.Expresion
	_IF              antlr.Token
	_expression      IExpressionContext
	bprin_e          IBloque_expContext
	belse_e          IBloque_expContext
	_list_elseif_exp IList_elseif_expContext
}

func NewEmptyIf_expContext() *If_expContext {
	var p = new(If_expContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_if_exp
	return p
}

func (*If_expContext) IsIf_expContext() {}

func NewIf_expContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *If_expContext {
	var p = new(If_expContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_if_exp

	return p
}

func (s *If_expContext) GetParser() antlr.Parser { return s.parser }

func (s *If_expContext) Get_IF() antlr.Token { return s._IF }

func (s *If_expContext) Set_IF(v antlr.Token) { s._IF = v }

func (s *If_expContext) Get_expression() IExpressionContext { return s._expression }

func (s *If_expContext) GetBprin_e() IBloque_expContext { return s.bprin_e }

func (s *If_expContext) GetBelse_e() IBloque_expContext { return s.belse_e }

func (s *If_expContext) Get_list_elseif_exp() IList_elseif_expContext { return s._list_elseif_exp }

func (s *If_expContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *If_expContext) SetBprin_e(v IBloque_expContext) { s.bprin_e = v }

func (s *If_expContext) SetBelse_e(v IBloque_expContext) { s.belse_e = v }

func (s *If_expContext) Set_list_elseif_exp(v IList_elseif_expContext) { s._list_elseif_exp = v }

func (s *If_expContext) GetP() interfaces.Expresion { return s.p }

func (s *If_expContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *If_expContext) IF() antlr.TerminalNode {
	return s.GetToken(RustParIF, 0)
}

func (s *If_expContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *If_expContext) ELSE() antlr.TerminalNode {
	return s.GetToken(RustParELSE, 0)
}

func (s *If_expContext) AllBloque_exp() []IBloque_expContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IBloque_expContext)(nil)).Elem())
	var tst = make([]IBloque_expContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IBloque_expContext)
		}
	}

	return tst
}

func (s *If_expContext) Bloque_exp(i int) IBloque_expContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_expContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IBloque_expContext)
}

func (s *If_expContext) List_elseif_exp() IList_elseif_expContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IList_elseif_expContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IList_elseif_expContext)
}

func (s *If_expContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *If_expContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *If_expContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterIf_exp(s)
	}
}

func (s *If_expContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitIf_exp(s)
	}
}

func (p *RustPar) If_exp() (localctx IIf_expContext) {
	this := p
	_ = this

	localctx = NewIf_expContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, RustParRULE_if_exp)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(216)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(201)

			var _m = p.Match(RustParIF)

			localctx.(*If_expContext)._IF = _m
		}
		{
			p.SetState(202)

			var _x = p.Expression()

			localctx.(*If_expContext)._expression = _x
		}
		{
			p.SetState(203)

			var _x = p.Bloque_exp()

			localctx.(*If_expContext).bprin_e = _x
		}
		{
			p.SetState(204)
			p.Match(RustParELSE)
		}
		{
			p.SetState(205)

			var _x = p.Bloque_exp()

			localctx.(*If_expContext).belse_e = _x
		}
		localctx.(*If_expContext).p = instruction.NewIfExpre(localctx.(*If_expContext).Get_expression().GetP(), nil, nil, nil, (func() int {
			if localctx.(*If_expContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*If_expContext).Get_IF().GetLine()
			}
		}()), localctx.(*If_expContext).Get_IF().GetColumn(), true, localctx.(*If_expContext).GetBprin_e().GetP(), nil, localctx.(*If_expContext).GetBelse_e().GetP())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(208)

			var _m = p.Match(RustParIF)

			localctx.(*If_expContext)._IF = _m
		}
		{
			p.SetState(209)

			var _x = p.Expression()

			localctx.(*If_expContext)._expression = _x
		}
		{
			p.SetState(210)

			var _x = p.Bloque_exp()

			localctx.(*If_expContext).bprin_e = _x
		}
		{
			p.SetState(211)

			var _x = p.List_elseif_exp()

			localctx.(*If_expContext)._list_elseif_exp = _x
		}
		{
			p.SetState(212)
			p.Match(RustParELSE)
		}
		{
			p.SetState(213)

			var _x = p.Bloque_exp()

			localctx.(*If_expContext).belse_e = _x
		}

		localctx.(*If_expContext).p = instruction.NewIfExpre(localctx.(*If_expContext).Get_expression().GetP(), nil, nil, nil, (func() int {
			if localctx.(*If_expContext).Get_IF() == nil {
				return 0
			} else {
				return localctx.(*If_expContext).Get_IF().GetLine()
			}
		}()), localctx.(*If_expContext).Get_IF().GetColumn(), true, localctx.(*If_expContext).GetBprin_e().GetP(), localctx.(*If_expContext).Get_list_elseif_exp().GetLista(), localctx.(*If_expContext).GetBelse_e().GetP())

	}

	return localctx
}

// IList_elseifContext is an interface to support dynamic dispatch.
type IList_elseifContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_else_if returns the _else_if rule contexts.
	Get_else_if() IElse_ifContext

	// Set_else_if sets the _else_if rule contexts.
	Set_else_if(IElse_ifContext)

	// GetList returns the list rule context list.
	GetList() []IElse_ifContext

	// SetList sets the list rule context list.
	SetList([]IElse_ifContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsList_elseifContext differentiates from other interfaces.
	IsList_elseifContext()
}

type List_elseifContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	lista    *arrayList.List
	_else_if IElse_ifContext
	list     []IElse_ifContext
}

func NewEmptyList_elseifContext() *List_elseifContext {
	var p = new(List_elseifContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_list_elseif
	return p
}

func (*List_elseifContext) IsList_elseifContext() {}

func NewList_elseifContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *List_elseifContext {
	var p = new(List_elseifContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_list_elseif

	return p
}

func (s *List_elseifContext) GetParser() antlr.Parser { return s.parser }

func (s *List_elseifContext) Get_else_if() IElse_ifContext { return s._else_if }

func (s *List_elseifContext) Set_else_if(v IElse_ifContext) { s._else_if = v }

func (s *List_elseifContext) GetList() []IElse_ifContext { return s.list }

func (s *List_elseifContext) SetList(v []IElse_ifContext) { s.list = v }

func (s *List_elseifContext) GetLista() *arrayList.List { return s.lista }

func (s *List_elseifContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *List_elseifContext) AllElse_if() []IElse_ifContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IElse_ifContext)(nil)).Elem())
	var tst = make([]IElse_ifContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IElse_ifContext)
		}
	}

	return tst
}

func (s *List_elseifContext) Else_if(i int) IElse_ifContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IElse_ifContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IElse_ifContext)
}

func (s *List_elseifContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *List_elseifContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *List_elseifContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterList_elseif(s)
	}
}

func (s *List_elseifContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitList_elseif(s)
	}
}

func (p *RustPar) List_elseif() (localctx IList_elseifContext) {
	this := p
	_ = this

	localctx = NewList_elseifContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 24, RustParRULE_list_elseif)
	localctx.(*List_elseifContext).lista = arrayList.New()

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(219)
	p.GetErrorHandler().Sync(p)
	_alt = 1
	for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		switch _alt {
		case 1:
			{
				p.SetState(218)

				var _x = p.Else_if()

				localctx.(*List_elseifContext)._else_if = _x
			}
			localctx.(*List_elseifContext).list = append(localctx.(*List_elseifContext).list, localctx.(*List_elseifContext)._else_if)

		default:
			panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		}

		p.SetState(221)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 9, p.GetParserRuleContext())
	}

	listInt := localctx.(*List_elseifContext).GetList()
	for _, e := range listInt {
		localctx.(*List_elseifContext).lista.Add(e.GetInstr())
	}

	return localctx
}

// IList_elseif_expContext is an interface to support dynamic dispatch.
type IList_elseif_expContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_else_if_exp returns the _else_if_exp rule contexts.
	Get_else_if_exp() IElse_if_expContext

	// Set_else_if_exp sets the _else_if_exp rule contexts.
	Set_else_if_exp(IElse_if_expContext)

	// GetList returns the list rule context list.
	GetList() []IElse_if_expContext

	// SetList sets the list rule context list.
	SetList([]IElse_if_expContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsList_elseif_expContext differentiates from other interfaces.
	IsList_elseif_expContext()
}

type List_elseif_expContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	lista        *arrayList.List
	_else_if_exp IElse_if_expContext
	list         []IElse_if_expContext
}

func NewEmptyList_elseif_expContext() *List_elseif_expContext {
	var p = new(List_elseif_expContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_list_elseif_exp
	return p
}

func (*List_elseif_expContext) IsList_elseif_expContext() {}

func NewList_elseif_expContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *List_elseif_expContext {
	var p = new(List_elseif_expContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_list_elseif_exp

	return p
}

func (s *List_elseif_expContext) GetParser() antlr.Parser { return s.parser }

func (s *List_elseif_expContext) Get_else_if_exp() IElse_if_expContext { return s._else_if_exp }

func (s *List_elseif_expContext) Set_else_if_exp(v IElse_if_expContext) { s._else_if_exp = v }

func (s *List_elseif_expContext) GetList() []IElse_if_expContext { return s.list }

func (s *List_elseif_expContext) SetList(v []IElse_if_expContext) { s.list = v }

func (s *List_elseif_expContext) GetLista() *arrayList.List { return s.lista }

func (s *List_elseif_expContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *List_elseif_expContext) AllElse_if_exp() []IElse_if_expContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IElse_if_expContext)(nil)).Elem())
	var tst = make([]IElse_if_expContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IElse_if_expContext)
		}
	}

	return tst
}

func (s *List_elseif_expContext) Else_if_exp(i int) IElse_if_expContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IElse_if_expContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IElse_if_expContext)
}

func (s *List_elseif_expContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *List_elseif_expContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *List_elseif_expContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterList_elseif_exp(s)
	}
}

func (s *List_elseif_expContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitList_elseif_exp(s)
	}
}

func (p *RustPar) List_elseif_exp() (localctx IList_elseif_expContext) {
	this := p
	_ = this

	localctx = NewList_elseif_expContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 26, RustParRULE_list_elseif_exp)
	localctx.(*List_elseif_expContext).lista = arrayList.New()

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(226)
	p.GetErrorHandler().Sync(p)
	_alt = 1
	for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		switch _alt {
		case 1:
			{
				p.SetState(225)

				var _x = p.Else_if_exp()

				localctx.(*List_elseif_expContext)._else_if_exp = _x
			}
			localctx.(*List_elseif_expContext).list = append(localctx.(*List_elseif_expContext).list, localctx.(*List_elseif_expContext)._else_if_exp)

		default:
			panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		}

		p.SetState(228)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext())
	}

	listInt := localctx.(*List_elseif_expContext).GetList()
	for _, e := range listInt {
		localctx.(*List_elseif_expContext).lista.Add(e.GetP())
	}

	return localctx
}

// IElse_ifContext is an interface to support dynamic dispatch.
type IElse_ifContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ELSE returns the _ELSE token.
	Get_ELSE() antlr.Token

	// Set_ELSE sets the _ELSE token.
	Set_ELSE(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_bloque_inst returns the _bloque_inst rule contexts.
	Get_bloque_inst() IBloque_instContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_bloque_inst sets the _bloque_inst rule contexts.
	Set_bloque_inst(IBloque_instContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsElse_ifContext differentiates from other interfaces.
	IsElse_ifContext()
}

type Else_ifContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	instr        interfaces.Instruction
	_ELSE        antlr.Token
	_expression  IExpressionContext
	_bloque_inst IBloque_instContext
}

func NewEmptyElse_ifContext() *Else_ifContext {
	var p = new(Else_ifContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_else_if
	return p
}

func (*Else_ifContext) IsElse_ifContext() {}

func NewElse_ifContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Else_ifContext {
	var p = new(Else_ifContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_else_if

	return p
}

func (s *Else_ifContext) GetParser() antlr.Parser { return s.parser }

func (s *Else_ifContext) Get_ELSE() antlr.Token { return s._ELSE }

func (s *Else_ifContext) Set_ELSE(v antlr.Token) { s._ELSE = v }

func (s *Else_ifContext) Get_expression() IExpressionContext { return s._expression }

func (s *Else_ifContext) Get_bloque_inst() IBloque_instContext { return s._bloque_inst }

func (s *Else_ifContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Else_ifContext) Set_bloque_inst(v IBloque_instContext) { s._bloque_inst = v }

func (s *Else_ifContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *Else_ifContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *Else_ifContext) ELSE() antlr.TerminalNode {
	return s.GetToken(RustParELSE, 0)
}

func (s *Else_ifContext) IF() antlr.TerminalNode {
	return s.GetToken(RustParIF, 0)
}

func (s *Else_ifContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Else_ifContext) Bloque_inst() IBloque_instContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_instContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloque_instContext)
}

func (s *Else_ifContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Else_ifContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Else_ifContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterElse_if(s)
	}
}

func (s *Else_ifContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitElse_if(s)
	}
}

func (p *RustPar) Else_if() (localctx IElse_ifContext) {
	this := p
	_ = this

	localctx = NewElse_ifContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 28, RustParRULE_else_if)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(232)

		var _m = p.Match(RustParELSE)

		localctx.(*Else_ifContext)._ELSE = _m
	}
	{
		p.SetState(233)
		p.Match(RustParIF)
	}
	{
		p.SetState(234)

		var _x = p.Expression()

		localctx.(*Else_ifContext)._expression = _x
	}
	{
		p.SetState(235)

		var _x = p.Bloque_inst()

		localctx.(*Else_ifContext)._bloque_inst = _x
	}
	localctx.(*Else_ifContext).instr = instruction.NewIf(localctx.(*Else_ifContext).Get_expression().GetP(), localctx.(*Else_ifContext).Get_bloque_inst().GetL(), nil, nil, (func() int {
		if localctx.(*Else_ifContext).Get_ELSE() == nil {
			return 0
		} else {
			return localctx.(*Else_ifContext).Get_ELSE().GetLine()
		}
	}()), localctx.(*Else_ifContext).Get_ELSE().GetColumn())

	return localctx
}

// IElse_if_expContext is an interface to support dynamic dispatch.
type IElse_if_expContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ELSE returns the _ELSE token.
	Get_ELSE() antlr.Token

	// Set_ELSE sets the _ELSE token.
	Set_ELSE(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_bloque_exp returns the _bloque_exp rule contexts.
	Get_bloque_exp() IBloque_expContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_bloque_exp sets the _bloque_exp rule contexts.
	Set_bloque_exp(IBloque_expContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsElse_if_expContext differentiates from other interfaces.
	IsElse_if_expContext()
}

type Else_if_expContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	_ELSE       antlr.Token
	_expression IExpressionContext
	_bloque_exp IBloque_expContext
}

func NewEmptyElse_if_expContext() *Else_if_expContext {
	var p = new(Else_if_expContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_else_if_exp
	return p
}

func (*Else_if_expContext) IsElse_if_expContext() {}

func NewElse_if_expContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Else_if_expContext {
	var p = new(Else_if_expContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_else_if_exp

	return p
}

func (s *Else_if_expContext) GetParser() antlr.Parser { return s.parser }

func (s *Else_if_expContext) Get_ELSE() antlr.Token { return s._ELSE }

func (s *Else_if_expContext) Set_ELSE(v antlr.Token) { s._ELSE = v }

func (s *Else_if_expContext) Get_expression() IExpressionContext { return s._expression }

func (s *Else_if_expContext) Get_bloque_exp() IBloque_expContext { return s._bloque_exp }

func (s *Else_if_expContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Else_if_expContext) Set_bloque_exp(v IBloque_expContext) { s._bloque_exp = v }

func (s *Else_if_expContext) GetP() interfaces.Expresion { return s.p }

func (s *Else_if_expContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *Else_if_expContext) ELSE() antlr.TerminalNode {
	return s.GetToken(RustParELSE, 0)
}

func (s *Else_if_expContext) IF() antlr.TerminalNode {
	return s.GetToken(RustParIF, 0)
}

func (s *Else_if_expContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Else_if_expContext) Bloque_exp() IBloque_expContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_expContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloque_expContext)
}

func (s *Else_if_expContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Else_if_expContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Else_if_expContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterElse_if_exp(s)
	}
}

func (s *Else_if_expContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitElse_if_exp(s)
	}
}

func (p *RustPar) Else_if_exp() (localctx IElse_if_expContext) {
	this := p
	_ = this

	localctx = NewElse_if_expContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, RustParRULE_else_if_exp)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(238)

		var _m = p.Match(RustParELSE)

		localctx.(*Else_if_expContext)._ELSE = _m
	}
	{
		p.SetState(239)
		p.Match(RustParIF)
	}
	{
		p.SetState(240)

		var _x = p.Expression()

		localctx.(*Else_if_expContext)._expression = _x
	}
	{
		p.SetState(241)

		var _x = p.Bloque_exp()

		localctx.(*Else_if_expContext)._bloque_exp = _x
	}
	localctx.(*Else_if_expContext).p = instruction.NewIfExpre(localctx.(*Else_if_expContext).Get_expression().GetP(), nil, nil, nil, (func() int {
		if localctx.(*Else_if_expContext).Get_ELSE() == nil {
			return 0
		} else {
			return localctx.(*Else_if_expContext).Get_ELSE().GetLine()
		}
	}()), localctx.(*Else_if_expContext).Get_ELSE().GetColumn(), true, localctx.(*Else_if_expContext).Get_bloque_exp().GetP(), nil, nil)

	return localctx
}

// IMatch_sentContext is an interface to support dynamic dispatch.
type IMatch_sentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_MATCH returns the _MATCH token.
	Get_MATCH() antlr.Token

	// GetTh returns the th token.
	GetTh() antlr.Token

	// Set_MATCH sets the _MATCH token.
	Set_MATCH(antlr.Token)

	// SetTh sets the th token.
	SetTh(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetBrazos returns the brazos rule contexts.
	GetBrazos() IMatch_brazosContext

	// Get_bloque_inst returns the _bloque_inst rule contexts.
	Get_bloque_inst() IBloque_instContext

	// Get_instruccion_only returns the _instruccion_only rule contexts.
	Get_instruccion_only() IInstruccion_onlyContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetBrazos sets the brazos rule contexts.
	SetBrazos(IMatch_brazosContext)

	// Set_bloque_inst sets the _bloque_inst rule contexts.
	Set_bloque_inst(IBloque_instContext)

	// Set_instruccion_only sets the _instruccion_only rule contexts.
	Set_instruccion_only(IInstruccion_onlyContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsMatch_sentContext differentiates from other interfaces.
	IsMatch_sentContext()
}

type Match_sentContext struct {
	*antlr.BaseParserRuleContext
	parser            antlr.Parser
	instr             interfaces.Instruction
	_MATCH            antlr.Token
	_expression       IExpressionContext
	brazos            IMatch_brazosContext
	th                antlr.Token
	_bloque_inst      IBloque_instContext
	_instruccion_only IInstruccion_onlyContext
}

func NewEmptyMatch_sentContext() *Match_sentContext {
	var p = new(Match_sentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_match_sent
	return p
}

func (*Match_sentContext) IsMatch_sentContext() {}

func NewMatch_sentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Match_sentContext {
	var p = new(Match_sentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_match_sent

	return p
}

func (s *Match_sentContext) GetParser() antlr.Parser { return s.parser }

func (s *Match_sentContext) Get_MATCH() antlr.Token { return s._MATCH }

func (s *Match_sentContext) GetTh() antlr.Token { return s.th }

func (s *Match_sentContext) Set_MATCH(v antlr.Token) { s._MATCH = v }

func (s *Match_sentContext) SetTh(v antlr.Token) { s.th = v }

func (s *Match_sentContext) Get_expression() IExpressionContext { return s._expression }

func (s *Match_sentContext) GetBrazos() IMatch_brazosContext { return s.brazos }

func (s *Match_sentContext) Get_bloque_inst() IBloque_instContext { return s._bloque_inst }

func (s *Match_sentContext) Get_instruccion_only() IInstruccion_onlyContext {
	return s._instruccion_only
}

func (s *Match_sentContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Match_sentContext) SetBrazos(v IMatch_brazosContext) { s.brazos = v }

func (s *Match_sentContext) Set_bloque_inst(v IBloque_instContext) { s._bloque_inst = v }

func (s *Match_sentContext) Set_instruccion_only(v IInstruccion_onlyContext) { s._instruccion_only = v }

func (s *Match_sentContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *Match_sentContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *Match_sentContext) MATCH() antlr.TerminalNode {
	return s.GetToken(RustParMATCH, 0)
}

func (s *Match_sentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Match_sentContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(RustParLLAVEIZQ, 0)
}

func (s *Match_sentContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(RustParLLAVEDER, 0)
}

func (s *Match_sentContext) Match_brazos() IMatch_brazosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatch_brazosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatch_brazosContext)
}

func (s *Match_sentContext) GUIONB() antlr.TerminalNode {
	return s.GetToken(RustParGUIONB, 0)
}

func (s *Match_sentContext) Bloque_inst() IBloque_instContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_instContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloque_instContext)
}

func (s *Match_sentContext) COMA() antlr.TerminalNode {
	return s.GetToken(RustParCOMA, 0)
}

func (s *Match_sentContext) MTHEN() antlr.TerminalNode {
	return s.GetToken(RustParMTHEN, 0)
}

func (s *Match_sentContext) Instruccion_only() IInstruccion_onlyContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccion_onlyContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccion_onlyContext)
}

func (s *Match_sentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Match_sentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Match_sentContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterMatch_sent(s)
	}
}

func (s *Match_sentContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitMatch_sent(s)
	}
}

func (p *RustPar) Match_sent() (localctx IMatch_sentContext) {
	this := p
	_ = this

	localctx = NewMatch_sentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 32, RustParRULE_match_sent)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(273)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 11, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(244)

			var _m = p.Match(RustParMATCH)

			localctx.(*Match_sentContext)._MATCH = _m
		}
		{
			p.SetState(245)

			var _x = p.Expression()

			localctx.(*Match_sentContext)._expression = _x
		}
		{
			p.SetState(246)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(247)

			var _x = p.match_brazos(0)

			localctx.(*Match_sentContext).brazos = _x
		}
		{
			p.SetState(248)
			p.Match(RustParLLAVEDER)
		}

		localctx.(*Match_sentContext).instr = instructionExpre.NewMatch(localctx.(*Match_sentContext).Get_expression().GetP(), localctx.(*Match_sentContext).GetBrazos().GetL_brazos(), nil, nil, (func() int {
			if localctx.(*Match_sentContext).Get_MATCH() == nil {
				return 0
			} else {
				return localctx.(*Match_sentContext).Get_MATCH().GetLine()
			}
		}()), localctx.(*Match_sentContext).Get_MATCH().GetColumn())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(251)

			var _m = p.Match(RustParMATCH)

			localctx.(*Match_sentContext)._MATCH = _m
		}
		{
			p.SetState(252)

			var _x = p.Expression()

			localctx.(*Match_sentContext)._expression = _x
		}
		{
			p.SetState(253)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(254)

			var _x = p.match_brazos(0)

			localctx.(*Match_sentContext).brazos = _x
		}
		{
			p.SetState(255)
			p.Match(RustParGUIONB)
		}
		{
			p.SetState(256)

			var _m = p.Match(RustParMTHEN)

			localctx.(*Match_sentContext).th = _m
		}
		{
			p.SetState(257)

			var _x = p.Bloque_inst()

			localctx.(*Match_sentContext)._bloque_inst = _x
		}
		{
			p.SetState(258)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(259)
			p.Match(RustParLLAVEDER)
		}

		localctx.(*Match_sentContext).instr = instructionExpre.NewMatch(localctx.(*Match_sentContext).Get_expression().GetP(), localctx.(*Match_sentContext).GetBrazos().GetL_brazos(), localctx.(*Match_sentContext).Get_bloque_inst().GetL(), nil, (func() int {
			if localctx.(*Match_sentContext).Get_MATCH() == nil {
				return 0
			} else {
				return localctx.(*Match_sentContext).Get_MATCH().GetLine()
			}
		}()), localctx.(*Match_sentContext).Get_MATCH().GetColumn())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(262)

			var _m = p.Match(RustParMATCH)

			localctx.(*Match_sentContext)._MATCH = _m
		}
		{
			p.SetState(263)

			var _x = p.Expression()

			localctx.(*Match_sentContext)._expression = _x
		}
		{
			p.SetState(264)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(265)

			var _x = p.match_brazos(0)

			localctx.(*Match_sentContext).brazos = _x
		}
		{
			p.SetState(266)
			p.Match(RustParGUIONB)
		}
		{
			p.SetState(267)

			var _m = p.Match(RustParMTHEN)

			localctx.(*Match_sentContext).th = _m
		}
		{
			p.SetState(268)

			var _x = p.Instruccion_only()

			localctx.(*Match_sentContext)._instruccion_only = _x
		}
		{
			p.SetState(269)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(270)
			p.Match(RustParLLAVEDER)
		}

		localctx.(*Match_sentContext).instr = instructionExpre.NewMatch(localctx.(*Match_sentContext).Get_expression().GetP(), localctx.(*Match_sentContext).GetBrazos().GetL_brazos(), nil, localctx.(*Match_sentContext).Get_instruccion_only().GetInstr(), (func() int {
			if localctx.(*Match_sentContext).Get_MATCH() == nil {
				return 0
			} else {
				return localctx.(*Match_sentContext).Get_MATCH().GetLine()
			}
		}()), localctx.(*Match_sentContext).Get_MATCH().GetColumn())

	}

	return localctx
}

// IMatch_brazosContext is an interface to support dynamic dispatch.
type IMatch_brazosContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetListb returns the listb rule contexts.
	GetListb() IMatch_brazosContext

	// Get_matchbrazo returns the _matchbrazo rule contexts.
	Get_matchbrazo() IMatchbrazoContext

	// SetListb sets the listb rule contexts.
	SetListb(IMatch_brazosContext)

	// Set_matchbrazo sets the _matchbrazo rule contexts.
	Set_matchbrazo(IMatchbrazoContext)

	// GetL_brazos returns the l_brazos attribute.
	GetL_brazos() *arrayList.List

	// SetL_brazos sets the l_brazos attribute.
	SetL_brazos(*arrayList.List)

	// IsMatch_brazosContext differentiates from other interfaces.
	IsMatch_brazosContext()
}

type Match_brazosContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	l_brazos    *arrayList.List
	listb       IMatch_brazosContext
	_matchbrazo IMatchbrazoContext
}

func NewEmptyMatch_brazosContext() *Match_brazosContext {
	var p = new(Match_brazosContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_match_brazos
	return p
}

func (*Match_brazosContext) IsMatch_brazosContext() {}

func NewMatch_brazosContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Match_brazosContext {
	var p = new(Match_brazosContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_match_brazos

	return p
}

func (s *Match_brazosContext) GetParser() antlr.Parser { return s.parser }

func (s *Match_brazosContext) GetListb() IMatch_brazosContext { return s.listb }

func (s *Match_brazosContext) Get_matchbrazo() IMatchbrazoContext { return s._matchbrazo }

func (s *Match_brazosContext) SetListb(v IMatch_brazosContext) { s.listb = v }

func (s *Match_brazosContext) Set_matchbrazo(v IMatchbrazoContext) { s._matchbrazo = v }

func (s *Match_brazosContext) GetL_brazos() *arrayList.List { return s.l_brazos }

func (s *Match_brazosContext) SetL_brazos(v *arrayList.List) { s.l_brazos = v }

func (s *Match_brazosContext) Matchbrazo() IMatchbrazoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatchbrazoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatchbrazoContext)
}

func (s *Match_brazosContext) Match_brazos() IMatch_brazosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatch_brazosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatch_brazosContext)
}

func (s *Match_brazosContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Match_brazosContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Match_brazosContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterMatch_brazos(s)
	}
}

func (s *Match_brazosContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitMatch_brazos(s)
	}
}

func (p *RustPar) Match_brazos() (localctx IMatch_brazosContext) {
	return p.match_brazos(0)
}

func (p *RustPar) match_brazos(_p int) (localctx IMatch_brazosContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewMatch_brazosContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IMatch_brazosContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 34
	p.EnterRecursionRule(localctx, 34, RustParRULE_match_brazos, _p)

	localctx.(*Match_brazosContext).l_brazos = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(276)

		var _x = p.Matchbrazo()

		localctx.(*Match_brazosContext)._matchbrazo = _x
	}
	localctx.(*Match_brazosContext).l_brazos.Add(localctx.(*Match_brazosContext).Get_matchbrazo().GetBrazo())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(285)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewMatch_brazosContext(p, _parentctx, _parentState)
			localctx.(*Match_brazosContext).listb = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_match_brazos)
			p.SetState(279)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(280)

				var _x = p.Matchbrazo()

				localctx.(*Match_brazosContext)._matchbrazo = _x
			}

			localctx.(*Match_brazosContext).GetListb().GetL_brazos().Add(localctx.(*Match_brazosContext).Get_matchbrazo().GetBrazo())
			localctx.(*Match_brazosContext).l_brazos = localctx.(*Match_brazosContext).GetListb().GetL_brazos()

		}
		p.SetState(287)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())
	}

	return localctx
}

// IMatchbrazoContext is an interface to support dynamic dispatch.
type IMatchbrazoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetTh returns the th token.
	GetTh() antlr.Token

	// SetTh sets the th token.
	SetTh(antlr.Token)

	// Get_listaOpciones returns the _listaOpciones rule contexts.
	Get_listaOpciones() IListaOpcionesContext

	// Get_bloque_inst returns the _bloque_inst rule contexts.
	Get_bloque_inst() IBloque_instContext

	// Get_instruccion_only returns the _instruccion_only rule contexts.
	Get_instruccion_only() IInstruccion_onlyContext

	// Set_listaOpciones sets the _listaOpciones rule contexts.
	Set_listaOpciones(IListaOpcionesContext)

	// Set_bloque_inst sets the _bloque_inst rule contexts.
	Set_bloque_inst(IBloque_instContext)

	// Set_instruccion_only sets the _instruccion_only rule contexts.
	Set_instruccion_only(IInstruccion_onlyContext)

	// GetBrazo returns the brazo attribute.
	GetBrazo() instructionExpre.BrazoMatch

	// SetBrazo sets the brazo attribute.
	SetBrazo(instructionExpre.BrazoMatch)

	// IsMatchbrazoContext differentiates from other interfaces.
	IsMatchbrazoContext()
}

type MatchbrazoContext struct {
	*antlr.BaseParserRuleContext
	parser            antlr.Parser
	brazo             instructionExpre.BrazoMatch
	_listaOpciones    IListaOpcionesContext
	th                antlr.Token
	_bloque_inst      IBloque_instContext
	_instruccion_only IInstruccion_onlyContext
}

func NewEmptyMatchbrazoContext() *MatchbrazoContext {
	var p = new(MatchbrazoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_matchbrazo
	return p
}

func (*MatchbrazoContext) IsMatchbrazoContext() {}

func NewMatchbrazoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MatchbrazoContext {
	var p = new(MatchbrazoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_matchbrazo

	return p
}

func (s *MatchbrazoContext) GetParser() antlr.Parser { return s.parser }

func (s *MatchbrazoContext) GetTh() antlr.Token { return s.th }

func (s *MatchbrazoContext) SetTh(v antlr.Token) { s.th = v }

func (s *MatchbrazoContext) Get_listaOpciones() IListaOpcionesContext { return s._listaOpciones }

func (s *MatchbrazoContext) Get_bloque_inst() IBloque_instContext { return s._bloque_inst }

func (s *MatchbrazoContext) Get_instruccion_only() IInstruccion_onlyContext {
	return s._instruccion_only
}

func (s *MatchbrazoContext) Set_listaOpciones(v IListaOpcionesContext) { s._listaOpciones = v }

func (s *MatchbrazoContext) Set_bloque_inst(v IBloque_instContext) { s._bloque_inst = v }

func (s *MatchbrazoContext) Set_instruccion_only(v IInstruccion_onlyContext) { s._instruccion_only = v }

func (s *MatchbrazoContext) GetBrazo() instructionExpre.BrazoMatch { return s.brazo }

func (s *MatchbrazoContext) SetBrazo(v instructionExpre.BrazoMatch) { s.brazo = v }

func (s *MatchbrazoContext) ListaOpciones() IListaOpcionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaOpcionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaOpcionesContext)
}

func (s *MatchbrazoContext) Bloque_inst() IBloque_instContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_instContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloque_instContext)
}

func (s *MatchbrazoContext) COMA() antlr.TerminalNode {
	return s.GetToken(RustParCOMA, 0)
}

func (s *MatchbrazoContext) MTHEN() antlr.TerminalNode {
	return s.GetToken(RustParMTHEN, 0)
}

func (s *MatchbrazoContext) Instruccion_only() IInstruccion_onlyContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccion_onlyContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccion_onlyContext)
}

func (s *MatchbrazoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MatchbrazoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MatchbrazoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterMatchbrazo(s)
	}
}

func (s *MatchbrazoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitMatchbrazo(s)
	}
}

func (p *RustPar) Matchbrazo() (localctx IMatchbrazoContext) {
	this := p
	_ = this

	localctx = NewMatchbrazoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 36, RustParRULE_matchbrazo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(300)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 13, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(288)

			var _x = p.listaOpciones(0)

			localctx.(*MatchbrazoContext)._listaOpciones = _x
		}
		{
			p.SetState(289)

			var _m = p.Match(RustParMTHEN)

			localctx.(*MatchbrazoContext).th = _m
		}
		{
			p.SetState(290)

			var _x = p.Bloque_inst()

			localctx.(*MatchbrazoContext)._bloque_inst = _x
		}
		{
			p.SetState(291)
			p.Match(RustParCOMA)
		}
		localctx.(*MatchbrazoContext).brazo = instructionExpre.NewBrazoMatch(localctx.(*MatchbrazoContext).Get_listaOpciones().GetLisop(), localctx.(*MatchbrazoContext).Get_bloque_inst().GetL(), nil, (func() int {
			if localctx.(*MatchbrazoContext).GetTh() == nil {
				return 0
			} else {
				return localctx.(*MatchbrazoContext).GetTh().GetLine()
			}
		}()), localctx.(*MatchbrazoContext).GetTh().GetColumn())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(294)

			var _x = p.listaOpciones(0)

			localctx.(*MatchbrazoContext)._listaOpciones = _x
		}
		{
			p.SetState(295)

			var _m = p.Match(RustParMTHEN)

			localctx.(*MatchbrazoContext).th = _m
		}
		{
			p.SetState(296)

			var _x = p.Instruccion_only()

			localctx.(*MatchbrazoContext)._instruccion_only = _x
		}
		{
			p.SetState(297)
			p.Match(RustParCOMA)
		}
		localctx.(*MatchbrazoContext).brazo = instructionExpre.NewBrazoMatch(localctx.(*MatchbrazoContext).Get_listaOpciones().GetLisop(), nil, localctx.(*MatchbrazoContext).Get_instruccion_only().GetInstr(), (func() int {
			if localctx.(*MatchbrazoContext).GetTh() == nil {
				return 0
			} else {
				return localctx.(*MatchbrazoContext).GetTh().GetLine()
			}
		}()), localctx.(*MatchbrazoContext).GetTh().GetColumn())

	}

	return localctx
}

// IListaOpcionesContext is an interface to support dynamic dispatch.
type IListaOpcionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetList returns the list rule contexts.
	GetList() IListaOpcionesContext

	// Get_primitivo returns the _primitivo rule contexts.
	Get_primitivo() IPrimitivoContext

	// SetList sets the list rule contexts.
	SetList(IListaOpcionesContext)

	// Set_primitivo sets the _primitivo rule contexts.
	Set_primitivo(IPrimitivoContext)

	// GetLisop returns the lisop attribute.
	GetLisop() *arrayList.List

	// SetLisop sets the lisop attribute.
	SetLisop(*arrayList.List)

	// IsListaOpcionesContext differentiates from other interfaces.
	IsListaOpcionesContext()
}

type ListaOpcionesContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	lisop      *arrayList.List
	list       IListaOpcionesContext
	_primitivo IPrimitivoContext
}

func NewEmptyListaOpcionesContext() *ListaOpcionesContext {
	var p = new(ListaOpcionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_listaOpciones
	return p
}

func (*ListaOpcionesContext) IsListaOpcionesContext() {}

func NewListaOpcionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaOpcionesContext {
	var p = new(ListaOpcionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_listaOpciones

	return p
}

func (s *ListaOpcionesContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaOpcionesContext) GetList() IListaOpcionesContext { return s.list }

func (s *ListaOpcionesContext) Get_primitivo() IPrimitivoContext { return s._primitivo }

func (s *ListaOpcionesContext) SetList(v IListaOpcionesContext) { s.list = v }

func (s *ListaOpcionesContext) Set_primitivo(v IPrimitivoContext) { s._primitivo = v }

func (s *ListaOpcionesContext) GetLisop() *arrayList.List { return s.lisop }

func (s *ListaOpcionesContext) SetLisop(v *arrayList.List) { s.lisop = v }

func (s *ListaOpcionesContext) Primitivo() IPrimitivoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrimitivoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrimitivoContext)
}

func (s *ListaOpcionesContext) MTOR() antlr.TerminalNode {
	return s.GetToken(RustParMTOR, 0)
}

func (s *ListaOpcionesContext) ListaOpciones() IListaOpcionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaOpcionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaOpcionesContext)
}

func (s *ListaOpcionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaOpcionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaOpcionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterListaOpciones(s)
	}
}

func (s *ListaOpcionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitListaOpciones(s)
	}
}

func (p *RustPar) ListaOpciones() (localctx IListaOpcionesContext) {
	return p.listaOpciones(0)
}

func (p *RustPar) listaOpciones(_p int) (localctx IListaOpcionesContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListaOpcionesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListaOpcionesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 38
	p.EnterRecursionRule(localctx, 38, RustParRULE_listaOpciones, _p)

	localctx.(*ListaOpcionesContext).lisop = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(303)

		var _x = p.Primitivo()

		localctx.(*ListaOpcionesContext)._primitivo = _x
	}

	localctx.(*ListaOpcionesContext).lisop.Add(localctx.(*ListaOpcionesContext).Get_primitivo().GetP())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(313)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListaOpcionesContext(p, _parentctx, _parentState)
			localctx.(*ListaOpcionesContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_listaOpciones)
			p.SetState(306)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(307)
				p.Match(RustParMTOR)
			}
			{
				p.SetState(308)

				var _x = p.Primitivo()

				localctx.(*ListaOpcionesContext)._primitivo = _x
			}

			localctx.(*ListaOpcionesContext).GetList().GetLisop().Add(localctx.(*ListaOpcionesContext).Get_primitivo().GetP())
			localctx.(*ListaOpcionesContext).lisop = localctx.(*ListaOpcionesContext).GetList().GetLisop()

		}
		p.SetState(315)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext())
	}

	return localctx
}

// IBloque_instContext is an interface to support dynamic dispatch.
type IBloque_instContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// GetL returns the l attribute.
	GetL() *arrayList.List

	// SetL sets the l attribute.
	SetL(*arrayList.List)

	// IsBloque_instContext differentiates from other interfaces.
	IsBloque_instContext()
}

type Bloque_instContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	l              *arrayList.List
	_instrucciones IInstruccionesContext
}

func NewEmptyBloque_instContext() *Bloque_instContext {
	var p = new(Bloque_instContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_bloque_inst
	return p
}

func (*Bloque_instContext) IsBloque_instContext() {}

func NewBloque_instContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Bloque_instContext {
	var p = new(Bloque_instContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_bloque_inst

	return p
}

func (s *Bloque_instContext) GetParser() antlr.Parser { return s.parser }

func (s *Bloque_instContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *Bloque_instContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *Bloque_instContext) GetL() *arrayList.List { return s.l }

func (s *Bloque_instContext) SetL(v *arrayList.List) { s.l = v }

func (s *Bloque_instContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(RustParLLAVEIZQ, 0)
}

func (s *Bloque_instContext) Instrucciones() IInstruccionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccionesContext)
}

func (s *Bloque_instContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(RustParLLAVEDER, 0)
}

func (s *Bloque_instContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Bloque_instContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Bloque_instContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterBloque_inst(s)
	}
}

func (s *Bloque_instContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitBloque_inst(s)
	}
}

func (p *RustPar) Bloque_inst() (localctx IBloque_instContext) {
	this := p
	_ = this

	localctx = NewBloque_instContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 40, RustParRULE_bloque_inst)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(324)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 15, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(316)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(317)

			var _x = p.Instrucciones()

			localctx.(*Bloque_instContext)._instrucciones = _x
		}
		{
			p.SetState(318)
			p.Match(RustParLLAVEDER)
		}
		localctx.(*Bloque_instContext).l = localctx.(*Bloque_instContext).Get_instrucciones().GetL()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(321)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(322)
			p.Match(RustParLLAVEDER)
		}
		localctx.(*Bloque_instContext).l = arrayList.New()

	}

	return localctx
}

// IBloque_expContext is an interface to support dynamic dispatch.
type IBloque_expContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsBloque_expContext differentiates from other interfaces.
	IsBloque_expContext()
}

type Bloque_expContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	_expression IExpressionContext
}

func NewEmptyBloque_expContext() *Bloque_expContext {
	var p = new(Bloque_expContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_bloque_exp
	return p
}

func (*Bloque_expContext) IsBloque_expContext() {}

func NewBloque_expContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Bloque_expContext {
	var p = new(Bloque_expContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_bloque_exp

	return p
}

func (s *Bloque_expContext) GetParser() antlr.Parser { return s.parser }

func (s *Bloque_expContext) Get_expression() IExpressionContext { return s._expression }

func (s *Bloque_expContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Bloque_expContext) GetP() interfaces.Expresion { return s.p }

func (s *Bloque_expContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *Bloque_expContext) LLAVEIZQ() antlr.TerminalNode {
	return s.GetToken(RustParLLAVEIZQ, 0)
}

func (s *Bloque_expContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Bloque_expContext) LLAVEDER() antlr.TerminalNode {
	return s.GetToken(RustParLLAVEDER, 0)
}

func (s *Bloque_expContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Bloque_expContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Bloque_expContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterBloque_exp(s)
	}
}

func (s *Bloque_expContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitBloque_exp(s)
	}
}

func (p *RustPar) Bloque_exp() (localctx IBloque_expContext) {
	this := p
	_ = this

	localctx = NewBloque_expContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 42, RustParRULE_bloque_exp)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(326)
		p.Match(RustParLLAVEIZQ)
	}
	{
		p.SetState(327)

		var _x = p.Expression()

		localctx.(*Bloque_expContext)._expression = _x
	}
	{
		p.SetState(328)
		p.Match(RustParLLAVEDER)
	}
	localctx.(*Bloque_expContext).p = localctx.(*Bloque_expContext).Get_expression().GetP()

	return localctx
}

// ITipos_varContext is an interface to support dynamic dispatch.
type ITipos_varContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetTipo returns the tipo attribute.
	GetTipo() interfaces.TipoExpresion

	// SetTipo sets the tipo attribute.
	SetTipo(interfaces.TipoExpresion)

	// IsTipos_varContext differentiates from other interfaces.
	IsTipos_varContext()
}

type Tipos_varContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	tipo   interfaces.TipoExpresion
}

func NewEmptyTipos_varContext() *Tipos_varContext {
	var p = new(Tipos_varContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_tipos_var
	return p
}

func (*Tipos_varContext) IsTipos_varContext() {}

func NewTipos_varContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Tipos_varContext {
	var p = new(Tipos_varContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_tipos_var

	return p
}

func (s *Tipos_varContext) GetParser() antlr.Parser { return s.parser }

func (s *Tipos_varContext) GetTipo() interfaces.TipoExpresion { return s.tipo }

func (s *Tipos_varContext) SetTipo(v interfaces.TipoExpresion) { s.tipo = v }

func (s *Tipos_varContext) T_NUMBER() antlr.TerminalNode {
	return s.GetToken(RustParT_NUMBER, 0)
}

func (s *Tipos_varContext) T_STRING() antlr.TerminalNode {
	return s.GetToken(RustParT_STRING, 0)
}

func (s *Tipos_varContext) T_FLOAT() antlr.TerminalNode {
	return s.GetToken(RustParT_FLOAT, 0)
}

func (s *Tipos_varContext) T_BOOL() antlr.TerminalNode {
	return s.GetToken(RustParT_BOOL, 0)
}

func (s *Tipos_varContext) T_STR() antlr.TerminalNode {
	return s.GetToken(RustParT_STR, 0)
}

func (s *Tipos_varContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Tipos_varContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Tipos_varContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterTipos_var(s)
	}
}

func (s *Tipos_varContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitTipos_var(s)
	}
}

func (p *RustPar) Tipos_var() (localctx ITipos_varContext) {
	this := p
	_ = this

	localctx = NewTipos_varContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 44, RustParRULE_tipos_var)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(341)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParT_NUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(331)
			p.Match(RustParT_NUMBER)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.INTEGER

	case RustParT_STRING:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(333)
			p.Match(RustParT_STRING)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.STRING

	case RustParT_FLOAT:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(335)
			p.Match(RustParT_FLOAT)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.FLOAT

	case RustParT_BOOL:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(337)
			p.Match(RustParT_BOOL)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.BOOLEAN

	case RustParT_STR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(339)
			p.Match(RustParT_STR)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.STR

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expr_arit returns the _expr_arit rule contexts.
	Get_expr_arit() IExpr_aritContext

	// Set_expr_arit sets the _expr_arit rule contexts.
	Set_expr_arit(IExpr_aritContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	p          interfaces.Expresion
	_expr_arit IExpr_aritContext
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) Get_expr_arit() IExpr_aritContext { return s._expr_arit }

func (s *ExpressionContext) Set_expr_arit(v IExpr_aritContext) { s._expr_arit = v }

func (s *ExpressionContext) GetP() interfaces.Expresion { return s.p }

func (s *ExpressionContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *ExpressionContext) Expr_arit() IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (p *RustPar) Expression() (localctx IExpressionContext) {
	this := p
	_ = this

	localctx = NewExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 46, RustParRULE_expression)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(343)

		var _x = p.expr_arit(0)

		localctx.(*ExpressionContext)._expr_arit = _x
	}
	localctx.(*ExpressionContext).p = localctx.(*ExpressionContext).Get_expr_arit().GetP()

	return localctx
}

// IExpr_aritContext is an interface to support dynamic dispatch.
type IExpr_aritContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetOp returns the op token.
	GetOp() antlr.Token

	// Get_CORIZQ returns the _CORIZQ token.
	Get_CORIZQ() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// Set_CORIZQ sets the _CORIZQ token.
	Set_CORIZQ(antlr.Token)

	// GetOpIz returns the opIz rule contexts.
	GetOpIz() IExpr_aritContext

	// GetOpU returns the opU rule contexts.
	GetOpU() IExpr_aritContext

	// GetOpDe returns the opDe rule contexts.
	GetOpDe() IExpr_aritContext

	// Get_listParams returns the _listParams rule contexts.
	Get_listParams() IListParamsContext

	// Get_primitivo returns the _primitivo rule contexts.
	Get_primitivo() IPrimitivoContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_casteo returns the _casteo rule contexts.
	Get_casteo() ICasteoContext

	// Get_if_exp returns the _if_exp rule contexts.
	Get_if_exp() IIf_expContext

	// SetOpIz sets the opIz rule contexts.
	SetOpIz(IExpr_aritContext)

	// SetOpU sets the opU rule contexts.
	SetOpU(IExpr_aritContext)

	// SetOpDe sets the opDe rule contexts.
	SetOpDe(IExpr_aritContext)

	// Set_listParams sets the _listParams rule contexts.
	Set_listParams(IListParamsContext)

	// Set_primitivo sets the _primitivo rule contexts.
	Set_primitivo(IPrimitivoContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_casteo sets the _casteo rule contexts.
	Set_casteo(ICasteoContext)

	// Set_if_exp sets the _if_exp rule contexts.
	Set_if_exp(IIf_expContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsExpr_aritContext differentiates from other interfaces.
	IsExpr_aritContext()
}

type Expr_aritContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	opIz        IExpr_aritContext
	op          antlr.Token
	opU         IExpr_aritContext
	opDe        IExpr_aritContext
	_CORIZQ     antlr.Token
	_listParams IListParamsContext
	_primitivo  IPrimitivoContext
	_expression IExpressionContext
	_casteo     ICasteoContext
	_if_exp     IIf_expContext
}

func NewEmptyExpr_aritContext() *Expr_aritContext {
	var p = new(Expr_aritContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_expr_arit
	return p
}

func (*Expr_aritContext) IsExpr_aritContext() {}

func NewExpr_aritContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Expr_aritContext {
	var p = new(Expr_aritContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_expr_arit

	return p
}

func (s *Expr_aritContext) GetParser() antlr.Parser { return s.parser }

func (s *Expr_aritContext) GetOp() antlr.Token { return s.op }

func (s *Expr_aritContext) Get_CORIZQ() antlr.Token { return s._CORIZQ }

func (s *Expr_aritContext) SetOp(v antlr.Token) { s.op = v }

func (s *Expr_aritContext) Set_CORIZQ(v antlr.Token) { s._CORIZQ = v }

func (s *Expr_aritContext) GetOpIz() IExpr_aritContext { return s.opIz }

func (s *Expr_aritContext) GetOpU() IExpr_aritContext { return s.opU }

func (s *Expr_aritContext) GetOpDe() IExpr_aritContext { return s.opDe }

func (s *Expr_aritContext) Get_listParams() IListParamsContext { return s._listParams }

func (s *Expr_aritContext) Get_primitivo() IPrimitivoContext { return s._primitivo }

func (s *Expr_aritContext) Get_expression() IExpressionContext { return s._expression }

func (s *Expr_aritContext) Get_casteo() ICasteoContext { return s._casteo }

func (s *Expr_aritContext) Get_if_exp() IIf_expContext { return s._if_exp }

func (s *Expr_aritContext) SetOpIz(v IExpr_aritContext) { s.opIz = v }

func (s *Expr_aritContext) SetOpU(v IExpr_aritContext) { s.opU = v }

func (s *Expr_aritContext) SetOpDe(v IExpr_aritContext) { s.opDe = v }

func (s *Expr_aritContext) Set_listParams(v IListParamsContext) { s._listParams = v }

func (s *Expr_aritContext) Set_primitivo(v IPrimitivoContext) { s._primitivo = v }

func (s *Expr_aritContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Expr_aritContext) Set_casteo(v ICasteoContext) { s._casteo = v }

func (s *Expr_aritContext) Set_if_exp(v IIf_expContext) { s._if_exp = v }

func (s *Expr_aritContext) GetP() interfaces.Expresion { return s.p }

func (s *Expr_aritContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *Expr_aritContext) SUB() antlr.TerminalNode {
	return s.GetToken(RustParSUB, 0)
}

func (s *Expr_aritContext) AllExpr_arit() []IExpr_aritContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem())
	var tst = make([]IExpr_aritContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpr_aritContext)
		}
	}

	return tst
}

func (s *Expr_aritContext) Expr_arit(i int) IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *Expr_aritContext) T_NUMBER() antlr.TerminalNode {
	return s.GetToken(RustParT_NUMBER, 0)
}

func (s *Expr_aritContext) DOSPUNTO() antlr.TerminalNode {
	return s.GetToken(RustParDOSPUNTO, 0)
}

func (s *Expr_aritContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *Expr_aritContext) COMA() antlr.TerminalNode {
	return s.GetToken(RustParCOMA, 0)
}

func (s *Expr_aritContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *Expr_aritContext) POW() antlr.TerminalNode {
	return s.GetToken(RustParPOW, 0)
}

func (s *Expr_aritContext) T_FLOAT() antlr.TerminalNode {
	return s.GetToken(RustParT_FLOAT, 0)
}

func (s *Expr_aritContext) POWF() antlr.TerminalNode {
	return s.GetToken(RustParPOWF, 0)
}

func (s *Expr_aritContext) NOT() antlr.TerminalNode {
	return s.GetToken(RustParNOT, 0)
}

func (s *Expr_aritContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(RustParCORIZQ, 0)
}

func (s *Expr_aritContext) ListParams() IListParamsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListParamsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListParamsContext)
}

func (s *Expr_aritContext) CORDER() antlr.TerminalNode {
	return s.GetToken(RustParCORDER, 0)
}

func (s *Expr_aritContext) Primitivo() IPrimitivoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrimitivoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrimitivoContext)
}

func (s *Expr_aritContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Expr_aritContext) Casteo() ICasteoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICasteoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ICasteoContext)
}

func (s *Expr_aritContext) If_exp() IIf_expContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IIf_expContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IIf_expContext)
}

func (s *Expr_aritContext) MUL() antlr.TerminalNode {
	return s.GetToken(RustParMUL, 0)
}

func (s *Expr_aritContext) DIV() antlr.TerminalNode {
	return s.GetToken(RustParDIV, 0)
}

func (s *Expr_aritContext) MOD() antlr.TerminalNode {
	return s.GetToken(RustParMOD, 0)
}

func (s *Expr_aritContext) ADD() antlr.TerminalNode {
	return s.GetToken(RustParADD, 0)
}

func (s *Expr_aritContext) MENOR() antlr.TerminalNode {
	return s.GetToken(RustParMENOR, 0)
}

func (s *Expr_aritContext) MENORIGUAL() antlr.TerminalNode {
	return s.GetToken(RustParMENORIGUAL, 0)
}

func (s *Expr_aritContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(RustParMAYOR, 0)
}

func (s *Expr_aritContext) MAYORIGUAL() antlr.TerminalNode {
	return s.GetToken(RustParMAYORIGUAL, 0)
}

func (s *Expr_aritContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(RustParIGUAL, 0)
}

func (s *Expr_aritContext) DISTINTO() antlr.TerminalNode {
	return s.GetToken(RustParDISTINTO, 0)
}

func (s *Expr_aritContext) AND() antlr.TerminalNode {
	return s.GetToken(RustParAND, 0)
}

func (s *Expr_aritContext) OR() antlr.TerminalNode {
	return s.GetToken(RustParOR, 0)
}

func (s *Expr_aritContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Expr_aritContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Expr_aritContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterExpr_arit(s)
	}
}

func (s *Expr_aritContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitExpr_arit(s)
	}
}

func (p *RustPar) Expr_arit() (localctx IExpr_aritContext) {
	return p.expr_arit(0)
}

func (p *RustPar) expr_arit(_p int) (localctx IExpr_aritContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpr_aritContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpr_aritContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 48
	p.EnterRecursionRule(localctx, 48, RustParRULE_expr_arit, _p)
	var _la int

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(394)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(347)

			var _m = p.Match(RustParSUB)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(348)

			var _x = p.expr_arit(14)

			localctx.(*Expr_aritContext).opU = _x
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpU().GetP(), "-", nil, true, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 2:
		{
			p.SetState(351)
			p.Match(RustParT_NUMBER)
		}
		{
			p.SetState(352)
			p.Match(RustParDOSPUNTO)
		}
		{
			p.SetState(353)

			var _m = p.Match(RustParPOW)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(354)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(355)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
		}
		{
			p.SetState(356)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(357)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
		}
		{
			p.SetState(358)
			p.Match(RustParPARDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetText()
			}
		}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 3:
		{
			p.SetState(361)
			p.Match(RustParT_FLOAT)
		}
		{
			p.SetState(362)
			p.Match(RustParDOSPUNTO)
		}
		{
			p.SetState(363)

			var _m = p.Match(RustParPOWF)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(364)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(365)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
		}
		{
			p.SetState(366)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(367)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
		}
		{
			p.SetState(368)
			p.Match(RustParPARDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return ""
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetText()
			}
		}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 4:
		{
			p.SetState(371)

			var _m = p.Match(RustParNOT)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(372)

			var _x = p.expr_arit(8)

			localctx.(*Expr_aritContext).opU = _x
		}
		localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpU().GetP(), "!", nil, true, (func() int {
			if localctx.(*Expr_aritContext).GetOp() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).GetOp().GetLine()
			}
		}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

	case 5:
		{
			p.SetState(375)

			var _m = p.Match(RustParCORIZQ)

			localctx.(*Expr_aritContext)._CORIZQ = _m
		}
		{
			p.SetState(376)

			var _x = p.listParams(0)

			localctx.(*Expr_aritContext)._listParams = _x
		}
		{
			p.SetState(377)
			p.Match(RustParCORDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewArray(localctx.(*Expr_aritContext).Get_listParams().GetL_e(), (func() int {
			if localctx.(*Expr_aritContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).Get_CORIZQ().GetLine()
			}
		}()), (func() int {
			if localctx.(*Expr_aritContext).Get_CORIZQ() == nil {
				return 0
			} else {
				return localctx.(*Expr_aritContext).Get_CORIZQ().GetColumn()
			}
		}()))

	case 6:
		{
			p.SetState(380)

			var _x = p.Primitivo()

			localctx.(*Expr_aritContext)._primitivo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_primitivo().GetP()

	case 7:
		{
			p.SetState(383)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(384)

			var _x = p.Expression()

			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(385)
			p.Match(RustParPARDER)
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_expression().GetP()

	case 8:
		{
			p.SetState(388)

			var _x = p.Casteo()

			localctx.(*Expr_aritContext)._casteo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_casteo().GetP()

	case 9:
		{
			p.SetState(391)

			var _x = p.If_exp()

			localctx.(*Expr_aritContext)._if_exp = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_if_exp().GetP()

	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(423)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 19, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(421)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(396)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
				}
				{
					p.SetState(397)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(RustParMUL-38))|(1<<(RustParDIV-38))|(1<<(RustParMOD-38)))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(398)

					var _x = p.expr_arit(12)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 2:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(401)

				if !(p.Precpred(p.GetParserRuleContext(), 10)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 10)", ""))
				}
				{
					p.SetState(402)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == RustParADD || _la == RustParSUB) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(403)

					var _x = p.expr_arit(11)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 3:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(406)

				if !(p.Precpred(p.GetParserRuleContext(), 9)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 9)", ""))
				}
				{
					p.SetState(407)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la-32)&-(0x1f+1)) == 0 && ((1<<uint((_la-32)))&((1<<(RustParDISTINTO-32))|(1<<(RustParIGUAL-32))|(1<<(RustParMAYORIGUAL-32))|(1<<(RustParMENORIGUAL-32))|(1<<(RustParMAYOR-32))|(1<<(RustParMENOR-32)))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(408)

					var _x = p.expr_arit(10)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 4:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(411)

				if !(p.Precpred(p.GetParserRuleContext(), 7)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 7)", ""))
				}
				{
					p.SetState(412)

					var _m = p.Match(RustParAND)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(413)

					var _x = p.expr_arit(8)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			case 5:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(416)

				if !(p.Precpred(p.GetParserRuleContext(), 6)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 6)", ""))
				}
				{
					p.SetState(417)

					var _m = p.Match(RustParOR)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(418)

					var _x = p.expr_arit(7)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).p = expresion.NewOperacion(localctx.(*Expr_aritContext).GetOpIz().GetP(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetP(), false, (func() int {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return 0
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetLine()
					}
				}()), localctx.(*Expr_aritContext).GetOp().GetColumn())

			}

		}
		p.SetState(425)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 19, p.GetParserRuleContext())
	}

	return localctx
}

// ICasteoContext is an interface to support dynamic dispatch.
type ICasteoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_PARIZQ returns the _PARIZQ token.
	Get_PARIZQ() antlr.Token

	// Set_PARIZQ sets the _PARIZQ token.
	Set_PARIZQ(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetTypec returns the typec rule contexts.
	GetTypec() ITipo_castContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetTypec sets the typec rule contexts.
	SetTypec(ITipo_castContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsCasteoContext differentiates from other interfaces.
	IsCasteoContext()
}

type CasteoContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	_PARIZQ     antlr.Token
	_expression IExpressionContext
	typec       ITipo_castContext
}

func NewEmptyCasteoContext() *CasteoContext {
	var p = new(CasteoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_casteo
	return p
}

func (*CasteoContext) IsCasteoContext() {}

func NewCasteoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CasteoContext {
	var p = new(CasteoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_casteo

	return p
}

func (s *CasteoContext) GetParser() antlr.Parser { return s.parser }

func (s *CasteoContext) Get_PARIZQ() antlr.Token { return s._PARIZQ }

func (s *CasteoContext) Set_PARIZQ(v antlr.Token) { s._PARIZQ = v }

func (s *CasteoContext) Get_expression() IExpressionContext { return s._expression }

func (s *CasteoContext) GetTypec() ITipo_castContext { return s.typec }

func (s *CasteoContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *CasteoContext) SetTypec(v ITipo_castContext) { s.typec = v }

func (s *CasteoContext) GetP() interfaces.Expresion { return s.p }

func (s *CasteoContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *CasteoContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *CasteoContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *CasteoContext) AS() antlr.TerminalNode {
	return s.GetToken(RustParAS, 0)
}

func (s *CasteoContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *CasteoContext) Tipo_cast() ITipo_castContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipo_castContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipo_castContext)
}

func (s *CasteoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CasteoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CasteoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterCasteo(s)
	}
}

func (s *CasteoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitCasteo(s)
	}
}

func (p *RustPar) Casteo() (localctx ICasteoContext) {
	this := p
	_ = this

	localctx = NewCasteoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 50, RustParRULE_casteo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(426)

		var _m = p.Match(RustParPARIZQ)

		localctx.(*CasteoContext)._PARIZQ = _m
	}
	{
		p.SetState(427)

		var _x = p.Expression()

		localctx.(*CasteoContext)._expression = _x
	}
	{
		p.SetState(428)
		p.Match(RustParAS)
	}
	{
		p.SetState(429)

		var _x = p.Tipo_cast()

		localctx.(*CasteoContext).typec = _x
	}
	{
		p.SetState(430)
		p.Match(RustParPARDER)
	}
	localctx.(*CasteoContext).p = expresion.NewCasteo(localctx.(*CasteoContext).Get_expression().GetP(), localctx.(*CasteoContext).GetTypec().GetTc(), (func() int {
		if localctx.(*CasteoContext).Get_PARIZQ() == nil {
			return 0
		} else {
			return localctx.(*CasteoContext).Get_PARIZQ().GetLine()
		}
	}()), localctx.(*CasteoContext).Get_PARIZQ().GetColumn())

	return localctx
}

// ITipo_castContext is an interface to support dynamic dispatch.
type ITipo_castContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetTc returns the tc attribute.
	GetTc() interfaces.TipoExpresion

	// SetTc sets the tc attribute.
	SetTc(interfaces.TipoExpresion)

	// IsTipo_castContext differentiates from other interfaces.
	IsTipo_castContext()
}

type Tipo_castContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	tc     interfaces.TipoExpresion
}

func NewEmptyTipo_castContext() *Tipo_castContext {
	var p = new(Tipo_castContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_tipo_cast
	return p
}

func (*Tipo_castContext) IsTipo_castContext() {}

func NewTipo_castContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Tipo_castContext {
	var p = new(Tipo_castContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_tipo_cast

	return p
}

func (s *Tipo_castContext) GetParser() antlr.Parser { return s.parser }

func (s *Tipo_castContext) GetTc() interfaces.TipoExpresion { return s.tc }

func (s *Tipo_castContext) SetTc(v interfaces.TipoExpresion) { s.tc = v }

func (s *Tipo_castContext) T_FLOAT() antlr.TerminalNode {
	return s.GetToken(RustParT_FLOAT, 0)
}

func (s *Tipo_castContext) T_NUMBER() antlr.TerminalNode {
	return s.GetToken(RustParT_NUMBER, 0)
}

func (s *Tipo_castContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Tipo_castContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Tipo_castContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterTipo_cast(s)
	}
}

func (s *Tipo_castContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitTipo_cast(s)
	}
}

func (p *RustPar) Tipo_cast() (localctx ITipo_castContext) {
	this := p
	_ = this

	localctx = NewTipo_castContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 52, RustParRULE_tipo_cast)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(437)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParT_FLOAT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(433)
			p.Match(RustParT_FLOAT)
		}
		localctx.(*Tipo_castContext).tc = interfaces.FLOAT

	case RustParT_NUMBER:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(435)
			p.Match(RustParT_NUMBER)
		}
		localctx.(*Tipo_castContext).tc = interfaces.INTEGER

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IPrimitivoContext is an interface to support dynamic dispatch.
type IPrimitivoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_FLOAT returns the _FLOAT token.
	Get_FLOAT() antlr.Token

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Get_TRUE returns the _TRUE token.
	Get_TRUE() antlr.Token

	// Get_FALSE returns the _FALSE token.
	Get_FALSE() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_FLOAT sets the _FLOAT token.
	Set_FLOAT(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Set_TRUE sets the _TRUE token.
	Set_TRUE(antlr.Token)

	// Set_FALSE sets the _FALSE token.
	Set_FALSE(antlr.Token)

	// Get_strings returns the _strings rule contexts.
	Get_strings() IStringsContext

	// Set_strings sets the _strings rule contexts.
	Set_strings(IStringsContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsPrimitivoContext differentiates from other interfaces.
	IsPrimitivoContext()
}

type PrimitivoContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	p        interfaces.Expresion
	_NUMBER  antlr.Token
	_FLOAT   antlr.Token
	_strings IStringsContext
	_ID      antlr.Token
	_TRUE    antlr.Token
	_FALSE   antlr.Token
}

func NewEmptyPrimitivoContext() *PrimitivoContext {
	var p = new(PrimitivoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_primitivo
	return p
}

func (*PrimitivoContext) IsPrimitivoContext() {}

func NewPrimitivoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrimitivoContext {
	var p = new(PrimitivoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_primitivo

	return p
}

func (s *PrimitivoContext) GetParser() antlr.Parser { return s.parser }

func (s *PrimitivoContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *PrimitivoContext) Get_FLOAT() antlr.Token { return s._FLOAT }

func (s *PrimitivoContext) Get_ID() antlr.Token { return s._ID }

func (s *PrimitivoContext) Get_TRUE() antlr.Token { return s._TRUE }

func (s *PrimitivoContext) Get_FALSE() antlr.Token { return s._FALSE }

func (s *PrimitivoContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *PrimitivoContext) Set_FLOAT(v antlr.Token) { s._FLOAT = v }

func (s *PrimitivoContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *PrimitivoContext) Set_TRUE(v antlr.Token) { s._TRUE = v }

func (s *PrimitivoContext) Set_FALSE(v antlr.Token) { s._FALSE = v }

func (s *PrimitivoContext) Get_strings() IStringsContext { return s._strings }

func (s *PrimitivoContext) Set_strings(v IStringsContext) { s._strings = v }

func (s *PrimitivoContext) GetP() interfaces.Expresion { return s.p }

func (s *PrimitivoContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *PrimitivoContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(RustParNUMBER, 0)
}

func (s *PrimitivoContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(RustParFLOAT, 0)
}

func (s *PrimitivoContext) Strings() IStringsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IStringsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IStringsContext)
}

func (s *PrimitivoContext) ID() antlr.TerminalNode {
	return s.GetToken(RustParID, 0)
}

func (s *PrimitivoContext) TRUE() antlr.TerminalNode {
	return s.GetToken(RustParTRUE, 0)
}

func (s *PrimitivoContext) FALSE() antlr.TerminalNode {
	return s.GetToken(RustParFALSE, 0)
}

func (s *PrimitivoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrimitivoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrimitivoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterPrimitivo(s)
	}
}

func (s *PrimitivoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitPrimitivo(s)
	}
}

func (p *RustPar) Primitivo() (localctx IPrimitivoContext) {
	this := p
	_ = this

	localctx = NewPrimitivoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 54, RustParRULE_primitivo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(452)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParNUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(439)

			var _m = p.Match(RustParNUMBER)

			localctx.(*PrimitivoContext)._NUMBER = _m
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(num, interfaces.INTEGER, (func() int {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_NUMBER().GetColumn())

	case RustParFLOAT:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(441)

			var _m = p.Match(RustParFLOAT)

			localctx.(*PrimitivoContext)._FLOAT = _m
		}

		num, err := strconv.ParseFloat((func() string {
			if localctx.(*PrimitivoContext).Get_FLOAT() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_FLOAT().GetText()
			}
		}()), 64)
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(num, interfaces.FLOAT, (func() int {
			if localctx.(*PrimitivoContext).Get_FLOAT() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_FLOAT().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_FLOAT().GetColumn())

	case RustParSTRING, RustParAMP:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(443)

			var _x = p.Strings()

			localctx.(*PrimitivoContext)._strings = _x
		}
		localctx.(*PrimitivoContext).p = localctx.(*PrimitivoContext).Get_strings().GetP()

	case RustParID:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(446)

			var _m = p.Match(RustParID)

			localctx.(*PrimitivoContext)._ID = _m
		}

		localctx.(*PrimitivoContext).p = expresion.NewIdentificador((func() string {
			if localctx.(*PrimitivoContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_ID().GetText()
			}
		}()), (func() int {
			if localctx.(*PrimitivoContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_ID().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_ID().GetColumn())

	case RustParTRUE:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(448)

			var _m = p.Match(RustParTRUE)

			localctx.(*PrimitivoContext)._TRUE = _m
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(true, interfaces.BOOLEAN, (func() int {
			if localctx.(*PrimitivoContext).Get_TRUE() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_TRUE().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())

	case RustParFALSE:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(450)

			var _m = p.Match(RustParFALSE)

			localctx.(*PrimitivoContext)._FALSE = _m
		}
		localctx.(*PrimitivoContext).p = expresion.NewPrimitivo(false, interfaces.BOOLEAN, (func() int {
			if localctx.(*PrimitivoContext).Get_FALSE() == nil {
				return 0
			} else {
				return localctx.(*PrimitivoContext).Get_FALSE().GetLine()
			}
		}()), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IStringsContext is an interface to support dynamic dispatch.
type IStringsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_STRING returns the _STRING token.
	Get_STRING() antlr.Token

	// Set_STRING sets the _STRING token.
	Set_STRING(antlr.Token)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsStringsContext differentiates from other interfaces.
	IsStringsContext()
}

type StringsContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	p       interfaces.Expresion
	_STRING antlr.Token
}

func NewEmptyStringsContext() *StringsContext {
	var p = new(StringsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_strings
	return p
}

func (*StringsContext) IsStringsContext() {}

func NewStringsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StringsContext {
	var p = new(StringsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_strings

	return p
}

func (s *StringsContext) GetParser() antlr.Parser { return s.parser }

func (s *StringsContext) Get_STRING() antlr.Token { return s._STRING }

func (s *StringsContext) Set_STRING(v antlr.Token) { s._STRING = v }

func (s *StringsContext) GetP() interfaces.Expresion { return s.p }

func (s *StringsContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *StringsContext) STRING() antlr.TerminalNode {
	return s.GetToken(RustParSTRING, 0)
}

func (s *StringsContext) AllAMP() []antlr.TerminalNode {
	return s.GetTokens(RustParAMP)
}

func (s *StringsContext) AMP(i int) antlr.TerminalNode {
	return s.GetToken(RustParAMP, i)
}

func (s *StringsContext) TO_STRING() antlr.TerminalNode {
	return s.GetToken(RustParTO_STRING, 0)
}

func (s *StringsContext) TO_OWNED() antlr.TerminalNode {
	return s.GetToken(RustParTO_OWNED, 0)
}

func (s *StringsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StringsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StringsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterStrings(s)
	}
}

func (s *StringsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitStrings(s)
	}
}

func (p *RustPar) Strings() (localctx IStringsContext) {
	this := p
	_ = this

	localctx = NewStringsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 56, RustParRULE_strings)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(469)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 24, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		p.SetState(455)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for ok := true; ok; ok = _la == RustParAMP {
			{
				p.SetState(454)
				p.Match(RustParAMP)
			}

			p.SetState(457)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(459)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}
		p.SetState(461)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 23, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(460)
				_la = p.GetTokenStream().LA(1)

				if !(_la == RustParTO_STRING || _la == RustParTO_OWNED) {
					p.GetErrorHandler().RecoverInline(p)
				} else {
					p.GetErrorHandler().ReportMatch(p)
					p.Consume()
				}
			}

		}

		str := (func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}()))-1]
		localctx.(*StringsContext).p = expresion.NewPrimitivo(str, interfaces.STR, (func() int {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*StringsContext).Get_STRING().GetLine()
			}
		}()), localctx.(*StringsContext).Get_STRING().GetColumn())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(464)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}
		{
			p.SetState(465)
			_la = p.GetTokenStream().LA(1)

			if !(_la == RustParTO_STRING || _la == RustParTO_OWNED) {
				p.GetErrorHandler().RecoverInline(p)
			} else {
				p.GetErrorHandler().ReportMatch(p)
				p.Consume()
			}
		}

		str := (func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}()))-1]
		localctx.(*StringsContext).p = expresion.NewPrimitivo(str, interfaces.STRING, (func() int {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*StringsContext).Get_STRING().GetLine()
			}
		}()), localctx.(*StringsContext).Get_STRING().GetColumn())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(467)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}

		str := (func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*StringsContext).Get_STRING().GetText()
			}
		}()))-1]
		localctx.(*StringsContext).p = expresion.NewPrimitivo(str, interfaces.STR, (func() int {
			if localctx.(*StringsContext).Get_STRING() == nil {
				return 0
			} else {
				return localctx.(*StringsContext).Get_STRING().GetLine()
			}
		}()), localctx.(*StringsContext).Get_STRING().GetColumn())

	}

	return localctx
}

func (p *RustPar) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 5:
		var t *ListParamsContext = nil
		if localctx != nil {
			t = localctx.(*ListParamsContext)
		}
		return p.ListParams_Sempred(t, predIndex)

	case 17:
		var t *Match_brazosContext = nil
		if localctx != nil {
			t = localctx.(*Match_brazosContext)
		}
		return p.Match_brazos_Sempred(t, predIndex)

	case 19:
		var t *ListaOpcionesContext = nil
		if localctx != nil {
			t = localctx.(*ListaOpcionesContext)
		}
		return p.ListaOpciones_Sempred(t, predIndex)

	case 24:
		var t *Expr_aritContext = nil
		if localctx != nil {
			t = localctx.(*Expr_aritContext)
		}
		return p.Expr_arit_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *RustPar) ListParams_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) Match_brazos_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 1:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) ListaOpciones_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 2:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) Expr_arit_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 3:
		return p.Precpred(p.GetParserRuleContext(), 11)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 10)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 9)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 7)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 6)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
