/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class IfClassAksi {
    public static void main(String[] args) {
        double totalbeli;
        Scanner input = new Scanner(System.in);
        
        IfClass fungsiif = new IfClass();
        
        System.out.print("Total Pembelian Rp. ");
        fungsiif.Totalbeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp. " + fungsiif.getPotongan());
        System.out.println("Jumlah yg dibayarkan Rp. " + fungsiif.Jumlahbayar());
    }
}
