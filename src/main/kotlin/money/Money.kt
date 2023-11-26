package money

abstract class Money(protected val amount: Int) {
    abstract fun times(multiplier: Int): Money
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount
                && javaClass.name.equals(money.javaClass.name)
    }
    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount)
        }
    }
}