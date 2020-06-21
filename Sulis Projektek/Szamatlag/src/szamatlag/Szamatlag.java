/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamatlag;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Szamatlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bekert;
    double osszeg = 0;
    double atlag;
    int oszto = 0;
    System.out.println("Kérem a számokat (-1-re kilép):");
    bekert = sc.nextInt();
    while (bekert != -1) {
        osszeg += bekert;
        bekert = sc.nextInt();
        oszto++;
    }
    if (bekert == -1) {
        atlag = osszeg / oszto; 
        System.out.printf("Az átlag: %.2f.", atlag);
    }
    }
    
}
