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
public class Kutya extends HaziAllat {

    private int elkergetettPostas;

    public Kutya() {
    }

    public Kutya(String nev, int kor, int postas) {
        super(nev, kor);
        this.elkergetettPostas = postas;
    }

    public void megol(Allat preda) {
        System.out.println("A(z) " + this.bemutatkozas() + " megölte " + preda.bemutatkozas() + "-t");
    }

    public String hang() {
        return "Vau";
    }

    public String bemutatkozas() {
        return this.getNev() + " kutya (" + this.getKor() + " éves, " + this.getElkergetettPostas() + " elkergetett postás)";
    }

    public int getElkergetettPostas() {
        return elkergetettPostas;
    }

    public void setElkergetettPostas(int elkergetettPostas) {
        this.elkergetettPostas = elkergetettPostas;
    }

}
