package money

class Dollar(var amount: Int) {
    fun times(multiplier: Int): Unit {
        amount = amount * multiplier
    }
}