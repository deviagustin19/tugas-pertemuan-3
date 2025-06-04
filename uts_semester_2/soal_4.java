/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_semester_2;

/**
 *
 * @author livi
 */
public class soal_4 {
    public static int[] hapusDuplikat(int[] arr) {
        int n = arr.length;

        // Jika array kosong atau hanya satu elemen, langsung kembalikan
        if (n == 0 || n == 1) {
            return arr;
        }

        // Urutkan array terlebih dahulu (agar duplikat berdampingan)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Tukar elemen
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Buat array sementara untuk menampung nilai unik
        int[] temp = new int[n];
        int j = 0;

        // Simpan elemen unik ke array sementara
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        // Tambahkan elemen terakhir (karena tidak diperiksa dalam loop)
        temp[j++] = arr[n - 1];

        // Buat array hasil dengan ukuran tepat
        int[] hasil = new int[j];
        for (int i = 0; i < j; i++) {
            hasil[i] = temp[i];
        }

        return hasil;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        int[] hasil = hapusDuplikat(input);

        System.out.print("Array tanpa duplikat: ");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
    }
}
 

