/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author User
 */
class ArrayPlg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, jd;
        String[] nm = new String[10];
        String[] kp = new String[10];
        String[] almt = new String[10];
        String tanya = "";

        do {
            System.out.print("Masukkan jumlah data: ");
            jd = input.nextInt();

            for (i = 1; i <= jd; i++) {
                System.out.println("Data Ke- " + i);
                System.out.print("Kode pelanggan: ");
                kp[i] = input.next();
                System.out.print("Nama pelanggan: ");
                nm[i] = input.next();
                System.out.print("Alamat pelanggan: ");
                almt[i] = input.next();
            }

            System.out.println("\n\nDATA PELANGGAN PT. SENTOSA JAYA");
            System.out.println("JL. Sagu No.27A Kebagusan Jakarta selatan");
            System.out.println("==============================================================");

            for (i = 1; i <= jd; i++) {
                System.out.println("Data Ke- " + i);
                System.out.println("Kode pelanggan: " + kp[i]);
                System.out.println("Nama pelanggan: " + nm[i]);
                System.out.println("Alamat pelanggan: " + almt[i]);
                System.out.println("==============================================================");
            }

            System.out.print("Mau input data lagi: ");
            tanya = input.next();
        } while (tanya.equals("Y") || tanya.equals("y"));
    }
}
