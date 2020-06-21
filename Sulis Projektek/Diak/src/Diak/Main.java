/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diak;

/**
 *
 * @author gabor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiakString jozsi = new DiakString("Nagy József Péter", 1999, 4.5);
            System.out.println(jozsi.getVezetekNev());
            for (String nev : jozsi.getKeresztNevek()) {
                System.out.println(nev);
            }
        String[] ker = {"András", "Leopold"};
            DiakString feri = new DiakString("Kovács", ker, 2000, 4.99);
            System.out.println(feri.getNev());
    }

}
