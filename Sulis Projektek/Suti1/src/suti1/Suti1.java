/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suti1;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Suti1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány deka liszt kell a sütihez? ");
        double lisztKell = sc.nextDouble();
        System.out.print("Hány tojás kell a sütihez? ");
        double tojasKell = sc.nextDouble();
        System.out.print("Hány deka cukor kell a sütihez? ");
        double cukorKell = sc.nextDouble();
        System.out.print("Hány deka liszt van otthon? ");
        double lisztVan = sc.nextDouble();
        System.out.print("Hány tojás van otthon? ");
        double tojasVan = sc.nextDouble();
        System.out.print("Hány deka cukor van otthon? ");
        double cukorVan = sc.nextDouble();        
        if (lisztVan > 0 && tojasVan > 0 && cukorVan > 0) {
          double lisztLesz = lisztVan / lisztKell;
          double tojasLesz = tojasVan / tojasKell;
          double cukorLesz = cukorVan / cukorKell;
           if (lisztLesz <= tojasLesz && lisztLesz <= cukorLesz) {
               System.out.printf(Locale.ENGLISH, "A megadott mennyiségekből %.1f", lisztLesz);
               System.out.println(" adag készülhet el.");
           } else if (tojasLesz <= cukorLesz) {
               System.out.printf(Locale.ENGLISH, "A megadott mennyiségekből %.1f", tojasLesz);
               System.out.println(" adag készülhet el.");
           }  else {
               System.out.printf(Locale.ENGLISH, "A megadott mennyiségekből %.1f,", cukorLesz);
               System.out.println(" adag készülhet el.");
           } 
        } else {
            System.out.println("Nincs elég alapanyag.");
        }
    }    
}    
    

