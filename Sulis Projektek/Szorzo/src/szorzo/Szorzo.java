/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szorzo;

/**
 *
 * @author gabor
 */
public class Szorzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            for (int k = 1; k <= 9; k++) {
                System.out.print(j * k);
                if (k == 9) {
                    break;
                } System.out.print(" ");
            } System.out.println();
        } 
    }
}
