package trash.coroutines

import kotlinx.coroutines.*
import java.lang.Error
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

data class User(
    val name: String,
)
private suspend fun fetchUser(): User {
    //Runs forever
    while (true) {
        yield()
    }
}

private suspend fun getUserOrNull(): User? =
    withTimeoutOrNull(5000) {
        fetchUser()
    }

private suspend fun main(): Unit = coroutineScope {
    val user = getUserOrNull()
   // println("User: $user")
}

