/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan35.tunjangan;
import java.util.Scanner;

/**
 *NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi tunjangan
 * @author Acer
 */
public class Pbo0210117043Latihan35Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        gaji g = new gaji();
        System.out.println("=====Program Tunjangan=====");
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Berapa Gaji Pokok Anda Perbulan : ");
        g.Gajipokok = scn.nextInt();
        
        System.out.println("Status Anda (menikah/belum : ");
        g.Status = scn.next();
        
        g.programtunjangan(g.Gajipokok, g.Status, g.Tunjangan , g.Totalgaji);
        System.out.println("(Develop By: Yusrizal Falahan)");
        
    }
    
}
