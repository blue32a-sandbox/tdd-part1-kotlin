package money

class Dollar(amount: Int): Money(amount) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
    override fun equals(other: Any?): Boolean {
        val dollar = other as Money
        return amount == dollar.xxxAmount()
    }
}