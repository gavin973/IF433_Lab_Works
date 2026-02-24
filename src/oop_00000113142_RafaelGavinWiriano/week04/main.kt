package oop_00000113142_RafaelGavinWiriano.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n --- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n --- Testing electric car ---")
    val myElectricCar = ElectricCar("Tesla", 4, 90)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n --- Testing employee hierarchy ---")
    val manager = Manager("Budi", 10_000_000)
    manager.work()
    println("Bonus manager: Rp ${manager.calculateBonus()}")

    println()

    val developer = developer("Andi", 8_000_000, "Kotlin")
    developer.work()
    println("Bonus developer: Rp ${developer.calculateBonus()}")
}