import java.util.Scanner

data class DataAkun(val id: Int, var nama: String)

class Akun(val info: DataAkun, var jk: String?) {
    fun ambilGender(): String {
        if (jk == null || jk == "") {
            return "Non Binary"
        } else {
            return jk!!
        }
    }
}

fun main() {
    val input = Scanner(System.`in`)
    
    val dataPlace = ArrayList<Akun>()

    while (true) {
        println("1. Tambah")
        println("2. Lihat Semua")
        println("3. Edit Nama")
        println("4. Hapus")
        println("5. Finished")
        print("Pilih menu: ")
        
        val menu = input.nextLine()

        if (menu == "1") {
            print("Masukkan ID: ")
            val id = input.nextLine().toInt()
            print("Masukkan Nama: ")
            val nama = input.nextLine()
            print("Masukkan Jenis Kelamin (Boleh kosong): ")
            val jk: String? = input.nextLine() 

            val dataBaru = Akun(DataAkun(id, nama), jk)
            dataPlace.add(dataBaru)
            println("Tersimpan!")

        } else if (menu == "2") {
            println("\nIsi data:")
            for (item in dataPlace) {
                println("ID: ${item.info.id} Nama: ${item.info.nama} [Gender: ${item.ambilGender()}]")
            }

        } else if (menu == "3") {
            print("ID : ")
            val cariId = input.nextLine().toInt()

            for (item in dataPlace) {
                if (item.info.id == cariId) {
                    print("Nama Baru: ")
                    item.info.nama = input.nextLine()
                    println("Nama berhasil diubah")
                }
            }

        } else if (menu == "4") {
            print("ID : ")
            val hapusId = input.nextLine().toInt()
            
            dataPlace.removeIf { it.info.id == hapusId }
            println("Data ID $hapusId sudah dihapus .")

        } else if (menu == "5") {
            break
        }
    }
}