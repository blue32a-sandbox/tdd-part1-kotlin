package money

class Dollar(amount: Int): Money(amount) {
    private val currency: String = "USD"
    override fun currency(): String {
        return currency
    }
    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}