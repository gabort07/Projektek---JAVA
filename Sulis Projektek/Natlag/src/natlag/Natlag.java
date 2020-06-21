/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natlag;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Natlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Átlagszámoló.\nHány számot ad be? n=");
        double osszeg = 0;
        int hanySzam = sc.nextInt();
        if (hanySzam < 0) {
            System.out.println("Az \"n\" értékének pozitívnak kell lennie.");
        } else {
            System.out.println("Kérem a számokat!");
            for (int n = 1; n <= hanySzam; n++) {
                System.out.print(n+". szám: ");
                double bekert = sc.nextDouble();
                osszeg += bekert;
            } System.out.println("A beírt számok átlaga "+(osszeg / hanySzam)+".");
        } 
    }
    
}
