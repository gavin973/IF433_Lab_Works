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
}