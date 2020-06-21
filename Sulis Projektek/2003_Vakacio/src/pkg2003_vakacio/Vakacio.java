package pkg2003_vakacio;

import java.time.LocalDate;
import java.util.Scanner;

public class Vakacio {

    static final LocalDate NOW = LocalDate.now();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iskola oktatasiNapok = new Iskola();

        System.out.print("Melyik a nyári vakáció első napja? (yyyy.MM.dd. formátumban) ");
        oktatasiNapok.setVakacioElsoNapja(oktatasiNapok.stringToDate(sc.next()));

        System.out.println("Évközi szünetek felvitele:");
        LocalDate kezd;
        LocalDate vege;
        do {
            System.out.print("Melyik az évközbeni szünet első napja?"
                    + " (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");

            kezd = oktatasiNapok.stringToDate(sc.next());

            if (kezd == null) {
                break;
            } else if (kezd.isBefore(NOW)) {
                kezd = NOW;
            }
            System.out.print("Melyik az évközbeni szünet utolsó napja?"
                    + " (yyyy.MM.dd. formátumban) ");

            vege = oktatasiNapok.stringToDate(sc.next());
            if (vege.isBefore(NOW)) {
                break;
            } else {
                oktatasiNapok.addSzunet(kezd, vege);
            }

        } while (kezd != null);

        System.out.println("Munkanap áthelyezések:");
        LocalDate szunet;
        LocalDate ledolgoz;

        do {
            System.out.print("Melyik munkanap lesz szünet? "
                    + "(yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");

            szunet = oktatasiNapok.stringToDate(sc.next());

            if (szunet != null) {
                System.out.print("Melyik szünnapon kell cserébe dolgozni?"
                        + " (yyyy.MM.dd. formátumban) ");
                ledolgoz = oktatasiNapok.stringToDate(sc.next());

            } else {
                break;
            }

            oktatasiNapok.athelyezMunkanap(szunet, ledolgoz);

        } while (szunet != null);

        System.out.printf("Hátralévő iskolai napok száma a mai nappal együtt: %d",
                oktatasiNapok.getOktatasiNapok(LocalDate.now()));
    }

}
