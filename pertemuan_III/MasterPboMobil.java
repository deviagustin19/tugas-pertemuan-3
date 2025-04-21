/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_III;

/**
 *
 * @author ACER
 */
public class MasterPboMobil {
    String kode;
    String merk;
    String tipe;
    String warna;
    int tahun;

    // Konstruktor untuk menginisialisasi objek mobil
    MasterPboMobil(String kode, String merk, String tipe, String warna, int tahun) {
        this.kode = kode;
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Mengoverride metode toString untuk menampilkan informasi mobil
    public String toString() {
        return "Kode: " + kode + ", Merk: " + merk + ", Tipe: " + tipe + 
               ", Warna: " + warna + ", Tahun: " + tahun;
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek MasterPboMobil baru
        MasterPboMobil mobil1 = new MasterPboMobil("M001", "Honda", "Sedan", "Merah", 2021);
        MasterPboMobil mobil2 = new MasterPboMobil("M002", "Toyota", "SUV", "Hitam", 2020);
        
        // Menampilkan informasi mobil menggunakan toString()
        System.out.println(mobil1);
        System.out.println(mobil2);
    }
}

