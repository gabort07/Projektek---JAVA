/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suti2;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Suti2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány deka liszt kell a sütihez? ");
        double lisztKell = sc.nextDouble();
        System.out.print("Hány tojás kell a sütihez? ");
        double tojasKell = sc.nextDouble();
        System.out.print("Hány deka cukor kell a sütihez? ");
        double cukorKell = sc.nextDouble();
        System.out.print("Hány deka liszt van otthon? ");
        double lisztVan = sc.nextDouble();
        System.out.print("Hány tojás van otthon? ");
        double tojasVan = sc.nextDouble();
        System.out.print("Hány deka cukor van otthon? ");
        double cukorVan = sc.nextDouble();
        double lisztLesz = Math.ceil(lisztVan / lisztKell);
        double tojasLesz = Math.ceil(tojasVan / tojasKell);
        double cukorLesz = Math.ceil(cukorVan / cukorKell);
        if (lisztLesz >= tojasLesz && lisztLesz >= cukorLesz) {
        double lisztVenni = lisztKell * lisztLesz;
        double tojasVenni = tojasKell * lisztLesz;
        double cukorVenni = cukorKell * lisztLesz;
        System.out.printf("Összesen %.0f", lisztLesz);
        System.out.println(" adagot készítünk.");
        System.out.printf("Venni kell még %.0f", lisztVenni - lisztVan);
        System.out.printf(" deka lisztet, %.0f", tojasVenni - tojasVan);
        System.out.printf(" db. tojást és %.0f", cukorVenni - cukorVan);
        System.out.println(" deka cukrot.");
        } else if(tojasLesz >= cukorLesz) {
            double lisztVenni = lisztKell * tojasLesz;
            double tojasVenni = tojasKell * tojasLesz;
            double cukorVenni = cukorKell * tojasLesz;
            System.out.printf("Összesen %.0f", tojasLesz);
            System.out.println(" adagot készítünk.");
            System.out.printf("Venni kell még %.0f", lisztVenni - lisztVan);
            System.out.printf(" deka lisztet, %.0f", tojasVenni - tojasVan);
            System.out.printf(" db. tojást és %.0f", cukorVenni - cukorVan);
            System.out.println(" deka cukrot.");
        } else {
            double lisztVenni = lisztKell * cukorLesz;
            double tojasVenni = tojasKell * cukorLesz;
            double cukorVenni = cukorKell * cukorLesz;
            System.out.printf("Összesen %.0f", cukorLesz);
            System.out.println(" adagot készítünk.");
            System.out.printf("Venni kell még %.0f", lisztVenni - lisztVan);
            System.out.printf(" deka lisztet, %.0f", tojasVenni - tojasVan);
            System.out.printf(" db. tojást és %.0f", cukorVenni - cukorVan);
            System.out.println(" deka cukrot.");
        }

    }

}
