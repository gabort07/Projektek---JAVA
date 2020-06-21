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
public class Tanar extends Ember {

    protected int tanitottOsztalyok;
    protected int fizetes;

    public Tanar() {
    }

    public Tanar(String nev, int szulEv, int tanOsztalyok, int fizetes) {
        super(nev, szulEv);
        this.tanitottOsztalyok = tanOsztalyok;
        this.fizetes = fizetes;
    }

    public void setNev(String nev) {
        super.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setSzuletesiEv(int szulEv) {
        super.szuletesiEv = szulEv;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public void setTanitottOsztalyok(int tanitottOsztalyok) {
        this.tanitottOsztalyok = tanitottOsztalyok;
    }

    public int getTanitottOsztalyok() {
        return tanitottOsztalyok;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }

    public int getFizetes() {
        return fizetes;
    }

    public void fizetestKap() {
        System.out.println("Ma megkaptam a fizetésem, " + this.getFizetes() + " Ft-ot!");
    }

    public void tanit() {
        System.out.println("Tanítom az egyik osztályomat. Összesen " + this.getTanitottOsztalyok() + " osztályom van.");
    }

    public void kiir() {
        System.out.println(this.nev + " (" + this.szuletesiEv + "; " + this.tanitottOsztalyok + " osztály; " + this.fizetes + " Ft)");
    }

}
