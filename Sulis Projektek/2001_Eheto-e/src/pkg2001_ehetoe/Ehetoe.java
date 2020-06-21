package pkg2001_ehetoe;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ehetoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a termék lejárati idejét (yyyy.MM.dd. formátumban)! ");
        Aru aru = new Aru();
        aru.setLejarat(aru.lejaratControll(sc.nextLine()));
        System.out.println("Kérem a termék felbontási idejét (yyyy.MM.dd. HH:mm formátumban, vagy egy \"-\" jelet, ha nincs még felbontva)!");
        aru.setFelbontas(aru.felbontasControll(sc.nextLine()));
        if (aru.eheto(LocalDateTime.now())) {
            System.out.println("Még ehető!");
        } else {
            System.out.println("Megromlott!");
        }
    }
}
