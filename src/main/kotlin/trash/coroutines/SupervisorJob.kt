package trash.coroutines

import kotlinx.coroutines.*
import java.lang.Error
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

private suspend fun main(): Unit = runBlocking {
    val scope = CoroutineScope(SupervisorJob())

    scope.launch {
        delay(1000)
        throw Error("Some error")
    }

    scope.launch {
        delay(2000)
        println("Will be printed")
    }

    delay(3000)
}

