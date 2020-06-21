/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busz;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Busz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int legkevesebb = 40;
        int legtobb = 0;
        int leszallo = 0;
        int megalloMin = 0;
        int megalloMax = 0;
        int utasSzam = 0;
        double tartozkodo = 0;

        outerloop:
        {
            for (int megalloFel = 1; megalloFel < 5; megalloFel++) {
                System.out.print("Kérem a(z) " + megalloFel + ". megállónál felszálló utasok számát! ");
                int felszallo = sc.nextInt();
                utasSzam += felszallo;
                if (utasSzam > legtobb) {
                    legtobb = utasSzam;
                    megalloMax = megalloFel;
                }
                if (megalloFel <= 4) {
                    tartozkodo += utasSzam;
                }
                if (felszallo < legkevesebb) {
                    legkevesebb = felszallo;
                    megalloMin = megalloFel;
                }
                if (utasSzam > 40) {
                    System.out.println("Túl sok utas a(z) " + megalloFel + ". megállónál.");
                    break outerloop;
                }
                if (utasSzam < 0) {
                    System.out.println("Negatív utasszám a(z) " + megalloFel + ". megállónál.");
                    break outerloop;
                }
                for (int megalloLe = megalloFel + 1; megalloLe <= megalloFel + 1; megalloLe++) {
                    System.out.print("Kérem a(z) " + megalloLe + ". megállónál leszálló utasok számát! ");
                    leszallo = sc.nextInt();
                    utasSzam -= leszallo;
                    if (megalloLe == 5 && utasSzam > 0) {
                        System.out.println("Fennmaradó utas a végállomás után.");
                        break outerloop;
                    }
                }
            }
            System.out.println("A 4. megálló elhagyása után " + leszallo + " utas volt a buszon.");
            System.out.println("Az adatok helyesek.");
            System.out.println("A(z) " + megalloMin + ". megállónál volt a legkevesebb a felszállók száma: " + legkevesebb + " utas.");
            System.out.printf(Locale.ENGLISH, "A buszon átlagosan %.1f utas tartózkodott.\n", tartozkodo / 4);
            System.out.println("A legtöbb utas a(z) " + megalloMax + ". megálló után volt: " + legtobb);
        }
    }
}
