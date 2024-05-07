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
public class LatihanScanner {
     public String nim, nama;
    public int na, nt, nuts, nuas;
    Scanner input = new Scanner(System.in);
    
    public String getNim (){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public int getNa(){
        return na;
    }
    public int getNt(){
        return nt;
    }
    public int getNuts(){
        return nuts;
    }
    public int getNuas(){
        return nuas;
    }
    
    public void inputScanner(){
        System.out.print("Masukkan NIM Anda \t: ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama Anda \t: ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Absen \t: ");
        na = input.nextInt();
        System.out.print("Masukkan Nilai Tugas \t: ");
        nt = input.nextInt();
        System.out.print("Masukkan Nilai UTS \t: ");
        nuts = input.nextInt();
        System.out.print("Masukkan Nilai UAS \t: ");
        nuas = input.nextInt();
    }   
    
    public double rata(){
        return ((0.1*na)+(0.2*nt)+(0.3*nuts)+(0.4*nuas));
    }
}
