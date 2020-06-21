package pkg1702_tombvisitorral;

/**
 *
 * @author gabesz
 */
public class Tomb {

    private int[] tomb;

    public Tomb(int[] tomb) {
        this.tomb = tomb;
    }

    public void setElem(int i, int elem) {
        this.tomb[i] = elem;
    }

    public int getElem(int i) {
        return this.tomb[i];
    }

    public void visit(Visitor v) {
        for(int elme : this.tomb){
            v.visiting(elme);
        }
    }

}
