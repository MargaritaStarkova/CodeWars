package level_8kyu.arrays

/*
Given a non-empty array of integers, return the result of multiplying the values together in order.

Example:
        [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/
private fun main() {
    println("6 = ${grow(intArrayOf(1, 2, 3))}")
    println("16 = ${grow(intArrayOf(4, 1, 1, 1, 4))}")
    println("64 = ${grow1(intArrayOf(2, 2, 2, 2, 2, 2))}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun grow(arr: IntArray): Int = arr.reduce { a, b -> a * b }

//----------------------------------------------------------------------------------------------------------------------
private fun grow1(arr: IntArray): Int {
    var result = 1
    for (i in arr) {
        result *= i
    }
    return result
}
//----------------------------------------------------------------------------------------------------------------------

