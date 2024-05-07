/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.text.*;
import java.io.*;

/**
 *
 * @author User
 */
public class LatSoalArray {
    public static void main(String[] args) throws IOException {
        InputStreamReader Keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Keyreader);
        int i, jumlah_data;
        double total=0;
        String nama;
        String[] nama_barang = new String[10];
        String[] kode = new String[10];
        int[] jumlah_brg = new int[10];
        int[] harga = new int[10];
        double[] total_hrg = new double [10];
        
        Date HariSekarang = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        
        System.out.println("\tPT PERMATA PRATAMA");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Nama Petugas : ");
        nama = input.readLine();
        System.out.print("\nMasukkan Jumlah Data : "); 
        jumlah_data = Integer.parseInt(input.readLine());
        System.out.println("-----------------------------------");
        
        for (i = 1; i <= jumlah_data; i++){
            System.out.println("\nData ke - " + i);
            System.out.print("Kode Barang : "); kode[i]=input.readLine();
            System.out.print("Jumlah Beli : "); jumlah_brg[i]=Integer.parseInt(input.readLine());
            System.out.println("");
            if (kode[i].equalsIgnoreCase("P001")) {
                nama_barang[i] = "Printer  ";
                harga[i] = 700000;
            }
            else if (kode[i].equalsIgnoreCase("V001")) {
                nama_barang[i] = "VGA Card ";
                harga[i] = 750000;
            }
            else {
                nama_barang[i] = "Motherboard";
                harga[i] = 950000;
            }
            
            total_hrg[i]=harga[i]*jumlah_brg[i];
            total += total_hrg[i];
        }
        
        System.out.println("\t\t\t\t\t\tPT PERMATA PRATAMA");
        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
        System.out.println("Nama Petugas \t\t\t: " + nama + "\t\t\t\t\t\tTanggal : " + ft.format(HariSekarang));
        System.out.println("Jumlah Data yg Dimasukkan \t: " + jumlah_data);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Data Ke" + "\t\tKode Barang" + "\tNama Barang" + "\t\tHarga Barang" + "\t  Jumlah Barang" + "\t\tTotal Harga");
        for (i = 1; i <= jumlah_data; i++){
            System.out.println("   " + i + "\t\t" + kode[i] + "\t\t" + nama_barang[i] + "\t\t" + harga[i] + "\t\t\t" + jumlah_brg[i] + "\t\t" + total_hrg[i]);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        
        System.out.printf("Total Pendapatan Pada tanggal " + ft.format(HariSekarang) + " adalah sebesar Rp. " + total);
    }
}