/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author livi
 */
public class method_static {
    
    // Static method untuk menjumlahkan dua angka
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Memanggil static method tanpa perlu membuat objek
        int hasil = tambah(5, 7);
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}


