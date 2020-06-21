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
public class Tigris extends Allat {

    public Tigris() {
    }

    public Tigris(int kor) {
        super(kor);
    }

    public void megol(Allat preda) {
        System.out.println("A(z) " + this.bemutatkozas() + " megölte " + preda.bemutatkozas() + "-t");
    }

    public String hang() {
        return "Grrr";
    }

    public String bemutatkozas() {
        return this.getKor() + " éves tigris";
    }

}
