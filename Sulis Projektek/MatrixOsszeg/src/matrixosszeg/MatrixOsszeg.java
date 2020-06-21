/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixosszeg;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class MatrixOsszeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elsoMtx[][] = new int[2][2];
        System.out.println("Kérem az első mátrix elemeit:");
        for (int sor = 0; sor < elsoMtx.length; sor++) {
            for (int oszlop = 0; oszlop < elsoMtx[sor].length; oszlop++) {
                elsoMtx[sor][oszlop] = sc.nextInt();
            }
        }
        int masodikMtx[][] = new int[2][2];
        System.out.println("Kérem a második mátrix elemeit:");
        for (int sor = 0; sor < masodikMtx.length; sor++) {
            for (int oszlop = 0; oszlop < masodikMtx[sor].length; oszlop++) {
                masodikMtx[sor][oszlop] = sc.nextInt();
            }
        }
        int harmadikMtx[][] = new int[2][2];
        for (int sor = 0; sor < harmadikMtx.length; sor++) {
            for (int oszlop = 0; oszlop < harmadikMtx[sor].length; oszlop++) {
                harmadikMtx[sor][oszlop] = elsoMtx[sor][oszlop] + masodikMtx[sor][oszlop];
            }
        }
        System.out.println("Az eredmény:");
        System.out.println(harmadikMtx[0][0] + " " + harmadikMtx[0][1]);
        System.out.println(harmadikMtx[1][0] + " " + harmadikMtx[1][1]);
    }
}

