package level_8kyu.mathematics
/*
Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
*/

fun main() {
    println("Even = ${evenOrOdd(2)}")
    println("Even = ${evenOrOdd(0)}")
    println("Odd = ${evenOrOdd(7)}")
    println("Odd = ${evenOrOdd(1)}")
}
//----------------------------------------------------------------------------------------------------------------------
fun evenOrOdd(number: Int): String =
    if (number % 2 == 0) "Even"
    else "Odd"

//----------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------

