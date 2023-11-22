package trash.coroutines.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

private suspend fun main(): Unit = coroutineScope {
    val channel = Channel<Int>()
    launch {
        repeat(5) { index ->
            delay(1000)
            println("Producing next one")
            channel.send(index * 2)
        }
    }

    launch {
        repeat(5) {
            val received = channel.receive()
            println(received)
        }
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