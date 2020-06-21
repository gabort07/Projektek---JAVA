/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabor
 */
public class Idopont1 {

    int ora;
    int perc;
    int masodperc;

    public void kiir() {
        System.out.printf("%02d:%02d:%02d%n", ora, perc, masodperc);
    }

    void novel(int mp) {
        this.masodperc += mp;
        this.perc += this.masodperc / 60;
        this.masodperc %= 60;
        this.ora += this.perc / 60;
        this.perc %= 60;
        this.ora %= 24;
    }
}
