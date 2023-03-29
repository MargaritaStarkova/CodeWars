package algorithms.tinkoff_tests

import java.util.Scanner

fun main() {

    val scn = Scanner(System.`in`)
    val firstLimit = scn.next()
    val secondLimit = scn.next()

    val a = count(firstLimit, true)
    val b = count(secondLimit, false)
    println("${b - a}")
}

fun count(number: String, isFirst: Boolean): Int {
    val zeroes = number.length - 1
    var firstDigit = number.take(1).toInt()

    for (char in number.drop(1)) {
        if (firstDigit < char.digitToInt()) {
            break
        }
        if (firstDigit > char.digitToInt()) {
            firstDigit--; break
        }
    }
    if (isFirst) {
        if (number.filter { firstDigit == it - '0' }.length == number.length) firstDigit--
    }

    return (9 * zeroes) + firstDigit
}




