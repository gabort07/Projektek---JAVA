/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1501;

import java.util.Scanner;

/**
 *
 * @author gaborT
 */
public class InfosDiak extends Diak {

    private String kedvencNyelv;

    public InfosDiak() {
    }

    public InfosDiak(String nev, int szuletesiEv, double atlga, String kedvencNyelv) {
        super(nev, szuletesiEv, atlga);
        this.kedvencNyelv = kedvencNyelv;
    }

    @Override
    public void kiir() {
        System.out.println(this.nev + " (" + this.szuletesiEv + "; " + this.atlag + "; "
                + this.kedvencNyelv + ")");
    }

    @Override
    public void beker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a nevet: ");
        this.nev=sc.nextLine();
        System.out.print("Kérem a születési évet: ");
        this.szuletesiEv=sc.nextInt();
        System.out.print("Kérem az átlagot: ");
        this.atlag=sc.nextDouble();
        System.out.print("Kérem a kedvenc programozási nyelvet: ");
        this.kedvencNyelv=sc.next();
    }

//    public String getKedvencNyelv() {
//        return kedvencNyelv;
//    }

//    public void setKedvencNyelv(String kedvencNyelv) {
//        this.kedvencNyelv = kedvencNyelv;
//    }
    
    public void windowstSzid(){
        System.out.println("Irgum-burgum, már megint lefagyott ez a ...");
    }
}
