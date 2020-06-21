/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penztargep;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Penztargep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bekert;
        double legdragabb = 0;
        double db;
        int olcsobb500 = 0;
        System.out.println("Pénztárgép program. Kérem a tételeket, a vége 0.");
        bekert = sc.nextInt();
        int osszesen = bekert;
        for (db = 0; bekert > 0; db++) {
            if (bekert < 500) {
                olcsobb500++;
            }
            bekert = sc.nextInt();
            osszesen += bekert;
            if (bekert > legdragabb) {
                legdragabb = bekert;
            }
        }
        double atlag = (double) osszesen / (double) db;
        double atlagKulombseg = ((double) legdragabb / (atlag / 100)) - 100;
        System.out.println("Összesen " + osszesen + " Ft.");
        System.out.printf("Átlag %.2f Ft.\n", atlag);
        System.out.printf("Legdrágább %.0f Ft.\n", legdragabb);
        System.out.printf("A legdrágább %.2f%%-kal volt drágább az átlagnál.\n", atlagKulombseg);
        System.out.println("Összesen " + olcsobb500 + " db. 500 Ft-nál olcsóbb termék volt az áruk közt.");

    }

}
