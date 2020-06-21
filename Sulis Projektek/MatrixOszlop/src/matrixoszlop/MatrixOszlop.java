/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoszlop;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class MatrixOszlop {

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
            System.out.print("Melyik oszlopát szeretnéd kiíratni (0-4)? ");
            bekert = sc.nextInt();
            if (bekert < 0 || bekert > 4) {
                System.out.println("Nem jó index.");
            }
        } while (bekert < 0 || bekert > 4);
        System.out.println("A mátrix " + bekert + ". indexű oszlopa:");
        for (int sor = 0; sor < matrix.length; sor++) {
            System.out.println(matrix[sor][bekert]);
        }
    }
}
