/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katikonyvei;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class KatiKonyvei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double oldalSum = 0;
        int kisKonyv = 0;
        int legrovidebb = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Szia Kati!\nKérlek írd be, hány könyvet szeretnél elolvasni! ");
        int konyvek = sc.nextInt();
        while (konyvek < 1) {
            System.out.print("Kati, a projekted biztosan legalább 1 könyvet tartalmaz!\n"
                    + "Kérlek írd be, hány könyvet szeretnél elolvasni! ");
            konyvek = sc.nextInt();
        }
        for (int i = 1; i <= konyvek; i++) {
            System.out.print("A(z) " + i + ". könyv hány oldalas? ");
            int oldalak = sc.nextInt();
            if (oldalak < legrovidebb) {
                legrovidebb = oldalak;
            }
            oldalSum += oldalak;
            if (oldalak < 120) {
                kisKonyv++;
            }

        }
        double oraSum = oldalSum / 20;
        double napSum = oraSum / 2.5;
        System.out.printf("Összesen %.0f oldalt akarsz elolvasni.%n", oldalSum);
        System.out.printf("A projekt %.1f óráig fog tartani, és %.2f napot vesz igénybe.%n", oraSum, napSum);
        System.out.println("A legrövidebb könyv " + legrovidebb + " oldalas.");
        System.out.println("A könyvek között " + kisKonyv + " db. 120 oldalnál rövidebb könyv van.");
    }

}
