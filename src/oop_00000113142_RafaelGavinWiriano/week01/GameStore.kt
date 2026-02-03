package oop_00000113142_RafaelGavinWiriano.week01

fun main() {
    val gameTitle = "wukong"
    val price = 1000000


    printReceipt(title = gameTitle, finalPrice = calculateDiscount(price))
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)

fun printReceipt(title: String, finalPrice: Int) {
    println("game: $title")
    println("finalPrice: $finalPrice")
}
