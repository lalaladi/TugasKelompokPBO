/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry;

/**
 *
 * @author Hana Maheswari
 */
public class Laundry {
    //properties
    public String jenis;
    public int harga;
    public int berat;
    
    //constructor
    public Laundry(String jenis, int berat, String harga){
        this.jenis = jenis;
        this.berat = berat;
    }
    
    public void biayatotal(int perkalian) {
        harga *= perkalian;
    }
    
    public String toString(){
        return ("Berat saat ini " + berat + "\n"
                + "Biaya total adalah " + harga);
    }
}
