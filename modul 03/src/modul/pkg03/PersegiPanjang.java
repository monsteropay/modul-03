/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LK09Nu4UTY
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersegiPanjang {
    
    public static void main(String[] args) {
        
    
    BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
    
    String pjg=null, lbr=null;
    
        System.out.println("Persegi Panjang");
   
        try {
            System.out.print("Masukkan Panjang : ");
            pjg = dataIn.readLine();
            System.out.print("Masukkan Lebar : ");
            lbr = dataIn.readLine();
        } catch (Exception e) {
            System.out.println("Error!!!");
        }
        
        int panjang = Integer.parseInt(pjg);
        int lebar = Integer.parseInt(lbr);
        
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);
    }
}