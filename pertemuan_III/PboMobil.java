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
public class PboMobil {
    
    // Atribut atau properti mobil
    String idMobil;
    String merek;
    String tipe;
    int tahun;

    // Constructor untuk menginisialisasi objek mobil
    public PboMobil(String idMobil, String merek, String tipe, int tahun) {
        this.idMobil = idMobil;
        this.merek = merek;
        this.tipe = tipe;
        this.tahun = tahun;
    }

    // Method untuk menampilkan data mobil
    public void tampilkanData() {
        System.out.println("ID: " + idMobil + ", Merek: " + merek + ", Tipe: " + tipe + ", Tahun: " + tahun);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek mobil baru dengan data yang diberikan
        PboMobil mobil = new PboMobil("M001", "Toyota", "SUV", 2020);
        
        // Menampilkan data mobil
        mobil.tampilkanData();
    }
}
