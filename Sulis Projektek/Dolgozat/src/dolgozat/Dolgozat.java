/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat;

import java.util.Scanner;
/**
 *
 * @author gabor
 */
public class Dolgozat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Kérem a dolgozat max. pontszámát: ");
       int maxPont = sc.nextInt();
       System.out.print("Kérem a dolgozat aktuális pontszámát: ");
       int pontSzam = sc.nextInt();
       float a = maxPont;
       float b = pontSzam;
       float eredmeny = (b / a * 100);
       System.out.printf("A dolgozat %.2f", eredmeny);
       System.out.println(" %-os lett");
       
    }
    
}
