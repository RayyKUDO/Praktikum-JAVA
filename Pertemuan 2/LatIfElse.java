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
public class LatIfElse {
    public static void main(String[] args) {
        IfElseClass ifclass = new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
             
        System.out.println("\tHasl Akhir");
        System.out.println("===============================");
        System.out.println("Nama Siswa      : " + ifclass.nama);
        System.out.println("Nilai Akhir     : " + ifclass.nilaiakhir);
        System.out.println("Keterangann     : " + ifclass.getKeterangan());
        System.out.println("===============================");
        
    }
}
