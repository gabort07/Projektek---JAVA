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
public class Ital {
    String nev;
    double szazalek;
    int ml;
    
    double getAlkoholGramm() {
        return 0.8*ml*szazalek/100.0;
    }
}
