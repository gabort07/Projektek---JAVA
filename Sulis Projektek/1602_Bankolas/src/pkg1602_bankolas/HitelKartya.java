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
public class HitelKartya extends BankKartya {

    private int hitelkeret;
    private static double HITELKAMAT;

    public HitelKartya(int egyenleg, int hitelkeret) {
        super(egyenleg);
        if (hitelkeret < 0) {
            hitelkeret = 0;
        } else {
            this.hitelkeret = hitelkeret;
        }
    }

    public boolean kivesz(int osszeg) {
        if (osszeg >= 0 && osszeg <= this.egyenleg + this.hitelkeret) {
            this.egyenleg -= osszeg;
            return true;
        } else {
            return false;
        }
    }

    public void betesz(int osszeg) {
        if (osszeg >= 0) {
            this.egyenleg += osszeg;
        }
    }

    public void kamatozik() {
        if (this.egyenleg >= 0) {
            super.kamatozik();
        }
        if (this.egyenleg < 0) {
            this.egyenleg += Math.round(this.egyenleg * HITELKAMAT / 100 / 12);
        }
    }

    public int getHitelkeret() {
        return hitelkeret;
    }

    public double getHITELKAMAT() {
        return HITELKAMAT;
    }

    public void setHitelkeret(int hitelkeret) {
        if (hitelkeret >= 0) {
            this.hitelkeret = hitelkeret;
        }
    }

    public static void setHITELKAMAT(double HITELKAMAT) {
        if (HITELKAMAT >= 0) {
            HitelKartya.HITELKAMAT = HITELKAMAT;
        }
    }

}
