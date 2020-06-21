/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miazn;
import java.util.Scanner;
/**
 *
 * @author gabor
 */
public class Miazn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 2; i < n-1; i++) {
    if (n % i != 0) {
    continue;
 }
 System.out.print(i+" ");
}
}
}
    


