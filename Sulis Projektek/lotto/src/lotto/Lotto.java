/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int db = 0;
    while (db < 5) {
        int lotto;
        do {
            System.out.println("Kérek egy 1...90 szaámot!");
            lotto = sc.nextInt();
        } while (lotto < 1 || lotto > 90);
        System.out.println("Az elfogadott szám: "+lotto);
        db++;
    }
    }
    
}
