/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan43.gajipegawai;
import java.util.Scanner;
/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung 
 * Gaji Karyawan
 */
public class PBO210117070Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gajiPegawai1 = new GajiPegawai();
        Scanner scn = new Scanner (System.in);
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.print("Nama Karyawan\t: ");
        String nm = scn.nextLine();
        System.out.print("Alamat\t: ");
        String am = scn.nextLine();
        System.out.print("Uang Transport\t: Rp. ");
        int upt = scn.nextInt();
        System.out.print("Uang Tunjangan\t: Rp. ");
        int utj = scn.nextInt();
        System.out.print("Gaji Pokok\t: Rp. ");
        int gp = scn.nextInt();
        System.out.println("Total Gaji\t: Rp. "+gajiPegawai1.totalGaji(utj, upt, gp));
       
    }
    
}
