package oop_00000113142_RafaelGavinWiriano.week04

class ElectricCar (
    brand: String,
    numberofDoors: Int,
    val baterryCapacity: Int
) : Car(brand, numberofDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $baterryCapacity%.")
    }
}