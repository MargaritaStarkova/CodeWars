package trash.coroutines.structured_cuncurency

import kotlinx.coroutines.*

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
    println("User: $user")
}

