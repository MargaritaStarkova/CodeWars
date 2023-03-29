package yandex

import java.io.File
import java.io.PrintWriter
import java.util.Scanner

fun main() {
    val input = "D:\\dev\\dev Android\\AndroidStudioProjects\\input_test\\input.txt"
    val output = "D:\\dev\\dev Android\\AndroidStudioProjects\\input_test\\output.txt"

    val scan = Scanner(File(input))
    val writer = PrintWriter(output)

    val text = arrayListOf<Int>()

    while (scan.hasNext()) {
        text.add(scan.nextInt())
    }
    println(text)

    val result = arrayListOf<Int>()

    for (i in 0..text.lastIndex) {
        when (i) {
            in 3 until  6 -> result.add(text[i])
            else -> {}
        }
    }
    writer.use { out ->
        out.println("${result.joinToString(" ")}")
    }
}