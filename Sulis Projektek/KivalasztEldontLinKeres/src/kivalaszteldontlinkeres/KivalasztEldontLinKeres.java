/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalaszteldontlinkeres;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class KivalasztEldontLinKeres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hány elem van összesen?");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("Kérem a keresett számot:");
        int key = sc.nextInt();
        int i = 0;
        int position = -1;
        System.out.println("Kérem az első számot:");
        int number = sc.nextInt();
        for (i = 1; i < count && key != number; i++) {            //*kiválasztás esetén a i < count nem kell, mert tudjuk, hogy
                                                                  // benne van az elem a sorozatban, ezért mindig ki fogunk lépni akkor,
                                                                  // h megvan, nem érünk sosem találat nélkül a sorozat végére 
            System.out.println("Kérem a következő számot:");
            number = sc.nextInt();
        }
        if (key == number) {
            position = i;
        }
        boolean contains = (position != -1);
        System.out.println("Az elem benne van-e a sorozatban (eldöntés): " + contains);
        System.out.println("A keresett elem helye (kiválasztás, lineáris keresés): " + position);
    }

}
