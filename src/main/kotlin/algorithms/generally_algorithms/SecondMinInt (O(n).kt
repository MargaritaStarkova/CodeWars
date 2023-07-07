package algorithms.generally_algorithms

fun main() {

    val array = intArrayOf(50, 20, 5, 6, 7, 5, 20, 6)
    println(array.contentToString())
    println(secondMin(array))

}

fun secondMin(array: IntArray): Int {

    var min = array[0]
    var secondMinInt = min

    for (i in 1..array.lastIndex) {
        if (array[i] < min) {
            secondMinInt = min
            min = array[i]
        }
        else if (array[i] <  secondMinInt && array[i] != min) secondMinInt = array[i]

    }
    return secondMinInt
}