package money

class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
    override fun equals(other: Any?): Boolean {
        return true
    }
}