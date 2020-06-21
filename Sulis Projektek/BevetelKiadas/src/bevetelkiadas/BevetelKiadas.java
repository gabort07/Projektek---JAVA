/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bevetelkiadas;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class BevetelKiadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        System.out.print("Hány tétel szerepeljen a tömbben? ");
        int hanySzam = scan.nextInt();
        if (hanySzam > 0) {
            
            double[] beKi = new double[hanySzam];
            System.out.println("Kérem a tételeket!");
            for (int i = 0; i < hanySzam; i++) {
                beKi[i] = scan.nextDouble();
                sum += beKi[i];
            }
            if (sum < 0) {
                System.out.print("Volt olyan pillanat, amikor negatívba csúsztunk.");
            } else {
                System.out.print("Minden rendben volt.");
            }

        } else {
            System.out.print("A tételek Száma pozitív kell legyen!");
        }

    }
}