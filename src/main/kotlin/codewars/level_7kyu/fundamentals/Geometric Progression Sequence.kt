package codewars.level_7kyu.fundamentals

/*
In your class, you have started lessons about geometric progression.
Since you are also a programmer, you have decided to write a function that will print first n elements
of the sequence with the given constant r and first element a.

Result should be separated by comma and space.

Example
        geometricSequenceElements(2, 3, 5) == "2, 6, 18, 54, 162"
*/

private fun main() {
    println("2, 6, 18, 54, 162 = ${geometricSequenceElements(2, 3, 5)}")
    println("2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 = ${geometricSequenceElements(2, 2, 10)}")
    println("1, -2, 4, -8, 16, -32, 64, -128, 256, -512 = ${geometricSequenceElements1(1, -2, 10)}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun geometricSequenceElements(a: Int, r: Int, n: Int ): String = when {
    n > 1 -> "$a, ${geometricSequenceElements(a * r, r, n - 1)}"
    n == 1 ->"$a"
    else -> ""
}
//----------------------------------------------------------------------------------------------------------------------
fun geometricSequenceElements1(a: Int, r: Int, n: Int): String =
    generateSequence(a) { it * r }
        .take(n)
        .joinToString(", ")
//----------------------------------------------------------------------------------------------------------------------


