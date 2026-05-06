package oop_00000113142_RafaelGavinWiriano.Week10.GenericBox

fun main() {
    val coinRepo = WalletRepository<Coin>()
    val txRepo = WalletRepository<Transaction>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    txRepo.add(Transaction("TX001", 100.0))
    txRepo.add(Transaction("TX002", 250.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }
}