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
import java.util.Scanner; // Import Scanner

public class pemograman_terstruktur {
    
    // Fungsi untuk menghitung luas
    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;

        // Input
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        // Proses
        luas = hitungLuas(panjang, lebar);

        // Output
        System.out.println("Luas persegi panjang adalah: " + luas);
        
        input.close();
    }
}
