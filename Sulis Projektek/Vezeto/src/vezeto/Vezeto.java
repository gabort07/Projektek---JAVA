/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezeto;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Vezeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány éves? ");
        int ev = sc.nextInt();
        System.out.println(ev >= 17 ? "Vezethet autót." : "Nem vezethet autót.");
        
        
    }
    
}
