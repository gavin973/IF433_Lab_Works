package oop_00000113142_RafaelGavinWiriano.Week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("To,bol '$name' berhasil diklik!")
    }
}