/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author User
 */
public class IfClass {
    public double Totalbeli, potongan;
    
    public void setTotalbeli(double a) {
        Totalbeli = a;
    }
    
    public double getPotongan(){
        if (Totalbeli >= 500000){
            potongan = 0.2 * Totalbeli;
        }
        return potongan;
    }
    
    public double Jumlahbayar (){
        return (Totalbeli - potongan);
    }
}
