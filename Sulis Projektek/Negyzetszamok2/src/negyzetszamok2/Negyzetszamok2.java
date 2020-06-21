/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzetszamok2;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Negyzetszamok2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bekert;
    int negyzetSzam = 1;
    int szorzando = 1;
    System.out.print("Kérem a négyzetszámok határszámát! ");
    bekert = sc.nextInt();
    while (bekert > 0 && bekert >= negyzetSzam) {
        szorzando++;
        System.out.print(negyzetSzam +" ");
        negyzetSzam = szorzando * szorzando;
    }
    }
}