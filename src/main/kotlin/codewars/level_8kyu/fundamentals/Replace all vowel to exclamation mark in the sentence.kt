package codewars.level_8kyu.fundamentals

/*
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

Examples
        replace("Hi!") === "H!!"
        replace("!Hi! Hi!") === "!H!! H!!"
        replace("aeiou") === "!!!!!"
        replace("ABCDE") === "!BCD!"
*/

private fun main() {
    println("H!! = ${replace("Hi!")}")
    println("!H!! H!! = ${replace("!Hi! Hi!")}")
    println("!!!!! = ${replace1("aeiou")}")
    println("!BCD! = ${replace2("ABCDE")}")
}
//----------------------------------------------------------------------------------------------------------------------
private fun replace(s: String): String = s.map {
    if ("aeiouAEIOU".contains(it)) '!'
    else it
}.joinToString("")

//----------------------------------------------------------------------------------------------------------------------
private fun replace1(s: String): String {
    val vowel = "aeiouAEIOU"
    var result = ""
    for (i in s) {
        if (!vowel.contains(i)) {
            result += i
        } else result += "!"
    }
    return result
}
//----------------------------------------------------------------------------------------------------------------------
private fun replace2(s: String) = s.replace(Regex("[aeiouAEIOU]"), "!")
