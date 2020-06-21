/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parose;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Parose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hány elem van összesen?");
        Scanner sc = new Scanner(System.in);
        int elementCount = sc.nextInt();
        int count = 0;
        for (int i = 0; i < elementCount; i++) {
            System.out.println("Kérem az elemet:");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.printf("A beolvasott elemek közül %d volt páros.%n", count);
    }

}
