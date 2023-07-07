package yandex

import java.io.File
import java.io.PrintWriter
import java.util.*

/*
4
3
1 2 3
Ответ: 16
 */

/*
2
3
1 4 3
Ответ: 11
 */

fun main() {
    val input = "input.txt"
    val output = "output.txt"
    val scn = Scanner(File(input))
    val out = PrintWriter(output)

    val k: Int = scn.nextInt()
    val n: Int = scn.nextInt()
    val firstProgram = IntArray(n) { scn.nextInt() }
    val finalProgram = IntArray(n + 1) { 0 }

    val laughTimeFirstProg: Int = firstProgram.mapIndexed { index, it -> (index + 1) * it }.sum()


    for (i in firstProgram.indices) {
        finalProgram[i] = firstProgram[i]
    }

    var maxLaughTimeDifference = 0

    for (i in 0..firstProgram.lastIndex) {
        //заполняем второй массив
        for (j in 0..finalProgram.lastIndex) {
            finalProgram[i] = k
        }

        val maxLaughTime = finalProgram.mapIndexed { index, it -> (index + 1) * it }.sum()
        val temp = maxLaughTime - laughTimeFirstProg

        if (temp > maxLaughTimeDifference){
            maxLaughTimeDifference = temp
        }
            //  finalProgram[i] = temp1
    }

    out.use {
        it.println(maxLaughTimeDifference)
    }
}

