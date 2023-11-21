package trash.coroutines.structured_cuncurency

import kotlinx.coroutines.*

private fun main(): Unit = runBlocking {
   this.launch { //same as just launch
       delay(1000L)
       println("World!")
   }
    launch { //same as this.launch
        delay(2000L)
        println("World!")
    }
    launch {
        delay(3000L)
        println("World!")
    }
    println("Hello,")
}