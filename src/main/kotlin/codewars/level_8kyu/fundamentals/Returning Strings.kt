package codewars.level_8kyu.fundamentals

/*
Make a function that will return a greeting statement that uses an input; your program should return,
        "Hello, <name> how are you doing today?".
*/

private fun main() {
    println("Hello, Ryan how are you doing today? = ${greet("Ryan")}")
    println("Hello, Shingles how are you doing today? = ${greet("Shingles")}")
    println("Hello, Rita how are you doing today? = ${greet("Rita")}")
}

//----------------------------------------------------------------------------------------------------------------------
private fun greet(name: String) = "Hello, $name how are you doing today?"

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------