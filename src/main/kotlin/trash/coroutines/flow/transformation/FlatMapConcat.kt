package trash.coroutines.flow.transformation

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

private fun flowFrom(elem: String) = flowOf(1, 2, 3)
    .onEach { delay(1000) }
    .map { "${it}_${elem}" }

@OptIn(ExperimentalCoroutinesApi::class)
private suspend fun main() {
    flowOf("A", "B", "C")
        .flatMapConcat { flowFrom(it) }
        .collect { println(it) }
}
//======================================================================================================================
//(1 sec)
//1_A
//(1 sec)
//2_A
//(1 sec)
//3_A
//(1 sec)
//1_B
//(1 sec)
//2_B
//(1 sec)
//3_B
//(1 sec)
//1_C
//(1 sec)
//2_C
//(1 sec)
//3_C
