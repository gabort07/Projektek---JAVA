/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobbradol;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Jobbradol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jobbra dőlő háromszöget rajzoló program.\n"
                + "Mekkora legyen a magassága? n=");
        int szam = sc.nextInt();
        if (szam < 1) {
            System.out.println("A magasságnak pozitívnak kell lennie.");
        }
        for (int i = szam; i > 0; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= szam - i; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}
