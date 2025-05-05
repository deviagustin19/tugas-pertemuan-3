/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author livi
 */
public class contoh_method {
    
    // Method untuk menampilkan pesan
    public static void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }

    // Method untuk menjumlahkan dua angka
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Memanggil method tampilkanPesan
        tampilkanPesan("Halo, aku adalah mahasiwa unu blitar!");

        // Memanggil method tambah dan menyimpan hasilnya
        int hasil = tambah(99, 1);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}


