package trash.coroutines.flow.sharedflow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val flow1 = flowOf("A", "B", "C")
    val flow2 = flowOf("D")
        .onEach { delay(1000) }

    val sharedFlow = merge(flow1, flow2).shareIn(
        scope = this,
        started = SharingStarted.Lazily
    )

    delay(100)

    //1-й подписчик
    launch { sharedFlow.collect { println("#1 $it") } }

    delay(1000)
    //2-й подписчик
    launch { sharedFlow.collect { println("#2 $it") } }

    delay(1000)
    //3-й подписчик = loze values
    launch { sharedFlow.collect { println("#3 $it") } }
    println("Done")
}
//======================================================================================================================
//(1 sec)
//#1 A
//#1 B
//#1 C
//(1 sec)
//#1 D
//#2 D
//(1 sec)
//Done