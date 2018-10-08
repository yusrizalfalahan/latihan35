/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan35.tunjangan;

/**
 *NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi tunjangan
 * @author Acer
 */
public class gaji {
    public double Gajipokok;
    public String Status;
    public double Tunjangan, Totalgaji;
    
    public void programtunjangan(double parGajipokok, String parStatus, double parTunjangan, double parTotalgaji){
        
        parTunjangan = (parStatus.equalsIgnoreCase("menikah")) ? parGajipokok * 0.35 : 0;
        
        parTotalgaji = parTunjangan + parGajipokok;
        
        System.out.println("\n");
        System.out.println("=======Hasil Perhitungan========");
        System.out.println("Gaji Pokok Anda\t: " + parGajipokok);
       // System.out.println("Status Anda\t\t: " + parstatus);
        System.out.println("Tunjangan Anda\t\t: " + parTunjangan);
        System.out.println("Total Gaji Anda\t\t: " + parTotalgaji);
        
    }
}
