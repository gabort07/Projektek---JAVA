/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombvissza;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Tombvissza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hanySzam;

        do {
            System.out.print("Hány szám lesz? ");
            hanySzam = sc.nextInt();
            if (hanySzam < 0) {
                System.out.println("A számok darabszáma negatív.");
            }
        } while (hanySzam < 0);

        if (hanySzam > 0) {
            double[] szamok = new double[hanySzam];
            System.out.println("Kérem írja be a számokat:");
            for (int i = 0; i < szamok.length; i++) {
                szamok[i] = sc.nextDouble();
            }

            System.out.println("A számok fordított sorrendben:");
            for (int i = szamok.length-1; i >= 0; i--) {
                System.out.print(szamok[i] + " ");
            }
        }
    }
}
