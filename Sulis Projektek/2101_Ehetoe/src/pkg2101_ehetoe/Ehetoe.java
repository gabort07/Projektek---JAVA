package pkg2101_ehetoe;

import java.util.Scanner;

public class Ehetoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a termék lejárati idejét (yyyy.MM.dd. formátumban)! ");
        Aru.TermekFactory factory = new Aru.TermekFactory(sc.next());
        System.out.println("Kérem a termék felbontási idejét (yyyy.MM.dd. HH:mm formátumban, "
                + "vagy egy \"-\" jelet, ha nincs még felbontva)!");
        factory.setFelbontas(sc.next());
        factory.creat().prinntEhetoE();
    }
}
