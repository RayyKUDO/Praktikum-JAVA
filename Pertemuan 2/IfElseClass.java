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
public class IfElseClass {
     public String nama, ket;
    public int nilaiakhir;
    Scanner input = new Scanner(System.in);
    
    public void setInputData(){
        System.out.print("Masukkan Nama Siswa : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Akhir : ");
        nilaiakhir = input.nextInt();
    }
    public String getKeterangan(){
        if (nilaiakhir >= 70){
            ket = "Lulus";
        }
        else {
            ket = "Gagal";
        }
    return ket;
    }
}