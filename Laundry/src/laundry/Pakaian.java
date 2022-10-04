/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Hana Maheswari
 */
public class Pakaian extends Laundry {
    public int biaya;
    
    public Pakaian(int berat, String harga){
        super(berat, harga);
        this.biaya = biaya;
    }
    
    public String toString(){
        return (super.toString() + "\nBerat saat ini " + berat + 
                "\n Biaya total adalah" + this.biaya);
    }
}
