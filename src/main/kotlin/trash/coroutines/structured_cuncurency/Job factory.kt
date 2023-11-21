package trash.coroutines.structured_cuncurency

import kotlinx.coroutines.*

private suspend fun main(): Unit = coroutineScope {
    val job = Job()

    launch(job) { //the new job replaces one from parent
        delay(1000L)
        println("Text 1")
    }

    launch(job) {//the new job replaces one from parent
        delay(2000L)
        println("Text 2")
    }

   // job.join() //Here we will await forever
    job.children.forEach { it.join() }
    println("Will not be printed")
}
