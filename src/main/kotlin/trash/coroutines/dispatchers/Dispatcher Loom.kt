package trash.coroutines.dispatchers

import kotlinx.coroutines.*
import java.util.concurrent.Executor
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

object LoomDispatcher : ExecutorCoroutineDispatcher() {
    override val executor: Executor = Executor { command -> Thread.startVirtualThread(command) }

    override fun close() {
        error("Cannot be invoked on Dispatchers.LOOM")
    }

    override fun dispatch(context: CoroutineContext, block: Runnable) {
        executor.execute(block)
    }
}

val Dispatchers.Loom: CoroutineDispatcher
    get() = LoomDispatcher

private suspend fun main() = measureTimeMillis {
    coroutineScope {
        repeat(100_000) {
            launch(Dispatchers.Loom) {
                Thread.sleep(1000)
            }
        }
    }
}.let(::println)