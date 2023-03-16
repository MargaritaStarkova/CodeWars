package codewars.level_8kyu.fundamentals

/*
I have a cat and a dog.
I got them at the same time as kitten/puppy. That was humanYears years ago.
Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:
        humanYears >= 1
        humanYears are whole numbers only
Cat Years
        15 cat years for first year
        +9 cat years for second year
        +4 cat years for each year after that
Dog Years
        15 dog years for first year
        +9 dog years for second year
        +5 dog years for each year after that
*/

private fun main() {
    println("${arrayOf(1, 15, 15).contentToString()} = ${calculateYears(1).contentToString()}")
    println("${arrayOf(2, 24, 24).contentToString()} = ${calculateYears(2).contentToString()}")
    println("${arrayOf(10, 56, 64).contentToString()} = ${calculateYears(10).contentToString()}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun calculateYears(years: Int) = when (years) {
    1 -> arrayOf(years, 15, 15)
    2 -> arrayOf(years, 15 + 9, 15 + 9)
    else -> arrayOf(years, 15 + 9 + ((years - 2) * 4), 15 + 9 + ((years - 2) * 5))
}
//----------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------

