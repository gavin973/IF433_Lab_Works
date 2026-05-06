package oop_00000113142_RafaelGavinWiriano.Week10.GenericBox

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}