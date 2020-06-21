/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmaxindex;
import java.util.Scanner;
/**
 *
 * @author gaborT
 */
public class TombMaxIndex {
    public static int maxIndex(double[] array) {
        int a = 0;
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                a = i;
            }
        }
        return a;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a tömb elemszámát: ");
        int elemSzam = sc.nextInt();
        System.out.print("Kérem a tömb elemeit: ");
        double[] fuggveny = new double[elemSzam];
        for (int i = 0; i < fuggveny.length; i++) {
            fuggveny[i] = sc.nextDouble();
        }
        System.out.print("A tömb legnagyobb elemének indexe: " + maxIndex(fuggveny));
    }
}
