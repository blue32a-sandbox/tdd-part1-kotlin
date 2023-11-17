package money

class Franc(private val amount: Int) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
    override fun equals(other: Any?): Boolean {
        val franc = other as Franc
        return amount == franc.amount
    }
}