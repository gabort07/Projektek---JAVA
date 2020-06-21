/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elojel;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class Elojel {

    public static int elojel(int szam) {
        int signum = 0;
        if (szam < 0) {
            signum = -1;
        } else if (szam > 0) {
            signum = 1;
        }
        return signum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        int bekert = sc.nextInt();
        int sig = elojel(bekert);
        if (sig >0){
        System.out.print("A szám signuma: +" + sig);
    }else {
            System.out.print("A szám signuma: "+sig);
        }
    }
}
