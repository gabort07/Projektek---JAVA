/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeromain;

/**
 *
 * @author gaborT
 */
public class HomeroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Homero fagyas = Homero.fagypont();
        Homero forras = Homero.forraspont();
        Homero ho = new Homero(42);
        System.out.println(ho.getCelsius()); // 42.0
        System.out.println(fagyas.getFahrenheit()); // 32.0
        System.out.println(forras.getFahrenheit()); // 212.0
        Homero.FORRASPONT = 150;
        System.out.println(forras.getFahrenheit()); // 212.0
        Homero forras2 = Homero.forraspont();
        System.out.println(forras2.getFahrenheit()); // 302.0
        System.out.println(forras2.getCelsius()); // 150.0

    }

}
 