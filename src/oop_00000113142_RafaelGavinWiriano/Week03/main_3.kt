package oop_00000113142_RafaelGavinWiriano.Week03

fun main() {

    val player = Player("Gavin")

    println("Level awal: ${player.level}")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}