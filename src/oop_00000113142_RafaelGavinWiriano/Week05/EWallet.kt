package oop_00000113142_RafaelGavinWiriano.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil sebesar $amount")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil sebesar $amount")
        println("Saldo sekarang: $balance")
    }
}