package pkg1901_eheto_e_meg;

/**
 *
 * @author gabesz
 */
public abstract class Datumok {

    public static final int TUR_ID = 10; //**Türelmi idő lejárat után**//

    public static String lejIdo; //** Lejárati idő
    public static String felboIdo; //** Felbontási idő

    public static Datumok create(String lejIdo, String felboIdo) {
        if (felboIdo == "-") {
            return new CsakLejarat();
        }

        return new LejaratEsNyitas();

    }

}
