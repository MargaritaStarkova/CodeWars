package level_7kyu.fundamentals

import kotlin.math.ceil

/*
Move every letter in the provided string forward 10 letters through the alphabet.
If it goes past 'z', start again at 'a'.
Input will be a string with length > 0.
*/

private fun main() {
    println("docdmkco = ${moveTen("testcase")}")
    println("mynogkbc = ${moveTen("codewars")}")
    println("ohkwzvodocdrobo = ${moveTen1("exampletesthere")}")
}
//----------------------------------------------------------------------------------------------------------------------
private fun moveTen(s: String): String {
    var char: Char
    val result = s.toMutableList()
    s.forEachIndexed { index, c ->
        char = c + 10
        if (!char.isLetter()) char = 'a' + (char - 'z') - 1
        result[index] = char
    }
    return result.joinToString("")
}
//----------------------------------------------------------------------------------------------------------------------
private fun moveTen1(s: String) = s.map { 'a' + (((it - 'a') + 10) % 26) }.joinToString("")
//----------------------------------------------------------------------------------------------------------------------
