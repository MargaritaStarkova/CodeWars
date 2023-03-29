package algorithms.tinkoff_tests

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val inputData = scanner.nextInt()
    var n = 1L
    var i = 0

    while (n < inputData) {
        n *= 2
        i++
    }
    println(i)

}