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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 75, 489,
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
	3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3,
	3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8,
	3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10,
	3, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	13, 3, 13, 3, 13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 15,
	3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3,
	16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 19,
	3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 20, 3, 20, 3, 20, 3, 21, 3, 21, 3,
	21, 3, 21, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 23, 3, 23, 3, 23, 3, 23,
	3, 24, 3, 24, 3, 24, 3, 24, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3,
	25, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 27, 3, 27, 3, 27, 3, 27, 3, 28,
	3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3, 28, 3,
	28, 3, 28, 3, 28, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29,
	3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3,
	30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 31, 3, 31, 3, 31, 3, 31,
	3, 31, 3, 31, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 33, 3, 33, 3,
	33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3, 34, 3, 34,
	3, 34, 3, 34, 3, 35, 3, 35, 3, 35, 3, 36, 3, 36, 3, 36, 3, 37, 3, 37, 3,
	37, 3, 37, 3, 37, 3, 38, 3, 38, 3, 38, 3, 38, 3, 38, 3, 38, 3, 38, 3, 39,
	3, 39, 3, 39, 3, 39, 3, 39, 3, 40, 6, 40, 372, 10, 40, 13, 40, 14, 40,
	373, 3, 41, 6, 41, 377, 10, 41, 13, 41, 14, 41, 378, 3, 41, 3, 41, 6, 41,
	383, 10, 41, 13, 41, 14, 41, 384, 3, 42, 3, 42, 7, 42, 389, 10, 42, 12,
	42, 14, 42, 392, 11, 42, 3, 42, 3, 42, 3, 43, 3, 43, 3, 44, 3, 44, 3, 45,
	3, 45, 3, 46, 3, 46, 3, 46, 3, 47, 3, 47, 3, 48, 3, 48, 3, 49, 3, 49, 3,
	49, 3, 50, 3, 50, 3, 51, 3, 51, 7, 51, 416, 10, 51, 12, 51, 14, 51, 419,
	11, 51, 3, 52, 3, 52, 3, 52, 3, 53, 3, 53, 3, 53, 3, 54, 3, 54, 3, 54,
	3, 55, 3, 55, 3, 55, 3, 56, 3, 56, 3, 57, 3, 57, 3, 58, 3, 58, 3, 59, 3,
	59, 3, 60, 3, 60, 3, 61, 3, 61, 3, 62, 3, 62, 3, 63, 3, 63, 3, 63, 3, 64,
	3, 64, 3, 64, 3, 65, 3, 65, 3, 66, 3, 66, 3, 67, 3, 67, 3, 68, 3, 68, 3,
	69, 3, 69, 3, 70, 3, 70, 3, 71, 3, 71, 3, 72, 3, 72, 3, 73, 6, 73, 470,
	10, 73, 13, 73, 14, 73, 471, 3, 73, 3, 73, 3, 74, 3, 74, 3, 74, 3, 74,
	7, 74, 480, 10, 74, 12, 74, 14, 74, 483, 11, 74, 3, 74, 3, 74, 3, 75, 3,
	75, 3, 75, 2, 2, 76, 3, 3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10,
	19, 11, 21, 12, 23, 13, 25, 14, 27, 15, 29, 16, 31, 17, 33, 18, 35, 19,
	37, 20, 39, 21, 41, 22, 43, 23, 45, 24, 47, 25, 49, 26, 51, 27, 53, 28,
	55, 29, 57, 30, 59, 31, 61, 32, 63, 33, 65, 34, 67, 35, 69, 36, 71, 37,
	73, 38, 75, 39, 77, 40, 79, 41, 81, 42, 83, 43, 85, 44, 87, 45, 89, 46,
	91, 47, 93, 48, 95, 49, 97, 50, 99, 51, 101, 52, 103, 53, 105, 54, 107,
	55, 109, 56, 111, 57, 113, 58, 115, 59, 117, 60, 119, 61, 121, 62, 123,
	63, 125, 64, 127, 65, 129, 66, 131, 67, 133, 68, 135, 69, 137, 70, 139,
	71, 141, 72, 143, 73, 145, 74, 147, 75, 149, 2, 3, 2, 10, 3, 2, 50, 59,
	3, 2, 48, 48, 3, 2, 36, 36, 5, 2, 67, 92, 97, 97, 99, 124, 6, 2, 50, 59,
	67, 92, 97, 97, 99, 124, 6, 2, 11, 12, 15, 15, 34, 34, 94, 94, 4, 2, 12,
	12, 15, 15, 9, 2, 34, 35, 37, 37, 45, 45, 47, 48, 60, 60, 66, 66, 93, 95,
	2, 494, 2, 3, 3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3,
	2, 2, 2, 2, 11, 3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17,
	3, 2, 2, 2, 2, 19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2,
	25, 3, 2, 2, 2, 2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2,
	2, 33, 3, 2, 2, 2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2,
	2, 2, 41, 3, 2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 3, 2,
	2, 2, 2, 49, 3, 2, 2, 2, 2, 51, 3, 2, 2, 2, 2, 53, 3, 2, 2, 2, 2, 55, 3,
	2, 2, 2, 2, 57, 3, 2, 2, 2, 2, 59, 3, 2, 2, 2, 2, 61, 3, 2, 2, 2, 2, 63,
	3, 2, 2, 2, 2, 65, 3, 2, 2, 2, 2, 67, 3, 2, 2, 2, 2, 69, 3, 2, 2, 2, 2,
	71, 3, 2, 2, 2, 2, 73, 3, 2, 2, 2, 2, 75, 3, 2, 2, 2, 2, 77, 3, 2, 2, 2,
	2, 79, 3, 2, 2, 2, 2, 81, 3, 2, 2, 2, 2, 83, 3, 2, 2, 2, 2, 85, 3, 2, 2,
	2, 2, 87, 3, 2, 2, 2, 2, 89, 3, 2, 2, 2, 2, 91, 3, 2, 2, 2, 2, 93, 3, 2,
	2, 2, 2, 95, 3, 2, 2, 2, 2, 97, 3, 2, 2, 2, 2, 99, 3, 2, 2, 2, 2, 101,
	3, 2, 2, 2, 2, 103, 3, 2, 2, 2, 2, 105, 3, 2, 2, 2, 2, 107, 3, 2, 2, 2,
	2, 109, 3, 2, 2, 2, 2, 111, 3, 2, 2, 2, 2, 113, 3, 2, 2, 2, 2, 115, 3,
	2, 2, 2, 2, 117, 3, 2, 2, 2, 2, 119, 3, 2, 2, 2, 2, 121, 3, 2, 2, 2, 2,
	123, 3, 2, 2, 2, 2, 125, 3, 2, 2, 2, 2, 127, 3, 2, 2, 2, 2, 129, 3, 2,
	2, 2, 2, 131, 3, 2, 2, 2, 2, 133, 3, 2, 2, 2, 2, 135, 3, 2, 2, 2, 2, 137,
	3, 2, 2, 2, 2, 139, 3, 2, 2, 2, 2, 141, 3, 2, 2, 2, 2, 143, 3, 2, 2, 2,
	2, 145, 3, 2, 2, 2, 2, 147, 3, 2, 2, 2, 3, 151, 3, 2, 2, 2, 5, 160, 3,
	2, 2, 2, 7, 164, 3, 2, 2, 2, 9, 168, 3, 2, 2, 2, 11, 175, 3, 2, 2, 2, 13,
	180, 3, 2, 2, 2, 15, 185, 3, 2, 2, 2, 17, 188, 3, 2, 2, 2, 19, 193, 3,
	2, 2, 2, 21, 199, 3, 2, 2, 2, 23, 204, 3, 2, 2, 2, 25, 208, 3, 2, 2, 2,
	27, 211, 3, 2, 2, 2, 29, 217, 3, 2, 2, 2, 31, 226, 3, 2, 2, 2, 33, 232,
	3, 2, 2, 2, 35, 234, 3, 2, 2, 2, 37, 239, 3, 2, 2, 2, 39, 245, 3, 2, 2,
	2, 41, 248, 3, 2, 2, 2, 43, 252, 3, 2, 2, 2, 45, 257, 3, 2, 2, 2, 47, 261,
	3, 2, 2, 2, 49, 265, 3, 2, 2, 2, 51, 272, 3, 2, 2, 2, 53, 277, 3, 2, 2,
	2, 55, 281, 3, 2, 2, 2, 57, 295, 3, 2, 2, 2, 59, 308, 3, 2, 2, 2, 61, 320,
	3, 2, 2, 2, 63, 326, 3, 2, 2, 2, 65, 332, 3, 2, 2, 2, 67, 343, 3, 2, 2,
	2, 69, 347, 3, 2, 2, 2, 71, 350, 3, 2, 2, 2, 73, 353, 3, 2, 2, 2, 75, 358,
	3, 2, 2, 2, 77, 365, 3, 2, 2, 2, 79, 371, 3, 2, 2, 2, 81, 376, 3, 2, 2,
	2, 83, 386, 3, 2, 2, 2, 85, 395, 3, 2, 2, 2, 87, 397, 3, 2, 2, 2, 89, 399,
	3, 2, 2, 2, 91, 401, 3, 2, 2, 2, 93, 404, 3, 2, 2, 2, 95, 406, 3, 2, 2,
	2, 97, 408, 3, 2, 2, 2, 99, 411, 3, 2, 2, 2, 101, 413, 3, 2, 2, 2, 103,
	420, 3, 2, 2, 2, 105, 423, 3, 2, 2, 2, 107, 426, 3, 2, 2, 2, 109, 429,
	3, 2, 2, 2, 111, 432, 3, 2, 2, 2, 113, 434, 3, 2, 2, 2, 115, 436, 3, 2,
	2, 2, 117, 438, 3, 2, 2, 2, 119, 440, 3, 2, 2, 2, 121, 442, 3, 2, 2, 2,
	123, 444, 3, 2, 2, 2, 125, 446, 3, 2, 2, 2, 127, 449, 3, 2, 2, 2, 129,
	452, 3, 2, 2, 2, 131, 454, 3, 2, 2, 2, 133, 456, 3, 2, 2, 2, 135, 458,
	3, 2, 2, 2, 137, 460, 3, 2, 2, 2, 139, 462, 3, 2, 2, 2, 141, 464, 3, 2,
	2, 2, 143, 466, 3, 2, 2, 2, 145, 469, 3, 2, 2, 2, 147, 475, 3, 2, 2, 2,
	149, 486, 3, 2, 2, 2, 151, 152, 7, 114, 2, 2, 152, 153, 7, 116, 2, 2, 153,
	154, 7, 107, 2, 2, 154, 155, 7, 112, 2, 2, 155, 156, 7, 118, 2, 2, 156,
	157, 7, 110, 2, 2, 157, 158, 7, 112, 2, 2, 158, 159, 7, 35, 2, 2, 159,
	4, 3, 2, 2, 2, 160, 161, 7, 107, 2, 2, 161, 162, 7, 56, 2, 2, 162, 163,
	7, 54, 2, 2, 163, 6, 3, 2, 2, 2, 164, 165, 7, 104, 2, 2, 165, 166, 7, 56,
	2, 2, 166, 167, 7, 54, 2, 2, 167, 8, 3, 2, 2, 2, 168, 169, 7, 85, 2, 2,
	169, 170, 7, 118, 2, 2, 170, 171, 7, 116, 2, 2, 171, 172, 7, 107, 2, 2,
	172, 173, 7, 112, 2, 2, 173, 174, 7, 105, 2, 2, 174, 10, 3, 2, 2, 2, 175,
	176, 7, 100, 2, 2, 176, 177, 7, 113, 2, 2, 177, 178, 7, 113, 2, 2, 178,
	179, 7, 110, 2, 2, 179, 12, 3, 2, 2, 2, 180, 181, 7, 40, 2, 2, 181, 182,
	7, 117, 2, 2, 182, 183, 7, 118, 2, 2, 183, 184, 7, 116, 2, 2, 184, 14,
	3, 2, 2, 2, 185, 186, 7, 107, 2, 2, 186, 187, 7, 104, 2, 2, 187, 16, 3,
	2, 2, 2, 188, 189, 7, 103, 2, 2, 189, 190, 7, 110, 2, 2, 190, 191, 7, 117,
	2, 2, 191, 192, 7, 103, 2, 2, 192, 18, 3, 2, 2, 2, 193, 194, 7, 121, 2,
	2, 194, 195, 7, 106, 2, 2, 195, 196, 7, 107, 2, 2, 196, 197, 7, 110, 2,
	2, 197, 198, 7, 103, 2, 2, 198, 20, 3, 2, 2, 2, 199, 200, 7, 110, 2, 2,
	200, 201, 7, 113, 2, 2, 201, 202, 7, 113, 2, 2, 202, 203, 7, 114, 2, 2,
	203, 22, 3, 2, 2, 2, 204, 205, 7, 104, 2, 2, 205, 206, 7, 113, 2, 2, 206,
	207, 7, 116, 2, 2, 207, 24, 3, 2, 2, 2, 208, 209, 7, 107, 2, 2, 209, 210,
	7, 112, 2, 2, 210, 26, 3, 2, 2, 2, 211, 212, 7, 100, 2, 2, 212, 213, 7,
	116, 2, 2, 213, 214, 7, 103, 2, 2, 214, 215, 7, 99, 2, 2, 215, 216, 7,
	109, 2, 2, 216, 28, 3, 2, 2, 2, 217, 218, 7, 101, 2, 2, 218, 219, 7, 113,
	2, 2, 219, 220, 7, 112, 2, 2, 220, 221, 7, 118, 2, 2, 221, 222, 7, 107,
	2, 2, 222, 223, 7, 112, 2, 2, 223, 224, 7, 119, 2, 2, 224, 225, 7, 103,
	2, 2, 225, 30, 3, 2, 2, 2, 226, 227, 7, 111, 2, 2, 227, 228, 7, 99, 2,
	2, 228, 229, 7, 118, 2, 2, 229, 230, 7, 101, 2, 2, 230, 231, 7, 106, 2,
	2, 231, 32, 3, 2, 2, 2, 232, 233, 7, 126, 2, 2, 233, 34, 3, 2, 2, 2, 234,
	235, 7, 118, 2, 2, 235, 236, 7, 116, 2, 2, 236, 237, 7, 119, 2, 2, 237,
	238, 7, 103, 2, 2, 238, 36, 3, 2, 2, 2, 239, 240, 7, 104, 2, 2, 240, 241,
	7, 99, 2, 2, 241, 242, 7, 110, 2, 2, 242, 243, 7, 117, 2, 2, 243, 244,
	7, 103, 2, 2, 244, 38, 3, 2, 2, 2, 245, 246, 7, 99, 2, 2, 246, 247, 7,
	117, 2, 2, 247, 40, 3, 2, 2, 2, 248, 249, 7, 114, 2, 2, 249, 250, 7, 113,
	2, 2, 250, 251, 7, 121, 2, 2, 251, 42, 3, 2, 2, 2, 252, 253, 7, 114, 2,
	2, 253, 254, 7, 113, 2, 2, 254, 255, 7, 121, 2, 2, 255, 256, 7, 104, 2,
	2, 256, 44, 3, 2, 2, 2, 257, 258, 7, 110, 2, 2, 258, 259, 7, 103, 2, 2,
	259, 260, 7, 118, 2, 2, 260, 46, 3, 2, 2, 2, 261, 262, 7, 111, 2, 2, 262,
	263, 7, 119, 2, 2, 263, 264, 7, 118, 2, 2, 264, 48, 3, 2, 2, 2, 265, 266,
	7, 117, 2, 2, 266, 267, 7, 118, 2, 2, 267, 268, 7, 116, 2, 2, 268, 269,
	7, 119, 2, 2, 269, 270, 7, 101, 2, 2, 270, 271, 7, 118, 2, 2, 271, 50,
	3, 2, 2, 2, 272, 273, 7, 120, 2, 2, 273, 274, 7, 103, 2, 2, 274, 275, 7,
	101, 2, 2, 275, 276, 7, 35, 2, 2, 276, 52, 3, 2, 2, 2, 277, 278, 7, 88,
	2, 2, 278, 279, 7, 103, 2, 2, 279, 280, 7, 101, 2, 2, 280, 54, 3, 2, 2,
	2, 281, 282, 7, 121, 2, 2, 282, 283, 7, 107, 2, 2, 283, 284, 7, 118, 2,
	2, 284, 285, 7, 106, 2, 2, 285, 286, 7, 97, 2, 2, 286, 287, 7, 101, 2,
	2, 287, 288, 7, 99, 2, 2, 288, 289, 7, 114, 2, 2, 289, 290, 7, 99, 2, 2,
	290, 291, 7, 101, 2, 2, 291, 292, 7, 107, 2, 2, 292, 293, 7, 118, 2, 2,
	293, 294, 7, 123, 2, 2, 294, 56, 3, 2, 2, 2, 295, 296, 7, 48, 2, 2, 296,
	297, 7, 118, 2, 2, 297, 298, 7, 113, 2, 2, 298, 299, 7, 97, 2, 2, 299,
	300, 7, 117, 2, 2, 300, 301, 7, 118, 2, 2, 301, 302, 7, 116, 2, 2, 302,
	303, 7, 107, 2, 2, 303, 304, 7, 112, 2, 2, 304, 305, 7, 105, 2, 2, 305,
	306, 7, 42, 2, 2, 306, 307, 7, 43, 2, 2, 307, 58, 3, 2, 2, 2, 308, 309,
	7, 48, 2, 2, 309, 310, 7, 118, 2, 2, 310, 311, 7, 113, 2, 2, 311, 312,
	7, 97, 2, 2, 312, 313, 7, 113, 2, 2, 313, 314, 7, 121, 2, 2, 314, 315,
	7, 112, 2, 2, 315, 316, 7, 103, 2, 2, 316, 317, 7, 102, 2, 2, 317, 318,
	7, 42, 2, 2, 318, 319, 7, 43, 2, 2, 319, 60, 3, 2, 2, 2, 320, 321, 7, 110,
	2, 2, 321, 322, 7, 103, 2, 2, 322, 323, 7, 112, 2, 2, 323, 324, 7, 42,
	2, 2, 324, 325, 7, 43, 2, 2, 325, 62, 3, 2, 2, 2, 326, 327, 7, 112, 2,
	2, 327, 328, 7, 103, 2, 2, 328, 329, 7, 121, 2, 2, 329, 330, 7, 42, 2,
	2, 330, 331, 7, 43, 2, 2, 331, 64, 3, 2, 2, 2, 332, 333, 7, 101, 2, 2,
	333, 334, 7, 99, 2, 2, 334, 335, 7, 114, 2, 2, 335, 336, 7, 99, 2, 2, 336,
	337, 7, 101, 2, 2, 337, 338, 7, 107, 2, 2, 338, 339, 7, 118, 2, 2, 339,
	340, 7, 123, 2, 2, 340, 341, 7, 42, 2, 2, 341, 342, 7, 43, 2, 2, 342, 66,
	3, 2, 2, 2, 343, 344, 7, 114, 2, 2, 344, 345, 7, 119, 2, 2, 345, 346, 7,
	100, 2, 2, 346, 68, 3, 2, 2, 2, 347, 348, 7, 47, 2, 2, 348, 349, 7, 64,
	2, 2, 349, 70, 3, 2, 2, 2, 350, 351, 7, 104, 2, 2, 351, 352, 7, 112, 2,
	2, 352, 72, 3, 2, 2, 2, 353, 354, 7, 111, 2, 2, 354, 355, 7, 99, 2, 2,
	355, 356, 7, 107, 2, 2, 356, 357, 7, 112, 2, 2, 357, 74, 3, 2, 2, 2, 358,
	359, 7, 116, 2, 2, 359, 360, 7, 103, 2, 2, 360, 361, 7, 118, 2, 2, 361,
	362, 7, 119, 2, 2, 362, 363, 7, 116, 2, 2, 363, 364, 7, 112, 2, 2, 364,
	76, 3, 2, 2, 2, 365, 366, 7, 40, 2, 2, 366, 367, 7, 111, 2, 2, 367, 368,
	7, 119, 2, 2, 368, 369, 7, 118, 2, 2, 369, 78, 3, 2, 2, 2, 370, 372, 9,
	2, 2, 2, 371, 370, 3, 2, 2, 2, 372, 373, 3, 2, 2, 2, 373, 371, 3, 2, 2,
	2, 373, 374, 3, 2, 2, 2, 374, 80, 3, 2, 2, 2, 375, 377, 9, 2, 2, 2, 376,
	375, 3, 2, 2, 2, 377, 378, 3, 2, 2, 2, 378, 376, 3, 2, 2, 2, 378, 379,
	3, 2, 2, 2, 379, 380, 3, 2, 2, 2, 380, 382, 9, 3, 2, 2, 381, 383, 9, 2,
	2, 2, 382, 381, 3, 2, 2, 2, 383, 384, 3, 2, 2, 2, 384, 382, 3, 2, 2, 2,
	384, 385, 3, 2, 2, 2, 385, 82, 3, 2, 2, 2, 386, 390, 7, 36, 2, 2, 387,
	389, 10, 4, 2, 2, 388, 387, 3, 2, 2, 2, 389, 392, 3, 2, 2, 2, 390, 388,
	3, 2, 2, 2, 390, 391, 3, 2, 2, 2, 391, 393, 3, 2, 2, 2, 392, 390, 3, 2,
	2, 2, 393, 394, 7, 36, 2, 2, 394, 84, 3, 2, 2, 2, 395, 396, 7, 48, 2, 2,
	396, 86, 3, 2, 2, 2, 397, 398, 7, 46, 2, 2, 398, 88, 3, 2, 2, 2, 399, 400,
	7, 61, 2, 2, 400, 90, 3, 2, 2, 2, 401, 402, 7, 60, 2, 2, 402, 403, 7, 60,
	2, 2, 403, 92, 3, 2, 2, 2, 404, 405, 7, 60, 2, 2, 405, 94, 3, 2, 2, 2,
	406, 407, 7, 63, 2, 2, 407, 96, 3, 2, 2, 2, 408, 409, 7, 63, 2, 2, 409,
	410, 7, 64, 2, 2, 410, 98, 3, 2, 2, 2, 411, 412, 7, 97, 2, 2, 412, 100,
	3, 2, 2, 2, 413, 417, 9, 5, 2, 2, 414, 416, 9, 6, 2, 2, 415, 414, 3, 2,
	2, 2, 416, 419, 3, 2, 2, 2, 417, 415, 3, 2, 2, 2, 417, 418, 3, 2, 2, 2,
	418, 102, 3, 2, 2, 2, 419, 417, 3, 2, 2, 2, 420, 421, 7, 35, 2, 2, 421,
	422, 7, 63, 2, 2, 422, 104, 3, 2, 2, 2, 423, 424, 7, 63, 2, 2, 424, 425,
	7, 63, 2, 2, 425, 106, 3, 2, 2, 2, 426, 427, 7, 64, 2, 2, 427, 428, 7,
	63, 2, 2, 428, 108, 3, 2, 2, 2, 429, 430, 7, 62, 2, 2, 430, 431, 7, 63,
	2, 2, 431, 110, 3, 2, 2, 2, 432, 433, 7, 64, 2, 2, 433, 112, 3, 2, 2, 2,
	434, 435, 7, 62, 2, 2, 435, 114, 3, 2, 2, 2, 436, 437, 7, 44, 2, 2, 437,
	116, 3, 2, 2, 2, 438, 439, 7, 49, 2, 2, 439, 118, 3, 2, 2, 2, 440, 441,
	7, 45, 2, 2, 441, 120, 3, 2, 2, 2, 442, 443, 7, 47, 2, 2, 443, 122, 3,
	2, 2, 2, 444, 445, 7, 39, 2, 2, 445, 124, 3, 2, 2, 2, 446, 447, 7, 40,
	2, 2, 447, 448, 7, 40, 2, 2, 448, 126, 3, 2, 2, 2, 449, 450, 7, 126, 2,
	2, 450, 451, 7, 126, 2, 2, 451, 128, 3, 2, 2, 2, 452, 453, 7, 35, 2, 2,
	453, 130, 3, 2, 2, 2, 454, 455, 7, 40, 2, 2, 455, 132, 3, 2, 2, 2, 456,
	457, 7, 42, 2, 2, 457, 134, 3, 2, 2, 2, 458, 459, 7, 43, 2, 2, 459, 136,
	3, 2, 2, 2, 460, 461, 7, 125, 2, 2, 461, 138, 3, 2, 2, 2, 462, 463, 7,
	127, 2, 2, 463, 140, 3, 2, 2, 2, 464, 465, 7, 93, 2, 2, 465, 142, 3, 2,
	2, 2, 466, 467, 7, 95, 2, 2, 467, 144, 3, 2, 2, 2, 468, 470, 9, 7, 2, 2,
	469, 468, 3, 2, 2, 2, 470, 471, 3, 2, 2, 2, 471, 469, 3, 2, 2, 2, 471,
	472, 3, 2, 2, 2, 472, 473, 3, 2, 2, 2, 473, 474, 8, 73, 2, 2, 474, 146,
	3, 2, 2, 2, 475, 476, 7, 49, 2, 2, 476, 477, 7, 49, 2, 2, 477, 481, 3,
	2, 2, 2, 478, 480, 10, 8, 2, 2, 479, 478, 3, 2, 2, 2, 480, 483, 3, 2, 2,
	2, 481, 479, 3, 2, 2, 2, 481, 482, 3, 2, 2, 2, 482, 484, 3, 2, 2, 2, 483,
	481, 3, 2, 2, 2, 484, 485, 8, 74, 2, 2, 485, 148, 3, 2, 2, 2, 486, 487,
	7, 94, 2, 2, 487, 488, 9, 9, 2, 2, 488, 150, 3, 2, 2, 2, 10, 2, 373, 378,
	384, 390, 417, 471, 481, 3, 8, 2, 2,
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
	"'.to_owned()'", "'len()'", "'new()'", "'capacity()'", "'pub'", "'->'",
	"'fn'", "'main'", "'return'", "'&mut'", "", "", "", "'.'", "','", "';'",
	"'::'", "':'", "'='", "'=>'", "'_'", "", "'!='", "'=='", "'>='", "'<='",
	"'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'",
	"'&'", "'('", "')'", "'{'", "'}'", "'['", "']'",
}

var lexerSymbolicNames = []string{
	"", "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR",
	"IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH",
	"MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", "VEC",
	"VECN", "CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", "PUBLIC",
	"TYPETHEN", "FN", "MAIN", "RETURN", "REF", "NUMBER", "FLOAT", "STRING",
	"PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN",
	"GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR",
	"MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP",
	"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE",
	"L_COMMENT",
}

var lexerRuleNames = []string{
	"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "IF",
	"ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH", "MTOR",
	"TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", "VEC", "VECN",
	"CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", "PUBLIC", "TYPETHEN",
	"FN", "MAIN", "RETURN", "REF", "NUMBER", "FLOAT", "STRING", "PUNTO", "COMA",
	"PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", "GUIONB", "ID",
	"DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL",
	"DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP", "PARIZQ", "PARDER",
	"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", "L_COMMENT",
	"ESC_SEQ",
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
	RustLexPUBLIC     = 33
	RustLexTYPETHEN   = 34
	RustLexFN         = 35
	RustLexMAIN       = 36
	RustLexRETURN     = 37
	RustLexREF        = 38
	RustLexNUMBER     = 39
	RustLexFLOAT      = 40
	RustLexSTRING     = 41
	RustLexPUNTO      = 42
	RustLexCOMA       = 43
	RustLexPTCOMA     = 44
	RustLexDOSPUNTO   = 45
	RustLexDPUNTO2    = 46
	RustLexASIGNACION = 47
	RustLexMTHEN      = 48
	RustLexGUIONB     = 49
	RustLexID         = 50
	RustLexDISTINTO   = 51
	RustLexIGUAL      = 52
	RustLexMAYORIGUAL = 53
	RustLexMENORIGUAL = 54
	RustLexMAYOR      = 55
	RustLexMENOR      = 56
	RustLexMUL        = 57
	RustLexDIV        = 58
	RustLexADD        = 59
	RustLexSUB        = 60
	RustLexMOD        = 61
	RustLexAND        = 62
	RustLexOR         = 63
	RustLexNOT        = 64
	RustLexAMP        = 65
	RustLexPARIZQ     = 66
	RustLexPARDER     = 67
	RustLexLLAVEIZQ   = 68
	RustLexLLAVEDER   = 69
	RustLexCORIZQ     = 70
	RustLexCORDER     = 71
	RustLexWHITESPACE = 72
	RustLexL_COMMENT  = 73
)
