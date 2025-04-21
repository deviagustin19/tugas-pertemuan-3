/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author livi
 */
import java.util.Scanner;

public class master_pbo_bangun_datar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Hitung Luas & Keliling Persegi Panjang ===");
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Luas      : " + luas);
        System.out.println("Keliling  : " + keliling);
        
        input.close();
    }
}


