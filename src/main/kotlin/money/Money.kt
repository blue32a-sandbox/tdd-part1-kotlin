package money

abstract class Money(protected val amount: Int) {
    protected abstract val currency: String
    abstract fun times(multiplier: Int): Money
    fun currency(): String {
        return currency
    }
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount
                && javaClass.name.equals(money.javaClass.name)
    }
    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount)
        }
        fun franc(amount: Int): Money {
           return Franc(amount, "CHF")
        }
    }
}