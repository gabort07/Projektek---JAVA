/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1501;

/**
 *
 * @author gaborT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        InfosDiak diak = new InfosDiak();
//        diak.beker();
//        diak.kiir();
        
        Ember ember = new Ember("Gyula", 1888);
        ember.kiir();
        
        Tanar tanar = new Tanar("Márti", 1970, 4, 195000);
        tanar.kiir();
        tanar.fizetestKap();
        tanar.tanit();
    }
    
    
}
