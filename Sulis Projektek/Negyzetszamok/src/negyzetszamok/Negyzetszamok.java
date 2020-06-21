/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzetszamok;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Negyzetszamok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bekert;
    int negyzetSzam;
    int szorzando = 1;
    System.out.print("Az első hány négyzetszámot írjam ki? ");
    bekert = sc.nextInt();
    while (szorzando <= bekert) {
        negyzetSzam = szorzando * szorzando;
        System.out.print(negyzetSzam +" ");
        szorzando++;
    }
    }
    
}
