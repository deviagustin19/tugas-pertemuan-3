/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_semester_2;

/**
 *
 * @author livi
 */
public class soal_7 {
    public static void main(String[] args) {
        String[] names = {"Devi", "Adel", "Tia", "Dian", "Citra", "Najib", "Sirin"};

        // Insertion Sort
        String[] insertionSorted = names.clone();
        insertionSort(insertionSorted);
        System.out.println("Insertion Sort: ");
        printArray(insertionSorted);

        // Selection Sort
        String[] selectionSorted = names.clone();
        selectionSort(selectionSorted);
        System.out.println("Selection Sort: ");
        printArray(selectionSorted);

        // Bubble Sort
        String[] bubbleSorted = names.clone();
        bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort: ");
        printArray(bubbleSorted);
    }

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            String temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println("\n");
    }
}
    

