/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homerseklet;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Homerseklet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int legmelegebb = -365;
        int plusz25 = 0;
        double hetiOssz = 0;
        int melegNap = 0;
        boolean minusz = false;
        for (int i = 1; i <= 7; i++) {
            System.out.print("Kérem a(z) " + i + ". nap középhőmérsékletét: ");
            int napiHo = sc.nextInt();
            if (napiHo > legmelegebb) {
                legmelegebb = napiHo;
                melegNap = i;
            }
            if (napiHo < 0) {
                minusz = true;
            }
            if (napiHo > 25) {
                plusz25++;
            }
            hetiOssz += napiHo;

        }
        if (minusz) {
            System.out.println("Volt 0 fok alatti középhőmérsékletű nap.");
        } else {
            System.out.println("Nem volt 0 fok alatti középhőmérsékletű nap.");
        }
        System.out.printf("A heti átlaghőmérséklet %.2f fok volt.\n", hetiOssz / 7);
        System.out.println("A héten " + plusz25 + " olyan nap volt, amikor 25 foknál melegebb volt.");
        System.out.println("A legmelegebb nap a(z) " + melegNap + ". volt, amikor " + legmelegebb + " fok volt.");
    }

}
