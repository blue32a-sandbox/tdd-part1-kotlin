package money

class Sum(public val augend: Money, public val addend: Money): Expression {
    fun reduce(to: String): Money {
        val amount = augend.amount + addend.amount
        return Money(amount, to)
    }
}