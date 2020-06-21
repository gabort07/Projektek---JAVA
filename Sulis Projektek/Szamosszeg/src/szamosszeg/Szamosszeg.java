/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamosszeg;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Szamosszeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bekert;
    int osszeg = 0;
    System.out.println("Kérem a számokat (-1-re kilép):");
    bekert = sc.nextInt();
    while (bekert != -1) {
        osszeg += bekert;
        bekert = sc.nextInt();
    }
    if (bekert == -1) {
        System.out.print("Az összeg: ");
        System.out.println(osszeg+".");
    }
    }
    
}
