package trash.coroutines.channel

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun main(): Unit = coroutineScope {
    val channel = produce {
            repeat(5) { index ->
                println("Producing next one")
                delay(1000)
                send(index * 2)
            }
    }

    for (element in channel) {
        println(element)
    }
}

//======================================================================================================================
//(1 sec)
// Producing next one
//0
//(1 sec)
//Producing next one
//2
//(1 sec)
//Producing next one
//4
//(1 sec)
//Producing next one
//6
//(1 sec)
//Producing next one
//8