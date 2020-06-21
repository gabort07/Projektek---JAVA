package pkg1801_tombesfeltetel;

/**
 *
 * @author gabesz
 */
public class TagadasFeltetel extends Feltetel {

    private Feltetel pozitiv;

    public TagadasFeltetel(Feltetel pozitiv) {
        this.pozitiv = pozitiv;
    }

    public boolean vizsgalat(double elem) {
        return !pozitiv.vizsgalat(elem);
    }

}
