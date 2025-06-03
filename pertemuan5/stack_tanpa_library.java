/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author livi
 */
public class stack_tanpa_library {
    private final int maxSize;       // Ukuran maksimum stack
    private final int[] stackArray;  // Array untuk menyimpan elemen stack
    private int top;           // Indeks elemen paling atas

    // Constructor
    public stack_tanpa_library (int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack kosong saat awal
    }

    // Push: Tambahkan elemen ke atas stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack penuh. Tidak bisa menambahkan " + value);
            return;
        }
        top++;
        stackArray[top] = value;
    }

    // Pop: Hapus dan kembalikan elemen paling atas
    public int pop() {
        if (top == -1) {
            System.out.println("Stack kosong. Tidak bisa pop.");
            return -1;
        }
        int value = stackArray[top];
        top--;
        return value;
    }

    // Peek: Lihat elemen paling atas tanpa menghapus
    public int peek() {
        if (top == -1) {
            System.out.println("Stack kosong. Tidak ada yang bisa dilihat.");
            return -1;
        }
        return stackArray[top];
    }

    // Cek apakah stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Cek apakah stack penuh
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Main method untuk uji coba
    public static void main(String[] args) {
        stack_tanpa_library stack = new stack_tanpa_library(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // Ini akan gagal karena stack penuh

        System.out.println("Elemen paling atas: " + stack.peek());
        System.out.println("Ambil elemen: " + stack.pop());
        System.out.println("Elemen paling atas sekarang: " + stack.peek());
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
    }
}
