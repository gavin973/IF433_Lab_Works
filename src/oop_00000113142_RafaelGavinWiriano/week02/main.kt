package oop_00000113142_RafaelGavinWiriano.week02

import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()


    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()



        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("pilih jalur (1. reguler, 2. umum)")
    val type = scanner.nextInt()
    scanner.nextLine()


    if (type == 1){
        print("Masukan jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major = major)
        println("terdaftar di: ${s1.major} dengan gpa awal ${s1.gpa}")
    } else if (type == 2){
        val s2 = Student(name, nim)
        println("terdaftar di ${s2.major} dengan gpa awal ${s2.gpa}")
    }else{
        println("pilihan tidak ada, pendaftaran batal")
    }
}