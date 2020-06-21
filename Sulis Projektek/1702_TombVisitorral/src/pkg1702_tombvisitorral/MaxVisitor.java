package pkg1702_tombvisitorral;

/**
 *
 * @author gabesz
 */
public class MaxVisitor extends Visitor {

    private int max = Integer.MIN_VALUE;

    public void visiting(int elem) {
        if (elem > this.max) {
            this.max = elem;
        }
    }

    public int getMax() {
        return this.max;
    }

}
