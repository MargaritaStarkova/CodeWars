package trash.coroutines.flow.operators

import kotlinx.coroutines.flow.*

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
