/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paros50;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class Paros50 {

    public static boolean evenAndGreaterThan50(int[] numbers) {
        boolean volt= false;
        for (int i = 0; i < numbers.length; i++) {
            volt = numbers[i]%2==0 && numbers[i] > 50; 
           if (volt == true){
               break;
           }
        }
        if(volt) {
            System.out.println("igen");
        } else {
            System.out.println("nem");
        }
        return volt;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a tömb elemszámát: ");
        int elemSzam = sc.nextInt();
        int[] t = new int[elemSzam];
        System.out.println("Kérem a tömb elemeit:");
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
       evenAndGreaterThan50(t);
        
    }
}
