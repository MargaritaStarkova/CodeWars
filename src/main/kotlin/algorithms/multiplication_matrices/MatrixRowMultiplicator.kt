package algorithms.multiplication_matrices

class MatrixRowMultiplicator(
    private val a: Matrix,
    private val b: Matrix,
    private val result: Matrix,
    private val rowIndex: Int,
    private val startIndex: Int,
    private val endIndex: Int,
) : Runnable {

    override fun run() {
        // Теперь поток будет обрабатывать ДИАПАЗОН строк,
        // а не только одну строчку
        for (rowIndex in startIndex until endIndex) {
            for (j in 0 until result.columnsCount) {
                for (k in 0 until a.columnsCount) {
                    result.addValue(
                        rowsIndex = rowIndex,
                        columnsIndex = j,
                        value = a.getValue(rowIndex, k) * b.getValue(k, j)
                    )
                }
            }
        }
    }
}