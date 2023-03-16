package codewars.level_8kyu.fundamentals

/*
Very simple, given an integer or a floating-point number, find its opposite.
Examples:

        1: -1
        14: -14
        -34: 34
*/

private fun main() {
    println("1 = ${opposite(-1)}")
    println("0 = ${opposite(0)}")
    println("-20 = ${opposite(20)}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun opposite(number: Int) = -number

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------


