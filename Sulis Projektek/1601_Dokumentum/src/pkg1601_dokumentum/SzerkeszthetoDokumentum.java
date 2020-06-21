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
public class SzerkeszthetoDokumentum extends Dokumentum {

    public SzerkeszthetoDokumentum() {
    }

    public SzerkeszthetoDokumentum(String szoveg) {
        super(szoveg);
    }

    public void beszur(int poz, String uj) {
        if (poz < this.szoveg.length() && poz >= 0 && uj != null) {
            if (poz == 0) {
                this.szoveg = uj + this.szoveg;
            } else {
                this.szoveg = this.szoveg.substring(0, poz) + uj + this.szoveg.substring(poz, this.szoveg.length());
            }
        }
    }

    public void torol(int poz, int len) {
        if (poz >= 0 && poz < this.szoveg.length() && len > 0 && len < this.szoveg.length()) {
            this.szoveg = szoveg.substring(0, poz) + szoveg.substring(poz + len, szoveg.length());
        }
    }

    public void cserel(int poz, int len, String uj) {
        if (poz >= 0 && poz < this.szoveg.length() && len >= 0 && len < this.szoveg.length() && uj != null) {
            this.torol(poz, len);
            this.beszur(poz, uj);
        }
    }

    public void hozzafuz(String uj) {
        if (uj != null) {
            this.szoveg = this.szoveg + uj;
        }
    }

    public void sorBeszur(int sorIndex, String ujSor) {
        if (this.szoveg == null || this.szoveg.isEmpty()) {
            this.szoveg = ujSor;
        }
        if (sorIndex == 0) {
            this.szoveg = ujSor + "\n" + this.szoveg;
        } else {
            this.szoveg = this.szoveg.substring(0, this.szoveg.indexOf("\n", sorIndex))
                    + ujSor
                    + this.szoveg.substring(this.szoveg.indexOf(this.szoveg.indexOf("\n", sorIndex)));
        }
    }

    public void sorTorol(int sorIndex) {
        if (sorIndex >= 0 && sorIndex < this.szoveg.lastIndexOf("\n")) {
            this.szoveg = this.szoveg.substring(0, this.szoveg.indexOf("\n", sorIndex))
                    + this.szoveg.substring(this.szoveg.indexOf("\n", sorIndex + 1));
        }
    }
}
