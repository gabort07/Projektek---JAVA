/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktor;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Faktor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Faktoriális számítás.");
       System.out.print("n=");
       int a = 1;
       int n = sc.nextInt();
       if (n < 0) {
       System.out.println(n+" faktoriálisát nem értelmezzük");
       } else {
         for (int i = 1; i <= n; i++) {
         a *= i;
        
         }
          System.out.println(n+"!="+ a);
    }
    
}
}