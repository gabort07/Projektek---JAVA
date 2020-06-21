package Diak;



import java.util.Scanner;

public class DiakString {

    private String nev;
    private int szuletesiEv;
    private double atlag;

    public DiakString(String nev, int szulEv, double atlag) {
        this.atlag = atlag;
        this.nev = nev;
        this.szuletesiEv = szulEv;
    }

    public DiakString(String vezetekNev, String[] keresztNevek, int szulEv, double atlag) {
        this.nev=vezetekNev;
        for(String vNevek : keresztNevek){
            this.nev +=" "+vNevek;
        }
        this.atlag = atlag;
        this.szuletesiEv = szulEv;

    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setSzuletesiEv(int szulEv) {
        this.szuletesiEv = szulEv;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public String getNev() {
        return nev;
    }

    public double getAtlag() {
        return atlag;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public String getVezetekNev() {
        return nev.substring(0, nev.indexOf(" "));
    }

    public String[] getKeresztNevek() {
        String[] nevei = nev.split(" ");
        String[] keresztNevek=new String[nevei.length-1];
        System.arraycopy(nevei, 1, keresztNevek, 0, nevei.length - 1);
        return keresztNevek;
    }
    
    

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
