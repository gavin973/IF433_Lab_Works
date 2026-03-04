package oop_00000113142_RafaelGavinWiriano.Week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}