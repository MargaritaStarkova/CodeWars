package level_8kyu.fundamentals

/*
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

Examples
    Kata().makeNegative(1)  // return -1
    Kata().makeNegative(-5) // return -5
    Kata().makeNegative(0)  // return 0
Notes
    The number can be negative already, in which case no change is required.
    Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
*/

private fun main() {
    println("-57 = ${makeNegative(57)}")
    println("0 = ${makeNegative(0)}")
    println("-42 = ${makeNegative1(-42)}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun makeNegative(x: Int) =
    if ( x >= 0) ("-$x").toInt()
    else x
//----------------------------------------------------------------------------------------------------------------------
private fun makeNegative1(x: Int) = if(x <= 0) x else -x
//----------------------------------------------------------------------------------------------------------------------

