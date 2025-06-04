/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_semester_2;

/**
 *
 * @author livi
 */
import java.util.Scanner;
public class soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan panjang array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Memasukkan elemen array dari user
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Mencetak array secara terbalik
        System.out.print("Array dalam urutan terbalik: [");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
   

