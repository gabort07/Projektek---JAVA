/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramis;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Piramis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Piramisrajzoló program.\n"
                + "Mekkora legyen a magassága? n=");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("A magasságnak pozitívnak kell lennie.");
        }
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
