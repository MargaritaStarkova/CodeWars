package codewars.level_8kyu.fundamentals
/*
It's pretty straightforward.
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.
*/

private fun main() {
    println("loquen = ${removeChar("eloquent")}")
    println("ountr = ${removeChar("country")}")
    println("erso = ${removeChar("person")}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun removeChar(str: String) = str.substring(1, str.length - 1)

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

