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
public class BankKartya {

    protected int egyenleg;
    private static double KAMAT;

    public BankKartya(int egyenleg) {
        if (egyenleg > 0) {
            this.egyenleg = egyenleg;
        }
    }

    public boolean kivesz(int osszeg) {
        if (osszeg <= this.egyenleg && osszeg >= 0) {
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
        this.egyenleg += Math.round(this.egyenleg * KAMAT / 100 / 12);
    }

    public int getEgyenleg() {
        return egyenleg;
    }

    public double getKAMAT() {
        return KAMAT;
    }

    public void setEgyenleg(int egyenleg) {
        if (egyenleg > 0) {
            this.egyenleg = egyenleg;
        }
    }

    public static void setKAMAT(double KAMAT) {
        if (KAMAT >= 0) {
            BankKartya.KAMAT = KAMAT;
        }
    }

}
