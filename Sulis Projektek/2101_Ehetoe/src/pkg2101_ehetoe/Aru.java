package pkg2101_ehetoe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Aru {

    interface Termek {
// Az interfce csak a közös viselkedést tartalmazza 

        boolean ehetoE();

        default void prinntEhetoE() {
            if (ehetoE()) {
                System.out.println("Még ehető!");
            } else {
                System.out.println("Megromot!");
            }
        }
    }

    static class FelbontatlanTermek implements Termek {
// A +10 napot a factoryban adom hozzá így itt már nem kell vele foglalkozni

        LocalDateTime lejarat;

        public FelbontatlanTermek(LocalDateTime lejarat) {
            this.lejarat = lejarat;
        }

        @Override
        public boolean ehetoE() {
            return lejarat.isAfter(LocalDateTime.now());
        }
    }

    static class FelbontottTermek extends FelbontatlanTermek {

        LocalDateTime felbontas;

        public FelbontottTermek(LocalDateTime felbontas, LocalDateTime lejarat) {
            super(lejarat);
            this.felbontas = felbontas;
        }

        @Override
        public boolean ehetoE() {
            // A lejárathoz a factory-ban adom hozzá a 10 napot és itt már azzal számolok
            if (lejarat.isBefore(felbontas)) {
                return false;
            } else {
                // Nyitas + 72 óra < now()
                LocalDateTime nyitasPlus72 = felbontas.plusHours(72);
                boolean romlott = nyitasPlus72.compareTo(LocalDateTime.now()) <= 0;

                if (romlott) {
                    return false;
                }
                return felbontas.compareTo(lejarat) <= 0;
            }
        }
    }

    static class TermekFactory {

        LocalDateTime lejarat;
        LocalDateTime felbontas = null;

        public TermekFactory(String lejaratInputString) {
            DateTimeFormatter fomr1 = new DateTimeFormatterBuilder().appendYear(4, 4).appendLiteral(".").
                    appendMonthOfYear(2).appendLiteral(".").appendDayOfMonth(2).appendLiteral(".").toFormatter();
            try {
                DateTime time = fomr1.parseDateTime(lejaratInputString);
                lejarat = time.withTime(23, 59, 0, 0);
            } catch (IllegalArgumentException ex) {
                System.out.println("Nem megfelelő formátum.");
                System.exit(0);
            }
        }

        void setFelbontas(String inputFelbontasString) {
            if (inputFelbontasString.equals("-")) {
                return;
            }

            DateTimeFormatter form2 = new DateTimeFormatterBuilder().appendYear(4, 4).appendLiteral(".").
                    appendMonthOfYear(2).appendLiteral(".").appendDayOfMonth(2).appendLiteral(".").
                    appendLiteral(" ").appendHourOfDay(2).appendLiteral(":").appendMinuteOfHour(2).toFormatter();
            try {
                DateTime time = form2.parseDateTime(inputFelbontasString);
                felbontas = time.withSecondOfMinute(0).withMillisOfSecond(0);
            } catch (IllegalArgumentException ex) {
                System.out.println("Nem megfelelő formátum.");
                System.exit(0);
            }
        }

        Termek creat() {
            if (felbontas == null) {
                return new FelbontatlanTermek(lejarat);
            } else {
                return new FelbontottTermek(felbontas, lejarat);
            }
        }
    }
}
