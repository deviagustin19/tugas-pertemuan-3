/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author livi
 */
import java.util.LinkedList;
import java.util.Queue;

public class contoh_queue {
    public static void main(String[] args) {
        // Membuat objek Queue dengan tipe Integer menggunakan LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Menambahkan elemen ke queue (enqueue)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Menampilkan elemen paling depan
        System.out.println("Elemen depan: " + queue.peek()); // Output: 10

        // Menghapus elemen dari depan (dequeue)
        System.out.println("Elemen yang di-dequeue: " + queue.poll()); // Output: 10
        System.out.println("Elemen depan setelah dequeue: " + queue.peek()); // Output: 20

        // Menambahkan elemen lagi
        queue.offer(40);
        System.out.println("Elemen depan setelah enqueue 40: " + queue.peek()); // Output: 20

        // Mengecek apakah queue kosong
        System.out.println("Apakah queue kosong? " + queue.isEmpty()); // Output: false

        // Menampilkan seluruh isi queue
        System.out.println("Isi queue: " + queue); // Output: [20, 30, 40]
    }
}


