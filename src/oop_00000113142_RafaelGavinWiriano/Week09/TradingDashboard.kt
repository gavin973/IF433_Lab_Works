package oop_00000113142_RafaelGavinWiriano.Week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 5, 3.0, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 15, 12.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, -10.0, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 30, 8.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

}