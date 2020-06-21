/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palacsinta;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Palacsinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mennyi ideig sült a palacsinta? ");
        int perc = sc.nextInt();
        switch (perc) {
            case 1:
            case 2: System.out.println("A palacsinta nyers.");
            break;
            case 3:
            case 4: System.out.println("A palacsinta jó.");
            break;
            default: System.out.println("A palacsinta égett.");
            break;
        }
                
    }
    
}
