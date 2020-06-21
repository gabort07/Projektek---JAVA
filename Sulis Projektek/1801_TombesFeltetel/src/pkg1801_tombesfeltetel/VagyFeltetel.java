package pkg1801_tombesfeltetel;

/**
 *
 * @author gabesz
 */
public class VagyFeltetel extends Feltetel {

    private Feltetel egyik;
    private Feltetel masik;

    public VagyFeltetel(Feltetel egyik, Feltetel masik) {
        this.egyik = egyik;
        this.masik = masik;
    }

    public boolean vizsgalat(double elem) {
        return egyik.vizsgalat(elem) || masik.vizsgalat(elem);
    }

}
