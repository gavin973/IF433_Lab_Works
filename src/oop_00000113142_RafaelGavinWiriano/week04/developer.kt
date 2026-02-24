package oop_00000113142_RafaelGavinWiriano.week04

class developer (name: String, baseSalary: Int, val programmingLanguage: String) : employee(name, baseSalary) {

    override fun work () {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}