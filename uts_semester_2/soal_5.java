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
public class soal_5 {
    public static void main(String[] args) {
        int[][] matriks = new int[3][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        if (adalahMatriksIdentitas(matriks)) {
            System.out.println("Matriks tersebut adalah matriks identitas.");
        } else {
            System.out.println("Matriks tersebut BUKAN matriks identitas.");
        }

        input.close();
    }

    public static boolean adalahMatriksIdentitas(int[][] matriks) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriks[i][j] != 1) {
                    return false; // Diagonal harus 1
                } else if (i != j && matriks[i][j] != 0) {
                    return false; // Non-diagonal harus 0
                }
            }
        }
        return true;
    }
}
   

