/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1602_bankolas;

/**
 *
 * @author gabesz
 */
public class Ugyfel {

    private String nev;
    private int fizetes;

    public Ugyfel(String nev, int fizetes) {
        this.nev = nev;
        if (fizetes < 0) {
            this.fizetes = 0;
        } else {
            this.fizetes = fizetes;
        }
    }

    public String getNev() {
        return nev;
    }

    public int getFizetes() {
        return fizetes;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setFizetes(int fizetes) {
        if (fizetes < 0) {
            this.fizetes = 0;
        } else {
            this.fizetes = fizetes;
        }
    }

}
