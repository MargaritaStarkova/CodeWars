package trash.coroutines.exceptions

import kotlinx.coroutines.*

object MyNonPropagationException : CancellationException()

private suspend fun main(): Unit = coroutineScope {
    launch {
        launch {
            delay(2000)
            println("Will not be printed")
        }
        throw MyNonPropagationException
    }
    launch {
        delay(2000)
        println("Will be printed")
    }
}
