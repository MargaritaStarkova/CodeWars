package trash.coroutines.flow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val job = launch {
        flowOf(1, 2, 3)
            .onEach { delay(1000) }
            .onCompletion { println("Completed") }
            .collect { println(it) }
    }
    delay(1100)
    job.cancel()
}
//======================================================================================================================
//(1 sec)
// 1
//(0.1 sec)
//Completed