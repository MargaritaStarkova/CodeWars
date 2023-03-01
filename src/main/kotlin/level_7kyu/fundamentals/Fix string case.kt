package level_7kyu.fundamentals

import kotlin.math.abs

/*
In this Kata, you will be given a string that may have mixed uppercase and lowercase letters
and your task is to convert that string to either lowercase only or uppercase only based on:
        make as few changes as possible.
        if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
For example:
        solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
        solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
        solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
*/

private fun main() {
    println("code = ${solve("code")}")
    println("CODE = ${solve("CODe")}")
    println("code = ${solve("COde")}")
    println("code = ${solve("Code")}")
    println(" = ${solve1("")}")
    println("YWNOREFBLJF = ${solve1("YwnOREFblJf")}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun solve(s: String) = when {
    s.filter { "$it" == it.uppercase() }.length > s.length / 2 -> s.uppercase()
    else -> s.lowercase()
}
//----------------------------------------------------------------------------------------------------------------------
private fun solve1(s: String): String = if (s.count { it.isLowerCase() } >= s.length/2.0) s.lowercase() else s.uppercase()
//----------------------------------------------------------------------------------------------------------------------


