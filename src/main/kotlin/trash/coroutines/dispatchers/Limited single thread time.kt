package trash.coroutines.dispatchers

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun main(): Unit = coroutineScope {
    val dispatcher = Dispatchers.Default.limitedParallelism(1)
    val job = Job()

    repeat(5) {
        launch(dispatcher + job) {
            Thread.sleep(1000L)
        }
    }
    job.complete()
    val time = measureTimeMillis { job.join() } //Took ~5073
    println(time)
}