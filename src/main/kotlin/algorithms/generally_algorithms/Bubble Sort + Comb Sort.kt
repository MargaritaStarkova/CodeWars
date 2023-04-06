package algorithms.generally_algorithms

private fun main() {
    val startTime = System.currentTimeMillis()
    val usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()

    val list = MutableList(30_000) { (128..999999).random() }


    list.sort()
    println(list.toString())
    println("memory = ${usedMemory / 1048576} mb")
    println("time = ${System.currentTimeMillis() - startTime} mill")
}

private fun bubbleSort(list: MutableList<Int>) {
    /*
    memory = 2 mb
    time = 5785 mill
     */
    var isSorted = false
    while (!isSorted) {
        isSorted = true
        for (i in 0 until list.lastIndex) {
            if (list[i + 1] < list[i]) {
                val temp = list[i + 1]
                list[i + 1] = list[i]
                list[i] = temp
                isSorted = false
            }

        }

    }
}

private fun combSort(list: MutableList<Int>) {
    /*
    memory = 2 mb
    time = 66 mill
     */
    var isSorted = false
    var gap = list.size
    while (!isSorted) {
        isSorted = true
        gap =
            if (gap > 1) {
                gap * 10 / 13
            } else 1

        for (i in gap..list.lastIndex) {

            if (list[i - gap] > list[i]) {
                val temp = list[i - gap]
                list[i - gap] = list[i]
                list[i] = temp
                isSorted = false
            }

        }


    }
}

