/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author livi
 */
public class method_fungsi_parameter {
  
    // Fungsi dengan parameter
    public static int tambah(int a, int b) {
        int hasil = a - b;
        return hasil;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        int hasilPenjumlahan = tambah(x, y);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
    }
}


