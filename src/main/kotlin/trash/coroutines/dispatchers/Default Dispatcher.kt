package trash.coroutines.dispatchers

import kotlinx.coroutines.*
import kotlin.random.Random

private suspend fun main(): Unit = coroutineScope {
    repeat(1000) {
        launch { // or launch(Dispatchers.Default)
            //to make it busy
            List(1000) { Random.nextLong() }.maxOrNull()
            val threadName = Thread.currentThread().name
            println("Running on thread: $threadName")
        }
    }
}

