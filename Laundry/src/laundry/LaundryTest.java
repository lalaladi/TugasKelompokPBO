/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laundry;

/**
 *
 * @author Hana Maheswari
 */
public class LaundryTest {
    public static void main(String[] args) {        
        Laundry l = new Laundry("Pakaian", 3, "5000");
        System.out.println(l);
        
        Laundry pakaian = new Pakaian(5, "5000");
        System.out.println(pakaian);
    }
    
}
