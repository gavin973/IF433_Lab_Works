package oop_00000113142_RafaelGavinWiriano.week04

open class employee (val name: String, val baseSalary: Int) {

    open fun work () {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 10) / 100
    }
}