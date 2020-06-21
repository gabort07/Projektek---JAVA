/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korosztaly;
import java.util.Scanner;
/**
 *
 * @author gabor
 */
public class Korosztaly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány éves? ");
        int a = sc.nextInt();
        if (a < 0 || a > 130) {
        System.out.println("Hibás bevitel.");
        } else if (a <= 5) {
        System.out.println("A foglalkozás: gyerek.");
        } else if (a <= 18) {
        System.out.println("A foglalkozás: iskolás.");
        } else if (a < 65) {
        System.out.println("A foglalkozás: dolgozó.");
        } else {
        System.out.println("A foglalkozás: nyugdíjas.");
        }
    }    
}       

        
        

