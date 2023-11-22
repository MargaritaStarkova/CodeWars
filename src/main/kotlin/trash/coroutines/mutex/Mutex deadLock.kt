package trash.coroutines.mutex

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.system.measureTimeMillis

private val mutex = Mutex()
private var counter = 0

private fun main(): Unit = runBlocking {
    mutex.withLock {
        mutex.withLock {
            counter++
            println(counter)
        }
    }
}
//======================================================================================================================
//Started
//(runs forever)

