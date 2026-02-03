package oop_00000113142_RafaelGavinWiriano.week01

fun main() {
    val gameTitle = "wukong"
    val price = 1000000

    println(calculateDiscount(price))
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)