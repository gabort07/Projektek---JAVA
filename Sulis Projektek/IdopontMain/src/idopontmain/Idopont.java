/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idopontmain;

/**
 *
 * @author gabor
 */
public class Idopont {

    int ora;
    int perc;
    int masodperc;

    void kiir() {
        System.out.printf("%02d:%02d:%02d", this.ora, this.perc, this.masodperc);
        System.out.println();
    }

    void novel(int mp) {
        int plusPerc = 0;
        int plusOra = 0;
        int ujOra;
        int ujPerc;
        int ujMp = this.masodperc + mp;
        if (ujMp < 60) {
            this.masodperc = ujMp;
        } else if (ujMp == 60) {
            plusPerc++;
            this.masodperc = 0;
        } else if (ujMp > 60) {
            while (ujMp >= 60) {
                ujMp = ujMp - 60;
                plusPerc++;
                if (ujMp < 60) {
                    this.masodperc = ujMp;
                }
            }
            this.masodperc = ujMp;
        }
        ujPerc = this.perc + plusPerc;
        if (ujPerc == 60) {
            plusOra++;
            this.perc = 0;
        } else if (ujPerc > 60) {
            while (ujPerc >= 60) {
                ujPerc = ujPerc - 60;
                plusOra++;
                if (ujPerc < 60) {
                    this.perc = ujPerc;
                }
            }
        } else {
            this.perc = ujPerc;
        }
        ujOra = this.ora + plusOra;
        if (ujOra == 24) {
            this.ora = 0;
        } else if (ujOra > 24) {
            this.ora = plusOra-1;
        } else {
            this.ora = ujOra;
        }
    }
}
