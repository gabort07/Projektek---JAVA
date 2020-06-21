package pkg1801_tombesfeltetel;

/**
 *
 * @author gabesz
 */
public class EgyenloFeltetel extends Feltetel {

    private double mivel;

    public EgyenloFeltetel(double mivel) {
        this.mivel = mivel;
    }

    public boolean vizsgalat(double elem) {
        return elem == mivel;
    }

}
