package codewars.level_7kyu.fundamentals

/*
You are given a sequence of a journey in London, UK. The sequence will contain bus numbers and TFL tube names as strings e.g.

arrayOf("Northern", "Central", 243, 1, "Victoria")
Journeys will always only contain a combination of tube names and bus numbers. Each tube journey costs £2.40 and each bus journey costs £1.50. If there are 2 or more adjacent bus journeys, the bus fare is capped for sets of two adjacent buses and calculated as one bus fare for each set.

For example: 'Piccadilly', 56, 93, 243, 20, 14 -> "£6.90"
Your task is to calculate the total cost of the journey and return the cost rounded to 2 decimal places in the format (where x is a number): £x.xx
*/

private fun main() {
    println("£7.80 = ${londonCityHacker(arrayOf(12, "Central", "Circle", 21))}")
    println("£5.40 = ${londonCityHacker(arrayOf("Piccidilly", 56, 93, 243))}")
}

//----------------------------------------------------------------------------------------------------------------------

fun londonCityHacker(journey: Array<Any>): String =
    journey.joinToString(""){ if (it is Int) "B" else "T"}
        .replace("BB", "B")
        .sumOf {if ( it == 'T' )  2.40  else 1.50 }
        .let { "£%.2f".format(it) }

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------




