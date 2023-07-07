package algorithms.tinkoff_tests

fun main() {

    var x = 10
    var y = 10L

    result(19.06540000000)
}

fun result(d: Double) {

    if (d == d.toInt().toDouble()) {

        println("%03d".format(d.toInt()))
    } else {

        val x = "%.6f".format(d)
        println(x.trimEnd('0'))

    }
}
