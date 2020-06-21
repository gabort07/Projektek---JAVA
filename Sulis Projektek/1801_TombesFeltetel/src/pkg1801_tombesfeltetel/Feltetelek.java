package pkg1801_tombesfeltetel;

/**
 *
 * @author gabesz
 */
public class Feltetelek {

    public static Feltetel getNagyobb10EsKisebbEgyenlo50Feltetel() {
        return new NagyobbFeltetel(10).es(new NagyobbFeltetel(50).tagadas());
        // nagyobb mint 10 és nem nagyobb mint 50
    }

    public static Feltetel getNagyobb10EsParatlanFeltetel() {
        return new NagyobbFeltetel(10).es(new ParosFeltetel().tagadas());
    }

    public static Feltetel getNagyobb20VagyParosFeltetel() {
        return new NagyobbFeltetel(20).vagy(new ParosFeltetel());
    }

}
