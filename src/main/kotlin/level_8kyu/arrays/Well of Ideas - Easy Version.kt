package level_8kyu.arrays

/*
For every good kata idea there seem to be quite a few bad ones!
In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'.
If there are no good ideas, as is often the case, return 'Fail!'.
*/


private fun main() {
    println("Publish! = ${well(arrayOf("good", "bad", "bad"))}")
    println("I smell a series! = ${well1(arrayOf("good", "good", "good"))}")
    println("Fail! = ${well2(arrayOf("bad", "bad", "bad"))}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun well(x: Array<String>) = when (x.partition { it == "good" }.first.size) {
    0 -> "Fail!"
    in 1..2 -> "Publish!"
    else -> "I smell a series!"
}

//----------------------------------------------------------------------------------------------------------------------
private fun well1(x: Array<String>) = when (x.count { it == "good" }) {
    0 -> "Fail!"
    1, 2 -> "Publish!"
    else -> "I smell a series!"
}

//----------------------------------------------------------------------------------------------------------------------
private fun well2(x: Array<String>): String {
    var goodNumbers = 0
    for (i in x) {
        if (i == "good") goodNumbers++
        if (goodNumbers > 2) return "I smell a series!"
    }
    return when (goodNumbers) {
        in 1..2 -> "Publish!"
        else -> "Fail!"
    }
}


