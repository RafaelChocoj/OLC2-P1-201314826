// Code generated from RustLex.g4 by ANTLR 4.9.3. DO NOT EDIT.

package parser

import (
	"fmt"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = unicode.IsLetter

var serializedLexerAtn = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 78, 518,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4,
	18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23,
	9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9,
	28, 4, 29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33,
	4, 34, 9, 34, 4, 35, 9, 35, 4, 36, 9, 36, 4, 37, 9, 37, 4, 38, 9, 38, 4,
	39, 9, 39, 4, 40, 9, 40, 4, 41, 9, 41, 4, 42, 9, 42, 4, 43, 9, 43, 4, 44,
	9, 44, 4, 45, 9, 45, 4, 46, 9, 46, 4, 47, 9, 47, 4, 48, 9, 48, 4, 49, 9,
	49, 4, 50, 9, 50, 4, 51, 9, 51, 4, 52, 9, 52, 4, 53, 9, 53, 4, 54, 9, 54,
	4, 55, 9, 55, 4, 56, 9, 56, 4, 57, 9, 57, 4, 58, 9, 58, 4, 59, 9, 59, 4,
	60, 9, 60, 4, 61, 9, 61, 4, 62, 9, 62, 4, 63, 9, 63, 4, 64, 9, 64, 4, 65,
	9, 65, 4, 66, 9, 66, 4, 67, 9, 67, 4, 68, 9, 68, 4, 69, 9, 69, 4, 70, 9,
	70, 4, 71, 9, 71, 4, 72, 9, 72, 4, 73, 9, 73, 4, 74, 9, 74, 4, 75, 9, 75,
	4, 76, 9, 76, 4, 77, 9, 77, 4, 78, 9, 78, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2,
	3, 2, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4,
	3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6,
	3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 11, 3, 11, 3, 11, 3,
	11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3, 13, 3, 13, 3, 13, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3,
	15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 17, 3, 17,
	3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3,
	19, 3, 20, 3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 21, 3, 22, 3, 22, 3, 22,
	3, 22, 3, 22, 3, 23, 3, 23, 3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3,
	25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 26, 3, 26, 3, 26, 3, 26,
	3, 26, 3, 27, 3, 27, 3, 27, 3, 27, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3,
	28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 29, 3, 29,
	3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3,
	29, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30,
	3, 30, 3, 30, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 32, 3, 32, 3,
	32, 3, 32, 3, 32, 3, 32, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33,
	3, 33, 3, 33, 3, 33, 3, 33, 3, 34, 3, 34, 3, 34, 3, 34, 3, 34, 3, 35, 3,
	35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 36, 3, 36, 3, 36,
	3, 36, 3, 36, 3, 36, 3, 36, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3,
	37, 3, 38, 3, 38, 3, 38, 3, 38, 3, 39, 3, 39, 3, 39, 3, 40, 3, 40, 3, 40,
	3, 41, 3, 41, 3, 41, 3, 41, 3, 41, 3, 42, 3, 42, 3, 42, 3, 42, 3, 42, 3,
	42, 3, 42, 3, 43, 6, 43, 401, 10, 43, 13, 43, 14, 43, 402, 3, 44, 6, 44,
	406, 10, 44, 13, 44, 14, 44, 407, 3, 44, 3, 44, 6, 44, 412, 10, 44, 13,
	44, 14, 44, 413, 3, 45, 3, 45, 7, 45, 418, 10, 45, 12, 45, 14, 45, 421,
	11, 45, 3, 45, 3, 45, 3, 46, 3, 46, 3, 47, 3, 47, 3, 48, 3, 48, 3, 49,
	3, 49, 3, 49, 3, 50, 3, 50, 3, 51, 3, 51, 3, 52, 3, 52, 3, 52, 3, 53, 3,
	53, 3, 54, 3, 54, 7, 54, 445, 10, 54, 12, 54, 14, 54, 448, 11, 54, 3, 55,
	3, 55, 3, 55, 3, 56, 3, 56, 3, 56, 3, 57, 3, 57, 3, 57, 3, 58, 3, 58, 3,
	58, 3, 59, 3, 59, 3, 60, 3, 60, 3, 61, 3, 61, 3, 62, 3, 62, 3, 63, 3, 63,
	3, 64, 3, 64, 3, 65, 3, 65, 3, 66, 3, 66, 3, 66, 3, 67, 3, 67, 3, 67, 3,
	68, 3, 68, 3, 69, 3, 69, 3, 70, 3, 70, 3, 71, 3, 71, 3, 72, 3, 72, 3, 73,
	3, 73, 3, 74, 3, 74, 3, 75, 3, 75, 3, 76, 6, 76, 499, 10, 76, 13, 76, 14,
	76, 500, 3, 76, 3, 76, 3, 77, 3, 77, 3, 77, 3, 77, 7, 77, 509, 10, 77,
	12, 77, 14, 77, 512, 11, 77, 3, 77, 3, 77, 3, 78, 3, 78, 3, 78, 2, 2, 79,
	3, 3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23,
	13, 25, 14, 27, 15, 29, 16, 31, 17, 33, 18, 35, 19, 37, 20, 39, 21, 41,
	22, 43, 23, 45, 24, 47, 25, 49, 26, 51, 27, 53, 28, 55, 29, 57, 30, 59,
	31, 61, 32, 63, 33, 65, 34, 67, 35, 69, 36, 71, 37, 73, 38, 75, 39, 77,
	40, 79, 41, 81, 42, 83, 43, 85, 44, 87, 45, 89, 46, 91, 47, 93, 48, 95,
	49, 97, 50, 99, 51, 101, 52, 103, 53, 105, 54, 107, 55, 109, 56, 111, 57,
	113, 58, 115, 59, 117, 60, 119, 61, 121, 62, 123, 63, 125, 64, 127, 65,
	129, 66, 131, 67, 133, 68, 135, 69, 137, 70, 139, 71, 141, 72, 143, 73,
	145, 74, 147, 75, 149, 76, 151, 77, 153, 78, 155, 2, 3, 2, 10, 3, 2, 50,
	59, 3, 2, 48, 48, 3, 2, 36, 36, 5, 2, 67, 92, 97, 97, 99, 124, 6, 2, 50,
	59, 67, 92, 97, 97, 99, 124, 6, 2, 11, 12, 15, 15, 34, 34, 94, 94, 4, 2,
	12, 12, 15, 15, 9, 2, 34, 35, 37, 37, 45, 45, 47, 48, 60, 60, 66, 66, 93,
	95, 2, 523, 2, 3, 3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9,
	3, 2, 2, 2, 2, 11, 3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2,
	17, 3, 2, 2, 2, 2, 19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2,
	2, 25, 3, 2, 2, 2, 2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2,
	2, 2, 33, 3, 2, 2, 2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2,
	2, 2, 2, 41, 3, 2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 3,
	2, 2, 2, 2, 49, 3, 2, 2, 2, 2, 51, 3, 2, 2, 2, 2, 53, 3, 2, 2, 2, 2, 55,
	3, 2, 2, 2, 2, 57, 3, 2, 2, 2, 2, 59, 3, 2, 2, 2, 2, 61, 3, 2, 2, 2, 2,
	63, 3, 2, 2, 2, 2, 65, 3, 2, 2, 2, 2, 67, 3, 2, 2, 2, 2, 69, 3, 2, 2, 2,
	2, 71, 3, 2, 2, 2, 2, 73, 3, 2, 2, 2, 2, 75, 3, 2, 2, 2, 2, 77, 3, 2, 2,
	2, 2, 79, 3, 2, 2, 2, 2, 81, 3, 2, 2, 2, 2, 83, 3, 2, 2, 2, 2, 85, 3, 2,
	2, 2, 2, 87, 3, 2, 2, 2, 2, 89, 3, 2, 2, 2, 2, 91, 3, 2, 2, 2, 2, 93, 3,
	2, 2, 2, 2, 95, 3, 2, 2, 2, 2, 97, 3, 2, 2, 2, 2, 99, 3, 2, 2, 2, 2, 101,
	3, 2, 2, 2, 2, 103, 3, 2, 2, 2, 2, 105, 3, 2, 2, 2, 2, 107, 3, 2, 2, 2,
	2, 109, 3, 2, 2, 2, 2, 111, 3, 2, 2, 2, 2, 113, 3, 2, 2, 2, 2, 115, 3,
	2, 2, 2, 2, 117, 3, 2, 2, 2, 2, 119, 3, 2, 2, 2, 2, 121, 3, 2, 2, 2, 2,
	123, 3, 2, 2, 2, 2, 125, 3, 2, 2, 2, 2, 127, 3, 2, 2, 2, 2, 129, 3, 2,
	2, 2, 2, 131, 3, 2, 2, 2, 2, 133, 3, 2, 2, 2, 2, 135, 3, 2, 2, 2, 2, 137,
	3, 2, 2, 2, 2, 139, 3, 2, 2, 2, 2, 141, 3, 2, 2, 2, 2, 143, 3, 2, 2, 2,
	2, 145, 3, 2, 2, 2, 2, 147, 3, 2, 2, 2, 2, 149, 3, 2, 2, 2, 2, 151, 3,
	2, 2, 2, 2, 153, 3, 2, 2, 2, 3, 157, 3, 2, 2, 2, 5, 166, 3, 2, 2, 2, 7,
	170, 3, 2, 2, 2, 9, 174, 3, 2, 2, 2, 11, 181, 3, 2, 2, 2, 13, 186, 3, 2,
	2, 2, 15, 191, 3, 2, 2, 2, 17, 194, 3, 2, 2, 2, 19, 199, 3, 2, 2, 2, 21,
	205, 3, 2, 2, 2, 23, 210, 3, 2, 2, 2, 25, 214, 3, 2, 2, 2, 27, 217, 3,
	2, 2, 2, 29, 223, 3, 2, 2, 2, 31, 232, 3, 2, 2, 2, 33, 238, 3, 2, 2, 2,
	35, 240, 3, 2, 2, 2, 37, 245, 3, 2, 2, 2, 39, 251, 3, 2, 2, 2, 41, 254,
	3, 2, 2, 2, 43, 258, 3, 2, 2, 2, 45, 263, 3, 2, 2, 2, 47, 267, 3, 2, 2,
	2, 49, 271, 3, 2, 2, 2, 51, 278, 3, 2, 2, 2, 53, 283, 3, 2, 2, 2, 55, 287,
	3, 2, 2, 2, 57, 301, 3, 2, 2, 2, 59, 314, 3, 2, 2, 2, 61, 326, 3, 2, 2,
	2, 63, 332, 3, 2, 2, 2, 65, 338, 3, 2, 2, 2, 67, 349, 3, 2, 2, 2, 69, 354,
	3, 2, 2, 2, 71, 363, 3, 2, 2, 2, 73, 370, 3, 2, 2, 2, 75, 377, 3, 2, 2,
	2, 77, 381, 3, 2, 2, 2, 79, 384, 3, 2, 2, 2, 81, 387, 3, 2, 2, 2, 83, 392,
	3, 2, 2, 2, 85, 400, 3, 2, 2, 2, 87, 405, 3, 2, 2, 2, 89, 415, 3, 2, 2,
	2, 91, 424, 3, 2, 2, 2, 93, 426, 3, 2, 2, 2, 95, 428, 3, 2, 2, 2, 97, 430,
	3, 2, 2, 2, 99, 433, 3, 2, 2, 2, 101, 435, 3, 2, 2, 2, 103, 437, 3, 2,
	2, 2, 105, 440, 3, 2, 2, 2, 107, 442, 3, 2, 2, 2, 109, 449, 3, 2, 2, 2,
	111, 452, 3, 2, 2, 2, 113, 455, 3, 2, 2, 2, 115, 458, 3, 2, 2, 2, 117,
	461, 3, 2, 2, 2, 119, 463, 3, 2, 2, 2, 121, 465, 3, 2, 2, 2, 123, 467,
	3, 2, 2, 2, 125, 469, 3, 2, 2, 2, 127, 471, 3, 2, 2, 2, 129, 473, 3, 2,
	2, 2, 131, 475, 3, 2, 2, 2, 133, 478, 3, 2, 2, 2, 135, 481, 3, 2, 2, 2,
	137, 483, 3, 2, 2, 2, 139, 485, 3, 2, 2, 2, 141, 487, 3, 2, 2, 2, 143,
	489, 3, 2, 2, 2, 145, 491, 3, 2, 2, 2, 147, 493, 3, 2, 2, 2, 149, 495,
	3, 2, 2, 2, 151, 498, 3, 2, 2, 2, 153, 504, 3, 2, 2, 2, 155, 515, 3, 2,
	2, 2, 157, 158, 7, 114, 2, 2, 158, 159, 7, 116, 2, 2, 159, 160, 7, 107,
	2, 2, 160, 161, 7, 112, 2, 2, 161, 162, 7, 118, 2, 2, 162, 163, 7, 110,
	2, 2, 163, 164, 7, 112, 2, 2, 164, 165, 7, 35, 2, 2, 165, 4, 3, 2, 2, 2,
	166, 167, 7, 107, 2, 2, 167, 168, 7, 56, 2, 2, 168, 169, 7, 54, 2, 2, 169,
	6, 3, 2, 2, 2, 170, 171, 7, 104, 2, 2, 171, 172, 7, 56, 2, 2, 172, 173,
	7, 54, 2, 2, 173, 8, 3, 2, 2, 2, 174, 175, 7, 85, 2, 2, 175, 176, 7, 118,
	2, 2, 176, 177, 7, 116, 2, 2, 177, 178, 7, 107, 2, 2, 178, 179, 7, 112,
	2, 2, 179, 180, 7, 105, 2, 2, 180, 10, 3, 2, 2, 2, 181, 182, 7, 100, 2,
	2, 182, 183, 7, 113, 2, 2, 183, 184, 7, 113, 2, 2, 184, 185, 7, 110, 2,
	2, 185, 12, 3, 2, 2, 2, 186, 187, 7, 40, 2, 2, 187, 188, 7, 117, 2, 2,
	188, 189, 7, 118, 2, 2, 189, 190, 7, 116, 2, 2, 190, 14, 3, 2, 2, 2, 191,
	192, 7, 107, 2, 2, 192, 193, 7, 104, 2, 2, 193, 16, 3, 2, 2, 2, 194, 195,
	7, 103, 2, 2, 195, 196, 7, 110, 2, 2, 196, 197, 7, 117, 2, 2, 197, 198,
	7, 103, 2, 2, 198, 18, 3, 2, 2, 2, 199, 200, 7, 121, 2, 2, 200, 201, 7,
	106, 2, 2, 201, 202, 7, 107, 2, 2, 202, 203, 7, 110, 2, 2, 203, 204, 7,
	103, 2, 2, 204, 20, 3, 2, 2, 2, 205, 206, 7, 110, 2, 2, 206, 207, 7, 113,
	2, 2, 207, 208, 7, 113, 2, 2, 208, 209, 7, 114, 2, 2, 209, 22, 3, 2, 2,
	2, 210, 211, 7, 104, 2, 2, 211, 212, 7, 113, 2, 2, 212, 213, 7, 116, 2,
	2, 213, 24, 3, 2, 2, 2, 214, 215, 7, 107, 2, 2, 215, 216, 7, 112, 2, 2,
	216, 26, 3, 2, 2, 2, 217, 218, 7, 100, 2, 2, 218, 219, 7, 116, 2, 2, 219,
	220, 7, 103, 2, 2, 220, 221, 7, 99, 2, 2, 221, 222, 7, 109, 2, 2, 222,
	28, 3, 2, 2, 2, 223, 224, 7, 101, 2, 2, 224, 225, 7, 113, 2, 2, 225, 226,
	7, 112, 2, 2, 226, 227, 7, 118, 2, 2, 227, 228, 7, 107, 2, 2, 228, 229,
	7, 112, 2, 2, 229, 230, 7, 119, 2, 2, 230, 231, 7, 103, 2, 2, 231, 30,
	3, 2, 2, 2, 232, 233, 7, 111, 2, 2, 233, 234, 7, 99, 2, 2, 234, 235, 7,
	118, 2, 2, 235, 236, 7, 101, 2, 2, 236, 237, 7, 106, 2, 2, 237, 32, 3,
	2, 2, 2, 238, 239, 7, 126, 2, 2, 239, 34, 3, 2, 2, 2, 240, 241, 7, 118,
	2, 2, 241, 242, 7, 116, 2, 2, 242, 243, 7, 119, 2, 2, 243, 244, 7, 103,
	2, 2, 244, 36, 3, 2, 2, 2, 245, 246, 7, 104, 2, 2, 246, 247, 7, 99, 2,
	2, 247, 248, 7, 110, 2, 2, 248, 249, 7, 117, 2, 2, 249, 250, 7, 103, 2,
	2, 250, 38, 3, 2, 2, 2, 251, 252, 7, 99, 2, 2, 252, 253, 7, 117, 2, 2,
	253, 40, 3, 2, 2, 2, 254, 255, 7, 114, 2, 2, 255, 256, 7, 113, 2, 2, 256,
	257, 7, 121, 2, 2, 257, 42, 3, 2, 2, 2, 258, 259, 7, 114, 2, 2, 259, 260,
	7, 113, 2, 2, 260, 261, 7, 121, 2, 2, 261, 262, 7, 104, 2, 2, 262, 44,
	3, 2, 2, 2, 263, 264, 7, 110, 2, 2, 264, 265, 7, 103, 2, 2, 265, 266, 7,
	118, 2, 2, 266, 46, 3, 2, 2, 2, 267, 268, 7, 111, 2, 2, 268, 269, 7, 119,
	2, 2, 269, 270, 7, 118, 2, 2, 270, 48, 3, 2, 2, 2, 271, 272, 7, 117, 2,
	2, 272, 273, 7, 118, 2, 2, 273, 274, 7, 116, 2, 2, 274, 275, 7, 119, 2,
	2, 275, 276, 7, 101, 2, 2, 276, 277, 7, 118, 2, 2, 277, 50, 3, 2, 2, 2,
	278, 279, 7, 120, 2, 2, 279, 280, 7, 103, 2, 2, 280, 281, 7, 101, 2, 2,
	281, 282, 7, 35, 2, 2, 282, 52, 3, 2, 2, 2, 283, 284, 7, 88, 2, 2, 284,
	285, 7, 103, 2, 2, 285, 286, 7, 101, 2, 2, 286, 54, 3, 2, 2, 2, 287, 288,
	7, 121, 2, 2, 288, 289, 7, 107, 2, 2, 289, 290, 7, 118, 2, 2, 290, 291,
	7, 106, 2, 2, 291, 292, 7, 97, 2, 2, 292, 293, 7, 101, 2, 2, 293, 294,
	7, 99, 2, 2, 294, 295, 7, 114, 2, 2, 295, 296, 7, 99, 2, 2, 296, 297, 7,
	101, 2, 2, 297, 298, 7, 107, 2, 2, 298, 299, 7, 118, 2, 2, 299, 300, 7,
	123, 2, 2, 300, 56, 3, 2, 2, 2, 301, 302, 7, 48, 2, 2, 302, 303, 7, 118,
	2, 2, 303, 304, 7, 113, 2, 2, 304, 305, 7, 97, 2, 2, 305, 306, 7, 117,
	2, 2, 306, 307, 7, 118, 2, 2, 307, 308, 7, 116, 2, 2, 308, 309, 7, 107,
	2, 2, 309, 310, 7, 112, 2, 2, 310, 311, 7, 105, 2, 2, 311, 312, 7, 42,
	2, 2, 312, 313, 7, 43, 2, 2, 313, 58, 3, 2, 2, 2, 314, 315, 7, 48, 2, 2,
	315, 316, 7, 118, 2, 2, 316, 317, 7, 113, 2, 2, 317, 318, 7, 97, 2, 2,
	318, 319, 7, 113, 2, 2, 319, 320, 7, 121, 2, 2, 320, 321, 7, 112, 2, 2,
	321, 322, 7, 103, 2, 2, 322, 323, 7, 102, 2, 2, 323, 324, 7, 42, 2, 2,
	324, 325, 7, 43, 2, 2, 325, 60, 3, 2, 2, 2, 326, 327, 7, 110, 2, 2, 327,
	328, 7, 103, 2, 2, 328, 329, 7, 112, 2, 2, 329, 330, 7, 42, 2, 2, 330,
	331, 7, 43, 2, 2, 331, 62, 3, 2, 2, 2, 332, 333, 7, 112, 2, 2, 333, 334,
	7, 103, 2, 2, 334, 335, 7, 121, 2, 2, 335, 336, 7, 42, 2, 2, 336, 337,
	7, 43, 2, 2, 337, 64, 3, 2, 2, 2, 338, 339, 7, 101, 2, 2, 339, 340, 7,
	99, 2, 2, 340, 341, 7, 114, 2, 2, 341, 342, 7, 99, 2, 2, 342, 343, 7, 101,
	2, 2, 343, 344, 7, 107, 2, 2, 344, 345, 7, 118, 2, 2, 345, 346, 7, 123,
	2, 2, 346, 347, 7, 42, 2, 2, 347, 348, 7, 43, 2, 2, 348, 66, 3, 2, 2, 2,
	349, 350, 7, 114, 2, 2, 350, 351, 7, 119, 2, 2, 351, 352, 7, 117, 2, 2,
	352, 353, 7, 106, 2, 2, 353, 68, 3, 2, 2, 2, 354, 355, 7, 101, 2, 2, 355,
	356, 7, 113, 2, 2, 356, 357, 7, 112, 2, 2, 357, 358, 7, 118, 2, 2, 358,
	359, 7, 99, 2, 2, 359, 360, 7, 107, 2, 2, 360, 361, 7, 112, 2, 2, 361,
	362, 7, 117, 2, 2, 362, 70, 3, 2, 2, 2, 363, 364, 7, 107, 2, 2, 364, 365,
	7, 112, 2, 2, 365, 366, 7, 117, 2, 2, 366, 367, 7, 103, 2, 2, 367, 368,
	7, 116, 2, 2, 368, 369, 7, 118, 2, 2, 369, 72, 3, 2, 2, 2, 370, 371, 7,
	116, 2, 2, 371, 372, 7, 103, 2, 2, 372, 373, 7, 111, 2, 2, 373, 374, 7,
	113, 2, 2, 374, 375, 7, 120, 2, 2, 375, 376, 7, 103, 2, 2, 376, 74, 3,
	2, 2, 2, 377, 378, 7, 114, 2, 2, 378, 379, 7, 119, 2, 2, 379, 380, 7, 100,
	2, 2, 380, 76, 3, 2, 2, 2, 381, 382, 7, 47, 2, 2, 382, 383, 7, 64, 2, 2,
	383, 78, 3, 2, 2, 2, 384, 385, 7, 104, 2, 2, 385, 386, 7, 112, 2, 2, 386,
	80, 3, 2, 2, 2, 387, 388, 7, 111, 2, 2, 388, 389, 7, 99, 2, 2, 389, 390,
	7, 107, 2, 2, 390, 391, 7, 112, 2, 2, 391, 82, 3, 2, 2, 2, 392, 393, 7,
	116, 2, 2, 393, 394, 7, 103, 2, 2, 394, 395, 7, 118, 2, 2, 395, 396, 7,
	119, 2, 2, 396, 397, 7, 116, 2, 2, 397, 398, 7, 112, 2, 2, 398, 84, 3,
	2, 2, 2, 399, 401, 9, 2, 2, 2, 400, 399, 3, 2, 2, 2, 401, 402, 3, 2, 2,
	2, 402, 400, 3, 2, 2, 2, 402, 403, 3, 2, 2, 2, 403, 86, 3, 2, 2, 2, 404,
	406, 9, 2, 2, 2, 405, 404, 3, 2, 2, 2, 406, 407, 3, 2, 2, 2, 407, 405,
	3, 2, 2, 2, 407, 408, 3, 2, 2, 2, 408, 409, 3, 2, 2, 2, 409, 411, 9, 3,
	2, 2, 410, 412, 9, 2, 2, 2, 411, 410, 3, 2, 2, 2, 412, 413, 3, 2, 2, 2,
	413, 411, 3, 2, 2, 2, 413, 414, 3, 2, 2, 2, 414, 88, 3, 2, 2, 2, 415, 419,
	7, 36, 2, 2, 416, 418, 10, 4, 2, 2, 417, 416, 3, 2, 2, 2, 418, 421, 3,
	2, 2, 2, 419, 417, 3, 2, 2, 2, 419, 420, 3, 2, 2, 2, 420, 422, 3, 2, 2,
	2, 421, 419, 3, 2, 2, 2, 422, 423, 7, 36, 2, 2, 423, 90, 3, 2, 2, 2, 424,
	425, 7, 48, 2, 2, 425, 92, 3, 2, 2, 2, 426, 427, 7, 46, 2, 2, 427, 94,
	3, 2, 2, 2, 428, 429, 7, 61, 2, 2, 429, 96, 3, 2, 2, 2, 430, 431, 7, 60,
	2, 2, 431, 432, 7, 60, 2, 2, 432, 98, 3, 2, 2, 2, 433, 434, 7, 60, 2, 2,
	434, 100, 3, 2, 2, 2, 435, 436, 7, 63, 2, 2, 436, 102, 3, 2, 2, 2, 437,
	438, 7, 63, 2, 2, 438, 439, 7, 64, 2, 2, 439, 104, 3, 2, 2, 2, 440, 441,
	7, 97, 2, 2, 441, 106, 3, 2, 2, 2, 442, 446, 9, 5, 2, 2, 443, 445, 9, 6,
	2, 2, 444, 443, 3, 2, 2, 2, 445, 448, 3, 2, 2, 2, 446, 444, 3, 2, 2, 2,
	446, 447, 3, 2, 2, 2, 447, 108, 3, 2, 2, 2, 448, 446, 3, 2, 2, 2, 449,
	450, 7, 35, 2, 2, 450, 451, 7, 63, 2, 2, 451, 110, 3, 2, 2, 2, 452, 453,
	7, 63, 2, 2, 453, 454, 7, 63, 2, 2, 454, 112, 3, 2, 2, 2, 455, 456, 7,
	64, 2, 2, 456, 457, 7, 63, 2, 2, 457, 114, 3, 2, 2, 2, 458, 459, 7, 62,
	2, 2, 459, 460, 7, 63, 2, 2, 460, 116, 3, 2, 2, 2, 461, 462, 7, 64, 2,
	2, 462, 118, 3, 2, 2, 2, 463, 464, 7, 62, 2, 2, 464, 120, 3, 2, 2, 2, 465,
	466, 7, 44, 2, 2, 466, 122, 3, 2, 2, 2, 467, 468, 7, 49, 2, 2, 468, 124,
	3, 2, 2, 2, 469, 470, 7, 45, 2, 2, 470, 126, 3, 2, 2, 2, 471, 472, 7, 47,
	2, 2, 472, 128, 3, 2, 2, 2, 473, 474, 7, 39, 2, 2, 474, 130, 3, 2, 2, 2,
	475, 476, 7, 40, 2, 2, 476, 477, 7, 40, 2, 2, 477, 132, 3, 2, 2, 2, 478,
	479, 7, 126, 2, 2, 479, 480, 7, 126, 2, 2, 480, 134, 3, 2, 2, 2, 481, 482,
	7, 35, 2, 2, 482, 136, 3, 2, 2, 2, 483, 484, 7, 40, 2, 2, 484, 138, 3,
	2, 2, 2, 485, 486, 7, 42, 2, 2, 486, 140, 3, 2, 2, 2, 487, 488, 7, 43,
	2, 2, 488, 142, 3, 2, 2, 2, 489, 490, 7, 125, 2, 2, 490, 144, 3, 2, 2,
	2, 491, 492, 7, 127, 2, 2, 492, 146, 3, 2, 2, 2, 493, 494, 7, 93, 2, 2,
	494, 148, 3, 2, 2, 2, 495, 496, 7, 95, 2, 2, 496, 150, 3, 2, 2, 2, 497,
	499, 9, 7, 2, 2, 498, 497, 3, 2, 2, 2, 499, 500, 3, 2, 2, 2, 500, 498,
	3, 2, 2, 2, 500, 501, 3, 2, 2, 2, 501, 502, 3, 2, 2, 2, 502, 503, 8, 76,
	2, 2, 503, 152, 3, 2, 2, 2, 504, 505, 7, 49, 2, 2, 505, 506, 7, 49, 2,
	2, 506, 510, 3, 2, 2, 2, 507, 509, 10, 8, 2, 2, 508, 507, 3, 2, 2, 2, 509,
	512, 3, 2, 2, 2, 510, 508, 3, 2, 2, 2, 510, 511, 3, 2, 2, 2, 511, 513,
	3, 2, 2, 2, 512, 510, 3, 2, 2, 2, 513, 514, 8, 77, 2, 2, 514, 154, 3, 2,
	2, 2, 515, 516, 7, 94, 2, 2, 516, 517, 9, 9, 2, 2, 517, 156, 3, 2, 2, 2,
	10, 2, 402, 407, 413, 419, 446, 500, 510, 3, 8, 2, 2,
}

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", "'if'",
	"'else'", "'while'", "'loop'", "'for'", "'in'", "'break'", "'continue'",
	"'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'",
	"'mut'", "'struct'", "'vec!'", "'Vec'", "'with_capacity'", "'.to_string()'",
	"'.to_owned()'", "'len()'", "'new()'", "'capacity()'", "'push'", "'contains'",
	"'insert'", "'remove'", "'pub'", "'->'", "'fn'", "'main'", "'return'",
	"", "", "", "'.'", "','", "';'", "'::'", "':'", "'='", "'=>'", "'_'", "",
	"'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'",
	"'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", "'}'", "'['",
	"']'",
}

var lexerSymbolicNames = []string{
	"", "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR",
	"IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH",
	"MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", "VEC",
	"VECN", "CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", "PUSH",
	"CONTAINS", "INSERT", "REMOVE", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN",
	"NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2",
	"ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL",
	"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND",
	"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ",
	"CORDER", "WHITESPACE", "L_COMMENT",
}

var lexerRuleNames = []string{
	"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "IF",
	"ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH", "MTOR",
	"TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", "VEC", "VECN",
	"CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", "PUSH", "CONTAINS",
	"INSERT", "REMOVE", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", "NUMBER",
	"FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION",
	"MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL",
	"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT",
	"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER",
	"WHITESPACE", "L_COMMENT", "ESC_SEQ",
}

type RustLex struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

// NewRustLex produces a new lexer instance for the optional input antlr.CharStream.
//
// The *RustLex instance produced may be reused by calling the SetInputStream method.
// The initial lexer configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewRustLex(input antlr.CharStream) *RustLex {
	l := new(RustLex)
	lexerDeserializer := antlr.NewATNDeserializer(nil)
	lexerAtn := lexerDeserializer.DeserializeFromUInt16(serializedLexerAtn)
	lexerDecisionToDFA := make([]*antlr.DFA, len(lexerAtn.DecisionToState))
	for index, ds := range lexerAtn.DecisionToState {
		lexerDecisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	l.BaseLexer = antlr.NewBaseLexer(input)
	l.Interpreter = antlr.NewLexerATNSimulator(l, lexerAtn, lexerDecisionToDFA, antlr.NewPredictionContextCache())

	l.channelNames = lexerChannelNames
	l.modeNames = lexerModeNames
	l.RuleNames = lexerRuleNames
	l.LiteralNames = lexerLiteralNames
	l.SymbolicNames = lexerSymbolicNames
	l.GrammarFileName = "RustLex.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// RustLex tokens.
const (
	RustLexPRINT_CON  = 1
	RustLexT_NUMBER   = 2
	RustLexT_FLOAT    = 3
	RustLexT_STRING   = 4
	RustLexT_BOOL     = 5
	RustLexT_STR      = 6
	RustLexIF         = 7
	RustLexELSE       = 8
	RustLexWHILE      = 9
	RustLexLOOP       = 10
	RustLexFOR        = 11
	RustLexIN         = 12
	RustLexBREAK      = 13
	RustLexCONTINUE   = 14
	RustLexMATCH      = 15
	RustLexMTOR       = 16
	RustLexTRUE       = 17
	RustLexFALSE      = 18
	RustLexAS         = 19
	RustLexPOW        = 20
	RustLexPOWF       = 21
	RustLexLET        = 22
	RustLexMUT        = 23
	RustLexSTRUCT     = 24
	RustLexVEC        = 25
	RustLexVECN       = 26
	RustLexCAPACITY   = 27
	RustLexTO_STRING  = 28
	RustLexTO_OWNED   = 29
	RustLexLEN        = 30
	RustLexNEW        = 31
	RustLexCAPF       = 32
	RustLexPUSH       = 33
	RustLexCONTAINS   = 34
	RustLexINSERT     = 35
	RustLexREMOVE     = 36
	RustLexPUBLIC     = 37
	RustLexTYPETHEN   = 38
	RustLexFN         = 39
	RustLexMAIN       = 40
	RustLexRETURN     = 41
	RustLexNUMBER     = 42
	RustLexFLOAT      = 43
	RustLexSTRING     = 44
	RustLexPUNTO      = 45
	RustLexCOMA       = 46
	RustLexPTCOMA     = 47
	RustLexDOSPUNTO   = 48
	RustLexDPUNTO2    = 49
	RustLexASIGNACION = 50
	RustLexMTHEN      = 51
	RustLexGUIONB     = 52
	RustLexID         = 53
	RustLexDISTINTO   = 54
	RustLexIGUAL      = 55
	RustLexMAYORIGUAL = 56
	RustLexMENORIGUAL = 57
	RustLexMAYOR      = 58
	RustLexMENOR      = 59
	RustLexMUL        = 60
	RustLexDIV        = 61
	RustLexADD        = 62
	RustLexSUB        = 63
	RustLexMOD        = 64
	RustLexAND        = 65
	RustLexOR         = 66
	RustLexNOT        = 67
	RustLexAMP        = 68
	RustLexPARIZQ     = 69
	RustLexPARDER     = 70
	RustLexLLAVEIZQ   = 71
	RustLexLLAVEDER   = 72
	RustLexCORIZQ     = 73
	RustLexCORDER     = 74
	RustLexWHITESPACE = 75
	RustLexL_COMMENT  = 76
)
