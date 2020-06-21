/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csempe;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Csempe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A szoba magassága: ");
        double m = sc.nextDouble() * 100;
        System.out.print("A szoba szélessége: ");
        double sz = sc.nextDouble() * 100;
        System.out.print("A szoba hosszúsága: ");
        double h = sc.nextDouble() * 100;
        double mCs = Math.ceil(m / 25);
        double szCs = Math.ceil(sz / 25);
        double hCs = Math.ceil(h / 25);
        System.out.printf("A szoba kicsempézéséhez %.0f", 2 * (mCs * szCs + mCs * hCs));
        System.out.println(" csempe kell.");
        
        
        
        
        
    }
    
}
