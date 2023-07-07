package leetcode.easy

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
    Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Constraints:
        -2^31 <= x <= 2^31 - 1
*/

private fun main() {
    println("true = ${isPalindrome1(121)}")
    println("false = ${isPalindrome1(-121)}")
    println("false = ${isPalindrome1(10)}")
    println("false = ${isPalindrome1(1234567899)}")
    println("false = ${isPalindrome1(2147483647)}")
}

//----------------------------------------------------------------------------------------------------------------------
//Runtime 252  ms, Memory 36.2 MB //O(n)
private fun isPalindrome(x: Int) = if (x < 0) false
else x.toString().reversed() == x.toString()


//----------------------------------------------------------------------------------------------------------------------
//Runtime 217 ms, Memory 35.6 MB //O(n)
private fun isPalindrome1(x: Int): Boolean {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false
    }
    var reveredNumber: ULong = 0u
    var temp: ULong = x.toULong()
    while (x.toULong() > reveredNumber) {
/*      println("temp = $temp")
        println("reveredNumber = $reveredNumber")*/
        reveredNumber = (reveredNumber * 10u) + (temp % 10u)
        temp /= 10u
    }
    return x.toULong() == reveredNumber || x.toULong() == reveredNumber / 10u
}

//----------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------
