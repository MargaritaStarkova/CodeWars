package level_6kyu.algorithms

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.

Examples
        [2, 4, 0, 100, 4, 11, 2602, 36]
        Should return: 11 (the only odd number)

        [160, 3, 1719, 19, 11, 13, -21]
        Should return: 160 (the only even number)
*/

private fun main() {
    println(find(arrayOf(2, 4, 0, 100, 4, 11, 2602, 36)))
    println(find1(arrayOf(160, 3, 1719, 19, 11, 13, -21)))
    println(find2(arrayOf(2,6,8,-10,3)))
}

//----------------------------------------------------------------------------------------------------------------------
private fun find(integers: Array<Int>): Int {
    val (a, b) = integers.partition { it % 2 == 0 }
    return if (a.size == 1) a[0]
    else b[0]
}
//----------------------------------------------------------------------------------------------------------------------
private fun find1(integers: Array<Int>) = integers.singleOrNull { it % 2 == 0 } ?: integers.single { it % 2 != 0 }
//----------------------------------------------------------------------------------------------------------------------
private fun find2(integers: Array<Int>): Int =
    if( integers.take(3).count {it % 2 == 0} > 1 )
        integers.first {it % 2 != 0}
    else
        integers.first {it % 2 == 0}