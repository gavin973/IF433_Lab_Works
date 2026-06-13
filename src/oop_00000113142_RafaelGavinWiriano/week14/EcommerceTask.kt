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
interface PricingStrategy {
    fun calculate(price: Double): Double
}
class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.80
}
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService,
    private val pricing: PricingStrategy
) {
    fun processOrder(
        basePrice: Double,
        customerTypeName: String
    ) {
        val finalPrice = pricing.calculate(basePrice)
        println("Memproses pesanan $customerTypeName seharga $finalPrice")
        repo.save("$customerTypeName,$finalPrice")
        notifier.send("Pesanan $customerTypeName telah dikonfirmasi!")
    }
}