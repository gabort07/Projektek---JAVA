package pkg1801_tombesfeltetel;

import java.util.ArrayList;
import java.util.function.Predicate;
import pkg1801_tombesfeltetel.Feltetel;

/**
 *
 * @author gabesz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] elemek = {5.0, 10.0, 15.0, 20.0, 22.0, 25.0, 55.0};
        Tomb t = new Tomb(elemek);

        Feltetel f1 = Feltetelek.getNagyobb10EsKisebbEgyenlo50Feltetel();
        Feltetel f2 = Feltetelek.getNagyobb10EsParatlanFeltetel();
        Feltetel f3 = Feltetelek.getNagyobb20VagyParosFeltetel();

        System.out.println("Számok, amik nagyobbak, mint 10 és kisebbek, (vagy egyenlőek), mint 50");
        t.kivalogat(f1);

        System.out.println("");

        System.out.println("Számok, amik nagyobbak, mint 10 és páratlanok");
        t.kivalogat(f2);

        System.out.println("");

        System.out.println("Számok, amik nagyobbak, mint 20 vagy párosak");
        t.kivalogat(f3);

        System.out.println("");

        if (t.mindIlyen(f3)) {
            System.out.println("Minden szám nagyobb, mint 20 vagy páros");
        } else {
            System.out.println("Nem igaz, hogy minden szám nagyobb, mint 20 vagy páros");
        }

        System.out.println("");

        if (t.vanIlyen(f2)) {
            System.out.println("Van olyan szám, ami nagyobb, mint 10 és páratlan");
        } else {
            System.out.println("Nincs olyan szám, ami nagyobb, mint 10 és páratlan");
        }

        System.out.println("Az első 10-nél nagyobb és 50, vagy annál kisebb szám, a(z) " + t.elsoIlyen(f1) + ". indexű elem");
        System.out.println("Az utolsó 10-nél nagyobb és 50, vagy annál kisebb szám, a(z) " + t.utolsoIlyen(f1) + ". indexű elem");

    }

}
