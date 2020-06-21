/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Ado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Bevétel: ");
    float bevetel = sc.nextFloat();
    System.out.print("Kiadás: ");
    float kiadas = sc.nextFloat();
    float nyereseg = bevetel - kiadas;
    System.out.printf("Iparűzési adó: %.0f Ft%n", bevetel * 0.02);
    System.out.printf("Nyereség: %.0f Ft%n", nyereseg);
    System.out.printf("ÁFA: %.0f Ft%n", nyereseg * 0.2);
    System.out.printf("Nettó nyereség: %.0f Ft%n", nyereseg - nyereseg * 0.2);
    System.out.printf("Társasági adó: %.0f Ft%n", (nyereseg - nyereseg *0.2) * 0.15);
    
    }
    
}
