package trash.coroutines.exceptions

import kotlinx.coroutines.*

class MyException : Throwable()
private suspend fun main(): Unit = supervisorScope {
    val str1 = async<String> {
        delay(1000)
        throw MyException()
    }

    val str2 = async {
        delay(2000)
        "Text2"
    }

    try {
        println(str1.await())
    } catch (e: MyException) {
        println(e)
    }

    println(str2.await())
}

