/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_02_lampa;

/**
 *
 * @author Dániel
 */
public class Lampa {

    private boolean piros = true;
    private boolean sarga = false;
    private boolean zold = false;

    public void kovetkezo() {
        if (!piros && sarga && !zold) {
            piros = true;
            sarga = false;
            return;
        }
        
        if (!piros && !sarga && zold) {
            sarga = true;
            zold = !zold;
        }

        if (piros && sarga && !zold) {
            piros = !piros;
            sarga = !sarga;
            zold = true;
        }
        
        if (piros && !sarga && !zold) {
            sarga = true;
        }

    }

    public boolean isPiros() {
        return piros;
    }

    public boolean isSarga() {
        return sarga;
    }

    public boolean isZold() {
        return zold;
    }

}
