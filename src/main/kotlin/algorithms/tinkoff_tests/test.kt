package algorithms.tinkoff_tests

class BankAccount(
    var balance: Int
) {

    fun deposit(amount: Int) {
        synchronized(this) {
            balance += amount
        }
    }

    @Synchronized
    fun withdraw(amount: Int) {
        balance -= amount
    }

}