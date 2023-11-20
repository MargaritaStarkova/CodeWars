package trash.coroutines

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

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
