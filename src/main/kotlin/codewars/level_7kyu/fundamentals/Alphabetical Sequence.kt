package codewars.level_7kyu.fundamentals


/*
In this kata you will be given a random string of letters and
tasked with returning them as a string of comma-separated
sequences sorted alphabetically, with each sequence starting
with an uppercase character followed by n-1 lowercase characters,
where n is the letter's alphabet position 1-26.

Example
alphaSeq("ZpglnRxqenU") -> "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,
Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"
*/

private fun main() {
    println(
        "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz = ${
            alphaSeq(
                "ZpglnRxqenU"
            )
        }"
    )
    println(
        "Bb,Eeeee,Ffffff,Ffffff,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Sssssssssssssssssss,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy,Yyyyyyyyyyyyyyyyyyyyyyyyy = ${
            alphaSeq1(
                "NyffsGeyylB"
            )
        }"
    )
    println(
        "Bb,Jjjjjjjjjj,Kkkkkkkkkkk,Mmmmmmmmmmmmm,Ooooooooooooooo,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Tttttttttttttttttttt,Uuuuuuuuuuuuuuuuuuuuu,Uuuuuuuuuuuuuuuuuuuuu,Vvvvvvvvvvvvvvvvvvvvvv = ${
            alphaSeq2(
                "MjtkuBovqrU"
            )
        }"
    )
}

//----------------------------------------------------------------------------------------------------------------------
private fun alphaSeq(str: String) = str.uppercase().toCharArray().sorted()
    .joinToString(",") { it.lowercase().repeat(it.code - 64).replaceFirstChar { char -> char.uppercase() } }

//----------------------------------------------------------------------------------------------------------------------
private fun alphaSeq1(str: String) = str.lowercase().toCharArray().sorted().joinToString(",") { it.toString().repeat(it.code - 96).capitalize() }

//----------------------------------------------------------------------------------------------------------------------
private fun alphaSeq2(str: String) =
    str.lowercase()
        .toCharArray()
        .sorted()
        .joinToString(","){ "$it".uppercase() + "$it".repeat(it - 'a')}

