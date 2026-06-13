package oop_00000113142_RafaelGavinWiriano.week14

import java.io.File

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(
        customerType: String,
        basePrice: Double,
        customerTypeName: String
    ) {
        val finalPrice = when (customerType) {
            "VIP" -> basePrice * 0.80
            "REGULAR" -> basePrice
            else -> basePrice
        }

        println("Memproses pesanan $customerTypeName seharga $finalPrice")

        file.appendText("$customerTypeName,$finalPrice,customerType\n")

        println("Email terkirim: Pesanan $customerTypeName telah dikonfirmasi!")
    }
}