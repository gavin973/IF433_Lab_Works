package oop_00000113142_RafaelGavinWiriano.Week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")