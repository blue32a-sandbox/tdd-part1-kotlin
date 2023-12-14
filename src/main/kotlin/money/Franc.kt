package money

class Franc(amount: Int): Money(amount) {
    override val currency: String = "CHF"
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}