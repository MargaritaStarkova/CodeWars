package algorithms.tinkoff_tests

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val inputData = scanner.nextLine()

    var x = ""

    if (!inputData.contains("a") || !inputData.contains("b") || !inputData.contains("c") || !inputData.contains("d")) println(-1)
    else {

        for (i in inputData) {
            x += i
            if (x.contains(Regex("[a-d]"))) println(x.length)
            inputData
        }
    }

}

