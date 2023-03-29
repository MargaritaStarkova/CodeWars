package algorithms.tinkoff_tests



import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val a = scanner.nextLine()

    val array = a.split(" ").map { it.toInt() }.toTypedArray()
    println(isSorted(array))
}

private fun isSorted(array: Array<Int>): String {
    var x = 1
    var j = array[0]
    for (i in 1..array.lastIndex) {
        if (array[i] >= j) {
            j = array[i]
            x++
        }
    }

    if (x == array.size) return "YES"

    j = array[0]

    for (i in 1..array.lastIndex) {
        if (array[i] <= j) {
            j = array[i]
            x++
        }
    }
    return if (x == array.size) "YES"
    else "NO"
}