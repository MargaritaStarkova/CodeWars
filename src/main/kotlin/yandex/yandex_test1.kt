package yandex

import java.io.File
import java.io.PrintWriter
import java.util.Scanner

fun main() {
    val input = "input.txt"
    val output = "output.txt"

    val scan = Scanner(File(input))
    val writer = PrintWriter(output)

    val n = scan.nextLine()
    val result = n.split(" ").sumOf { it.toInt() }

    writer.use { out ->
        out.println(result)
    }
}