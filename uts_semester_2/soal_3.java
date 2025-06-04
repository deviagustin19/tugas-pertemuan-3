/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_semester_2;

/**
 *
 * @author livi
 */
import java.util.HashMap;
import java.util.Map;

public class soal_3 {
    public static void main(String[] args) {
        // Array input
        int[] array = {1, 2, 1, 3, 4, 2, 1};

        // Map untuk menyimpan jumlah kemunculan tiap elemen
        Map<Integer, Integer> jumlahKemunculan = new HashMap<>();

        // Menghitung kemunculan
        for (int angka : array) {
            if (jumlahKemunculan.containsKey(angka)) {
                jumlahKemunculan.put(angka, jumlahKemunculan.get(angka) + 1);
            } else {
                jumlahKemunculan.put(angka, 1);
            }
        }

        // Menampilkan hasil
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (Map.Entry<Integer, Integer> entry : jumlahKemunculan.entrySet()) {
            System.out.println("Angka " + entry.getKey() + ": " + entry.getValue() + " kali");
        }
    }
}
  

