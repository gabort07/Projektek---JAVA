/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Minimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hány elem van összesen?");
        Scanner sc = new Scanner(System.in);
        int elementCount = sc.nextInt();
        System.out.println("Kérem az első számot!");
        int number = sc.nextInt();
        int min = number;
        for (int i = 1; i < elementCount; i++) {
            System.out.println("Kérem a következő számot:");
            number = sc.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.printf("A beolvasott elemek közül a legnagyobb: " + min);
    }
}
