package level_8kyu.fundamentals

/*
Write a program that finds the summation of every number from 1 to num.
The number will always be a positive integer greater than 0.
For example (Input -> Output):
        2 -> 3 (1 + 2)
        8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
*/

fun main() {
    println("1 = ${summation(1)}")
    println("36 = ${summation2(8)}")
}

//----------------------------------------------------------------------------------------------------------------------
fun summation(n: Int): Int = if (n > 0) n + summation(n - 1) else 0


//----------------------------------------------------------------------------------------------------------------------
fun summation2(n: Int) = (1..n).sum()
//----------------------------------------------------------------------------------------------------------------------


