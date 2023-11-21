package trash.coroutines.dispatchers

import kotlinx.coroutines.*


private suspend fun main() {
    nonConsistentResult() //~9876
    consistentResult() //10_000
}

@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun consistentResult(): Unit = coroutineScope {
    val dispatcher = Dispatchers.Default.limitedParallelism(1)
    var i = 0
    repeat(10_000) {
        launch(dispatcher) { //or Default
            i++
        }
    }
    delay(1000)
    println(i)
}
private suspend fun nonConsistentResult(): Unit = coroutineScope {
    var i = 0
    repeat(10_000) {
        launch(Dispatchers.IO) { //or Default
            i++
        }
    }
    delay(1000)
    println(i)
}