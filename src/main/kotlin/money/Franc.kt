package money

class Franc(amount: Int): Money(amount) {
    override fun currency(): String {
        return "CHF"
    }
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}