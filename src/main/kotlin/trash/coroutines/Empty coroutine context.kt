package trash.coroutines

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

private fun main() {
    val empty: CoroutineContext = EmptyCoroutineContext
    println(empty[CoroutineName])
    println(empty[Job])

    val ctxName = empty + CoroutineName("Name1") + empty
    println(ctxName[CoroutineName])
}