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
public class Allatfarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Allat[] allatkert = new Allat[3];
        allatkert[0] = new Tigris(3);
        allatkert[1] = new Kutya("Blöki", 3, 12);
        allatkert[2] = new Szamar("Samantha", 1, false);
        for (Allat a : allatkert) {
            System.out.println(a.bemutatkozas());
            System.out.println(a.hang());
        }
        
        HaziAllat[] haziak = new HaziAllat[2];
        haziak[0] = (HaziAllat) allatkert[1];
        haziak[1] = (HaziAllat) allatkert[2];
        for (HaziAllat h : haziak) {
            System.out.println(h.getNev());
        }
        
        Tigris tigrincs = new Tigris(5);
        tigrincs.megol(allatkert[0]);
        tigrincs.megol(allatkert[1]);
        tigrincs.megol(allatkert[2]);
    }

}
