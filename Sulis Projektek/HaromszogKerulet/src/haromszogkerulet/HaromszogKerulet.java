/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haromszogkerulet;
import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class HaromszogKerulet {
    public static double circumference(double a, double b, double c) {
        return (a + b + c);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a háromszög \"a\" oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Kérem a háromszög \"b\" oldalát: ");
        double b = sc.nextDouble();
        System.out.print("Kérem a háromszög \"c\" oldalát: ");
        double c = sc.nextDouble();
        double kerulet = circumference(a, b, c);
        System.out.print("A háromszög kerülete: " + kerulet);
    }
}
