package pkg1702_tombvisitorral;

/**
 *
 * @author gabesz
 */
public class ParosOsszegVisitor extends Visitor {

    private int osszeg;

    public void visiting(int elem) {
        if (elem % 2 == 0) {
            this.osszeg += elem;
        }
    }

    public int getOsszeg() {
        return this.osszeg;

    }

}
