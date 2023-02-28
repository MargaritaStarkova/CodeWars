package level_8kyu.fundamentals
/*
Given a number n, return the number of positive odd numbers below n, EASY!

Examples (Input -> Output)
    7  -> 3 (because odd numbers below 7 are [1, 3, 5])
    15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
Expect large Inputs!
*/

private fun main() {
    println("7 = ${oddCount(15)}")
    println("7511 = ${oddCount(15023)}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun oddCount(n: Int) = n / 2
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------


