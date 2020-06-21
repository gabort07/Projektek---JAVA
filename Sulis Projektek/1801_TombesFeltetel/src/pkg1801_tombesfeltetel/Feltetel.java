package pkg1801_tombesfeltetel;

/**
 *
 * @author gabesz
 */
public abstract class Feltetel {

    public abstract boolean vizsgalat(double elem);

    public Feltetel tagadas() {
        return new TagadasFeltetel(this);
    }

    public Feltetel es(Feltetel jobb) {
        return new EsFeltetel(this, jobb);
    }

    public Feltetel vagy(Feltetel jobb) {
        return new VagyFeltetel(this, jobb);
    }

}
