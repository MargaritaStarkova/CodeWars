package algorithms.multiplication_matrices

class MatrixRowMultiplicationThread(
    private val a: Matrix,
    private val b: Matrix,
    private val result: Matrix,
    private val rowIndex: Int,
) : Thread() {

    override fun run() {
        for (j in 0 until result.columnsCount) {
            for (k in 0 until a.columnsCount) {
                result.addValue(
                    rowsIndex = rowIndex,
                    columnsIndex = j,
                    value = a.getValue(rowIndex, k) * b.getValue(k, j),
                )
            }
        }
    }
}