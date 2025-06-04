/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_semester_2;

/**
 *
 * @author livi
 */
public class soal_2 {
    public static void main(String[] args) {
        // Array pertama dan kedua
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Hitung panjang total array baru
        int panjangGabungan = array1.length + array2.length;
        int[] arrayGabungan = new int[panjangGabungan];

        // Salin elemen dari array pertama ke array gabungan
        for (int i = 0; i < array1.length; i++) {
            arrayGabungan[i] = array1[i];
        }

        // Salin elemen dari array kedua ke array gabungan
        for (int i = 0; i < array2.length; i++) {
            arrayGabungan[array1.length + i] = array2[i];
        }

        // Cetak array gabungan
        System.out.print("Array gabungan: [");
        for (int i = 0; i < arrayGabungan.length; i++) {
            System.out.print(arrayGabungan[i]);
            if (i < arrayGabungan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


