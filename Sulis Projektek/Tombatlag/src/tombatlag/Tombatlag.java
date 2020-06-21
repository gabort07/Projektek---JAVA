/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombatlag;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Tombatlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hanySzam;
        double osszesen = 0;
        do {
            System.out.print("Hány szám lesz? ");
            hanySzam = sc.nextInt();
            if (hanySzam < 0) {
                System.out.println("A számok darabszáma negatív.");
            }
        } while (hanySzam < 0);
        if (hanySzam > 0) {
            System.out.println("Kérem, írja be a számokat:");
            double[] szamok = new double[hanySzam];
            for (int i = 0; i < szamok.length; i++) {
                szamok[i] = sc.nextDouble();
                osszesen += szamok[i];
            }
            double atlag = osszesen / hanySzam;
            System.out.print("Az átlag feletti számok: ");
            for (int i = 0; i < szamok.length; i++) {
                if (szamok[i] > atlag) {
                    System.out.print(szamok[i]+" ");
                }
            }
        }
    }
}
