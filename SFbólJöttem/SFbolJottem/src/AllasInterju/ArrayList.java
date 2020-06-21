package AllasInterju;

/**
 *
 * @author gabi
 */
public class ArrayList {

    /**
     * Csak az előre megadott adattípust tudja tárolni Dinamikus tároló, törlés
     * esetén a következő lesz az aktuális Nem mindig ez a gyorsabb de sok
     * esetben Nem tud tárolni primitíveket
     */
    public static void main(String[] args) {

        String[] simpleArray = new String[2];
        simpleArray[0] = "alma";
        simpleArray[1] = "körte";
        int a = simpleArray.length;

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(2);
        //int b = list.size();
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("alma");
//        list.add("körte");
//        list.get(0);
//        list.indexOf("alma");
//        
//        list.remove(0);
    }

}
