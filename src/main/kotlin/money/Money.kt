package money

open class Money(protected val amount: Int, protected val currency: String) {
    open fun times(multiplier: Int): Money {
        return Money(0, "")
    }
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
            return Dollar(amount, "USD")
        }
        fun franc(amount: Int): Money {
           return Franc(amount, "CHF")
        }
    }
}