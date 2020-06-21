/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerekit;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class Kerekit {

    public static int round(int a) {
        double kerekSzam = 0;
        double tortSzam = (double) a / 10;
        double b = a - (Math.floor(tortSzam) * 10);
        if (b < 3) {
            kerekSzam = (Math.floor(tortSzam)) * 10;
        } else if (b < 8) {
            kerekSzam = (Math.floor(tortSzam) * 10) + 5;
        } else if (b > 7) {
            kerekSzam = (Math.ceil(tortSzam)) * 10;
        }
        return (int) kerekSzam;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az összeget: ");
        int bekert = sc.nextInt();
        System.out.print("Kerekítve: " + round(bekert));
    }
}
