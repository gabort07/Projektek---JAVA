/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramisproba;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Piramisproba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Piramisrajzoló program.\n" +
                         "Mekkora legyen a magassága? n=");
        int n = sc.nextInt();
            if (n<=0) 

           System.out.println("A magasságnak pozitívnak kell lennie.");

       

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
                System.out.println();
            } 
        } 
    }



