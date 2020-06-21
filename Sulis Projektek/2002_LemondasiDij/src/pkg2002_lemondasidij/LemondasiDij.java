package pkg2002_lemondasidij;

import java.time.LocalDateTime;
import java.util.Scanner;

public class LemondasiDij {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem az érkezés napját (yyyy.MM.dd. formátumban)! ");
        Szallas szallo = new Szallas();
        szallo.setErkezes(szallo.inputControll(sc.next()));
        System.out.printf("%d%% jár vissza.", szallo.getVisszajaroSzazalek(LocalDateTime.now()));

    }

}
