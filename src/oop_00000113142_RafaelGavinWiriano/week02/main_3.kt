package oop_00000113142_RafaelGavinWiriano.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()
    val hero = Hero(name, damage)
    var enemyHp = 100
    println("\n=== BATTLE START ===")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()
        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Musuh: $enemyHp")
            if (enemyHp > 0) {
                val enemyDamage = Random.nextInt(10, 21) // 10..20
                println("Musuh menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP Hero: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }
    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.hp > enemyHp) {
        println("${hero.name} MENANG!")
    } else if (enemyHp > hero.hp) {
        println("Musuh MENANG!")
    } else {
        println("Seri!")
    }
}
