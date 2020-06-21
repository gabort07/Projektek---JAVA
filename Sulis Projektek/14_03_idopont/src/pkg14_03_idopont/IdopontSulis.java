public class Idopont1 {
	private int ora;
	private int perc;
	private int masodperc;
	
	public Idopont1() {}
	
	public Idopont1(int ora, int perc, int masodperc) {
		this.ora = ora;
		this.perc = perc;
		this.masodperc = masodperc;
		atvalt();
	}
	
	public void novelOra() {
		ora++;
		atvalt();
	}
	public void novelPerc() {
		perc++;
		atvalt();
	}
	public void novelMp() {
		masodperc++;
		atvalt();
	}
	
	private void atvalt() {
		if (masodperc < 0) {
            perc -= (masodperc / 60 + 1);
            masodperc = masodperc % 60 + 60;
        }
        if (perc < 0) {
            ora -= (perc / 60 + 1);
            perc = perc % 60 + 60;
        }
        if (ora < 0) {
            ora = ora % 24 + 24;
        }		
        if (masodperc >= 60) {
            perc+= masodperc / 60;
            masodperc = masodperc % 60;
        }
        if (perc >= 60) {
            ora += perc / 60;
            perc = perc % 60;
        }
		if (ora >= 24) {
            ora %= 24;
        }
	}
	
	public void setOra(int ora) {
		this.ora = ora;
		atvalt();
	}
	public int getOra() {
		return this.ora;
	}
	public void setPerc(int perc) {
		this.perc = perc;
		atvalt();
	}
	public int getPerc() {
		return perc;
	}
	public void setMasodperc(int mp) {
		this.masodperc = mp;
		atvalt();
	}
	public int getMasodperc() { 
		return masodperc;
	}
	
}