package oop_00000113142_RafaelGavinWiriano.Week13

fun main() {
    println("\n=== TEST UNSAFE RESOURCE HANDLING ===")

    val unsafeFile = File("unsafe_logs.txt")


    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()

    println("Proses penulisan unsafe selesai.")
}