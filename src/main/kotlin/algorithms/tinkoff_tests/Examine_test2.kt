package algorithms.tinkoff_tests

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val inputData = scanner.nextLine().split(" ").map { it.toInt() }.toTypedArray()

    val n = inputData[0]
    val m = inputData[1]
    val k = inputData[2]

    println(m / k * n - k * (m % k))

}

