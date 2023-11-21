package money

class Dollar(amount: Int): Money(amount) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
    override fun equals(other: Any?): Boolean {
        val dollar: Money = other as Dollar
        return amount == dollar.xxxAmount()
    }
}