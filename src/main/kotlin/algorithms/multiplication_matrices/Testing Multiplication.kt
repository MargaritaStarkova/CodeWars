package algorithms.multiplication_matrices



//проверяем работу функций
fun main() {

    for (i in 0 until 100) {
        testMatrixMultiplication()
    }
}

fun testMatrixMultiplication(){
    println("Start using")

    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
        )
    )

    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(7, 8),
            intArrayOf(9, 10),
            intArrayOf(11, 12),
        )
    )
    val result = firstMatrix.multiply(secondMatrix)
    println(result.contentToString())

    //тестируем результаты
    check(result.rowsCount == 2) {
        "Rows count not valid!"
    }
    check(result.columnsCount == 2){
        "Columns count not valid!"
    }

    val expectedResult = Matrix (
        arrayOf(
            intArrayOf(58, 64),
            intArrayOf(139, 154)
        )
    )
    check(result == expectedResult) {
        "Matrices multiplication result is not valid"
    }

    //если мы увидим эту фразу в результатах,
    //то все корректно
    println("Everything is correct, success!")
}