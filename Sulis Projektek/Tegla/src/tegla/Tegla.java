/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tegla;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Tegla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Téglatest térfogat- és felszínszámoló");
       System.out.print("a=");
       float a = sc.nextFloat();
       System.out.print("b=");
       float b = sc.nextFloat();
       System.out.print("c=");
       float c = sc.nextFloat();
       System.out.printf("Felszín: %.1f%n", 2 * (a * b + a * c + b * c));
       System.out.printf("Térfogat: %.1f", a * b * c);
        
    }
    
}
