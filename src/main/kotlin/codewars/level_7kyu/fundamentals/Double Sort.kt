package codewars.level_7kyu.fundamentals

/*
Simple enough this one - you will be given an array.
The values in the array will either be numbers or strings, or a mix of both.
You will not get an empty array, nor a sparse one.
Your job is to return a single array that has first the numbers sorted in ascending order,
followed by the strings sorted in alphabetic order. The values must maintain their original type.
Note that numbers written as strings are strings and must be sorted with the other strings.
*/

private fun main() {
    println(
        "2, 3, 4, 5, 6 = ${
            dbSort(arrayOf(6, 2, 3, 4, 5)).contentDeepToString()
        }"
    )
    println(
        "46, 78, 574, \"287\", \"3\", \"423\", \"69\", \"Apple\", \"Grape\", \"Peach\" = ${
            dbSort2(arrayOf("Apple", 46, "287", 574, "Peach", "3", "69", 78, "Grape", "423")).contentDeepToString()
        }"
    )
}

//----------------------------------------------------------------------------------------------------------------------
fun dbSort(a: Array<Any>): Array<Any> {
    var str = mutableListOf<String>()
    var numbers = mutableListOf<Int>()
    for (i in a) {
        if (i is Int) numbers.add(i)
        else str.add(i.toString())
    }
    val result = ArrayList<Any>()
    result.addAll(numbers.sorted())
    result.addAll(str.sorted())
    return result.toTypedArray()
}
//----------------------------------------------------------------------------------------------------------------------
fun dbSort2(a: Array<Any>): Array<Any> = (a.filterIsInstance<Int>().sortedBy { it } + a.filterIsInstance<String>().sorted()).toTypedArray()
//----------------------------------------------------------------------------------------------------------------------


