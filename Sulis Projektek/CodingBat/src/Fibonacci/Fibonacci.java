/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fibonacci;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A Fibonacci-számsorozatot meddig írjam ki? ");
        fiboPrint(0, 1, sc.nextInt());
    }

    public static void fiboPrint(int n1, int n2, int index) {
        int fibNumber = n1 + n2;
        if (fibNumber < index) {
            System.out.print(fibNumber + " ");
            fiboPrint(n2, fibNumber, index);
        }
    }
}
