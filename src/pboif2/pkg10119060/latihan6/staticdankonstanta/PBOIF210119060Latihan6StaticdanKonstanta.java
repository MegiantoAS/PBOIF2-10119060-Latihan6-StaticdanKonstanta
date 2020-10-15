/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan6.staticdankonstanta;

/**
 *
 * @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Kambing static dan konstanta
 */
public class PBOIF210119060Latihan6StaticdanKonstanta {

    public static final String NAMA_KAMBING ="SOLEH";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "maemiliki kambing sebanyak" + Mamalia.jumlahKambing);
        
    }
    
}
