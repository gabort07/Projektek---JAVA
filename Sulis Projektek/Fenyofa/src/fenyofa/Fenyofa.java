/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenyofa;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Fenyofa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fenyőfarajzoló program.\n"
                + "Kérem a magasságot: ");
        int magassag = sc.nextInt();
        if (magassag < 3) {
            System.out.println("A magasság csak 2-nél nagyobb lehet.");
        } else {
            System.out.print("Kérem a szintek számát: ");
            int szintek = sc.nextInt();
            if (szintek < 1) {
                System.out.println("A szintek száma csak pozitív lehet.");
            } else {
                for (int e = 1; e <= szintek; e++) {
                    for (int i = 0; i < magassag; i++) {
                        for (int k = 1; k < magassag - i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                for (int w = 1; w <= 3; w++) {
                    for (int r = 1; r <= (magassag - 2); r++) {
                        System.out.print(" ");
                    }
                    System.out.println("***");
                }
            }
        }
    }
}
