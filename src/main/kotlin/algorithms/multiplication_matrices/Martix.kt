package algorithms.multiplication_matrices

import java.lang.Integer.min

class Matrix (
    //двумерный массив для хранения чисел в матрице
    private val data: Array<IntArray>,
){
    //конструктор, принимающий на вход только размеры матрицы
    constructor(rowsCount: Int,columnsCount: Int) : this (
        data = Array(rowsCount) { IntArray(columnsCount) }
    )

    //пара всопомгательных свойств для определения числа строк
    //и столбцов матрицы
    val rowsCount: Int
        get() = this.data.size

    val columnsCount: Int
        get() = if (rowsCount > 0) this.data[0].size else -1

    //переопределяем equals и hashCode, чтобы было легче
    //сравнивать две матрицы по их содержимому
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Matrix

        if (this.rowsCount != other.rowsCount || this.columnsCount != other.columnsCount) {
            throw AssertionError("Matrices have different shapes")
        }

        for (i in 0 until rowsCount) {
            for (j in 0 until columnsCount) {
                if (this.data[i][j] != other.data[i][j]) {
                    throw AssertionError("Values at ($i, $j) are not equal: ${this.getValue(i, j)} != ${other.getValue(i, j)}")
                }
            }
        }

        return true
    }

    override fun hashCode(): Int {
        return data.contentDeepHashCode()
    }

    //специальный метод, который добавит переданное значение
    //в ячейку матрицы
    fun addValue(rowsIndex: Int, columnsIndex: Int, value: Int) {
        check(
            rowsIndex < rowsCount && columnsIndex < columnsCount
        ){
            "Wrong indices!"
        }
        this.data[rowsIndex][columnsIndex] += value
    }

    //метод вернут значение в ячейке матрицы
    //с указанным индексом
    fun getValue(rowsIndex: Int, columnsIndex: Int): Int {
        check(
            rowsIndex < rowsCount && columnsIndex < columnsCount
        ) {
            "Wrong indices!"
        }
        return this.data[rowsIndex][columnsIndex]
    }

    //метод для перемножения матриц
    fun multiply(other: Matrix): Matrix {
        check(this.columnsCount == other.rowsCount){
            "Cannot multiply matrices: the number of columns of the first matrix must be equal to the number of rows of the second matrix"
        }
        val result = Matrix(this.rowsCount, other.columnsCount)

        //создаем список для хранения потоков
        val threads = mutableListOf<Thread>()

        //вычисляем максимальное количество потоков
        val numThreads = min(
            this.rowsCount,
            Runtime.getRuntime().availableProcessors()
        )

        for (i in 0 until result.rowsCount) {
            val startIndex = i * this.rowsCount / numThreads
            val endIndex = (i + 1) * this.rowsCount / numThreads


            // Создаём поток и передаём в него реализацию
            // интерфейса Runnable
            threads += Thread(
                MatrixRowMultiplicator(
                    a = this,
                    b = other,
                    result = result,
                    rowIndex = i,
                    startIndex = startIndex,
                    endIndex = endIndex,
                )
            )
        }

        //проходим по списку и запускаем каждый поток
        threads.forEach { it.start() }

        //заставим все потоки дождаться окончания их выполнения
        threads.forEach { it.join() }

        return result
    }

    fun contentToString(): String {
        return this.data.contentDeepToString()
    }
}
