package oop_00000113142_RafaelGavinWiriano.Week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API invalid: Missing Name"
        }

        val type = rawJson["type"] as? String ?: return null

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "ALL"
                Clothing(id, name, size)
            }

            else -> null
        }
    }

    fun checkout(product: Product) {

        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        try {
            val transactionId = JavaPaymentService.processPayment(id!!)

            println("Payment Success: $transactionId")

        } catch (e: Exception) {
            println("Payment Failed for product $id")
        }
    }
}