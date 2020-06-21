/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor;
        do {
            System.out.println("Kérem a következő ember korát!");
            kor = sc.nextInt();
            if (kor < 0) {
                System.out.println("Hibás kor, kérlek add meg újra!");
            }
        } while (kor < 0);
    }    
}
