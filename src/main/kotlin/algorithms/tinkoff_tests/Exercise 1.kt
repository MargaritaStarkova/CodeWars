package algorithms.tinkoff_tests

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val inputData =
        scanner
            .nextLine()
            .split(" ")
            .map { it.toInt() }
    if (inputData[3] < inputData[1]) println(inputData[0])
    else println(inputData[0] + (inputData[3] - inputData[1]) * inputData[2])

}