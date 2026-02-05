package oop_00000113142_RafaelGavinWiriano.week01

fun main() {
    val gameTitle = "wukong"
    val price = 1000000
    val userNote: String? = null


    printReceipt(
        title = gameTitle,
        finalPrice = calculateDiscount(price),
        userNote = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20/100)
    else price - (price * 10/100)

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("game: $title")
    println("finalPrice: $finalPrice")
    println("note: ${userNote ?: "Tidak ada catatan"}")
}
