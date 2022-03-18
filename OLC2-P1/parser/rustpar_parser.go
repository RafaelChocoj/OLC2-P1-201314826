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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 60, 627,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4,
	29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33, 4, 34,
	9, 34, 4, 35, 9, 35, 4, 36, 9, 36, 4, 37, 9, 37, 4, 38, 9, 38, 4, 39, 9,
	39, 3, 2, 3, 2, 3, 2, 3, 3, 7, 3, 83, 10, 3, 12, 3, 14, 3, 86, 11, 3, 3,
	3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 7, 4, 98, 10,
	4, 12, 4, 14, 4, 101, 11, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 5, 5, 135, 10, 5, 3, 6, 3, 6, 3, 6, 5, 6, 140, 10, 6, 3, 7, 3, 7,
	3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 7, 7, 152, 10, 7, 12, 7,
	14, 7, 155, 11, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 5, 9, 186, 10, 9, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3,
	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 206, 10, 10, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 7, 13, 228,
	10, 13, 12, 13, 14, 13, 231, 11, 13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3,
	14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5, 14,
	258, 10, 14, 3, 15, 3, 15, 3, 15, 5, 15, 263, 10, 15, 3, 16, 3, 16, 3,
	16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16,
	3, 16, 5, 16, 279, 10, 16, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3,
	17, 3, 17, 3, 17, 3, 17, 3, 17, 5, 17, 292, 10, 17, 3, 18, 3, 18, 3, 18,
	3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 7, 18, 302, 10, 18, 12, 18, 14, 18,
	305, 11, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 20, 3, 20, 3, 20, 3,
	20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20,
	3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 3, 20, 5, 20, 332, 10, 20, 3, 21, 3,
	21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21, 3, 21,
	3, 21, 3, 21, 3, 21, 5, 21, 349, 10, 21, 3, 22, 6, 22, 352, 10, 22, 13,
	22, 14, 22, 353, 3, 22, 3, 22, 3, 23, 6, 23, 359, 10, 23, 13, 23, 14, 23,
	360, 3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24, 3, 25, 3,
	25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26,
	3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3,
	26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26,
	3, 26, 3, 26, 5, 26, 406, 10, 26, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3,
	27, 3, 27, 3, 27, 7, 27, 416, 10, 27, 12, 27, 14, 27, 419, 11, 27, 3, 28,
	3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3,
	28, 5, 28, 433, 10, 28, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29,
	3, 29, 3, 29, 7, 29, 444, 10, 29, 12, 29, 14, 29, 447, 11, 29, 3, 30, 3,
	30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 5, 30, 457, 10, 30, 3, 31,
	3, 31, 3, 31, 3, 31, 3, 31, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3,
	32, 3, 32, 3, 32, 3, 32, 5, 32, 474, 10, 32, 3, 33, 3, 33, 3, 33, 3, 34,
	3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3,
	34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34,
	3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3,
	34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34,
	3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3,
	34, 3, 34, 5, 34, 534, 10, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34,
	3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3,
	34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 7, 34, 561,
	10, 34, 12, 34, 14, 34, 564, 11, 34, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35,
	3, 35, 3, 35, 3, 36, 3, 36, 3, 36, 3, 36, 5, 36, 577, 10, 36, 3, 37, 3,
	37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37,
	3, 37, 3, 37, 5, 37, 593, 10, 37, 3, 38, 3, 38, 3, 38, 3, 38, 3, 38, 3,
	38, 3, 38, 3, 38, 3, 38, 3, 38, 7, 38, 605, 10, 38, 12, 38, 14, 38, 608,
	11, 38, 3, 39, 6, 39, 611, 10, 39, 13, 39, 14, 39, 612, 3, 39, 3, 39, 5,
	39, 617, 10, 39, 3, 39, 3, 39, 3, 39, 3, 39, 3, 39, 3, 39, 5, 39, 625,
	10, 39, 3, 39, 2, 10, 6, 12, 24, 34, 52, 56, 66, 74, 40, 2, 4, 6, 8, 10,
	12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46,
	48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 2, 6, 4, 2,
	44, 45, 48, 48, 3, 2, 46, 47, 3, 2, 38, 43, 3, 2, 20, 21, 2, 652, 2, 78,
	3, 2, 2, 2, 4, 84, 3, 2, 2, 2, 6, 89, 3, 2, 2, 2, 8, 134, 3, 2, 2, 2, 10,
	139, 3, 2, 2, 2, 12, 141, 3, 2, 2, 2, 14, 156, 3, 2, 2, 2, 16, 185, 3,
	2, 2, 2, 18, 205, 3, 2, 2, 2, 20, 207, 3, 2, 2, 2, 22, 212, 3, 2, 2, 2,
	24, 218, 3, 2, 2, 2, 26, 257, 3, 2, 2, 2, 28, 262, 3, 2, 2, 2, 30, 278,
	3, 2, 2, 2, 32, 291, 3, 2, 2, 2, 34, 293, 3, 2, 2, 2, 36, 306, 3, 2, 2,
	2, 38, 331, 3, 2, 2, 2, 40, 348, 3, 2, 2, 2, 42, 351, 3, 2, 2, 2, 44, 358,
	3, 2, 2, 2, 46, 364, 3, 2, 2, 2, 48, 370, 3, 2, 2, 2, 50, 405, 3, 2, 2,
	2, 52, 407, 3, 2, 2, 2, 54, 432, 3, 2, 2, 2, 56, 434, 3, 2, 2, 2, 58, 456,
	3, 2, 2, 2, 60, 458, 3, 2, 2, 2, 62, 473, 3, 2, 2, 2, 64, 475, 3, 2, 2,
	2, 66, 533, 3, 2, 2, 2, 68, 565, 3, 2, 2, 2, 70, 576, 3, 2, 2, 2, 72, 592,
	3, 2, 2, 2, 74, 594, 3, 2, 2, 2, 76, 624, 3, 2, 2, 2, 78, 79, 5, 6, 4,
	2, 79, 80, 8, 2, 1, 2, 80, 3, 3, 2, 2, 2, 81, 83, 5, 16, 9, 2, 82, 81,
	3, 2, 2, 2, 83, 86, 3, 2, 2, 2, 84, 82, 3, 2, 2, 2, 84, 85, 3, 2, 2, 2,
	85, 87, 3, 2, 2, 2, 86, 84, 3, 2, 2, 2, 87, 88, 8, 3, 1, 2, 88, 5, 3, 2,
	2, 2, 89, 90, 8, 4, 1, 2, 90, 91, 5, 8, 5, 2, 91, 92, 8, 4, 1, 2, 92, 99,
	3, 2, 2, 2, 93, 94, 12, 4, 2, 2, 94, 95, 5, 8, 5, 2, 95, 96, 8, 4, 1, 2,
	96, 98, 3, 2, 2, 2, 97, 93, 3, 2, 2, 2, 98, 101, 3, 2, 2, 2, 99, 97, 3,
	2, 2, 2, 99, 100, 3, 2, 2, 2, 100, 7, 3, 2, 2, 2, 101, 99, 3, 2, 2, 2,
	102, 103, 5, 14, 8, 2, 103, 104, 8, 5, 1, 2, 104, 135, 3, 2, 2, 2, 105,
	106, 5, 10, 6, 2, 106, 107, 7, 24, 2, 2, 107, 108, 7, 37, 2, 2, 108, 109,
	7, 53, 2, 2, 109, 110, 7, 54, 2, 2, 110, 111, 7, 23, 2, 2, 111, 112, 5,
	62, 32, 2, 112, 113, 5, 58, 30, 2, 113, 114, 8, 5, 1, 2, 114, 135, 3, 2,
	2, 2, 115, 116, 5, 10, 6, 2, 116, 117, 7, 24, 2, 2, 117, 118, 7, 37, 2,
	2, 118, 119, 7, 53, 2, 2, 119, 120, 7, 54, 2, 2, 120, 121, 5, 58, 30, 2,
	121, 122, 8, 5, 1, 2, 122, 135, 3, 2, 2, 2, 123, 124, 5, 10, 6, 2, 124,
	125, 7, 24, 2, 2, 125, 126, 7, 37, 2, 2, 126, 127, 7, 53, 2, 2, 127, 128,
	5, 12, 7, 2, 128, 129, 7, 54, 2, 2, 129, 130, 7, 23, 2, 2, 130, 131, 5,
	62, 32, 2, 131, 132, 5, 58, 30, 2, 132, 133, 8, 5, 1, 2, 133, 135, 3, 2,
	2, 2, 134, 102, 3, 2, 2, 2, 134, 105, 3, 2, 2, 2, 134, 115, 3, 2, 2, 2,
	134, 123, 3, 2, 2, 2, 135, 9, 3, 2, 2, 2, 136, 137, 7, 22, 2, 2, 137, 140,
	8, 6, 1, 2, 138, 140, 8, 6, 1, 2, 139, 136, 3, 2, 2, 2, 139, 138, 3, 2,
	2, 2, 140, 11, 3, 2, 2, 2, 141, 142, 8, 7, 1, 2, 142, 143, 7, 37, 2, 2,
	143, 144, 7, 33, 2, 2, 144, 145, 5, 62, 32, 2, 145, 153, 3, 2, 2, 2, 146,
	147, 12, 4, 2, 2, 147, 148, 7, 30, 2, 2, 148, 149, 7, 37, 2, 2, 149, 150,
	7, 33, 2, 2, 150, 152, 5, 62, 32, 2, 151, 146, 3, 2, 2, 2, 152, 155, 3,
	2, 2, 2, 153, 151, 3, 2, 2, 2, 153, 154, 3, 2, 2, 2, 154, 13, 3, 2, 2,
	2, 155, 153, 3, 2, 2, 2, 156, 157, 7, 24, 2, 2, 157, 158, 7, 25, 2, 2,
	158, 159, 7, 53, 2, 2, 159, 160, 7, 54, 2, 2, 160, 161, 5, 58, 30, 2, 161,
	162, 8, 8, 1, 2, 162, 15, 3, 2, 2, 2, 163, 164, 5, 22, 12, 2, 164, 165,
	7, 31, 2, 2, 165, 166, 8, 9, 1, 2, 166, 186, 3, 2, 2, 2, 167, 168, 5, 26,
	14, 2, 168, 169, 7, 31, 2, 2, 169, 170, 8, 9, 1, 2, 170, 186, 3, 2, 2,
	2, 171, 172, 5, 32, 17, 2, 172, 173, 7, 31, 2, 2, 173, 174, 8, 9, 1, 2,
	174, 186, 3, 2, 2, 2, 175, 176, 5, 38, 20, 2, 176, 177, 8, 9, 1, 2, 177,
	186, 3, 2, 2, 2, 178, 179, 5, 50, 26, 2, 179, 180, 8, 9, 1, 2, 180, 186,
	3, 2, 2, 2, 181, 182, 5, 20, 11, 2, 182, 183, 7, 31, 2, 2, 183, 184, 8,
	9, 1, 2, 184, 186, 3, 2, 2, 2, 185, 163, 3, 2, 2, 2, 185, 167, 3, 2, 2,
	2, 185, 171, 3, 2, 2, 2, 185, 175, 3, 2, 2, 2, 185, 178, 3, 2, 2, 2, 185,
	181, 3, 2, 2, 2, 186, 17, 3, 2, 2, 2, 187, 188, 5, 22, 12, 2, 188, 189,
	8, 10, 1, 2, 189, 206, 3, 2, 2, 2, 190, 191, 5, 26, 14, 2, 191, 192, 8,
	10, 1, 2, 192, 206, 3, 2, 2, 2, 193, 194, 5, 32, 17, 2, 194, 195, 8, 10,
	1, 2, 195, 206, 3, 2, 2, 2, 196, 197, 5, 38, 20, 2, 197, 198, 8, 10, 1,
	2, 198, 206, 3, 2, 2, 2, 199, 200, 5, 50, 26, 2, 200, 201, 8, 10, 1, 2,
	201, 206, 3, 2, 2, 2, 202, 203, 5, 20, 11, 2, 203, 204, 8, 10, 1, 2, 204,
	206, 3, 2, 2, 2, 205, 187, 3, 2, 2, 2, 205, 190, 3, 2, 2, 2, 205, 193,
	3, 2, 2, 2, 205, 196, 3, 2, 2, 2, 205, 199, 3, 2, 2, 2, 205, 202, 3, 2,
	2, 2, 206, 19, 3, 2, 2, 2, 207, 208, 7, 37, 2, 2, 208, 209, 7, 53, 2, 2,
	209, 210, 7, 54, 2, 2, 210, 211, 8, 11, 1, 2, 211, 21, 3, 2, 2, 2, 212,
	213, 7, 3, 2, 2, 213, 214, 7, 53, 2, 2, 214, 215, 5, 24, 13, 2, 215, 216,
	7, 54, 2, 2, 216, 217, 8, 12, 1, 2, 217, 23, 3, 2, 2, 2, 218, 219, 8, 13,
	1, 2, 219, 220, 5, 64, 33, 2, 220, 221, 8, 13, 1, 2, 221, 229, 3, 2, 2,
	2, 222, 223, 12, 4, 2, 2, 223, 224, 7, 30, 2, 2, 224, 225, 5, 64, 33, 2,
	225, 226, 8, 13, 1, 2, 226, 228, 3, 2, 2, 2, 227, 222, 3, 2, 2, 2, 228,
	231, 3, 2, 2, 2, 229, 227, 3, 2, 2, 2, 229, 230, 3, 2, 2, 2, 230, 25, 3,
	2, 2, 2, 231, 229, 3, 2, 2, 2, 232, 233, 7, 18, 2, 2, 233, 234, 5, 28,
	15, 2, 234, 235, 7, 37, 2, 2, 235, 236, 7, 33, 2, 2, 236, 237, 5, 62, 32,
	2, 237, 238, 7, 34, 2, 2, 238, 239, 5, 64, 33, 2, 239, 240, 8, 14, 1, 2,
	240, 258, 3, 2, 2, 2, 241, 242, 7, 18, 2, 2, 242, 243, 5, 28, 15, 2, 243,
	244, 7, 37, 2, 2, 244, 245, 7, 34, 2, 2, 245, 246, 5, 64, 33, 2, 246, 247,
	8, 14, 1, 2, 247, 258, 3, 2, 2, 2, 248, 249, 7, 18, 2, 2, 249, 250, 5,
	28, 15, 2, 250, 251, 7, 37, 2, 2, 251, 252, 7, 33, 2, 2, 252, 253, 5, 30,
	16, 2, 253, 254, 7, 34, 2, 2, 254, 255, 5, 64, 33, 2, 255, 256, 8, 14,
	1, 2, 256, 258, 3, 2, 2, 2, 257, 232, 3, 2, 2, 2, 257, 241, 3, 2, 2, 2,
	257, 248, 3, 2, 2, 2, 258, 27, 3, 2, 2, 2, 259, 260, 7, 19, 2, 2, 260,
	263, 8, 15, 1, 2, 261, 263, 3, 2, 2, 2, 262, 259, 3, 2, 2, 2, 262, 261,
	3, 2, 2, 2, 263, 29, 3, 2, 2, 2, 264, 265, 7, 57, 2, 2, 265, 266, 5, 30,
	16, 2, 266, 267, 7, 31, 2, 2, 267, 268, 5, 64, 33, 2, 268, 269, 7, 58,
	2, 2, 269, 270, 8, 16, 1, 2, 270, 279, 3, 2, 2, 2, 271, 272, 7, 57, 2,
	2, 272, 273, 5, 62, 32, 2, 273, 274, 7, 31, 2, 2, 274, 275, 5, 64, 33,
	2, 275, 276, 7, 58, 2, 2, 276, 277, 8, 16, 1, 2, 277, 279, 3, 2, 2, 2,
	278, 264, 3, 2, 2, 2, 278, 271, 3, 2, 2, 2, 279, 31, 3, 2, 2, 2, 280, 281,
	7, 37, 2, 2, 281, 282, 7, 34, 2, 2, 282, 283, 5, 64, 33, 2, 283, 284, 8,
	17, 1, 2, 284, 292, 3, 2, 2, 2, 285, 286, 7, 37, 2, 2, 286, 287, 5, 34,
	18, 2, 287, 288, 7, 34, 2, 2, 288, 289, 5, 64, 33, 2, 289, 290, 8, 17,
	1, 2, 290, 292, 3, 2, 2, 2, 291, 280, 3, 2, 2, 2, 291, 285, 3, 2, 2, 2,
	292, 33, 3, 2, 2, 2, 293, 294, 8, 18, 1, 2, 294, 295, 5, 36, 19, 2, 295,
	296, 8, 18, 1, 2, 296, 303, 3, 2, 2, 2, 297, 298, 12, 4, 2, 2, 298, 299,
	5, 36, 19, 2, 299, 300, 8, 18, 1, 2, 300, 302, 3, 2, 2, 2, 301, 297, 3,
	2, 2, 2, 302, 305, 3, 2, 2, 2, 303, 301, 3, 2, 2, 2, 303, 304, 3, 2, 2,
	2, 304, 35, 3, 2, 2, 2, 305, 303, 3, 2, 2, 2, 306, 307, 7, 57, 2, 2, 307,
	308, 5, 64, 33, 2, 308, 309, 7, 58, 2, 2, 309, 310, 8, 19, 1, 2, 310, 37,
	3, 2, 2, 2, 311, 312, 7, 9, 2, 2, 312, 313, 5, 64, 33, 2, 313, 314, 5,
	58, 30, 2, 314, 315, 8, 20, 1, 2, 315, 332, 3, 2, 2, 2, 316, 317, 7, 9,
	2, 2, 317, 318, 5, 64, 33, 2, 318, 319, 5, 58, 30, 2, 319, 320, 7, 10,
	2, 2, 320, 321, 5, 58, 30, 2, 321, 322, 8, 20, 1, 2, 322, 332, 3, 2, 2,
	2, 323, 324, 7, 9, 2, 2, 324, 325, 5, 64, 33, 2, 325, 326, 5, 58, 30, 2,
	326, 327, 5, 42, 22, 2, 327, 328, 7, 10, 2, 2, 328, 329, 5, 58, 30, 2,
	329, 330, 8, 20, 1, 2, 330, 332, 3, 2, 2, 2, 331, 311, 3, 2, 2, 2, 331,
	316, 3, 2, 2, 2, 331, 323, 3, 2, 2, 2, 332, 39, 3, 2, 2, 2, 333, 334, 7,
	9, 2, 2, 334, 335, 5, 64, 33, 2, 335, 336, 5, 60, 31, 2, 336, 337, 7, 10,
	2, 2, 337, 338, 5, 60, 31, 2, 338, 339, 8, 21, 1, 2, 339, 349, 3, 2, 2,
	2, 340, 341, 7, 9, 2, 2, 341, 342, 5, 64, 33, 2, 342, 343, 5, 60, 31, 2,
	343, 344, 5, 44, 23, 2, 344, 345, 7, 10, 2, 2, 345, 346, 5, 60, 31, 2,
	346, 347, 8, 21, 1, 2, 347, 349, 3, 2, 2, 2, 348, 333, 3, 2, 2, 2, 348,
	340, 3, 2, 2, 2, 349, 41, 3, 2, 2, 2, 350, 352, 5, 46, 24, 2, 351, 350,
	3, 2, 2, 2, 352, 353, 3, 2, 2, 2, 353, 351, 3, 2, 2, 2, 353, 354, 3, 2,
	2, 2, 354, 355, 3, 2, 2, 2, 355, 356, 8, 22, 1, 2, 356, 43, 3, 2, 2, 2,
	357, 359, 5, 48, 25, 2, 358, 357, 3, 2, 2, 2, 359, 360, 3, 2, 2, 2, 360,
	358, 3, 2, 2, 2, 360, 361, 3, 2, 2, 2, 361, 362, 3, 2, 2, 2, 362, 363,
	8, 23, 1, 2, 363, 45, 3, 2, 2, 2, 364, 365, 7, 10, 2, 2, 365, 366, 7, 9,
	2, 2, 366, 367, 5, 64, 33, 2, 367, 368, 5, 58, 30, 2, 368, 369, 8, 24,
	1, 2, 369, 47, 3, 2, 2, 2, 370, 371, 7, 10, 2, 2, 371, 372, 7, 9, 2, 2,
	372, 373, 5, 64, 33, 2, 373, 374, 5, 60, 31, 2, 374, 375, 8, 25, 1, 2,
	375, 49, 3, 2, 2, 2, 376, 377, 7, 11, 2, 2, 377, 378, 5, 64, 33, 2, 378,
	379, 7, 55, 2, 2, 379, 380, 5, 52, 27, 2, 380, 381, 7, 56, 2, 2, 381, 382,
	8, 26, 1, 2, 382, 406, 3, 2, 2, 2, 383, 384, 7, 11, 2, 2, 384, 385, 5,
	64, 33, 2, 385, 386, 7, 55, 2, 2, 386, 387, 5, 52, 27, 2, 387, 388, 7,
	36, 2, 2, 388, 389, 7, 35, 2, 2, 389, 390, 5, 58, 30, 2, 390, 391, 7, 30,
	2, 2, 391, 392, 7, 56, 2, 2, 392, 393, 8, 26, 1, 2, 393, 406, 3, 2, 2,
	2, 394, 395, 7, 11, 2, 2, 395, 396, 5, 64, 33, 2, 396, 397, 7, 55, 2, 2,
	397, 398, 5, 52, 27, 2, 398, 399, 7, 36, 2, 2, 399, 400, 7, 35, 2, 2, 400,
	401, 5, 18, 10, 2, 401, 402, 7, 30, 2, 2, 402, 403, 7, 56, 2, 2, 403, 404,
	8, 26, 1, 2, 404, 406, 3, 2, 2, 2, 405, 376, 3, 2, 2, 2, 405, 383, 3, 2,
	2, 2, 405, 394, 3, 2, 2, 2, 406, 51, 3, 2, 2, 2, 407, 408, 8, 27, 1, 2,
	408, 409, 5, 54, 28, 2, 409, 410, 8, 27, 1, 2, 410, 417, 3, 2, 2, 2, 411,
	412, 12, 4, 2, 2, 412, 413, 5, 54, 28, 2, 413, 414, 8, 27, 1, 2, 414, 416,
	3, 2, 2, 2, 415, 411, 3, 2, 2, 2, 416, 419, 3, 2, 2, 2, 417, 415, 3, 2,
	2, 2, 417, 418, 3, 2, 2, 2, 418, 53, 3, 2, 2, 2, 419, 417, 3, 2, 2, 2,
	420, 421, 5, 56, 29, 2, 421, 422, 7, 35, 2, 2, 422, 423, 5, 58, 30, 2,
	423, 424, 7, 30, 2, 2, 424, 425, 8, 28, 1, 2, 425, 433, 3, 2, 2, 2, 426,
	427, 5, 56, 29, 2, 427, 428, 7, 35, 2, 2, 428, 429, 5, 18, 10, 2, 429,
	430, 7, 30, 2, 2, 430, 431, 8, 28, 1, 2, 431, 433, 3, 2, 2, 2, 432, 420,
	3, 2, 2, 2, 432, 426, 3, 2, 2, 2, 433, 55, 3, 2, 2, 2, 434, 435, 8, 29,
	1, 2, 435, 436, 5, 72, 37, 2, 436, 437, 8, 29, 1, 2, 437, 445, 3, 2, 2,
	2, 438, 439, 12, 4, 2, 2, 439, 440, 7, 12, 2, 2, 440, 441, 5, 72, 37, 2,
	441, 442, 8, 29, 1, 2, 442, 444, 3, 2, 2, 2, 443, 438, 3, 2, 2, 2, 444,
	447, 3, 2, 2, 2, 445, 443, 3, 2, 2, 2, 445, 446, 3, 2, 2, 2, 446, 57, 3,
	2, 2, 2, 447, 445, 3, 2, 2, 2, 448, 449, 7, 55, 2, 2, 449, 450, 5, 4, 3,
	2, 450, 451, 7, 56, 2, 2, 451, 452, 8, 30, 1, 2, 452, 457, 3, 2, 2, 2,
	453, 454, 7, 55, 2, 2, 454, 455, 7, 56, 2, 2, 455, 457, 8, 30, 1, 2, 456,
	448, 3, 2, 2, 2, 456, 453, 3, 2, 2, 2, 457, 59, 3, 2, 2, 2, 458, 459, 7,
	55, 2, 2, 459, 460, 5, 64, 33, 2, 460, 461, 7, 56, 2, 2, 461, 462, 8, 31,
	1, 2, 462, 61, 3, 2, 2, 2, 463, 464, 7, 4, 2, 2, 464, 474, 8, 32, 1, 2,
	465, 466, 7, 6, 2, 2, 466, 474, 8, 32, 1, 2, 467, 468, 7, 5, 2, 2, 468,
	474, 8, 32, 1, 2, 469, 470, 7, 7, 2, 2, 470, 474, 8, 32, 1, 2, 471, 472,
	7, 8, 2, 2, 472, 474, 8, 32, 1, 2, 473, 463, 3, 2, 2, 2, 473, 465, 3, 2,
	2, 2, 473, 467, 3, 2, 2, 2, 473, 469, 3, 2, 2, 2, 473, 471, 3, 2, 2, 2,
	474, 63, 3, 2, 2, 2, 475, 476, 5, 66, 34, 2, 476, 477, 8, 33, 1, 2, 477,
	65, 3, 2, 2, 2, 478, 479, 8, 34, 1, 2, 479, 480, 7, 47, 2, 2, 480, 481,
	5, 66, 34, 17, 481, 482, 8, 34, 1, 2, 482, 534, 3, 2, 2, 2, 483, 484, 7,
	4, 2, 2, 484, 485, 7, 32, 2, 2, 485, 486, 7, 16, 2, 2, 486, 487, 7, 53,
	2, 2, 487, 488, 5, 66, 34, 2, 488, 489, 7, 30, 2, 2, 489, 490, 5, 66, 34,
	2, 490, 491, 7, 54, 2, 2, 491, 492, 8, 34, 1, 2, 492, 534, 3, 2, 2, 2,
	493, 494, 7, 5, 2, 2, 494, 495, 7, 32, 2, 2, 495, 496, 7, 17, 2, 2, 496,
	497, 7, 53, 2, 2, 497, 498, 5, 66, 34, 2, 498, 499, 7, 30, 2, 2, 499, 500,
	5, 66, 34, 2, 500, 501, 7, 54, 2, 2, 501, 502, 8, 34, 1, 2, 502, 534, 3,
	2, 2, 2, 503, 504, 7, 51, 2, 2, 504, 505, 5, 66, 34, 11, 505, 506, 8, 34,
	1, 2, 506, 534, 3, 2, 2, 2, 507, 508, 7, 57, 2, 2, 508, 509, 5, 64, 33,
	2, 509, 510, 7, 31, 2, 2, 510, 511, 5, 64, 33, 2, 511, 512, 7, 58, 2, 2,
	512, 513, 8, 34, 1, 2, 513, 534, 3, 2, 2, 2, 514, 515, 7, 57, 2, 2, 515,
	516, 5, 24, 13, 2, 516, 517, 7, 58, 2, 2, 517, 518, 8, 34, 1, 2, 518, 534,
	3, 2, 2, 2, 519, 520, 5, 72, 37, 2, 520, 521, 8, 34, 1, 2, 521, 534, 3,
	2, 2, 2, 522, 523, 7, 53, 2, 2, 523, 524, 5, 64, 33, 2, 524, 525, 7, 54,
	2, 2, 525, 526, 8, 34, 1, 2, 526, 534, 3, 2, 2, 2, 527, 528, 5, 68, 35,
	2, 528, 529, 8, 34, 1, 2, 529, 534, 3, 2, 2, 2, 530, 531, 5, 40, 21, 2,
	531, 532, 8, 34, 1, 2, 532, 534, 3, 2, 2, 2, 533, 478, 3, 2, 2, 2, 533,
	483, 3, 2, 2, 2, 533, 493, 3, 2, 2, 2, 533, 503, 3, 2, 2, 2, 533, 507,
	3, 2, 2, 2, 533, 514, 3, 2, 2, 2, 533, 519, 3, 2, 2, 2, 533, 522, 3, 2,
	2, 2, 533, 527, 3, 2, 2, 2, 533, 530, 3, 2, 2, 2, 534, 562, 3, 2, 2, 2,
	535, 536, 12, 14, 2, 2, 536, 537, 9, 2, 2, 2, 537, 538, 5, 66, 34, 15,
	538, 539, 8, 34, 1, 2, 539, 561, 3, 2, 2, 2, 540, 541, 12, 13, 2, 2, 541,
	542, 9, 3, 2, 2, 542, 543, 5, 66, 34, 14, 543, 544, 8, 34, 1, 2, 544, 561,
	3, 2, 2, 2, 545, 546, 12, 12, 2, 2, 546, 547, 9, 4, 2, 2, 547, 548, 5,
	66, 34, 13, 548, 549, 8, 34, 1, 2, 549, 561, 3, 2, 2, 2, 550, 551, 12,
	10, 2, 2, 551, 552, 7, 49, 2, 2, 552, 553, 5, 66, 34, 11, 553, 554, 8,
	34, 1, 2, 554, 561, 3, 2, 2, 2, 555, 556, 12, 9, 2, 2, 556, 557, 7, 50,
	2, 2, 557, 558, 5, 66, 34, 10, 558, 559, 8, 34, 1, 2, 559, 561, 3, 2, 2,
	2, 560, 535, 3, 2, 2, 2, 560, 540, 3, 2, 2, 2, 560, 545, 3, 2, 2, 2, 560,
	550, 3, 2, 2, 2, 560, 555, 3, 2, 2, 2, 561, 564, 3, 2, 2, 2, 562, 560,
	3, 2, 2, 2, 562, 563, 3, 2, 2, 2, 563, 67, 3, 2, 2, 2, 564, 562, 3, 2,
	2, 2, 565, 566, 7, 53, 2, 2, 566, 567, 5, 64, 33, 2, 567, 568, 7, 15, 2,
	2, 568, 569, 5, 70, 36, 2, 569, 570, 7, 54, 2, 2, 570, 571, 8, 35, 1, 2,
	571, 69, 3, 2, 2, 2, 572, 573, 7, 5, 2, 2, 573, 577, 8, 36, 1, 2, 574,
	575, 7, 4, 2, 2, 575, 577, 8, 36, 1, 2, 576, 572, 3, 2, 2, 2, 576, 574,
	3, 2, 2, 2, 577, 71, 3, 2, 2, 2, 578, 579, 7, 26, 2, 2, 579, 593, 8, 37,
	1, 2, 580, 581, 7, 27, 2, 2, 581, 593, 8, 37, 1, 2, 582, 583, 5, 76, 39,
	2, 583, 584, 8, 37, 1, 2, 584, 593, 3, 2, 2, 2, 585, 586, 7, 13, 2, 2,
	586, 593, 8, 37, 1, 2, 587, 588, 7, 14, 2, 2, 588, 593, 8, 37, 1, 2, 589,
	590, 5, 74, 38, 2, 590, 591, 8, 37, 1, 2, 591, 593, 3, 2, 2, 2, 592, 578,
	3, 2, 2, 2, 592, 580, 3, 2, 2, 2, 592, 582, 3, 2, 2, 2, 592, 585, 3, 2,
	2, 2, 592, 587, 3, 2, 2, 2, 592, 589, 3, 2, 2, 2, 593, 73, 3, 2, 2, 2,
	594, 595, 8, 38, 1, 2, 595, 596, 7, 37, 2, 2, 596, 597, 8, 38, 1, 2, 597,
	606, 3, 2, 2, 2, 598, 599, 12, 4, 2, 2, 599, 600, 7, 57, 2, 2, 600, 601,
	5, 64, 33, 2, 601, 602, 7, 58, 2, 2, 602, 603, 8, 38, 1, 2, 603, 605, 3,
	2, 2, 2, 604, 598, 3, 2, 2, 2, 605, 608, 3, 2, 2, 2, 606, 604, 3, 2, 2,
	2, 606, 607, 3, 2, 2, 2, 607, 75, 3, 2, 2, 2, 608, 606, 3, 2, 2, 2, 609,
	611, 7, 52, 2, 2, 610, 609, 3, 2, 2, 2, 611, 612, 3, 2, 2, 2, 612, 610,
	3, 2, 2, 2, 612, 613, 3, 2, 2, 2, 613, 614, 3, 2, 2, 2, 614, 616, 7, 28,
	2, 2, 615, 617, 9, 5, 2, 2, 616, 615, 3, 2, 2, 2, 616, 617, 3, 2, 2, 2,
	617, 618, 3, 2, 2, 2, 618, 625, 8, 39, 1, 2, 619, 620, 7, 28, 2, 2, 620,
	621, 9, 5, 2, 2, 621, 625, 8, 39, 1, 2, 622, 623, 7, 28, 2, 2, 623, 625,
	8, 39, 1, 2, 624, 610, 3, 2, 2, 2, 624, 619, 3, 2, 2, 2, 624, 622, 3, 2,
	2, 2, 625, 77, 3, 2, 2, 2, 34, 84, 99, 134, 139, 153, 185, 205, 229, 257,
	262, 278, 291, 303, 331, 348, 353, 360, 405, 417, 432, 445, 456, 473, 533,
	560, 562, 576, 592, 606, 612, 616, 624,
}
var literalNames = []string{
	"", "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", "'if'",
	"'else'", "'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'",
	"'let'", "'mut'", "'.to_string()'", "'.to_owned()'", "'pub'", "'->'", "'fn'",
	"'main'", "", "", "", "'.'", "','", "';'", "'::'", "':'", "'='", "'=>'",
	"'_'", "", "'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'",
	"'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'",
	"'}'", "'['", "']'",
}
var symbolicNames = []string{
	"", "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR",
	"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET",
	"MUT", "TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", "NUMBER",
	"FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION",
	"MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL",
	"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT",
	"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER",
	"WHITESPACE", "L_COMMENT",
}

var ruleNames = []string{
	"start", "instrucciones", "list_Funciones", "funcion", "t_access", "params_declar",
	"fn_main", "instruccion", "instruccion_only", "callFunction", "printconsola",
	"listParams", "declaracion", "is_mut", "array_type", "asignacion", "list_index",
	"index_array", "if_sent", "if_exp", "list_elseif", "list_elseif_exp", "else_if",
	"else_if_exp", "match_sent", "match_brazos", "matchbrazo", "listaOpciones",
	"bloque_inst", "bloque_exp", "tipos_var", "expression", "expr_arit", "casteo",
	"tipo_cast", "primitivo", "listIDArray", "strings",
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
	RustParPUBLIC     = 20
	RustParTYPETHEN   = 21
	RustParFN         = 22
	RustParMAIN       = 23
	RustParNUMBER     = 24
	RustParFLOAT      = 25
	RustParSTRING     = 26
	RustParPUNTO      = 27
	RustParCOMA       = 28
	RustParPTCOMA     = 29
	RustParDOSPUNTO   = 30
	RustParDPUNTO2    = 31
	RustParASIGNACION = 32
	RustParMTHEN      = 33
	RustParGUIONB     = 34
	RustParID         = 35
	RustParDISTINTO   = 36
	RustParIGUAL      = 37
	RustParMAYORIGUAL = 38
	RustParMENORIGUAL = 39
	RustParMAYOR      = 40
	RustParMENOR      = 41
	RustParMUL        = 42
	RustParDIV        = 43
	RustParADD        = 44
	RustParSUB        = 45
	RustParMOD        = 46
	RustParAND        = 47
	RustParOR         = 48
	RustParNOT        = 49
	RustParAMP        = 50
	RustParPARIZQ     = 51
	RustParPARDER     = 52
	RustParLLAVEIZQ   = 53
	RustParLLAVEDER   = 54
	RustParCORIZQ     = 55
	RustParCORDER     = 56
	RustParWHITESPACE = 57
	RustParL_COMMENT  = 58
)

// RustPar rules.
const (
	RustParRULE_start            = 0
	RustParRULE_instrucciones    = 1
	RustParRULE_list_Funciones   = 2
	RustParRULE_funcion          = 3
	RustParRULE_t_access         = 4
	RustParRULE_params_declar    = 5
	RustParRULE_fn_main          = 6
	RustParRULE_instruccion      = 7
	RustParRULE_instruccion_only = 8
	RustParRULE_callFunction     = 9
	RustParRULE_printconsola     = 10
	RustParRULE_listParams       = 11
	RustParRULE_declaracion      = 12
	RustParRULE_is_mut           = 13
	RustParRULE_array_type       = 14
	RustParRULE_asignacion       = 15
	RustParRULE_list_index       = 16
	RustParRULE_index_array      = 17
	RustParRULE_if_sent          = 18
	RustParRULE_if_exp           = 19
	RustParRULE_list_elseif      = 20
	RustParRULE_list_elseif_exp  = 21
	RustParRULE_else_if          = 22
	RustParRULE_else_if_exp      = 23
	RustParRULE_match_sent       = 24
	RustParRULE_match_brazos     = 25
	RustParRULE_matchbrazo       = 26
	RustParRULE_listaOpciones    = 27
	RustParRULE_bloque_inst      = 28
	RustParRULE_bloque_exp       = 29
	RustParRULE_tipos_var        = 30
	RustParRULE_expression       = 31
	RustParRULE_expr_arit        = 32
	RustParRULE_casteo           = 33
	RustParRULE_tipo_cast        = 34
	RustParRULE_primitivo        = 35
	RustParRULE_listIDArray      = 36
	RustParRULE_strings          = 37
)

// IStartContext is an interface to support dynamic dispatch.
type IStartContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_list_Funciones returns the _list_Funciones rule contexts.
	Get_list_Funciones() IList_FuncionesContext

	// Set_list_Funciones sets the _list_Funciones rule contexts.
	Set_list_Funciones(IList_FuncionesContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsStartContext differentiates from other interfaces.
	IsStartContext()
}

type StartContext struct {
	*antlr.BaseParserRuleContext
	parser          antlr.Parser
	lista           *arrayList.List
	_list_Funciones IList_FuncionesContext
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

func (s *StartContext) Get_list_Funciones() IList_FuncionesContext { return s._list_Funciones }

func (s *StartContext) Set_list_Funciones(v IList_FuncionesContext) { s._list_Funciones = v }

func (s *StartContext) GetLista() *arrayList.List { return s.lista }

func (s *StartContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *StartContext) List_Funciones() IList_FuncionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IList_FuncionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IList_FuncionesContext)
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
		p.SetState(76)

		var _x = p.list_Funciones(0)

		localctx.(*StartContext)._list_Funciones = _x
	}
	localctx.(*StartContext).lista = localctx.(*StartContext).Get_list_Funciones().GetLista()

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
	p.SetState(82)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<RustParPRINT_CON)|(1<<RustParIF)|(1<<RustParMATCH)|(1<<RustParLET))) != 0) || _la == RustParID {
		{
			p.SetState(79)

			var _x = p.Instruccion()

			localctx.(*InstruccionesContext)._instruccion = _x
		}
		localctx.(*InstruccionesContext).e = append(localctx.(*InstruccionesContext).e, localctx.(*InstruccionesContext)._instruccion)

		p.SetState(84)
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

// IList_FuncionesContext is an interface to support dynamic dispatch.
type IList_FuncionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetLisfun returns the lisfun rule contexts.
	GetLisfun() IList_FuncionesContext

	// Get_funcion returns the _funcion rule contexts.
	Get_funcion() IFuncionContext

	// SetLisfun sets the lisfun rule contexts.
	SetLisfun(IList_FuncionesContext)

	// Set_funcion sets the _funcion rule contexts.
	Set_funcion(IFuncionContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsList_FuncionesContext differentiates from other interfaces.
	IsList_FuncionesContext()
}

type List_FuncionesContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	lista    *arrayList.List
	lisfun   IList_FuncionesContext
	_funcion IFuncionContext
}

func NewEmptyList_FuncionesContext() *List_FuncionesContext {
	var p = new(List_FuncionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_list_Funciones
	return p
}

func (*List_FuncionesContext) IsList_FuncionesContext() {}

func NewList_FuncionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *List_FuncionesContext {
	var p = new(List_FuncionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_list_Funciones

	return p
}

func (s *List_FuncionesContext) GetParser() antlr.Parser { return s.parser }

func (s *List_FuncionesContext) GetLisfun() IList_FuncionesContext { return s.lisfun }

func (s *List_FuncionesContext) Get_funcion() IFuncionContext { return s._funcion }

func (s *List_FuncionesContext) SetLisfun(v IList_FuncionesContext) { s.lisfun = v }

func (s *List_FuncionesContext) Set_funcion(v IFuncionContext) { s._funcion = v }

func (s *List_FuncionesContext) GetLista() *arrayList.List { return s.lista }

func (s *List_FuncionesContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *List_FuncionesContext) Funcion() IFuncionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFuncionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFuncionContext)
}

func (s *List_FuncionesContext) List_Funciones() IList_FuncionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IList_FuncionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IList_FuncionesContext)
}

func (s *List_FuncionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *List_FuncionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *List_FuncionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterList_Funciones(s)
	}
}

func (s *List_FuncionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitList_Funciones(s)
	}
}

func (p *RustPar) List_Funciones() (localctx IList_FuncionesContext) {
	return p.list_Funciones(0)
}

func (p *RustPar) list_Funciones(_p int) (localctx IList_FuncionesContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewList_FuncionesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IList_FuncionesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 4
	p.EnterRecursionRule(localctx, 4, RustParRULE_list_Funciones, _p)

	localctx.(*List_FuncionesContext).lista = arrayList.New()

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
		p.SetState(88)

		var _x = p.Funcion()

		localctx.(*List_FuncionesContext)._funcion = _x
	}
	localctx.(*List_FuncionesContext).lista.Add(localctx.(*List_FuncionesContext).Get_funcion().GetInstr())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(97)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 1, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewList_FuncionesContext(p, _parentctx, _parentState)
			localctx.(*List_FuncionesContext).lisfun = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_list_Funciones)
			p.SetState(91)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(92)

				var _x = p.Funcion()

				localctx.(*List_FuncionesContext)._funcion = _x
			}

			localctx.(*List_FuncionesContext).GetLisfun().GetLista().Add(localctx.(*List_FuncionesContext).Get_funcion().GetInstr())
			localctx.(*List_FuncionesContext).lista = localctx.(*List_FuncionesContext).GetLisfun().GetLista()

		}
		p.SetState(99)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 1, p.GetParserRuleContext())
	}

	return localctx
}

// IFuncionContext is an interface to support dynamic dispatch.
type IFuncionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_fn_main returns the _fn_main rule contexts.
	Get_fn_main() IFn_mainContext

	// Get_tipos_var returns the _tipos_var rule contexts.
	Get_tipos_var() ITipos_varContext

	// Get_bloque_inst returns the _bloque_inst rule contexts.
	Get_bloque_inst() IBloque_instContext

	// Get_params_declar returns the _params_declar rule contexts.
	Get_params_declar() IParams_declarContext

	// Set_fn_main sets the _fn_main rule contexts.
	Set_fn_main(IFn_mainContext)

	// Set_tipos_var sets the _tipos_var rule contexts.
	Set_tipos_var(ITipos_varContext)

	// Set_bloque_inst sets the _bloque_inst rule contexts.
	Set_bloque_inst(IBloque_instContext)

	// Set_params_declar sets the _params_declar rule contexts.
	Set_params_declar(IParams_declarContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsFuncionContext differentiates from other interfaces.
	IsFuncionContext()
}

type FuncionContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	instr          interfaces.Instruction
	_fn_main       IFn_mainContext
	_ID            antlr.Token
	_tipos_var     ITipos_varContext
	_bloque_inst   IBloque_instContext
	_params_declar IParams_declarContext
}

func NewEmptyFuncionContext() *FuncionContext {
	var p = new(FuncionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_funcion
	return p
}

func (*FuncionContext) IsFuncionContext() {}

func NewFuncionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FuncionContext {
	var p = new(FuncionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_funcion

	return p
}

func (s *FuncionContext) GetParser() antlr.Parser { return s.parser }

func (s *FuncionContext) Get_ID() antlr.Token { return s._ID }

func (s *FuncionContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *FuncionContext) Get_fn_main() IFn_mainContext { return s._fn_main }

func (s *FuncionContext) Get_tipos_var() ITipos_varContext { return s._tipos_var }

func (s *FuncionContext) Get_bloque_inst() IBloque_instContext { return s._bloque_inst }

func (s *FuncionContext) Get_params_declar() IParams_declarContext { return s._params_declar }

func (s *FuncionContext) Set_fn_main(v IFn_mainContext) { s._fn_main = v }

func (s *FuncionContext) Set_tipos_var(v ITipos_varContext) { s._tipos_var = v }

func (s *FuncionContext) Set_bloque_inst(v IBloque_instContext) { s._bloque_inst = v }

func (s *FuncionContext) Set_params_declar(v IParams_declarContext) { s._params_declar = v }

func (s *FuncionContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *FuncionContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *FuncionContext) Fn_main() IFn_mainContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFn_mainContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFn_mainContext)
}

func (s *FuncionContext) T_access() IT_accessContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IT_accessContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IT_accessContext)
}

func (s *FuncionContext) FN() antlr.TerminalNode {
	return s.GetToken(RustParFN, 0)
}

func (s *FuncionContext) ID() antlr.TerminalNode {
	return s.GetToken(RustParID, 0)
}

func (s *FuncionContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *FuncionContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *FuncionContext) TYPETHEN() antlr.TerminalNode {
	return s.GetToken(RustParTYPETHEN, 0)
}

func (s *FuncionContext) Tipos_var() ITipos_varContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipos_varContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipos_varContext)
}

func (s *FuncionContext) Bloque_inst() IBloque_instContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_instContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloque_instContext)
}

func (s *FuncionContext) Params_declar() IParams_declarContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IParams_declarContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IParams_declarContext)
}

func (s *FuncionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FuncionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FuncionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterFuncion(s)
	}
}

func (s *FuncionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitFuncion(s)
	}
}

func (p *RustPar) Funcion() (localctx IFuncionContext) {
	this := p
	_ = this

	localctx = NewFuncionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, RustParRULE_funcion)
	listParams := arrayList.New()

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

	p.SetState(132)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(100)

			var _x = p.Fn_main()

			localctx.(*FuncionContext)._fn_main = _x
		}
		localctx.(*FuncionContext).instr = localctx.(*FuncionContext).Get_fn_main().GetInstr()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(103)
			p.T_access()
		}
		{
			p.SetState(104)
			p.Match(RustParFN)
		}
		{
			p.SetState(105)

			var _m = p.Match(RustParID)

			localctx.(*FuncionContext)._ID = _m
		}
		{
			p.SetState(106)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(107)
			p.Match(RustParPARDER)
		}
		{
			p.SetState(108)
			p.Match(RustParTYPETHEN)
		}
		{
			p.SetState(109)

			var _x = p.Tipos_var()

			localctx.(*FuncionContext)._tipos_var = _x
		}
		{
			p.SetState(110)

			var _x = p.Bloque_inst()

			localctx.(*FuncionContext)._bloque_inst = _x
		}
		localctx.(*FuncionContext).instr = interfaces.NewFunction((func() string {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FuncionContext).Get_ID().GetText()
			}
		}()), listParams, localctx.(*FuncionContext).Get_bloque_inst().GetL(), localctx.(*FuncionContext).Get_tipos_var().GetTipo(), (func() int {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FuncionContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FuncionContext).Get_ID().GetColumn()
			}
		}()))

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(113)
			p.T_access()
		}
		{
			p.SetState(114)
			p.Match(RustParFN)
		}
		{
			p.SetState(115)

			var _m = p.Match(RustParID)

			localctx.(*FuncionContext)._ID = _m
		}
		{
			p.SetState(116)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(117)
			p.Match(RustParPARDER)
		}
		{
			p.SetState(118)

			var _x = p.Bloque_inst()

			localctx.(*FuncionContext)._bloque_inst = _x
		}
		localctx.(*FuncionContext).instr = interfaces.NewFunction((func() string {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FuncionContext).Get_ID().GetText()
			}
		}()), listParams, localctx.(*FuncionContext).Get_bloque_inst().GetL(), interfaces.VOID, (func() int {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FuncionContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FuncionContext).Get_ID().GetColumn()
			}
		}()))

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(121)
			p.T_access()
		}
		{
			p.SetState(122)
			p.Match(RustParFN)
		}
		{
			p.SetState(123)

			var _m = p.Match(RustParID)

			localctx.(*FuncionContext)._ID = _m
		}
		{
			p.SetState(124)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(125)

			var _x = p.params_declar(0)

			localctx.(*FuncionContext)._params_declar = _x
		}
		{
			p.SetState(126)
			p.Match(RustParPARDER)
		}
		{
			p.SetState(127)
			p.Match(RustParTYPETHEN)
		}
		{
			p.SetState(128)

			var _x = p.Tipos_var()

			localctx.(*FuncionContext)._tipos_var = _x
		}
		{
			p.SetState(129)

			var _x = p.Bloque_inst()

			localctx.(*FuncionContext)._bloque_inst = _x
		}
		localctx.(*FuncionContext).instr = interfaces.NewFunction((func() string {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FuncionContext).Get_ID().GetText()
			}
		}()), localctx.(*FuncionContext).Get_params_declar().GetLista(), localctx.(*FuncionContext).Get_bloque_inst().GetL(), localctx.(*FuncionContext).Get_tipos_var().GetTipo(), (func() int {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FuncionContext).Get_ID().GetLine()
			}
		}()), (func() int {
			if localctx.(*FuncionContext).Get_ID() == nil {
				return 0
			} else {
				return localctx.(*FuncionContext).Get_ID().GetColumn()
			}
		}()))

	}

	return localctx
}

// IT_accessContext is an interface to support dynamic dispatch.
type IT_accessContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetModAccess returns the modAccess attribute.
	GetModAccess() interfaces.TipoAccess

	// SetModAccess sets the modAccess attribute.
	SetModAccess(interfaces.TipoAccess)

	// IsT_accessContext differentiates from other interfaces.
	IsT_accessContext()
}

type T_accessContext struct {
	*antlr.BaseParserRuleContext
	parser    antlr.Parser
	modAccess interfaces.TipoAccess
}

func NewEmptyT_accessContext() *T_accessContext {
	var p = new(T_accessContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_t_access
	return p
}

func (*T_accessContext) IsT_accessContext() {}

func NewT_accessContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *T_accessContext {
	var p = new(T_accessContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_t_access

	return p
}

func (s *T_accessContext) GetParser() antlr.Parser { return s.parser }

func (s *T_accessContext) GetModAccess() interfaces.TipoAccess { return s.modAccess }

func (s *T_accessContext) SetModAccess(v interfaces.TipoAccess) { s.modAccess = v }

func (s *T_accessContext) PUBLIC() antlr.TerminalNode {
	return s.GetToken(RustParPUBLIC, 0)
}

func (s *T_accessContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *T_accessContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *T_accessContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterT_access(s)
	}
}

func (s *T_accessContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitT_access(s)
	}
}

func (p *RustPar) T_access() (localctx IT_accessContext) {
	this := p
	_ = this

	localctx = NewT_accessContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, RustParRULE_t_access)

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

	p.SetState(137)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParPUBLIC:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(134)
			p.Match(RustParPUBLIC)
		}
		localctx.(*T_accessContext).modAccess = interfaces.PUBLIC

	case RustParFN:
		p.EnterOuterAlt(localctx, 2)
		localctx.(*T_accessContext).modAccess = interfaces.PRIVATE

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IParams_declarContext is an interface to support dynamic dispatch.
type IParams_declarContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetSublista returns the sublista rule contexts.
	GetSublista() IParams_declarContext

	// SetSublista sets the sublista rule contexts.
	SetSublista(IParams_declarContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsParams_declarContext differentiates from other interfaces.
	IsParams_declarContext()
}

type Params_declarContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	lista    *arrayList.List
	sublista IParams_declarContext
}

func NewEmptyParams_declarContext() *Params_declarContext {
	var p = new(Params_declarContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_params_declar
	return p
}

func (*Params_declarContext) IsParams_declarContext() {}

func NewParams_declarContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Params_declarContext {
	var p = new(Params_declarContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_params_declar

	return p
}

func (s *Params_declarContext) GetParser() antlr.Parser { return s.parser }

func (s *Params_declarContext) GetSublista() IParams_declarContext { return s.sublista }

func (s *Params_declarContext) SetSublista(v IParams_declarContext) { s.sublista = v }

func (s *Params_declarContext) GetLista() *arrayList.List { return s.lista }

func (s *Params_declarContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *Params_declarContext) ID() antlr.TerminalNode {
	return s.GetToken(RustParID, 0)
}

func (s *Params_declarContext) DPUNTO2() antlr.TerminalNode {
	return s.GetToken(RustParDPUNTO2, 0)
}

func (s *Params_declarContext) Tipos_var() ITipos_varContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITipos_varContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITipos_varContext)
}

func (s *Params_declarContext) COMA() antlr.TerminalNode {
	return s.GetToken(RustParCOMA, 0)
}

func (s *Params_declarContext) Params_declar() IParams_declarContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IParams_declarContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IParams_declarContext)
}

func (s *Params_declarContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Params_declarContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Params_declarContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterParams_declar(s)
	}
}

func (s *Params_declarContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitParams_declar(s)
	}
}

func (p *RustPar) Params_declar() (localctx IParams_declarContext) {
	return p.params_declar(0)
}

func (p *RustPar) params_declar(_p int) (localctx IParams_declarContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewParams_declarContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IParams_declarContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 10
	p.EnterRecursionRule(localctx, 10, RustParRULE_params_declar, _p)

	localctx.(*Params_declarContext).lista = arrayList.New()

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
		p.SetState(140)
		p.Match(RustParID)
	}
	{
		p.SetState(141)
		p.Match(RustParDPUNTO2)
	}
	{
		p.SetState(142)
		p.Tipos_var()
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(151)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 4, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewParams_declarContext(p, _parentctx, _parentState)
			localctx.(*Params_declarContext).sublista = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_params_declar)
			p.SetState(144)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(145)
				p.Match(RustParCOMA)
			}
			{
				p.SetState(146)
				p.Match(RustParID)
			}
			{
				p.SetState(147)
				p.Match(RustParDPUNTO2)
			}
			{
				p.SetState(148)
				p.Tipos_var()
			}

		}
		p.SetState(153)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 4, p.GetParserRuleContext())
	}

	return localctx
}

// IFn_mainContext is an interface to support dynamic dispatch.
type IFn_mainContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_MAIN returns the _MAIN token.
	Get_MAIN() antlr.Token

	// Set_MAIN sets the _MAIN token.
	Set_MAIN(antlr.Token)

	// Get_bloque_inst returns the _bloque_inst rule contexts.
	Get_bloque_inst() IBloque_instContext

	// Set_bloque_inst sets the _bloque_inst rule contexts.
	Set_bloque_inst(IBloque_instContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// IsFn_mainContext differentiates from other interfaces.
	IsFn_mainContext()
}

type Fn_mainContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	instr        interfaces.Instruction
	_MAIN        antlr.Token
	_bloque_inst IBloque_instContext
}

func NewEmptyFn_mainContext() *Fn_mainContext {
	var p = new(Fn_mainContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_fn_main
	return p
}

func (*Fn_mainContext) IsFn_mainContext() {}

func NewFn_mainContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Fn_mainContext {
	var p = new(Fn_mainContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_fn_main

	return p
}

func (s *Fn_mainContext) GetParser() antlr.Parser { return s.parser }

func (s *Fn_mainContext) Get_MAIN() antlr.Token { return s._MAIN }

func (s *Fn_mainContext) Set_MAIN(v antlr.Token) { s._MAIN = v }

func (s *Fn_mainContext) Get_bloque_inst() IBloque_instContext { return s._bloque_inst }

func (s *Fn_mainContext) Set_bloque_inst(v IBloque_instContext) { s._bloque_inst = v }

func (s *Fn_mainContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *Fn_mainContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *Fn_mainContext) FN() antlr.TerminalNode {
	return s.GetToken(RustParFN, 0)
}

func (s *Fn_mainContext) MAIN() antlr.TerminalNode {
	return s.GetToken(RustParMAIN, 0)
}

func (s *Fn_mainContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *Fn_mainContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *Fn_mainContext) Bloque_inst() IBloque_instContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_instContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloque_instContext)
}

func (s *Fn_mainContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Fn_mainContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Fn_mainContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterFn_main(s)
	}
}

func (s *Fn_mainContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitFn_main(s)
	}
}

func (p *RustPar) Fn_main() (localctx IFn_mainContext) {
	this := p
	_ = this

	localctx = NewFn_mainContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, RustParRULE_fn_main)
	listParams := arrayList.New()

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
		p.SetState(154)
		p.Match(RustParFN)
	}
	{
		p.SetState(155)

		var _m = p.Match(RustParMAIN)

		localctx.(*Fn_mainContext)._MAIN = _m
	}
	{
		p.SetState(156)
		p.Match(RustParPARIZQ)
	}
	{
		p.SetState(157)
		p.Match(RustParPARDER)
	}
	{
		p.SetState(158)

		var _x = p.Bloque_inst()

		localctx.(*Fn_mainContext)._bloque_inst = _x
	}
	localctx.(*Fn_mainContext).instr = interfaces.NewFunction("main", listParams, localctx.(*Fn_mainContext).Get_bloque_inst().GetL(), interfaces.VOID, (func() int {
		if localctx.(*Fn_mainContext).Get_MAIN() == nil {
			return 0
		} else {
			return localctx.(*Fn_mainContext).Get_MAIN().GetLine()
		}
	}()), (func() int {
		if localctx.(*Fn_mainContext).Get_MAIN() == nil {
			return 0
		} else {
			return localctx.(*Fn_mainContext).Get_MAIN().GetColumn()
		}
	}()))

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

	// Get_callFunction returns the _callFunction rule contexts.
	Get_callFunction() ICallFunctionContext

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

	// Set_callFunction sets the _callFunction rule contexts.
	Set_callFunction(ICallFunctionContext)

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
	_callFunction ICallFunctionContext
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

func (s *InstruccionContext) Get_callFunction() ICallFunctionContext { return s._callFunction }

func (s *InstruccionContext) Set_printconsola(v IPrintconsolaContext) { s._printconsola = v }

func (s *InstruccionContext) Set_declaracion(v IDeclaracionContext) { s._declaracion = v }

func (s *InstruccionContext) Set_asignacion(v IAsignacionContext) { s._asignacion = v }

func (s *InstruccionContext) Set_if_sent(v IIf_sentContext) { s._if_sent = v }

func (s *InstruccionContext) Set_match_sent(v IMatch_sentContext) { s._match_sent = v }

func (s *InstruccionContext) Set_callFunction(v ICallFunctionContext) { s._callFunction = v }

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

func (s *InstruccionContext) CallFunction() ICallFunctionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICallFunctionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ICallFunctionContext)
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
	p.EnterRule(localctx, 14, RustParRULE_instruccion)

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

	p.SetState(183)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 5, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(161)

			var _x = p.Printconsola()

			localctx.(*InstruccionContext)._printconsola = _x
		}
		{
			p.SetState(162)
			p.Match(RustParPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_printconsola().GetInstr()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(165)

			var _x = p.Declaracion()

			localctx.(*InstruccionContext)._declaracion = _x
		}
		{
			p.SetState(166)
			p.Match(RustParPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_declaracion().GetInstr()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(169)

			var _x = p.Asignacion()

			localctx.(*InstruccionContext)._asignacion = _x
		}
		{
			p.SetState(170)
			p.Match(RustParPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_asignacion().GetInstr()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(173)

			var _x = p.If_sent()

			localctx.(*InstruccionContext)._if_sent = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_if_sent().GetInstr()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(176)

			var _x = p.Match_sent()

			localctx.(*InstruccionContext)._match_sent = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_match_sent().GetInstr()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(179)

			var _x = p.CallFunction()

			localctx.(*InstruccionContext)._callFunction = _x
		}
		{
			p.SetState(180)
			p.Match(RustParPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_callFunction().GetInstr()

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

	// Get_callFunction returns the _callFunction rule contexts.
	Get_callFunction() ICallFunctionContext

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

	// Set_callFunction sets the _callFunction rule contexts.
	Set_callFunction(ICallFunctionContext)

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
	_callFunction ICallFunctionContext
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

func (s *Instruccion_onlyContext) Get_callFunction() ICallFunctionContext { return s._callFunction }

func (s *Instruccion_onlyContext) Set_printconsola(v IPrintconsolaContext) { s._printconsola = v }

func (s *Instruccion_onlyContext) Set_declaracion(v IDeclaracionContext) { s._declaracion = v }

func (s *Instruccion_onlyContext) Set_asignacion(v IAsignacionContext) { s._asignacion = v }

func (s *Instruccion_onlyContext) Set_if_sent(v IIf_sentContext) { s._if_sent = v }

func (s *Instruccion_onlyContext) Set_match_sent(v IMatch_sentContext) { s._match_sent = v }

func (s *Instruccion_onlyContext) Set_callFunction(v ICallFunctionContext) { s._callFunction = v }

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

func (s *Instruccion_onlyContext) CallFunction() ICallFunctionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICallFunctionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ICallFunctionContext)
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
	p.EnterRule(localctx, 16, RustParRULE_instruccion_only)

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

	p.SetState(203)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 6, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(185)

			var _x = p.Printconsola()

			localctx.(*Instruccion_onlyContext)._printconsola = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_printconsola().GetInstr()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(188)

			var _x = p.Declaracion()

			localctx.(*Instruccion_onlyContext)._declaracion = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_declaracion().GetInstr()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(191)

			var _x = p.Asignacion()

			localctx.(*Instruccion_onlyContext)._asignacion = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_asignacion().GetInstr()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(194)

			var _x = p.If_sent()

			localctx.(*Instruccion_onlyContext)._if_sent = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_if_sent().GetInstr()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(197)

			var _x = p.Match_sent()

			localctx.(*Instruccion_onlyContext)._match_sent = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_match_sent().GetInstr()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(200)

			var _x = p.CallFunction()

			localctx.(*Instruccion_onlyContext)._callFunction = _x
		}
		localctx.(*Instruccion_onlyContext).instr = localctx.(*Instruccion_onlyContext).Get_callFunction().GetInstr()

	}

	return localctx
}

// ICallFunctionContext is an interface to support dynamic dispatch.
type ICallFunctionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruction

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruction)

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsCallFunctionContext differentiates from other interfaces.
	IsCallFunctionContext()
}

type CallFunctionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	instr  interfaces.Instruction
	p      interfaces.Expresion
	_ID    antlr.Token
}

func NewEmptyCallFunctionContext() *CallFunctionContext {
	var p = new(CallFunctionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_callFunction
	return p
}

func (*CallFunctionContext) IsCallFunctionContext() {}

func NewCallFunctionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CallFunctionContext {
	var p = new(CallFunctionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_callFunction

	return p
}

func (s *CallFunctionContext) GetParser() antlr.Parser { return s.parser }

func (s *CallFunctionContext) Get_ID() antlr.Token { return s._ID }

func (s *CallFunctionContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *CallFunctionContext) GetInstr() interfaces.Instruction { return s.instr }

func (s *CallFunctionContext) GetP() interfaces.Expresion { return s.p }

func (s *CallFunctionContext) SetInstr(v interfaces.Instruction) { s.instr = v }

func (s *CallFunctionContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *CallFunctionContext) ID() antlr.TerminalNode {
	return s.GetToken(RustParID, 0)
}

func (s *CallFunctionContext) PARIZQ() antlr.TerminalNode {
	return s.GetToken(RustParPARIZQ, 0)
}

func (s *CallFunctionContext) PARDER() antlr.TerminalNode {
	return s.GetToken(RustParPARDER, 0)
}

func (s *CallFunctionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CallFunctionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CallFunctionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterCallFunction(s)
	}
}

func (s *CallFunctionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitCallFunction(s)
	}
}

func (p *RustPar) CallFunction() (localctx ICallFunctionContext) {
	this := p
	_ = this

	localctx = NewCallFunctionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, RustParRULE_callFunction)

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
		p.SetState(205)

		var _m = p.Match(RustParID)

		localctx.(*CallFunctionContext)._ID = _m
	}
	{
		p.SetState(206)
		p.Match(RustParPARIZQ)
	}
	{
		p.SetState(207)
		p.Match(RustParPARDER)
	}

	localctx.(*CallFunctionContext).instr = instructionExpre.NewCallFunction((func() string {
		if localctx.(*CallFunctionContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*CallFunctionContext).Get_ID().GetText()
		}
	}()), arrayList.New(), (func() int {
		if localctx.(*CallFunctionContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*CallFunctionContext).Get_ID().GetLine()
		}
	}()), (func() int {
		if localctx.(*CallFunctionContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*CallFunctionContext).Get_ID().GetColumn()
		}
	}()))
	localctx.(*CallFunctionContext).p = instructionExpre.NewCallFunction((func() string {
		if localctx.(*CallFunctionContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*CallFunctionContext).Get_ID().GetText()
		}
	}()), arrayList.New(), (func() int {
		if localctx.(*CallFunctionContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*CallFunctionContext).Get_ID().GetLine()
		}
	}()), (func() int {
		if localctx.(*CallFunctionContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*CallFunctionContext).Get_ID().GetColumn()
		}
	}()))

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
	p.EnterRule(localctx, 20, RustParRULE_printconsola)

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
		p.SetState(210)

		var _m = p.Match(RustParPRINT_CON)

		localctx.(*PrintconsolaContext)._PRINT_CON = _m
	}
	{
		p.SetState(211)
		p.Match(RustParPARIZQ)
	}
	{
		p.SetState(212)

		var _x = p.listParams(0)

		localctx.(*PrintconsolaContext)._listParams = _x
	}
	{
		p.SetState(213)
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
	_startState := 22
	p.EnterRecursionRule(localctx, 22, RustParRULE_listParams, _p)

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
		p.SetState(217)

		var _x = p.Expression()

		localctx.(*ListParamsContext)._expression = _x
	}
	localctx.(*ListParamsContext).l_e.Add(localctx.(*ListParamsContext).Get_expression().GetP())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(227)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListParamsContext(p, _parentctx, _parentState)
			localctx.(*ListParamsContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_listParams)
			p.SetState(220)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(221)
				p.Match(RustParCOMA)
			}
			{
				p.SetState(222)

				var _x = p.Expression()

				localctx.(*ListParamsContext)._expression = _x
			}

			localctx.(*ListParamsContext).GetList().GetL_e().Add(localctx.(*ListParamsContext).Get_expression().GetP())
			localctx.(*ListParamsContext).l_e = localctx.(*ListParamsContext).GetList().GetL_e()

		}
		p.SetState(229)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 24, RustParRULE_declaracion)

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

	p.SetState(255)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(230)
			p.Match(RustParLET)
		}
		{
			p.SetState(231)

			var _x = p.Is_mut()

			localctx.(*DeclaracionContext).isMut = _x
		}
		{
			p.SetState(232)

			var _m = p.Match(RustParID)

			localctx.(*DeclaracionContext).id = _m
		}
		{
			p.SetState(233)
			p.Match(RustParDPUNTO2)
		}
		{
			p.SetState(234)

			var _x = p.Tipos_var()

			localctx.(*DeclaracionContext)._tipos_var = _x
		}
		{
			p.SetState(235)

			var _m = p.Match(RustParASIGNACION)

			localctx.(*DeclaracionContext).asig = _m
		}
		{
			p.SetState(236)

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
			p.SetState(239)
			p.Match(RustParLET)
		}
		{
			p.SetState(240)

			var _x = p.Is_mut()

			localctx.(*DeclaracionContext).isMut = _x
		}
		{
			p.SetState(241)

			var _m = p.Match(RustParID)

			localctx.(*DeclaracionContext).id = _m
		}
		{
			p.SetState(242)

			var _m = p.Match(RustParASIGNACION)

			localctx.(*DeclaracionContext).asig = _m
		}
		{
			p.SetState(243)

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
			p.SetState(246)
			p.Match(RustParLET)
		}
		{
			p.SetState(247)

			var _x = p.Is_mut()

			localctx.(*DeclaracionContext).isMut = _x
		}
		{
			p.SetState(248)

			var _m = p.Match(RustParID)

			localctx.(*DeclaracionContext).id = _m
		}
		{
			p.SetState(249)
			p.Match(RustParDPUNTO2)
		}
		{
			p.SetState(250)

			var _x = p.Array_type()

			localctx.(*DeclaracionContext)._array_type = _x
		}
		{
			p.SetState(251)

			var _m = p.Match(RustParASIGNACION)

			localctx.(*DeclaracionContext).asig = _m
		}
		{
			p.SetState(252)

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
	p.EnterRule(localctx, 26, RustParRULE_is_mut)

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

	p.SetState(260)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParMUT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(257)
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
	p.EnterRule(localctx, 28, RustParRULE_array_type)

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

	p.SetState(276)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(262)

			var _m = p.Match(RustParCORIZQ)

			localctx.(*Array_typeContext)._CORIZQ = _m
		}
		{
			p.SetState(263)

			var _x = p.Array_type()

			localctx.(*Array_typeContext)._array_type = _x
		}
		{
			p.SetState(264)
			p.Match(RustParPTCOMA)
		}
		{
			p.SetState(265)

			var _x = p.Expression()

			localctx.(*Array_typeContext)._expression = _x
		}
		{
			p.SetState(266)
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
			p.SetState(269)

			var _m = p.Match(RustParCORIZQ)

			localctx.(*Array_typeContext)._CORIZQ = _m
		}
		{
			p.SetState(270)

			var _x = p.Tipos_var()

			localctx.(*Array_typeContext)._tipos_var = _x
		}
		{
			p.SetState(271)
			p.Match(RustParPTCOMA)
		}
		{
			p.SetState(272)

			var _x = p.Expression()

			localctx.(*Array_typeContext)._expression = _x
		}
		{
			p.SetState(273)
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

	// Get_list_index returns the _list_index rule contexts.
	Get_list_index() IList_indexContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_list_index sets the _list_index rule contexts.
	Set_list_index(IList_indexContext)

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
	_list_index IList_indexContext
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

func (s *AsignacionContext) Get_list_index() IList_indexContext { return s._list_index }

func (s *AsignacionContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *AsignacionContext) Set_list_index(v IList_indexContext) { s._list_index = v }

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

func (s *AsignacionContext) List_index() IList_indexContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IList_indexContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IList_indexContext)
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
	p.EnterRule(localctx, 30, RustParRULE_asignacion)

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

	p.SetState(289)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 11, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(278)

			var _m = p.Match(RustParID)

			localctx.(*AsignacionContext).id = _m
		}
		{
			p.SetState(279)
			p.Match(RustParASIGNACION)
		}
		{
			p.SetState(280)

			var _x = p.Expression()

			localctx.(*AsignacionContext)._expression = _x
		}
		localctx.(*AsignacionContext).instr = instruction.NewAssignment((func() string {
			if localctx.(*AsignacionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*AsignacionContext).GetId().GetText()
			}
		}()), localctx.(*AsignacionContext).Get_expression().GetP(), nil, (func() int {
			if localctx.(*AsignacionContext).GetId() == nil {
				return 0
			} else {
				return localctx.(*AsignacionContext).GetId().GetLine()
			}
		}()), localctx.(*AsignacionContext).GetId().GetColumn())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(283)

			var _m = p.Match(RustParID)

			localctx.(*AsignacionContext).id = _m
		}
		{
			p.SetState(284)

			var _x = p.list_index(0)

			localctx.(*AsignacionContext)._list_index = _x
		}
		{
			p.SetState(285)
			p.Match(RustParASIGNACION)
		}
		{
			p.SetState(286)

			var _x = p.Expression()

			localctx.(*AsignacionContext)._expression = _x
		}
		localctx.(*AsignacionContext).instr = instruction.NewAssignment((func() string {
			if localctx.(*AsignacionContext).GetId() == nil {
				return ""
			} else {
				return localctx.(*AsignacionContext).GetId().GetText()
			}
		}()), localctx.(*AsignacionContext).Get_expression().GetP(), localctx.(*AsignacionContext).Get_list_index().GetLista(), (func() int {
			if localctx.(*AsignacionContext).GetId() == nil {
				return 0
			} else {
				return localctx.(*AsignacionContext).GetId().GetLine()
			}
		}()), localctx.(*AsignacionContext).GetId().GetColumn())

	}

	return localctx
}

// IList_indexContext is an interface to support dynamic dispatch.
type IList_indexContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetListi returns the listi rule contexts.
	GetListi() IList_indexContext

	// Get_index_array returns the _index_array rule contexts.
	Get_index_array() IIndex_arrayContext

	// SetListi sets the listi rule contexts.
	SetListi(IList_indexContext)

	// Set_index_array sets the _index_array rule contexts.
	Set_index_array(IIndex_arrayContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsList_indexContext differentiates from other interfaces.
	IsList_indexContext()
}

type List_indexContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	lista        *arrayList.List
	listi        IList_indexContext
	_index_array IIndex_arrayContext
}

func NewEmptyList_indexContext() *List_indexContext {
	var p = new(List_indexContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_list_index
	return p
}

func (*List_indexContext) IsList_indexContext() {}

func NewList_indexContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *List_indexContext {
	var p = new(List_indexContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_list_index

	return p
}

func (s *List_indexContext) GetParser() antlr.Parser { return s.parser }

func (s *List_indexContext) GetListi() IList_indexContext { return s.listi }

func (s *List_indexContext) Get_index_array() IIndex_arrayContext { return s._index_array }

func (s *List_indexContext) SetListi(v IList_indexContext) { s.listi = v }

func (s *List_indexContext) Set_index_array(v IIndex_arrayContext) { s._index_array = v }

func (s *List_indexContext) GetLista() *arrayList.List { return s.lista }

func (s *List_indexContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *List_indexContext) Index_array() IIndex_arrayContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IIndex_arrayContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IIndex_arrayContext)
}

func (s *List_indexContext) List_index() IList_indexContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IList_indexContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IList_indexContext)
}

func (s *List_indexContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *List_indexContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *List_indexContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterList_index(s)
	}
}

func (s *List_indexContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitList_index(s)
	}
}

func (p *RustPar) List_index() (localctx IList_indexContext) {
	return p.list_index(0)
}

func (p *RustPar) list_index(_p int) (localctx IList_indexContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewList_indexContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IList_indexContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 32
	p.EnterRecursionRule(localctx, 32, RustParRULE_list_index, _p)

	localctx.(*List_indexContext).lista = arrayList.New()

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
		p.SetState(292)

		var _x = p.Index_array()

		localctx.(*List_indexContext)._index_array = _x
	}
	localctx.(*List_indexContext).lista.Add(localctx.(*List_indexContext).Get_index_array().GetIndex())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(301)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewList_indexContext(p, _parentctx, _parentState)
			localctx.(*List_indexContext).listi = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_list_index)
			p.SetState(295)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(296)

				var _x = p.Index_array()

				localctx.(*List_indexContext)._index_array = _x
			}

			localctx.(*List_indexContext).GetListi().GetLista().Add(localctx.(*List_indexContext).Get_index_array().GetIndex())
			localctx.(*List_indexContext).lista = localctx.(*List_indexContext).GetListi().GetLista()

		}
		p.SetState(303)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())
	}

	return localctx
}

// IIndex_arrayContext is an interface to support dynamic dispatch.
type IIndex_arrayContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetIndex returns the index attribute.
	GetIndex() interfaces.Expresion

	// SetIndex sets the index attribute.
	SetIndex(interfaces.Expresion)

	// IsIndex_arrayContext differentiates from other interfaces.
	IsIndex_arrayContext()
}

type Index_arrayContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	index       interfaces.Expresion
	_expression IExpressionContext
}

func NewEmptyIndex_arrayContext() *Index_arrayContext {
	var p = new(Index_arrayContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_index_array
	return p
}

func (*Index_arrayContext) IsIndex_arrayContext() {}

func NewIndex_arrayContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Index_arrayContext {
	var p = new(Index_arrayContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_index_array

	return p
}

func (s *Index_arrayContext) GetParser() antlr.Parser { return s.parser }

func (s *Index_arrayContext) Get_expression() IExpressionContext { return s._expression }

func (s *Index_arrayContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Index_arrayContext) GetIndex() interfaces.Expresion { return s.index }

func (s *Index_arrayContext) SetIndex(v interfaces.Expresion) { s.index = v }

func (s *Index_arrayContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(RustParCORIZQ, 0)
}

func (s *Index_arrayContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Index_arrayContext) CORDER() antlr.TerminalNode {
	return s.GetToken(RustParCORDER, 0)
}

func (s *Index_arrayContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Index_arrayContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Index_arrayContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterIndex_array(s)
	}
}

func (s *Index_arrayContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitIndex_array(s)
	}
}

func (p *RustPar) Index_array() (localctx IIndex_arrayContext) {
	this := p
	_ = this

	localctx = NewIndex_arrayContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 34, RustParRULE_index_array)

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
		p.SetState(304)
		p.Match(RustParCORIZQ)
	}
	{
		p.SetState(305)

		var _x = p.Expression()

		localctx.(*Index_arrayContext)._expression = _x
	}
	{
		p.SetState(306)
		p.Match(RustParCORDER)
	}
	localctx.(*Index_arrayContext).index = localctx.(*Index_arrayContext).Get_expression().GetP()

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
	p.EnterRule(localctx, 36, RustParRULE_if_sent)

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

	p.SetState(329)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 13, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(309)

			var _m = p.Match(RustParIF)

			localctx.(*If_sentContext)._IF = _m
		}
		{
			p.SetState(310)

			var _x = p.Expression()

			localctx.(*If_sentContext)._expression = _x
		}
		{
			p.SetState(311)

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
			p.SetState(314)

			var _m = p.Match(RustParIF)

			localctx.(*If_sentContext)._IF = _m
		}
		{
			p.SetState(315)

			var _x = p.Expression()

			localctx.(*If_sentContext)._expression = _x
		}
		{
			p.SetState(316)

			var _x = p.Bloque_inst()

			localctx.(*If_sentContext).bprin = _x
		}
		{
			p.SetState(317)
			p.Match(RustParELSE)
		}
		{
			p.SetState(318)

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
			p.SetState(321)

			var _m = p.Match(RustParIF)

			localctx.(*If_sentContext)._IF = _m
		}
		{
			p.SetState(322)

			var _x = p.Expression()

			localctx.(*If_sentContext)._expression = _x
		}
		{
			p.SetState(323)

			var _x = p.Bloque_inst()

			localctx.(*If_sentContext).bprin = _x
		}
		{
			p.SetState(324)

			var _x = p.List_elseif()

			localctx.(*If_sentContext)._list_elseif = _x
		}
		{
			p.SetState(325)
			p.Match(RustParELSE)
		}
		{
			p.SetState(326)

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
	p.EnterRule(localctx, 38, RustParRULE_if_exp)

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

	p.SetState(346)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(331)

			var _m = p.Match(RustParIF)

			localctx.(*If_expContext)._IF = _m
		}
		{
			p.SetState(332)

			var _x = p.Expression()

			localctx.(*If_expContext)._expression = _x
		}
		{
			p.SetState(333)

			var _x = p.Bloque_exp()

			localctx.(*If_expContext).bprin_e = _x
		}
		{
			p.SetState(334)
			p.Match(RustParELSE)
		}
		{
			p.SetState(335)

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
			p.SetState(338)

			var _m = p.Match(RustParIF)

			localctx.(*If_expContext)._IF = _m
		}
		{
			p.SetState(339)

			var _x = p.Expression()

			localctx.(*If_expContext)._expression = _x
		}
		{
			p.SetState(340)

			var _x = p.Bloque_exp()

			localctx.(*If_expContext).bprin_e = _x
		}
		{
			p.SetState(341)

			var _x = p.List_elseif_exp()

			localctx.(*If_expContext)._list_elseif_exp = _x
		}
		{
			p.SetState(342)
			p.Match(RustParELSE)
		}
		{
			p.SetState(343)

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
	p.EnterRule(localctx, 40, RustParRULE_list_elseif)
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
	p.SetState(349)
	p.GetErrorHandler().Sync(p)
	_alt = 1
	for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		switch _alt {
		case 1:
			{
				p.SetState(348)

				var _x = p.Else_if()

				localctx.(*List_elseifContext)._else_if = _x
			}
			localctx.(*List_elseifContext).list = append(localctx.(*List_elseifContext).list, localctx.(*List_elseifContext)._else_if)

		default:
			panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		}

		p.SetState(351)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 15, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 42, RustParRULE_list_elseif_exp)
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
	p.SetState(356)
	p.GetErrorHandler().Sync(p)
	_alt = 1
	for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		switch _alt {
		case 1:
			{
				p.SetState(355)

				var _x = p.Else_if_exp()

				localctx.(*List_elseif_expContext)._else_if_exp = _x
			}
			localctx.(*List_elseif_expContext).list = append(localctx.(*List_elseif_expContext).list, localctx.(*List_elseif_expContext)._else_if_exp)

		default:
			panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		}

		p.SetState(358)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 16, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 44, RustParRULE_else_if)

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
		p.SetState(362)

		var _m = p.Match(RustParELSE)

		localctx.(*Else_ifContext)._ELSE = _m
	}
	{
		p.SetState(363)
		p.Match(RustParIF)
	}
	{
		p.SetState(364)

		var _x = p.Expression()

		localctx.(*Else_ifContext)._expression = _x
	}
	{
		p.SetState(365)

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
	p.EnterRule(localctx, 46, RustParRULE_else_if_exp)

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
		p.SetState(368)

		var _m = p.Match(RustParELSE)

		localctx.(*Else_if_expContext)._ELSE = _m
	}
	{
		p.SetState(369)
		p.Match(RustParIF)
	}
	{
		p.SetState(370)

		var _x = p.Expression()

		localctx.(*Else_if_expContext)._expression = _x
	}
	{
		p.SetState(371)

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
	p.EnterRule(localctx, 48, RustParRULE_match_sent)

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

	p.SetState(403)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(374)

			var _m = p.Match(RustParMATCH)

			localctx.(*Match_sentContext)._MATCH = _m
		}
		{
			p.SetState(375)

			var _x = p.Expression()

			localctx.(*Match_sentContext)._expression = _x
		}
		{
			p.SetState(376)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(377)

			var _x = p.match_brazos(0)

			localctx.(*Match_sentContext).brazos = _x
		}
		{
			p.SetState(378)
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
			p.SetState(381)

			var _m = p.Match(RustParMATCH)

			localctx.(*Match_sentContext)._MATCH = _m
		}
		{
			p.SetState(382)

			var _x = p.Expression()

			localctx.(*Match_sentContext)._expression = _x
		}
		{
			p.SetState(383)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(384)

			var _x = p.match_brazos(0)

			localctx.(*Match_sentContext).brazos = _x
		}
		{
			p.SetState(385)
			p.Match(RustParGUIONB)
		}
		{
			p.SetState(386)

			var _m = p.Match(RustParMTHEN)

			localctx.(*Match_sentContext).th = _m
		}
		{
			p.SetState(387)

			var _x = p.Bloque_inst()

			localctx.(*Match_sentContext)._bloque_inst = _x
		}
		{
			p.SetState(388)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(389)
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
			p.SetState(392)

			var _m = p.Match(RustParMATCH)

			localctx.(*Match_sentContext)._MATCH = _m
		}
		{
			p.SetState(393)

			var _x = p.Expression()

			localctx.(*Match_sentContext)._expression = _x
		}
		{
			p.SetState(394)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(395)

			var _x = p.match_brazos(0)

			localctx.(*Match_sentContext).brazos = _x
		}
		{
			p.SetState(396)
			p.Match(RustParGUIONB)
		}
		{
			p.SetState(397)

			var _m = p.Match(RustParMTHEN)

			localctx.(*Match_sentContext).th = _m
		}
		{
			p.SetState(398)

			var _x = p.Instruccion_only()

			localctx.(*Match_sentContext)._instruccion_only = _x
		}
		{
			p.SetState(399)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(400)
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
	_startState := 50
	p.EnterRecursionRule(localctx, 50, RustParRULE_match_brazos, _p)

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
		p.SetState(406)

		var _x = p.Matchbrazo()

		localctx.(*Match_brazosContext)._matchbrazo = _x
	}
	localctx.(*Match_brazosContext).l_brazos.Add(localctx.(*Match_brazosContext).Get_matchbrazo().GetBrazo())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(415)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewMatch_brazosContext(p, _parentctx, _parentState)
			localctx.(*Match_brazosContext).listb = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_match_brazos)
			p.SetState(409)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(410)

				var _x = p.Matchbrazo()

				localctx.(*Match_brazosContext)._matchbrazo = _x
			}

			localctx.(*Match_brazosContext).GetListb().GetL_brazos().Add(localctx.(*Match_brazosContext).Get_matchbrazo().GetBrazo())
			localctx.(*Match_brazosContext).l_brazos = localctx.(*Match_brazosContext).GetListb().GetL_brazos()

		}
		p.SetState(417)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 52, RustParRULE_matchbrazo)

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

	p.SetState(430)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 19, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(418)

			var _x = p.listaOpciones(0)

			localctx.(*MatchbrazoContext)._listaOpciones = _x
		}
		{
			p.SetState(419)

			var _m = p.Match(RustParMTHEN)

			localctx.(*MatchbrazoContext).th = _m
		}
		{
			p.SetState(420)

			var _x = p.Bloque_inst()

			localctx.(*MatchbrazoContext)._bloque_inst = _x
		}
		{
			p.SetState(421)
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
			p.SetState(424)

			var _x = p.listaOpciones(0)

			localctx.(*MatchbrazoContext)._listaOpciones = _x
		}
		{
			p.SetState(425)

			var _m = p.Match(RustParMTHEN)

			localctx.(*MatchbrazoContext).th = _m
		}
		{
			p.SetState(426)

			var _x = p.Instruccion_only()

			localctx.(*MatchbrazoContext)._instruccion_only = _x
		}
		{
			p.SetState(427)
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
	_startState := 54
	p.EnterRecursionRule(localctx, 54, RustParRULE_listaOpciones, _p)

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
		p.SetState(433)

		var _x = p.Primitivo()

		localctx.(*ListaOpcionesContext)._primitivo = _x
	}

	localctx.(*ListaOpcionesContext).lisop.Add(localctx.(*ListaOpcionesContext).Get_primitivo().GetP())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(443)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListaOpcionesContext(p, _parentctx, _parentState)
			localctx.(*ListaOpcionesContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_listaOpciones)
			p.SetState(436)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(437)
				p.Match(RustParMTOR)
			}
			{
				p.SetState(438)

				var _x = p.Primitivo()

				localctx.(*ListaOpcionesContext)._primitivo = _x
			}

			localctx.(*ListaOpcionesContext).GetList().GetLisop().Add(localctx.(*ListaOpcionesContext).Get_primitivo().GetP())
			localctx.(*ListaOpcionesContext).lisop = localctx.(*ListaOpcionesContext).GetList().GetLisop()

		}
		p.SetState(445)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 56, RustParRULE_bloque_inst)

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

	p.SetState(454)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 21, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(446)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(447)

			var _x = p.Instrucciones()

			localctx.(*Bloque_instContext)._instrucciones = _x
		}
		{
			p.SetState(448)
			p.Match(RustParLLAVEDER)
		}
		localctx.(*Bloque_instContext).l = localctx.(*Bloque_instContext).Get_instrucciones().GetL()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(451)
			p.Match(RustParLLAVEIZQ)
		}
		{
			p.SetState(452)
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
	p.EnterRule(localctx, 58, RustParRULE_bloque_exp)

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
		p.SetState(456)
		p.Match(RustParLLAVEIZQ)
	}
	{
		p.SetState(457)

		var _x = p.Expression()

		localctx.(*Bloque_expContext)._expression = _x
	}
	{
		p.SetState(458)
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
	p.EnterRule(localctx, 60, RustParRULE_tipos_var)

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

	p.SetState(471)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParT_NUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(461)
			p.Match(RustParT_NUMBER)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.INTEGER

	case RustParT_STRING:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(463)
			p.Match(RustParT_STRING)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.STRING

	case RustParT_FLOAT:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(465)
			p.Match(RustParT_FLOAT)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.FLOAT

	case RustParT_BOOL:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(467)
			p.Match(RustParT_BOOL)
		}
		localctx.(*Tipos_varContext).tipo = interfaces.BOOLEAN

	case RustParT_STR:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(469)
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
	p.EnterRule(localctx, 62, RustParRULE_expression)

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
		p.SetState(473)

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

	// GetExp returns the exp rule contexts.
	GetExp() IExpressionContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// GetTam returns the tam rule contexts.
	GetTam() IExpressionContext

	// Get_listParams returns the _listParams rule contexts.
	Get_listParams() IListParamsContext

	// Get_primitivo returns the _primitivo rule contexts.
	Get_primitivo() IPrimitivoContext

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

	// SetExp sets the exp rule contexts.
	SetExp(IExpressionContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// SetTam sets the tam rule contexts.
	SetTam(IExpressionContext)

	// Set_listParams sets the _listParams rule contexts.
	Set_listParams(IListParamsContext)

	// Set_primitivo sets the _primitivo rule contexts.
	Set_primitivo(IPrimitivoContext)

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
	exp         IExpressionContext
	_expression IExpressionContext
	tam         IExpressionContext
	_listParams IListParamsContext
	_primitivo  IPrimitivoContext
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

func (s *Expr_aritContext) GetExp() IExpressionContext { return s.exp }

func (s *Expr_aritContext) Get_expression() IExpressionContext { return s._expression }

func (s *Expr_aritContext) GetTam() IExpressionContext { return s.tam }

func (s *Expr_aritContext) Get_listParams() IListParamsContext { return s._listParams }

func (s *Expr_aritContext) Get_primitivo() IPrimitivoContext { return s._primitivo }

func (s *Expr_aritContext) Get_casteo() ICasteoContext { return s._casteo }

func (s *Expr_aritContext) Get_if_exp() IIf_expContext { return s._if_exp }

func (s *Expr_aritContext) SetOpIz(v IExpr_aritContext) { s.opIz = v }

func (s *Expr_aritContext) SetOpU(v IExpr_aritContext) { s.opU = v }

func (s *Expr_aritContext) SetOpDe(v IExpr_aritContext) { s.opDe = v }

func (s *Expr_aritContext) SetExp(v IExpressionContext) { s.exp = v }

func (s *Expr_aritContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Expr_aritContext) SetTam(v IExpressionContext) { s.tam = v }

func (s *Expr_aritContext) Set_listParams(v IListParamsContext) { s._listParams = v }

func (s *Expr_aritContext) Set_primitivo(v IPrimitivoContext) { s._primitivo = v }

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

func (s *Expr_aritContext) PTCOMA() antlr.TerminalNode {
	return s.GetToken(RustParPTCOMA, 0)
}

func (s *Expr_aritContext) CORDER() antlr.TerminalNode {
	return s.GetToken(RustParCORDER, 0)
}

func (s *Expr_aritContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *Expr_aritContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Expr_aritContext) ListParams() IListParamsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListParamsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListParamsContext)
}

func (s *Expr_aritContext) Primitivo() IPrimitivoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrimitivoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrimitivoContext)
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
	_startState := 64
	p.EnterRecursionRule(localctx, 64, RustParRULE_expr_arit, _p)
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
	p.SetState(531)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 23, p.GetParserRuleContext()) {
	case 1:
		{
			p.SetState(477)

			var _m = p.Match(RustParSUB)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(478)

			var _x = p.expr_arit(15)

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
			p.SetState(481)
			p.Match(RustParT_NUMBER)
		}
		{
			p.SetState(482)
			p.Match(RustParDOSPUNTO)
		}
		{
			p.SetState(483)

			var _m = p.Match(RustParPOW)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(484)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(485)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
		}
		{
			p.SetState(486)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(487)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
		}
		{
			p.SetState(488)
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
			p.SetState(491)
			p.Match(RustParT_FLOAT)
		}
		{
			p.SetState(492)
			p.Match(RustParDOSPUNTO)
		}
		{
			p.SetState(493)

			var _m = p.Match(RustParPOWF)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(494)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(495)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opIz = _x
		}
		{
			p.SetState(496)
			p.Match(RustParCOMA)
		}
		{
			p.SetState(497)

			var _x = p.expr_arit(0)

			localctx.(*Expr_aritContext).opDe = _x
		}
		{
			p.SetState(498)
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
			p.SetState(501)

			var _m = p.Match(RustParNOT)

			localctx.(*Expr_aritContext).op = _m
		}
		{
			p.SetState(502)

			var _x = p.expr_arit(9)

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
			p.SetState(505)

			var _m = p.Match(RustParCORIZQ)

			localctx.(*Expr_aritContext)._CORIZQ = _m
		}
		{
			p.SetState(506)

			var _x = p.Expression()

			localctx.(*Expr_aritContext).exp = _x
			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(507)
			p.Match(RustParPTCOMA)
		}
		{
			p.SetState(508)

			var _x = p.Expression()

			localctx.(*Expr_aritContext).tam = _x
			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(509)
			p.Match(RustParCORDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewArray(nil, localctx.(*Expr_aritContext).GetExp().GetP(), localctx.(*Expr_aritContext).GetTam().GetP(), 2, (func() int {
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
			p.SetState(512)

			var _m = p.Match(RustParCORIZQ)

			localctx.(*Expr_aritContext)._CORIZQ = _m
		}
		{
			p.SetState(513)

			var _x = p.listParams(0)

			localctx.(*Expr_aritContext)._listParams = _x
		}
		{
			p.SetState(514)
			p.Match(RustParCORDER)
		}
		localctx.(*Expr_aritContext).p = expresion.NewArray(localctx.(*Expr_aritContext).Get_listParams().GetL_e(), nil, nil, 1, (func() int {
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

	case 7:
		{
			p.SetState(517)

			var _x = p.Primitivo()

			localctx.(*Expr_aritContext)._primitivo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_primitivo().GetP()

	case 8:
		{
			p.SetState(520)
			p.Match(RustParPARIZQ)
		}
		{
			p.SetState(521)

			var _x = p.Expression()

			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(522)
			p.Match(RustParPARDER)
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_expression().GetP()

	case 9:
		{
			p.SetState(525)

			var _x = p.Casteo()

			localctx.(*Expr_aritContext)._casteo = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_casteo().GetP()

	case 10:
		{
			p.SetState(528)

			var _x = p.If_exp()

			localctx.(*Expr_aritContext)._if_exp = _x
		}
		localctx.(*Expr_aritContext).p = localctx.(*Expr_aritContext).Get_if_exp().GetP()

	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(560)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(558)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 24, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(533)

				if !(p.Precpred(p.GetParserRuleContext(), 12)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 12)", ""))
				}
				{
					p.SetState(534)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la-42)&-(0x1f+1)) == 0 && ((1<<uint((_la-42)))&((1<<(RustParMUL-42))|(1<<(RustParDIV-42))|(1<<(RustParMOD-42)))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(535)

					var _x = p.expr_arit(13)

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
				p.SetState(538)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
				}
				{
					p.SetState(539)

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
					p.SetState(540)

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

			case 3:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(543)

				if !(p.Precpred(p.GetParserRuleContext(), 10)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 10)", ""))
				}
				{
					p.SetState(544)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la-36)&-(0x1f+1)) == 0 && ((1<<uint((_la-36)))&((1<<(RustParDISTINTO-36))|(1<<(RustParIGUAL-36))|(1<<(RustParMAYORIGUAL-36))|(1<<(RustParMENORIGUAL-36))|(1<<(RustParMAYOR-36))|(1<<(RustParMENOR-36)))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(545)

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

			case 4:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, RustParRULE_expr_arit)
				p.SetState(548)

				if !(p.Precpred(p.GetParserRuleContext(), 8)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 8)", ""))
				}
				{
					p.SetState(549)

					var _m = p.Match(RustParAND)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(550)

					var _x = p.expr_arit(9)

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
				p.SetState(553)

				if !(p.Precpred(p.GetParserRuleContext(), 7)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 7)", ""))
				}
				{
					p.SetState(554)

					var _m = p.Match(RustParOR)

					localctx.(*Expr_aritContext).op = _m
				}
				{
					p.SetState(555)

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

			}

		}
		p.SetState(562)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 66, RustParRULE_casteo)

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
		p.SetState(563)

		var _m = p.Match(RustParPARIZQ)

		localctx.(*CasteoContext)._PARIZQ = _m
	}
	{
		p.SetState(564)

		var _x = p.Expression()

		localctx.(*CasteoContext)._expression = _x
	}
	{
		p.SetState(565)
		p.Match(RustParAS)
	}
	{
		p.SetState(566)

		var _x = p.Tipo_cast()

		localctx.(*CasteoContext).typec = _x
	}
	{
		p.SetState(567)
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
	p.EnterRule(localctx, 68, RustParRULE_tipo_cast)

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

	p.SetState(574)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParT_FLOAT:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(570)
			p.Match(RustParT_FLOAT)
		}
		localctx.(*Tipo_castContext).tc = interfaces.FLOAT

	case RustParT_NUMBER:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(572)
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

	// Get_TRUE returns the _TRUE token.
	Get_TRUE() antlr.Token

	// Get_FALSE returns the _FALSE token.
	Get_FALSE() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_FLOAT sets the _FLOAT token.
	Set_FLOAT(antlr.Token)

	// Set_TRUE sets the _TRUE token.
	Set_TRUE(antlr.Token)

	// Set_FALSE sets the _FALSE token.
	Set_FALSE(antlr.Token)

	// Get_strings returns the _strings rule contexts.
	Get_strings() IStringsContext

	// GetList returns the list rule contexts.
	GetList() IListIDArrayContext

	// Set_strings sets the _strings rule contexts.
	Set_strings(IStringsContext)

	// SetList sets the list rule contexts.
	SetList(IListIDArrayContext)

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
	_TRUE    antlr.Token
	_FALSE   antlr.Token
	list     IListIDArrayContext
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

func (s *PrimitivoContext) Get_TRUE() antlr.Token { return s._TRUE }

func (s *PrimitivoContext) Get_FALSE() antlr.Token { return s._FALSE }

func (s *PrimitivoContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *PrimitivoContext) Set_FLOAT(v antlr.Token) { s._FLOAT = v }

func (s *PrimitivoContext) Set_TRUE(v antlr.Token) { s._TRUE = v }

func (s *PrimitivoContext) Set_FALSE(v antlr.Token) { s._FALSE = v }

func (s *PrimitivoContext) Get_strings() IStringsContext { return s._strings }

func (s *PrimitivoContext) GetList() IListIDArrayContext { return s.list }

func (s *PrimitivoContext) Set_strings(v IStringsContext) { s._strings = v }

func (s *PrimitivoContext) SetList(v IListIDArrayContext) { s.list = v }

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

func (s *PrimitivoContext) TRUE() antlr.TerminalNode {
	return s.GetToken(RustParTRUE, 0)
}

func (s *PrimitivoContext) FALSE() antlr.TerminalNode {
	return s.GetToken(RustParFALSE, 0)
}

func (s *PrimitivoContext) ListIDArray() IListIDArrayContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListIDArrayContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListIDArrayContext)
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
	p.EnterRule(localctx, 70, RustParRULE_primitivo)

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

	p.SetState(590)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case RustParNUMBER:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(576)

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
			p.SetState(578)

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
			p.SetState(580)

			var _x = p.Strings()

			localctx.(*PrimitivoContext)._strings = _x
		}
		localctx.(*PrimitivoContext).p = localctx.(*PrimitivoContext).Get_strings().GetP()

	case RustParTRUE:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(583)

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
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(585)

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

	case RustParID:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(587)

			var _x = p.listIDArray(0)

			localctx.(*PrimitivoContext).list = _x
		}
		localctx.(*PrimitivoContext).p = localctx.(*PrimitivoContext).GetList().GetP()

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IListIDArrayContext is an interface to support dynamic dispatch.
type IListIDArrayContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Get_CORIZQ returns the _CORIZQ token.
	Get_CORIZQ() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Set_CORIZQ sets the _CORIZQ token.
	Set_CORIZQ(antlr.Token)

	// GetList returns the list rule contexts.
	GetList() IListIDArrayContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetList sets the list rule contexts.
	SetList(IListIDArrayContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetP returns the p attribute.
	GetP() interfaces.Expresion

	// SetP sets the p attribute.
	SetP(interfaces.Expresion)

	// IsListIDArrayContext differentiates from other interfaces.
	IsListIDArrayContext()
}

type ListIDArrayContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	p           interfaces.Expresion
	list        IListIDArrayContext
	_ID         antlr.Token
	_CORIZQ     antlr.Token
	_expression IExpressionContext
}

func NewEmptyListIDArrayContext() *ListIDArrayContext {
	var p = new(ListIDArrayContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = RustParRULE_listIDArray
	return p
}

func (*ListIDArrayContext) IsListIDArrayContext() {}

func NewListIDArrayContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListIDArrayContext {
	var p = new(ListIDArrayContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = RustParRULE_listIDArray

	return p
}

func (s *ListIDArrayContext) GetParser() antlr.Parser { return s.parser }

func (s *ListIDArrayContext) Get_ID() antlr.Token { return s._ID }

func (s *ListIDArrayContext) Get_CORIZQ() antlr.Token { return s._CORIZQ }

func (s *ListIDArrayContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ListIDArrayContext) Set_CORIZQ(v antlr.Token) { s._CORIZQ = v }

func (s *ListIDArrayContext) GetList() IListIDArrayContext { return s.list }

func (s *ListIDArrayContext) Get_expression() IExpressionContext { return s._expression }

func (s *ListIDArrayContext) SetList(v IListIDArrayContext) { s.list = v }

func (s *ListIDArrayContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ListIDArrayContext) GetP() interfaces.Expresion { return s.p }

func (s *ListIDArrayContext) SetP(v interfaces.Expresion) { s.p = v }

func (s *ListIDArrayContext) ID() antlr.TerminalNode {
	return s.GetToken(RustParID, 0)
}

func (s *ListIDArrayContext) CORIZQ() antlr.TerminalNode {
	return s.GetToken(RustParCORIZQ, 0)
}

func (s *ListIDArrayContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ListIDArrayContext) CORDER() antlr.TerminalNode {
	return s.GetToken(RustParCORDER, 0)
}

func (s *ListIDArrayContext) ListIDArray() IListIDArrayContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListIDArrayContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListIDArrayContext)
}

func (s *ListIDArrayContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListIDArrayContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListIDArrayContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.EnterListIDArray(s)
	}
}

func (s *ListIDArrayContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RustParListener); ok {
		listenerT.ExitListIDArray(s)
	}
}

func (p *RustPar) ListIDArray() (localctx IListIDArrayContext) {
	return p.listIDArray(0)
}

func (p *RustPar) listIDArray(_p int) (localctx IListIDArrayContext) {
	this := p
	_ = this

	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListIDArrayContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListIDArrayContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 72
	p.EnterRecursionRule(localctx, 72, RustParRULE_listIDArray, _p)

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
		p.SetState(593)

		var _m = p.Match(RustParID)

		localctx.(*ListIDArrayContext)._ID = _m
	}

	localctx.(*ListIDArrayContext).p = expresion.NewIdentificador((func() string {
		if localctx.(*ListIDArrayContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*ListIDArrayContext).Get_ID().GetText()
		}
	}()), (func() int {
		if localctx.(*ListIDArrayContext).Get_ID() == nil {
			return 0
		} else {
			return localctx.(*ListIDArrayContext).Get_ID().GetLine()
		}
	}()), localctx.(*ListIDArrayContext).Get_ID().GetColumn())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(604)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 28, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListIDArrayContext(p, _parentctx, _parentState)
			localctx.(*ListIDArrayContext).list = _prevctx
			p.PushNewRecursionContext(localctx, _startState, RustParRULE_listIDArray)
			p.SetState(596)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(597)

				var _m = p.Match(RustParCORIZQ)

				localctx.(*ListIDArrayContext)._CORIZQ = _m
			}
			{
				p.SetState(598)

				var _x = p.Expression()

				localctx.(*ListIDArrayContext)._expression = _x
			}
			{
				p.SetState(599)
				p.Match(RustParCORDER)
			}
			localctx.(*ListIDArrayContext).p = expresion.NewArrayAccess(localctx.(*ListIDArrayContext).GetList().GetP(), localctx.(*ListIDArrayContext).Get_expression().GetP(), (func() int {
				if localctx.(*ListIDArrayContext).Get_CORIZQ() == nil {
					return 0
				} else {
					return localctx.(*ListIDArrayContext).Get_CORIZQ().GetLine()
				}
			}()), (func() int {
				if localctx.(*ListIDArrayContext).Get_CORIZQ() == nil {
					return 0
				} else {
					return localctx.(*ListIDArrayContext).Get_CORIZQ().GetColumn()
				}
			}()))

		}
		p.SetState(606)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 28, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 74, RustParRULE_strings)
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

	p.SetState(622)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 31, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		p.SetState(608)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for ok := true; ok; ok = _la == RustParAMP {
			{
				p.SetState(607)
				p.Match(RustParAMP)
			}

			p.SetState(610)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(612)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}
		p.SetState(614)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 30, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(613)
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
			p.SetState(617)

			var _m = p.Match(RustParSTRING)

			localctx.(*StringsContext)._STRING = _m
		}
		{
			p.SetState(618)
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
			p.SetState(620)

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
	case 2:
		var t *List_FuncionesContext = nil
		if localctx != nil {
			t = localctx.(*List_FuncionesContext)
		}
		return p.List_Funciones_Sempred(t, predIndex)

	case 5:
		var t *Params_declarContext = nil
		if localctx != nil {
			t = localctx.(*Params_declarContext)
		}
		return p.Params_declar_Sempred(t, predIndex)

	case 11:
		var t *ListParamsContext = nil
		if localctx != nil {
			t = localctx.(*ListParamsContext)
		}
		return p.ListParams_Sempred(t, predIndex)

	case 16:
		var t *List_indexContext = nil
		if localctx != nil {
			t = localctx.(*List_indexContext)
		}
		return p.List_index_Sempred(t, predIndex)

	case 25:
		var t *Match_brazosContext = nil
		if localctx != nil {
			t = localctx.(*Match_brazosContext)
		}
		return p.Match_brazos_Sempred(t, predIndex)

	case 27:
		var t *ListaOpcionesContext = nil
		if localctx != nil {
			t = localctx.(*ListaOpcionesContext)
		}
		return p.ListaOpciones_Sempred(t, predIndex)

	case 32:
		var t *Expr_aritContext = nil
		if localctx != nil {
			t = localctx.(*Expr_aritContext)
		}
		return p.Expr_arit_Sempred(t, predIndex)

	case 36:
		var t *ListIDArrayContext = nil
		if localctx != nil {
			t = localctx.(*ListIDArrayContext)
		}
		return p.ListIDArray_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *RustPar) List_Funciones_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) Params_declar_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 1:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) ListParams_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 2:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) List_index_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 3:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) Match_brazos_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 4:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) ListaOpciones_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 5:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) Expr_arit_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 6:
		return p.Precpred(p.GetParserRuleContext(), 12)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 11)

	case 8:
		return p.Precpred(p.GetParserRuleContext(), 10)

	case 9:
		return p.Precpred(p.GetParserRuleContext(), 8)

	case 10:
		return p.Precpred(p.GetParserRuleContext(), 7)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RustPar) ListIDArray_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	this := p
	_ = this

	switch predIndex {
	case 11:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
