package money

abstract class Money(protected val amount: Int) {
    abstract fun times(multiplier: Int): Money
    abstract fun currency(): String
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
           return Franc(amount)
        }
    }
}