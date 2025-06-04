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
public class soal_6 {
    public static void main(String[] args) {
        int[][] matriks = new int[3][3];
        int[][] transpos = new int[3][3];
        Scanner input = new Scanner(System.in);

        // Input matriks 3x3
        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        // Proses transposisi
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpos[j][i] = matriks[i][j];
            }
        }

        // Output matriks asli
        System.out.println("\nMatriks Asli:");
        tampilkanMatriks(matriks);

        // Output matriks transpos
        System.out.println("\nMatriks Hasil Transposisi:");
        tampilkanMatriks(transpos);

        input.close();
    }

    public static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
   

