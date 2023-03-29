package algorithms.generally_algorithms

fun main() {

    val item = 55
    println(binarySearch(arrayOf(20, 31, 33, 46, 47, 50, 51, 55, 57, 59, 60, 69, 70, 78, 101), item))

}

fun binarySearch(list: Array<Int>, item: Int): Int? {

    //в переменных low и high хранятся границы той части списка, в которой выполняется поиск
    var low = 0
    var high = list.lastIndex

    //пока интервал поиска не сократится до одного элемента
    while (low <= high) {
        val mid = (low + high) / 2 //получаем индекс среднего элемента
        val guess = list[mid] //получаем значение среднего элемента

        when {
            //проверяем подходит ли нам средний эелемент, если да, то возвращаем его индекс
            guess == item -> return mid
            //если средний эелемент больше искомого уменьшаем верхнюю границу поиска на половину эелементов, исключая наш средний эелемент
            guess > item -> high = mid - 1
            //если средний эелемент меньше искомого увеличиваем нижнюю границу поиска на половину эелементов, исключая наш средний эелемент
            else -> low = mid + 1
        }
    }
    //возвращаем null, если в массиве нет такого элемента
    return null
}