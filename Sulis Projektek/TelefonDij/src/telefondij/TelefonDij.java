/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefondij;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class TelefonDij {

    public static int hivasDij(int ora, int perc, int masodperc, int percDij) {

        int kerekPerc = 0;
        if (masodperc > 0) {
            kerekPerc = 1;
        }
        return ((ora * 60) + perc + kerekPerc) * percDij;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Meddig tartott a hívás?");
        System.out.print("óra: ");
        int o = sc.nextInt();
        System.out.print("perc: ");
        int p = sc.nextInt();
        System.out.print("másodperc: ");
        int m = sc.nextInt();
        System.out.print("Mennyi a percdíj? ");
        int pD = sc.nextInt();
        int hD = hivasDij(o, p, m, pD);
        System.out.print("A hívás díja: " + hD + " Ft volt.");
    }
}
