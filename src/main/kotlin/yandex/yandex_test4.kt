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

    val nGroup = scanner.nextLine().split(" ")
    val hashMap = List<Int> (10) { it + 1  }.groupBy { nGroup[it] to nGroup.count { it == it }}

}

// [1 2 3]
// [3 3 3]
// [1 1 1 3 1] - 3 * 5 = 15
// [1 1 1 1 1] - 1 * 5 = 5