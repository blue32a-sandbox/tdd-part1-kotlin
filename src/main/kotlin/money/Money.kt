package money

open class Money(protected val amount: Int) {
    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount
                && javaClass.name.equals(money.javaClass.name)
    }
    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }
    }
}