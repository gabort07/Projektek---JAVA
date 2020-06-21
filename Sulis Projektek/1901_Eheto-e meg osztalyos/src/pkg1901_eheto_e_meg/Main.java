package pkg1901_eheto_e_meg;
import java.util.Scanner;
/**
 *
 * @author gabesz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Kérem a termék lejárati idejét (yyyy.MM.dd. formátumban)! ");
      Datumok.lejIdo = sc.next();
              
      System.out.println("Kérem a termék felbontási idejét (yyyy.MM.dd. HH:mm formátumban,"
              + " vagy egy \"-\" jelet, ha nincs még felbontva)! ");
      Datumok.felboIdo = sc.next();
        
    }

}
