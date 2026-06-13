package oop_00000113142_RafaelGavinWiriano.week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}
class StudentDiscount: DiscountStrategy {
    override fun apply(price: Double) = price * 0.80
}
class MemberDiscount: DiscountStrategy {
    override fun apply(price: Double) = price * 0.85
}
class SeniorDiscount : DiscountStrategy {

    override fun apply(price: Double) = price * 0.75

}
class SafeDiscountCalculator(private val strategy: DiscountStrategy) {

    fun calculate(price: Double) = strategy.apply(price)

}