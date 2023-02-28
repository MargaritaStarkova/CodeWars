package level_8kyu.mathematics

/*
You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
If it is a square, return its area. If it is a rectangle, return its perimeter.

Example(Input1, Input2 --> Output):
    6, 10 --> 32
    3, 3 --> 9
Note:
for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
*/

private fun main() {
    println("32 = ${areaOrPerimeter(6, 10)}")
    println("9 = ${areaOrPerimeter(3, 3)}")
    println("4 = ${areaOrPerimeter(2, 2)}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun areaOrPerimeter(l:Int, w:Int) = if (l == w) l * w else 2 * (l + w)
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
