package trash.coroutines.flow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

private class MyError : Throwable("My Error")

private val flow = flow {
    emit(1)
    emit(2)
    throw MyError()

}
private suspend fun main(): Unit {
    flow.onEach { println("Got $it") }
        .catch { println("Caught $it") }
        .collect { println("Collected $it") }
}

//======================================================================================================================
//Got 1
//Collected 1
//Got 2
//Collected 2
//Caught trash.coroutines.flow.MyError: My Error
