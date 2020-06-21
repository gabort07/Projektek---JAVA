package pkg14_03_idopont;

/**
 *
 * @author Pasztuhov Dániel
 */
public class Idopont {

    private int ora;
    private int perc;
    private int masodperc;

    public Idopont() {
    }

    public Idopont(int ora, int perc, int mp) {
        this.ora = ora;
        this.perc = perc;
        this.masodperc = mp;
        atvalt();
    }

    public void novelMp() {
        masodperc++;
        atvalt();
    }

    public void novelPerc() {
        perc++;
        atvalt();
    }

    public void novelOra() {
        ora++;
        atvalt();
    }

    private void atvalt() {
        while (masodperc >= 60) {
            perc++;
            masodperc -= 60;
        }

        while (perc >= 60) {
            ora++;
            perc -= 60;
        }

        while (ora >= 24) {
            ora -= 24;
        }
        
        while (masodperc < 0) {
            perc--;
            masodperc += 60;
        }

        while (perc < 0) {
            ora--;
            perc += 60;
        }

        while (ora < 0) {
            ora += 24;
        }

    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
        atvalt();
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
        atvalt();
    }

    public int getMasodperc() {
        return masodperc;
    }

    public void setMasodperc(int masodperc) {
        this.masodperc = masodperc;
        atvalt();
    }

}
