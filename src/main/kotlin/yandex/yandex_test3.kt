package yandex

import java.util.Scanner

/*
3
1 2 3
1
2 3
*/

/*
3
1 2 3
4
1 1
2 1
3 1
4 1
*/

/*
3
1 2 3
4
1 1
2 3
3 1
4 1
*/

/*
3
1 2 3
1
3 3
*/


//[3, 3, 2, 2, 2, 1]

fun main() {
    val scanner = Scanner(System.`in`)

    val array = arrayListOf<Int>()
    scanner.nextLine()

    val nGroup = scanner.nextLine().split(" ").map { it.toInt() }.sorted()
    val k = scanner.nextInt()

    for (i in 1..k) {
        val room = scanner.nextInt()
        val count = scanner.nextInt()
        for (j in 1..count) {
            array.add(room)
        }
    }
    array.sort()
    var amount = false
    if (nGroup.size <= array.size) { // 3  3
        for (i in nGroup.lastIndex downTo 0) {
            if (nGroup[i] > array[i]) {
                amount = false
                break
            }
            else {
                amount = true
            }
        }
    }
    println(if (amount) "Yes" else "No")
}
// [1 2 3]
// [3 3 3]
// [1 1 1 3 1] - 3 * 5 = 15
// [1 1 1 1 1] - 1 * 5 = 5


//[1 2 3 4 2 1]
// 4 = {1}
// 2 = {2}
// 3 ={1}
//