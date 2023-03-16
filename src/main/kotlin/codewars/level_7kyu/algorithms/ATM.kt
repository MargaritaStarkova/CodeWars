package codewars.level_7kyu.algorithms

/*
An ATM has banknotes of nominal values 10, 20, 50, 100, 200 and 500 dollars.
You can consider that there is a large enough supply of each of these banknotes.
You have to write the ATM's function that determines the minimal number of banknotes
needed to honor a withdrawal of n dollars, with 1 <= n <= 1500.
Return that number, or -1 if it is impossible.
*/

private fun main() {

    println(count(770)) // 4
    println(count1(1000)) // 2
    println(count2(125)) // -1
    println(count2(1000)) // 2
}

//----------------------------------------------------------------------------------------------------------------------
private fun count(number: Int): Int = when {
    number % 10 != 0 -> -1
    number - 500 >= 0 -> 1 + count(number - 500)
    number - 200 >= 0 -> 1 + count(number - 200)
    number - 100 >= 0 -> 1 + count(number - 100)
    number - 50 >= 0 -> 1 + count(number - 50)
    number - 20 >= 0 -> 1 + count(number - 20)
    number - 10 >= 0 -> 1
    else -> 0
}

//----------------------------------------------------------------------------------------------------------------------
val values = listOf(500, 200, 100, 50, 20, 10)
private fun count1(amount: Int): Int {
    val (a, k) = values.fold(Pair(amount, 0)){ (a, k), v -> Pair(a % v, k + a / v) }
    return if (a == 0) k else -1
}
//----------------------------------------------------------------------------------------------------------------------
private fun count2(amount: Int): Int {
    val nominals = intArrayOf(500, 200, 100, 50, 20, 10)
    var remainingAmount = amount
    var count = 0

    while (remainingAmount != 0) {
        remainingAmount -= nominals.find { it <= remainingAmount } ?: return -1
        count ++
    }

    return count
}
