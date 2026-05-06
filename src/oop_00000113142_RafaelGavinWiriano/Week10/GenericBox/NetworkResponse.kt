package oop_00000113142_RafaelGavinWiriano.Week10.GenericBox

data class ApiResponse<T>(
    val status: String,
    val data: T
)