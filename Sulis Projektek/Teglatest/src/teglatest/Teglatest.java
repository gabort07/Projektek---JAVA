/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teglatest;

/**
 *
 * @author gabor
 */
public class Teglatest {

    private double a;
    private double b;
    private double c;

    public double terfogat() {
        return this.a * this.b * this.c;
    }

    public double felszin() {
        return 2 * (this.a * this.b + this.b * this.c + this.a * this.c);
    }

    public Teglatest(double a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public Teglatest(double a, double c) {
        this.a = a;
        this.b = a;
        this.c = c;
    }

    public Teglatest(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

}
