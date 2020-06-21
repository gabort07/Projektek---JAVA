/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszeado;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Osszeado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első számot!");
        float egyik = sc.nextFloat();
        System.out.println("Kérem a második számot!");
        float masik = sc.nextFloat();
        float eredmeny;
        System.out.print("Az eredmény: "); 
        System.out.println(egyik + masik);
        System.out.println("Edina love Gábor");
    }
    
}
