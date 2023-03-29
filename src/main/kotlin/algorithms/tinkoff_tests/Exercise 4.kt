package algorithms.tinkoff_tests

import java.util.Scanner
import kotlin.math.pow

fun main() {

    val scanner = Scanner(System.`in`)
    val inputData = scanner.nextLine()
    val inputNumbers = scanner.nextLine()

    val firstSum = inputNumbers.split(" ").sumOf { it.toLong() }
    val sequence = inputNumbers.split(" ").toTypedArray()
    val k = inputData.split(" ").last().toInt()

    if (k == 0) println(0)
    else {
        var arr = arrayListOf<Pair<Int, String>>()
        val newSequence = arrayListOf<String>()

        calculateProfitability(arr, sequence)

        for (i in arr) {
            newSequence.add(i.second)
        }
        var x = 0
        while (x != k) {
            val maxIndex = findMaxIndex(arr)
            val newStr = newSequence[maxIndex].replaceFirst(Regex("[0-8]"), "9")
            newSequence[maxIndex] = newStr
            x++
            arr = calculateProfitability(arr, newSequence.toTypedArray())
        }
        println("Начальная последовательность = ${sequence.contentToString()}")
        println("Начальная сумма = $firstSum")
        println("Новая последовательность = $newSequence")
        println("Новая сумма = ${newSequence.sumOf { it.toLong() }}")
        println("Разница = ${newSequence.sumOf { it.toLong() } - firstSum}")
    }
}

fun calculateProfitability(
    arr: ArrayList<Pair<Int, String>>,
    sequence: Array<String>
): ArrayList<Pair<Int, String>> {
    arr.clear()
    for (i in sequence) {
        val exp = (10.0.pow(i.length.toDouble()) - i.toLong()).toInt()
        arr.add(Pair(exp, i))
    }
    return arr
}

fun findMaxIndex(arr: ArrayList<Pair<Int, String>>): Int {
    var max = arr[0]
    for (i in 1..arr.lastIndex) {
        if (arr[i].first >= max.first) max = arr[i]
    }
    return arr.indexOf(max)
}



