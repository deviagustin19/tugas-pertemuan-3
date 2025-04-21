/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_III;

/**
 *
 * @author ACER
 */

// PboPlayer.java
public class PboPlayer {

    public static void main(String[] args) {
        // Membuat objek pemain baru dengan nama
        PboPlayer player = new PboPlayer("Alice");
        
        // Menaikkan level pemain
        player.levelUp(); 

        // Menampilkan level pemain setelah naik level
        System.out.println("Level player setelah naik level: " + player.getLevel());
    }

    // Atribut pemain
    private String name;
    private int level;
    private int score;

    // Constructor untuk membuat objek pemain baru dengan nama
    public PboPlayer(String name) {
        this.name = name;
        this.level = 1;  // Level dimulai dari 1
        this.score = 0;  // Skor dimulai dari 0
    }

    // Method untuk menampilkan status pemain
    public void showStatus() {
        System.out.println("Nama Pemain: " + name);
        System.out.println("Level: " + level);
        System.out.println("Skor: " + score);
    }

    // Method untuk menambah skor
    public void addScore(int additionalScore) {
        this.score += additionalScore;
        System.out.println("Skor bertambah " + additionalScore + ", total skor: " + score);
    }

    // Method untuk menaikkan level pemain
    public void levelUp() {
        this.level++;
        System.out.println(name + " telah naik level! Sekarang level " + level);
    }

    // Getter dan Setter untuk nama pemain
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter untuk level
    public int getLevel() {
        return this.level;  // Kembalikan level yang benar
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Getter dan Setter untuk skor
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}






