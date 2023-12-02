package trash.coroutines.flow.sharedflow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect

@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun main(): Unit = coroutineScope {
    val mutableSharedFlow = MutableSharedFlow<String>(replay = 2)
    mutableSharedFlow.emit("Message1")
    mutableSharedFlow.emit("Message2")
    mutableSharedFlow.emit("Message3")
    println(mutableSharedFlow.replayCache) //[Message2, Message3]

    launch {
        mutableSharedFlow.collect {
            println("#1 received $it")
        }
        //#1 received Message2
        //#1 received Message3
    }
    delay(100)
    mutableSharedFlow.resetReplayCache()
    println(mutableSharedFlow.replayCache)// []
}
//======================================================================================================================
//[Message2, Message3]
//#1 received Message2
//#1 received Message3
//[]