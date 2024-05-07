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
public class LatihanScannerAksi {
    public static void main(String[] args) {
        LatihanScanner scan = new LatihanScanner();
        
        scan.inputScanner();
        System.out.println("\n\n\tProgram Nilai Mahasiswa");
        System.out.println("--------------------------------------");
        System.out.println("NIM Anda \t\t: " + scan.getNim());
        System.out.println("Nama Anda \t\t: " + scan.getNama());
        System.out.println("Nilai Absen Anda \t: " + scan.getNa());
        System.out.println("Nilai Tugas Anda \t: " + scan.getNt());
        System.out.println("Nilai UTS Anda \t\t: " + scan.getNuts());
        System.out.println("Nilai UAS Anda \t\t: " + scan.getNuas());
        System.out.println("--------------------------------------");
        System.out.println("Rata - Rata \t\t: " + scan.rata());
    }
}