package pkg1801_tombesfeltetel;

/**
 *
 * @author gabesz
 */
public class NagyobbFeltetel extends Feltetel {

    private double hatar;

    public NagyobbFeltetel(double hatar) {
        this.hatar = hatar;
    }

    public boolean vizsgalat(double elem) {
        return elem > hatar;
    }
}
