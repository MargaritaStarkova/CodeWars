package sobes_tests

/*
Дано: неотрицательное число. Это секунды.
Представить в виде hh:mm:ss, например 05:00:56
*/

private fun main() {

    println(strTimeFormat(3600))
    println(strTimeFormat(50))
    println(strTimeFormat(58931))
    println(strTimeFormat(5777))
    println(strTimeFormat(300))

}


//----------------------------------------------------------------------------------------------------------------------
private fun strTimeFormat(sec: Long): String {

    val hours = sec / 3600
    val minutes = (sec % 3600)/60
    val seconds = sec % 60
    return String.format("%02d:%02d:%02d", hours, minutes, seconds)

}

//----------------------------------------------------------------------------------------------------------------------
