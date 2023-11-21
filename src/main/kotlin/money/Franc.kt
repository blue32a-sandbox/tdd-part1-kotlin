package money

class Franc(amount: Int): Money(amount) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.xxxAmount()
    }
}