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
        channel.close()
    }

    launch {
        for (element in channel) {
            println(element)
        }
        //or
        //channel.consumeEach { element ->
        //    println(element)
        //}
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