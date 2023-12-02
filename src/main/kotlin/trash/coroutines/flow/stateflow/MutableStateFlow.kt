package trash.coroutines.flow.stateflow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val state = MutableStateFlow("A")
    println(state.value) // A

    //1-й подписчик
    launch {
        state.collect { println("Value changed to $it") }
        // Value changed to A
    }

    delay(1000)
    state.value = "B" // Value changed to B

    delay(1000)
    //2-й подписчик
    launch {
        state.collect { println("and now it is $it") }
        // and now it is B
    }

    delay(1000)
    state.value = "C"
    // Value changed to C
    // and now it is C
}
//======================================================================================================================
//A
//Value changed to A
//(1 sec)
//Value changed to B
//(1 sec)
//and now it is B
//(1 sec)
//Value changed to C
//and now it is C