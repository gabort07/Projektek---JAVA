/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketjegyukilep;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Ketjegyukilep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bekert;
    System.out.println("Írj be számokat! Ha kétjegyű, kilép!");
    bekert = sc.nextInt();
    while (bekert < 10 && bekert > -10 || bekert < -99 || bekert > 99) {
        System.out.println("jó szám");
        bekert = sc.nextInt();
    }
    }
    
}
