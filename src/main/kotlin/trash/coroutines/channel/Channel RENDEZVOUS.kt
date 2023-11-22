package trash.coroutines.channel

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun main(): Unit = coroutineScope {
    val channel = produce(capacity = Channel.RENDEZVOUS) {
        repeat(5) { index ->
            send(index * 2)
            delay(100)
            println("Sent")
        }
    }
    delay(1000)
    for (element in channel) {
        println(element)
        delay(1000)
    }
}

//======================================================================================================================
//0
//Sent
//(1 sec)
//2
//Sent
//(1 sec)
//4
//Sent
//(1 sec)
//6
//Sent
//(1 sec)
//8
//Sent
//(1 sec)