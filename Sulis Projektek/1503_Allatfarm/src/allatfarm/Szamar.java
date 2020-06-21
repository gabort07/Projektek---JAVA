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
public class Szamar extends HaziAllat {

    private boolean makacs;

    public Szamar() {
    }

    public Szamar(String nev, int kor, boolean makacs) {
        super(nev, kor);
        this.makacs = makacs;
    }

    public void kocsitHuz() {
        int random = (int) (Math.random() * 10 + 1);
        if (!this.makacs) {
            System.out.println("Kocsit húz.");
        } else {
            if (random % 2 == 0) {
                System.out.println("Megmakacsolta magát.");
            } else {
                System.out.println("Kocsit húz.");
            }
        }
    }
    

    public String hang() {
        return "Iá";
    }

    public String bemutatkozas() {
        return this.getNev() + ", a(z) " + this.getKor() + " éves" + (this.isMakacs() ? "" : " nem") + " makacs szamár";
    }

    public boolean isMakacs() {
        return makacs;
    }

    public void setMakacs(boolean makacs) {
        this.makacs = makacs;
    }

}
