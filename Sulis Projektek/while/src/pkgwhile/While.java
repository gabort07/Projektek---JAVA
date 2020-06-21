/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

/**
 *
 * @author gabor
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int szam = 129;
        int i = 0;
        while (szam > 0) {
        szam /= 2;
        i++;
        } 
    }
    
}
