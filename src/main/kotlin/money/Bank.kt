package money

class Bank {
    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }
    fun addRate(from: String, to: String, rate: Int) {
    }
}