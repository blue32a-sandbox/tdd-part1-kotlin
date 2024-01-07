package money

open class Money(public val amount: Int, protected val currency: String): Expression {
    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }
    fun plus(addend: Money): Expression {
        return Sum(this, addend)
    }
    fun reduce(to: String): Money {
        return this
    }
    fun currency(): String {
        return currency
    }
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount
                && currency().equals(money.currency())
    }
    override fun toString(): String {
        return "$amount $currency"
    }
    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }
        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
}