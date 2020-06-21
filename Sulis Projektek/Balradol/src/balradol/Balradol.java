/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balradol;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Balradol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Balra dőlő háromszöget rajzoló program.\n"
                + "Mekkora legyen a magassága? n=");
        int szam = sc.nextInt();
        if (szam < 1) {
            System.out.println("A magasságnak pozitívnak kell lennie.");
        }
        for (int i = 1; i <= szam; i++) {
            for (int k = 0; k < i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
