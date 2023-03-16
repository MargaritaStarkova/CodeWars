package codewars.level_7kyu.fundamentals

import kotlin.math.ceil

/*
John wants to decorate the walls of a room with wallpaper. He wants a fool-proof method for getting it right.
John knows that the rectangular room has a length of l meters, a width of w meters, a height of h meters.
The standard width of the rolls he wants to buy is 52 centimeters.
The length of a roll is 10 meters. He bears in mind however,
that it’s best to have an extra length of wallpaper handy in case of mistakes or miscalculations
 so he wants to buy a length 15% greater than the one he needs.
Last time he did these calculations he got a headache, so could you help John?

Task
    Your function wallpaper(l, w, h) should return as a plain English word in lower case the number of rolls he must buy.

Example:
    wallpaper(4.0, 3.5, 3.0) should return "ten"
    wallpaper(0.0, 3.5, 3.0) should return "zero"

Notes:
    all rolls (even with incomplete width) are put edge to edge
    0 <= l, w, h (floating numbers); it can happens that w * h * l is zero
    the integer r (number of rolls) will always be less or equal to 20
    FORTH: the number of rolls will be a positive or null integer (not a plain English word; this number can be greater than 20)
*/

private fun main() {
    println("ten = ${wallpaper(4.0, 3.5, 3.0)}")
    println("sixteen = ${wallpaper(6.3, 4.5, 3.2)}")
    println("zero = ${wallpaper(8.49, 9.16, 0.0)}")
}

private val numbers = arrayOf(
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen",
    "twenty"
)

//----------------------------------------------------------------------------------------------------------------------
private fun wallpaper(l: Double, w: Double, h: Double) = if (l * w * h <= 0) numbers[0]
else numbers[(ceil(h * 2 * (l + w) / 0.52f / 10 * 1.15f)).toInt()]

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
