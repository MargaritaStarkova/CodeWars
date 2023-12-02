package trash.coroutines.flow.stateflow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val flow = flowOf("A", "B", "C")
        .onEach { delay(1000) }
        .onEach { println("Produced $it") }

    val stateFlow: StateFlow<String> = flow.stateIn(
        scope = this,
        started = SharingStarted.Lazily,
        initialValue = "Empty"
        )

    println("Listening")
    println(stateFlow.value)
    delay(2000)
    stateFlow.collect { println("Received $it") }
}
//======================================================================================================================
//Listening
//Empty
//(2 sec)
//Received Empty
//(1 sec)
//Produced A
//Received A
//(1 sec)
//Produced B
//Received B
//(1 sec)
//Produced C
//Received C