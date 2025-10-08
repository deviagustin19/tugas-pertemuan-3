/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2;

/**
 *
 * @author livi
 */
public class Penyimpanan_Data_Mahasiswa_BPO {
    // Atribut (Encapsulation)
     String nama;
     String nim;
     String jurusan;
     double ipk;

    // Constructor
    public Penyimpanan_Data_Mahasiswa_BPO (String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method tambahan
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("IPK      : " + ipk);
        System.out.println("-----------------------");
    }
}
  

