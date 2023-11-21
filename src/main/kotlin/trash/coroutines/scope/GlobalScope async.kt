package trash.coroutines.scope

import kotlinx.coroutines.*

private fun main(): Unit = runBlocking {
   val res1 = GlobalScope.async {
        delay(1000L)
        "Text1"
    }
    val res2 = GlobalScope.async {
        delay(3000L)
        "Text2"
    }
    val res3 = GlobalScope.async {
        delay(1000L)
        "Text3"
    }
    println(res1.await())
    println(res2.await())
    println(res3.await())
}