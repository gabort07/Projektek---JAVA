/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1601_dokumentum;

/**
 *
 * @author gabesz
 */
public class Dokumentum {

    protected String szoveg;

    public Dokumentum() {

    }

    public Dokumentum(String szoveg) {
        if (szoveg == null) {
            this.szoveg = "";
        } else {
            this.szoveg = szoveg;
        }
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public int getHossz() {
        return this.szoveg.length();
    }

    public int getSorokSzama() {
        return this.szoveg.split("\n").length;
    }

    public String getSor(int sorIndex) {
        if (sorIndex >= 0 && sorIndex < this.szoveg.split("\n").length) {
            return this.szoveg.split("\n")[sorIndex];
        } else {
            return null;
        }
    }

    public SzerkeszthetoDokumentum szerkeszthetoValtozat() {
        return new SzerkeszthetoDokumentum(szoveg);

    }

}
