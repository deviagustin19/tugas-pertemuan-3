/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author livi
 */
import java.util.Stack;
public class contoh_stack { 
    public static void main(String[] args) {
           Stack<String> stack = new Stack<>();

                stack.push("A");
                stack.push("K");
                stack.push("U");

            System.out.println("Isi stack: " + stack);
            System.out.println("Top: " + stack.peek());

            stack.pop(); // hapus C
            System.out.println("Setelah pop: " + stack);
    }
}


