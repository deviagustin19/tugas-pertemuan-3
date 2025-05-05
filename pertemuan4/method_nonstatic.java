/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author livi
 */
public class method_nonstatic {
    // Atribut jari-jari
    double jariJari;

    // Constructor
    public method_nonstatic(double r) {
        jariJari = r;
    }

    // Method non-static untuk menghitung luas
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method non-static untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Main method
    public static void main(String[] args) {
        // Membuat objek dari class Lingkaran
        method_nonstatic lingkaran = new method_nonstatic(7);

        // Memanggil method non-static
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        // Menampilkan hasil
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
}


  

