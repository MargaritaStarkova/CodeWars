package trash.coroutines.flow.sharedflow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val flow = flowOf("A", "B", "C", "D")
        .onStart { println("Started") }
        .onCompletion { println("Finished") }
        .onEach { delay(1000) }

    val sharedFlow =flow.shareIn(
        scope = this,
        started = SharingStarted.WhileSubscribed(),
    )

    delay(3000)
    //1-й подписчик
    launch { println("#1 ${sharedFlow.first()}") }
    //2-й подписчик
    launch { println("#2 ${sharedFlow.take(2).toList()}") }

    delay(3000)
    //3-й подписчик
    launch { println("#3 ${sharedFlow.first()}") }

}
//======================================================================================================================
//(3 sec)
//Started
//(1 sec)
//#1 A
//(1 sec)
//#2 [A, B]
//Finished
//(1 sec)
//Started
//(1 sec)
//#3 A
//Finished