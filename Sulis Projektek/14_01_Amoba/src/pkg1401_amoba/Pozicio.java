/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1401_amoba;

/**
 *
 * @author Dániel
 */
public class Pozicio {

    private int sor;
    private int oszlop;

    public Pozicio() {
    }

    public Pozicio(int sor, int oszlop) {
        this.sor = sor;
        this.oszlop = oszlop;
    }

    public int getSor() {
        return sor;
    }

    public int getOszlop() {
        return oszlop;
    }
}
