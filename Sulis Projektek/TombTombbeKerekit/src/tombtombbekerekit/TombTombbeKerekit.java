/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombtombbekerekit;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class TombTombbeKerekit {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az összegek számát: ");
        int elemSzam = sc.nextInt();
        int[] array = new int[elemSzam];
        System.out.println("Kérem az összegeket:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        roundNew(array);

        System.out.println("Kerekítve:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
 public static final int SZORZO = 10;
    public static final int OSZTO=10;
    
    public static int round(int a) {
        double kerekSzam = 0;
        double tortSzam = (double) a / OSZTO;
        double b = a - (Math.floor(tortSzam) * SZORZO);
        if (b < 3) {
            kerekSzam = (Math.floor(tortSzam)) * SZORZO;
        } else if (b < 8) {
            kerekSzam = (Math.floor(tortSzam) * SZORZO) + 5;
        } else if (b > 7) {
            kerekSzam = (Math.ceil(tortSzam)) * SZORZO;
        }
        return (int) kerekSzam;
    }

    public static void roundSelf(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = round(numbers[i]);
        }
    }

    public static int[] roundNew(int[] numbers) {
        int[] numbersNew = numbers;
        for (int i = 0; i < numbersNew.length; i++) {
            numbersNew[i] = round(numbersNew[i]);
        }
        return numbersNew;
    }
}
