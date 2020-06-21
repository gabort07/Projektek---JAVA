/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebesseg;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Sebesseg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Hány km/h-val ment? ");
    int a = sc.nextInt();
    if (a < 51) {
        System.out.println("Ön szabályosan hajtott.");
    } else if (a < 66) {
        System.out.println("Az Ön büntetése 0,- Ft.");
    } else if (a < 76) {
        System.out.println("Az Ön büntetése 30 000,- Ft.");
    } else if (a < 86) {
        System.out.println("Az Ön büntetése 45 000,- Ft.");
    } else if (a < 96) {
        System.out.println("Az Ön büntetése 60 000,- Ft.");
    } else if (a < 106) {
        System.out.println("Az Ön büntetése 90 000,- Ft.");
    } else if (a < 116) {
        System.out.println("Az Ön büntetése 130 000,- Ft.");
    } else if (a < 126) {
        System.out.println("Az Ön büntetése 200 000,- Ft.");
    } else {
        System.out.println("Az Ön büntetése 300 000,- Ft.");
    }
    }
}
