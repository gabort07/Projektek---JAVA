/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diak;

import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Diak {

    private String nev;
    private int szuletesiEv;
    private double atlag;

    public Diak(String nev, int szulEv, double atlag){
        this.atlag=atlag;
        this.nev=nev;
        this.szuletesiEv=szulEv;
    }
    
    public void setNev(String nev){
        this.nev=nev;
    }
    
    public void setSzuletesiEv(int szulEv){
        this.szuletesiEv=szulEv;
    }
    
    public void setAtlag(double atlag) {
        this.atlag=atlag;
    }
    
    public String getNev(){
        return nev;
    }
    
    public double getAtlag(){
        return atlag;
    }
    
    public int getSzuletesiEv(){
        return szuletesiEv;
    }
    
    public Diak(){}

    public void beker() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a diák nevét!");
        this.nev = sc.nextLine();
        System.out.println("Kérem a diák születési évét!");
        this.szuletesiEv = sc.nextInt();
        System.out.println("Kérem a diák átlagát!");
        this.atlag = sc.nextDouble();
    }

    public void kiir() {
        System.out.println(nev+" ("+szuletesiEv+"; "+atlag+")");
        
    }
}
