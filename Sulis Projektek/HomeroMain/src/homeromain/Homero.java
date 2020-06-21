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
public class Homero {

    public static double FORRASPONT = 100;
    public static double FAGYASPONT = 0;
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public double getFahrenheit() {
        return this.celsius * 9 / 5 + 32;
    }

    public void setFahrenheit(double fahr) {
        this.celsius = (fahr - 32) * 5 / 9;
    }

    public Homero(double ho) {
        this.celsius = ho;
    }

    public static Homero fagypont() {
        return new Homero(Homero.FAGYASPONT);
    }

    public static Homero forraspont() {
        return new Homero(Homero.FORRASPONT);
    }

}
