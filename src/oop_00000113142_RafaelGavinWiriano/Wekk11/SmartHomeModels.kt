package oop_00000113142_RafaelGavinWiriano.Wekk11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)