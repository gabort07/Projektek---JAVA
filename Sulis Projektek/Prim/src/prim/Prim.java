/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Prim {

    public static boolean isPrime(int a) {
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot, amiről el kell döntenem, hogy prím-e: ");
        int bekert = sc.nextInt();
        boolean prim = isPrime(bekert);
        if (prim == true) {
            System.out.print("A szám prím.");
        } else {
            System.out.print("A szám nem prím.");
        }
    }
}
