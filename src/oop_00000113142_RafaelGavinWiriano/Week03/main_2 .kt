package oop_00000113142_RafaelGavinWiriano.Week03

fun main() {

    val weapon = Weapon("EMP Slayer", 300)

    println("Test Damage -50")
    weapon.damage = -50   // harus gagal

    println("Damage yang sekarang: ${weapon.damage}")

    println("\n Test Damage 9999 ")
    weapon.damage = 9999  // harus jadi 1000

    println("Damage yang sekarang: ${weapon.damage}")
    println("Tiernya : ${weapon.tier}")
}