package oop_00000113142_RafaelGavinWiriano.week14

import java.io.File

interface OrderRepository {
    fun save(orderData: String)
}

class CsvOrderRepository : OrderRepository {

    private val file = File("orders.csv")

    override fun save(orderData: String) {
        file.appendText("$orderData\n")
    }
}

interface NotificationService {
    fun send(message: String)
}

class EmailNotifier : NotificationService {

    override fun send(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

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
        repo.save("$customerTypeName,$finalPrice,$customerType")
        notifier.send("Pesanan $customerTypeName telah dikonfirmasi!")
    }
}