package money

class Sum(public val augend: Money, public val addend: Money): Expression {
    override fun reduce(to: String): Money {
        val amount = augend.amount + addend.amount
        return Money(amount, to)
    }
}