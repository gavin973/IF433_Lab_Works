package oop_00000113142_RafaelGavinWiriano.Week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}