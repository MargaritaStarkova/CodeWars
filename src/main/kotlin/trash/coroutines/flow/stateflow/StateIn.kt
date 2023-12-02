package trash.coroutines.flow.stateflow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val flow = flowOf("A", "B", "C")
        .onEach { delay(1000) }
        .onEach { println("Produced $it") }

    val stateFlow: StateFlow<String> = flow.stateIn(scope = this)

    println("Listening")
    println(stateFlow.value)
    stateFlow.collect { println("Received $it") }
}
//======================================================================================================================
//(1 sec)
//Produced A
//Listening
//A
//Received A
//(1 sec)
//Produced B
//Received B
//(1 sec)
//Produced C
//Received C