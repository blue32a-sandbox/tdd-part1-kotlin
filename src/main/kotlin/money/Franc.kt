package money

class Franc(amount: Int): Money(amount) {
    private val currency: String = "CHF"
    override fun currency(): String {
        return currency
    }
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}