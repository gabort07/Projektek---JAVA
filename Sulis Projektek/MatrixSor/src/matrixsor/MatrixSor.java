/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixsor;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class MatrixSor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bekert;
        int matrix[][] = {
            {1, 4, 7, 5, 3},
            {3, 7, 9, 10, 1},
            {4, -3, 2, -4, 1},
            {5, 9, 6, 4, 3},
            {1, 2, 3, 4, 5},};
        do {
            System.out.print("Melyik sorát szeretnéd kiíratni (0-4)? ");
            bekert = sc.nextInt();
            if (bekert < 0 || bekert > 4) {
                System.out.println("Nem jó index.");
            }
        } while (bekert < 0 || bekert > 4);

        System.out.print("A mátrix " + bekert + ". indexű sora:");
        for (int sor : matrix[bekert]) {
            System.out.print(" " + sor);
        }
    }
}
