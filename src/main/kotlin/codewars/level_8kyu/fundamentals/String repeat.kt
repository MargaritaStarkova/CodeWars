package codewars.level_8kyu.fundamentals

/*
Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

Examples (input -> output)
        6, "I"     -> "IIIIII"
        5, "Hello" -> "HelloHelloHelloHelloHello"
*/

private fun main() {
    println("aaaa = ${repeatStr(4, "a")}")
    println("HelloHelloHello = ${repeatStr(3, "a")}")
    println("  = ${repeatStr(5, "")}")
    println("  = ${repeatStr(0, "kata")}")
}
//----------------------------------------------------------------------------------------------------------------------
private fun repeatStr(r: Int, str: String) : String = str.repeat(r)

//----------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------

