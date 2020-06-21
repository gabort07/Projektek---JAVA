/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatfarm;

/**
 *
 * @author gabesz
 */
public abstract class HaziAllat extends Allat {

    protected String nev;

    public HaziAllat() {
    }

    public HaziAllat(String nev, int kor) {
        super(kor);
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

}
