package pkg1703_hapburgitelekom;

import java.util.Scanner;

/**
 *
 * @author gabesz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        PhoneNumber customer = PhoneNumber.create("888888");
//        int cost = customer.price(3, 4);
//        System.out.println("A hívás díja: " + cost + " tallér.");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a telefonszámot: ");
        String telSzam = sc.nextLine();
        PhoneNumber customer = PhoneNumber.create(telSzam);
        if (customer == null) {
            System.out.println("Helytelen telefonszám.");
            System.exit(0);
        }
        System.out.print("Kérem a hívás perceinek számát: ");
        int p = sc.nextInt();
        System.out.print("Kérem a hívás másodperceinek számát: ");
        int mp = sc.nextInt();
        if (customer.price(p, mp)==-1) {
            System.out.println("A megadott hívásidő hibás!");
            System.exit(0);
        }
        System.out.println("A hívás díja: "+customer.price(p, mp)+" tallér.");

    }

}
