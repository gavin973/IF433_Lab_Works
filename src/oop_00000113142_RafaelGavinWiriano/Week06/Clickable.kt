package oop_00000113142_RafaelGavinWiriano.Week06

interface Clickable {
    //ERROR: Property in an interface cannot have a backing field.
    val name: String = "Tombol Rahasia"

    //Function without body (Implicitly Abstract
    fun click()
}