package oop_00000113142_RafaelGavinWiriano.Week10.GenericBox

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}