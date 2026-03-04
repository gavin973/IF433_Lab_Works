package oop_00000113142_RafaelGavinWiriano.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi berhasil sebesar $amount")
            println("Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu.")
        }
    }
}