package oop_00000113142_RafaelGavinWiriano.Week06

class Smartphone : Camera, phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}