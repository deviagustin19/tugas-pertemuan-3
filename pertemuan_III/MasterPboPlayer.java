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
public class MasterPboPlayer {
    
    private String id;
    private String name;
    private String company;
    private String role;

    // Constructor untuk menginisialisasi objek dengan id, name, company, dan role
    public MasterPboPlayer(String id, String name, String company, String role) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.role = role;
    }

    // Getter untuk id
    public String getId() {
        return id;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Getter untuk company
    public String getCompany() {
        return company;
    }

    // Getter untuk role
    public String getRole() {
        return role;
    }

    // Setter untuk name
    public void setName(String name) {
        this.name = name;
    }

    // Setter untuk company
    public void setCompany(String company) {
        this.company = company;
    }

    // Setter untuk role
    public void setRole(String role) {
        this.role = role;
    }

    // Method untuk menampilkan informasi player
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Company: " + company + ", Role: " + role);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek pemain baru dengan data yang diberikan
        MasterPboPlayer player = new MasterPboPlayer("P001", "Alice", "TechCorp", "Developer");
        
        // Menampilkan informasi pemain
        player.displayInfo();
        
        // Mengubah nama dan menampilkan informasi lagi
        player.setName("Bob");
        player.displayInfo();
    }
}

