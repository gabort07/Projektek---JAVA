/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamolo;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Szamolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String egyik = "Kérem az egyik számot: ";
    String masik = "Kérem a másik számot: ";
    String eR = "Az eredmény: ";
    System.out.print("1.) összeadás\n2.) kivonás\n3.) szorzás\n4.) osztás\nMelyik műveletet hajtsam végre? ");
    int a = sc.nextInt();
    switch (a) {
        case 1: System.out.print(egyik);
                int b = sc.nextInt();
                System.out.print(masik);
                int c = sc.nextInt();
                System.out.println(eR + (b + c));
                break;
        case 2: System.out.print(egyik);
                b = sc.nextInt();
                System.out.print(masik);
                c = sc.nextInt();
                System.out.println(eR + (b - c));
                break;
        case 3: System.out.print(egyik);
                b = sc.nextInt();
                System.out.print(masik);
                c = sc.nextInt();
                System.out.println(eR + (b * c));
                break;
        case 4: System.out.print(egyik);
                double d = sc.nextInt();
                System.out.print(masik);
                double e = sc.nextInt();
                if (e == 0) {
                System.out.println("Nullával való osztás.");
                } else {
                System.out.println(e + (d / e));
                }
                break;
        default: System.out.println("Hibás művelet.");
        break;
    }
    }
    
}
