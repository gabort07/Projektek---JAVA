package pkg1901_eheto.e;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Ehetoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem a termék lejárati idejét (yyyy.MM.dd. formátumban)! ");

        TermekFactory factory = new TermekFactory(sc.nextLine());

        System.out.println("Kérem a termék felbontási idejét (yyyy.MM.dd. HH:mm formátumban,"
                + " vagy egy \"-\" jelet, ha nincs még felbontva)!");

        factory.setFelbontas(sc.nextLine());
        factory.create().printEhetoE();
    }

    interface Termek {

        boolean ehetoE();

        default void printEhetoE() {
            if (ehetoE()) {
                System.out.println("Még ehető!");
            } else {
                System.out.println("Megromlott!");
            }
        }
    }

    static class FelbontatlanTermek implements Termek {

        Calendar lejarat;

        FelbontatlanTermek(Calendar lejarat) {
            this.lejarat = lejarat;
        }

        @Override
        public boolean ehetoE() {
            return lejarat.after(Calendar.getInstance());
        }
    }

    static class FelbontottTermek extends FelbontatlanTermek {

        Calendar felbontas;

        FelbontottTermek(Calendar lejarat, Calendar felbontas) {
            super(lejarat);
            this.felbontas = felbontas;
        }

        @Override
        public boolean ehetoE() {
            if (lejarat.compareTo(felbontas) < 0) {
                return false;
            } else {
                // Nyitás + 72 óra < now()
                Calendar nyitasPlus72 = (Calendar) felbontas.clone();
                nyitasPlus72.add(Calendar.HOUR_OF_DAY, 72);
                boolean romlott = nyitasPlus72.compareTo(Calendar.getInstance()) <= 0;

                if (romlott) {
                    return false;
                }

                return felbontas.compareTo(lejarat) <= 0;
            }
        }
    }

    static class TermekFactory {

        Calendar lejarat;
        Calendar felbontas = null;

        TermekFactory(String lejaratInput) {
            SimpleDateFormat form1 = new SimpleDateFormat("yyyy.MM.dd.");
            try {
                Date lejaratDate = form1.parse(lejaratInput);
                Calendar calLejarat = Calendar.getInstance();
                calLejarat.setTime(lejaratDate);
                calLejarat.set(Calendar.HOUR_OF_DAY, 23);
                calLejarat.set(Calendar.MINUTE, 59);
                calLejarat.set(Calendar.SECOND, 0);
                calLejarat.set(Calendar.MILLISECOND, 0);
                calLejarat.add(Calendar.DAY_OF_MONTH, 10);
                lejarat = calLejarat;
            } catch (ParseException ex) {
                System.out.println("Nem megfelelő formátum.");
                System.exit(0);

            }
        }

        void setFelbontas(String inputFelbontas) {
            if (inputFelbontas.equals("-")) {
                return;
            }

            SimpleDateFormat form2 = new SimpleDateFormat("yyyy.MM.dd. HH:mm");
            try {
                Date nyitasDate = form2.parse(inputFelbontas);
                Calendar calFelbontas = Calendar.getInstance();
                calFelbontas.setTime(nyitasDate);
                calFelbontas.set(Calendar.SECOND, 0);
                calFelbontas.set(Calendar.MILLISECOND, 0);
                felbontas = calFelbontas;
            } catch (ParseException ex) {
                System.out.println("Nem megfelelő formátum.");
                System.exit(0);
            }
        }

        Termek create() {
            if (felbontas == null) {
                return new FelbontatlanTermek(lejarat);
            } else {
                return new FelbontottTermek(lejarat, felbontas);
            }
        }
    }

}
