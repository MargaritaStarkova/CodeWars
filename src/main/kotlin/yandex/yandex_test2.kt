package yandex

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val j = scanner.nextLine()
    val s = scanner.nextLine()
    //ab
    //aaabbbkeihfgaabb
    println(j)
    println(s)
    var result = 0

    val map = s.groupBy ({j.contains(it)}, {it} )

    println(map[true]?.size)

    /*for (k in s) {              //О(n)
        if (j.contains(k)) result++
    }

    println(result)*/

}