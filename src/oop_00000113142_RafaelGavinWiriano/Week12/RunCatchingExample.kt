package oop_00000113142_RafaelGavinWiriano.Week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}