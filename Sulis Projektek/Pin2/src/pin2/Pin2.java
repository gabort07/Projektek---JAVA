/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pin2;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Pin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int joPin = 5936;
    int proba = 0;
    int bekert;
    System.out.print("PIN: ");
    bekert = sc.nextInt();
    proba++;
    while (bekert != joPin && proba < 3) {
        System.out.println("Hibás PIN.");
        System.out.print("PIN: ");
        bekert = sc.nextInt();
        proba++;
    } 
    if (bekert == joPin) {
        System.out.println("Titkos információ");
    } else {
        System.out.println("Hibás PIN.");
        System.out.println("Nincs több próbálkozási lehetőség!");
    }
        
    }
    
}

