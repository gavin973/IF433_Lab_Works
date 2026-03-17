package oop_00000113142_RafaelGavinWiriano.Week07

class Main() {
    fun main() {
        println("=== TEST SINGLETON ===")
        println("Status: ${DatabaseManager.connectionStatus}")
        DatabaseManager.connect()

        println("\n=== TEST COMPANION OBJECT ===")
        val client = NetworkClient.createClient()
        client.connect()
    }
}