/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim.e;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class PrimE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean prim;
    do {
        System.out.println("Kérek egy számot, ha prím, kilép!");
        int szam = sc.nextInt();
        int oszto = 2;
        prim = true;
        while (oszto <= Math.sqrt(szam) && prim) {
            if (szam % oszto == 0) {
                prim = false;
            }
            oszto++;
        }
    } while (!prim);
    System.out.println("Kiléptem, mert prím volt");
    }
    
}
