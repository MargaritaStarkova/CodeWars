package level_7kyu.arrays

/*
Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.
Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
Each part will be in a string
Elements of a pair must be in the same order as in the original array.

Examples of returns in different languages:
a = ["az", "toto", "picaro", "zone", "kiwi"] -->
[["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
*/

private fun main() {
    println(
        "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]] = ${
            partlist(
                arrayOf(
                    "cdIw", "tzIy", "xDu", "rThG"
                )
            ).contentDeepToString()
        }"
    )
    println(
        "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]] = ${
            partlist(
                arrayOf("I", "wish", "I", "hadn't", "come")
            ).contentDeepToString()
        }"
    )
}

//----------------------------------------------------------------------------------------------------------------------
private fun partlist(arr: Array<String>): Array<Array<String>> = (1 until arr.size).map {
    arrayOf(arr.take(it).joinToString(" "), arr.drop(it).joinToString(" "))
}.toTypedArray()


//----------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------


