package money

class Franc(amount: Int): Money(amount) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
    override fun equals(other: Any?): Boolean {
        val franc: Money = other as Franc
        return amount == franc.xxxAmount()
    }
}