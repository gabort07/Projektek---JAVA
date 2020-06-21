package pkg1702_tombvisitorral;

/**
 *
 * @author gabesz
 */
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 5, 8, 7, 34, 23};
        
        Tomb tomb = new Tomb(t);
        tomb.setElem(0, 16);
        System.out.println(tomb.getElem(1)); /* 5 */

        KiirVisitor kiiro = new KiirVisitor();
        tomb.visit(kiiro); /* 16 5 8 7 34 23 */

        ParosOsszegVisitor parosOsszeg = new ParosOsszegVisitor();
        tomb.visit(parosOsszeg); /* semmi nem íródik ki */

        System.out.println(parosOsszeg.getOsszeg()); /* 58 */

    }

}
