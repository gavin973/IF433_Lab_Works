package oop_00000113142_RafaelGavinWiriano.Week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebgai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
    println("\n=== TEST MATHHELPER ===")

    val math = MathHelper()

    println("Luas Persegi (4): ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (5 x 3): ${math.hitungLuas(5, 3)}")
    println("Luas Lingkaran (r = 7.0): ${math.hitungLuas(7.0)}")

    println("\n=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet("Rafael", 50000.0)
    val creditCard = CreditCard("Rafael", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in paymentMethods) {
        println("\nMemproses pembayaran 75000.0 untuk ${method.accountName}")
        method.processPayment(75000.0)

        if (method is EWallet) {
            println("Saldo kurang, melakukan top up 50000.0...")
            method.topUp(50000.0)

            println("Mencoba pembayaran lagi 75000.0...")
            method.processPayment(75000.0)
        }
    }
}