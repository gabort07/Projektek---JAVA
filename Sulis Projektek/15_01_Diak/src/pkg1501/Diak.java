/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1501;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class Diak extends Ember {

    protected String nev;
    protected int szuletesiEv;
    protected double atlag;

    public Diak() {
    }

    public Diak(String nev, int szulEv, double atlag) {
        this.nev = nev;
        this.szuletesiEv = szulEv;
        this.atlag = atlag;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setSzuletesiEv(int szuletesiEv) {
        this.szuletesiEv = szuletesiEv;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public String getNev() {
        return nev;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public double getAtlag() {
        return atlag;
    }

    public void kiir() {
        System.out.println(this.getNev() + " (" + this.getSzuletesiEv() + "; " + this.getAtlag() + ")");
    }

    public void hazitKeszit() {
        System.out.println("Fogom a kedvenc szövegszerkesztőmet, és megírom, majd elküldöm e - mailben.");
    }

    public void beker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a nevet: ");
        this.setNev(sc.nextLine());
        System.out.print("Kérem a születési évet: ");
        this.setSzuletesiEv(sc.nextInt());
        System.out.print("Kérem az átlagot: ");
        this.setAtlag(sc.nextDouble());
    }
}
