/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1501;

/**
 *
 * @author gaborT
 */
public class Ember {

    protected String nev;
    protected int szuletesiEv;
    
    public Ember(){}
    
    public Ember(String nev, int szulEv) {
        this.nev = nev;
        this.szuletesiEv = szulEv;
    }

    public int getSzulEv() {
        return this.szuletesiEv;
    }

    public String getNev() {
        return this.nev;
    }

    public void kiir() {
        System.out.println(this.nev+" ("+this.szuletesiEv+")");

    }

//    public void setNev(String nev) {
//        this.nev = nev;
//    }
//
//    public void setSzulEv(int szuletesiEv) {
//        this.szuletesiEv = szuletesiEv;
//    }
 
}
