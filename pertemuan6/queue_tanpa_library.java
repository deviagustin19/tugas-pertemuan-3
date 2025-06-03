/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author livi
 */
public class queue_tanpa_library {
  
    private final int[] queueArray;  // Array untuk menyimpan elemen antrian
    private int front;         // Indeks elemen depan
    private int rear;          // Indeks elemen belakang
    private int size;          // Jumlah elemen dalam antrian

    // Constructor untuk Queue
    public queue_tanpa_library(int capacity) {
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue: Menambahkan elemen ke belakang antrian
    public void enqueue(int value) {
        if (size == queueArray.length) {
            System.out.println("Queue penuh. Tidak bisa menambahkan " + value);
            return;
        }
        rear = (rear + 1) % queueArray.length; // Circular increment
        queueArray[rear] = value;
        size++;
    }

    // Dequeue: Menghapus dan mengembalikan elemen dari depan
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue kosong. Tidak bisa dequeue.");
            return -1;
        }
        int value = queueArray[front];
        front = (front + 1) % queueArray.length; // Circular increment
        size--;
        return value;
    }

    // Melihat elemen depan tanpa menghapus
    public int peek() {
        if (size == 0) {
            System.out.println("Queue kosong.");
            return -1;
        }
        return queueArray[front];
    }

    // Main method untuk uji coba
    public static void main(String[] args) {
        queue_tanpa_library queue = new queue_tanpa_library(3);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40); // Ini akan gagal karena queue penuh

        System.out.println("Elemen depan: " + queue.peek()); // Output: 10

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 10
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 20
    }
}
  

