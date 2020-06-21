/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogsi;
import java.util.Scanner;
/**
 *
 * @author gabor
 */
public class Jogsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjam meg az életkorát!");
        int kor = sc.nextInt();
        if (kor < 14) {
            System.out.println("Biciklit vezethet");
        } else if (kor < 17) {
            System.out.println("segédmotort vezethet");
        } else { 
            System.out.println("autot is vezethet");
        }
    }
    
}
