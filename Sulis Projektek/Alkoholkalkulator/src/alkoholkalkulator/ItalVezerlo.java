/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholkalkulator;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class ItalVezerlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ember ember = new Ember();
        System.out.print("Hogy hívnak? ");
        ember.nev = sc.nextLine();
        System.out.print("Hány kiló vagy? ");
        ember.kilogramm = sc.nextInt();
        int a;
        OUTER:
        do {
            System.out.println("Mit csinálsz?\n1 - iszol\n2 - pihensz\n3 - kilépsz");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    Ital ital = new Ital();
                    System.out.print("Mit iszol? ");
                    ital.nev = sc.next();
                    System.out.print("Hány százalékos alkoholtartalmú? ");
                    ital.szazalek = sc.nextDouble();
                    System.out.print("Mennyit iszol belőle? ");
                    ital.ml = sc.nextInt();
                    ember.megiszik(ital);
                    System.out.print(ember.nev + " véralkoholszintje: ");
                    System.out.printf("%.2f gramm, azaz %.2f ezrelék.\n",
                            ember.alkoholGramm, ember.veralkoholEzrelek());
                    break;
                case 2:
                    System.out.print("Mennyit pihensz? ");
                    ember.pihen(sc.nextDouble());
                    System.out.print(ember.nev + " véralkoholszintje: ");
                    System.out.printf("%.2f gramm, azaz %.2f ezrelék.\n",
                            ember.alkoholGramm, ember.veralkoholEzrelek());
                    break;
                case 3:
                    System.out.print(ember.nev + " véralkoholszintje: ");
                    System.out.printf("%.2f gramm, azaz %.2f ezrelék.\n",
                            ember.alkoholGramm, ember.veralkoholEzrelek());
                    break OUTER;
                default:
                    break;
            }
        } while (a != 3);

    }

    public static void emberInit(Scanner sc) {

    }

    public static void italInit(Scanner sc) {

    }

    static void valaszt(Scanner sc, int a) {
        System.out.println("Mit csinálsz?\n1 - iszol\n2 - pihensz\n3 - kilépsz");
        a = sc.nextInt();
    }

    public void kiir(Ember ember, Ital ital) {

    }
}
