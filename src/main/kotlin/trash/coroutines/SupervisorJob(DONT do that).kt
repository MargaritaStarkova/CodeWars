package trash.coroutines

import kotlinx.coroutines.*
import java.lang.Error

private suspend fun main(): Unit = runBlocking {
    //Don't do that, SupervisorJob with one child
    // and no parent works similar to just Job
    launch(SupervisorJob()) {
        delay(1000)
        throw Error("Some error")
    }

    launch {
        delay(2000)
        println("Will be printed")
    }
    //ddddddddddddddddddddddd
    //ddddddddddddddddddddddddd
    delay(3000)
}

