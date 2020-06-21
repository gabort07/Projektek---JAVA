/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pin1;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Pin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pin;
    do {
        System.out.print("PIN: ");
        pin = sc.nextInt();
        if (pin != 5936) {
            System.out.println("Hibás PIN.");
        }
    } while (pin != 5936);                  
    System.out.println("Titkos információ");
    }
}
