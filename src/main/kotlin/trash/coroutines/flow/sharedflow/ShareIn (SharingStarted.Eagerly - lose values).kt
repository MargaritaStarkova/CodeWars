package trash.coroutines.flow.sharedflow

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val flow = flowOf("A", "B", "C")

    val sharedFlow: SharedFlow<String> = flow.shareIn(
        scope = this,
        started = SharingStarted.Eagerly,
        //replay = 0 (default)
    )

    delay(100)

    //1-й подписчик
    launch { sharedFlow.collect { println("#1 $it") } }
    //2-й подписчик
    launch { sharedFlow.collect { println("#2 $it") } }
    //3-й подписчик
    launch { sharedFlow.collect { println("#3 $it") } }
    println("Done")
}
//======================================================================================================================
//(0,1 sec)
//Done
//!!!!!lose all values!!!!!