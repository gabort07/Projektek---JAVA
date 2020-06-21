
package elsoprojekt;

import java.util.ArrayList;

/**
 *
 * @author gabi
 */
public class ElsoProjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ArrayList<Cat> cats =  new ArrayList<Cat>();
        Cat sziamiau = new Cat("Sziamiau");
        cats.add(sziamiau);


            System.out.println(cats.get(0).getName());

    }

}
