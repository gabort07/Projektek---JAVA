/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alkoholkalkulator;

/**
 *
 * @author gabor
 */
public class Ember {

    String nev;
    int kilogramm;
    double alkoholGramm;

    void megiszik(Ital ital) {
        alkoholGramm+=ital.getAlkoholGramm();
    }

    void pihen(double ora) {  // mája 9 gramm/óra sebességgel bontja az alkoholt
        alkoholGramm -= 9 * ora;
        if(alkoholGramm <0){
            alkoholGramm=0;
        }
    }

    double veralkoholEzrelek() {  // alkoholGramm és kilogramm hányadosa
        return alkoholGramm / kilogramm;
    }

    double getJozanIdo() { // alkoholGramm alapján mennyit kell pihennie hogy 0 legyen
        return alkoholGramm/9;
    }
}
