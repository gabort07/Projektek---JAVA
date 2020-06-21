package pkg2003_vakacio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Iskola {

    private final LocalDate NOW = LocalDate.now();
    private LocalDate vakacioElsoNapja;
    private int szunet = 0;
    private ArrayList<LocalDate> kezd = new ArrayList<>();
    private ArrayList<LocalDate> vege = new ArrayList<>();
    private ArrayList<LocalDate> szunnap = new ArrayList<>();
    private ArrayList<LocalDate> ledolgoz = new ArrayList<>();
    Period p;

    public int getOktatasiNapok(LocalDate mikortol) {

        if (!this.kezd.isEmpty()) {
            for (int i = 0; i < this.kezd.size(); i++) {
                if (this.kezd.get(i).isBefore(mikortol)) {
                    this.kezd.remove(i);
                    this.kezd.add(mikortol);
                }

                this.szunet += calculateVacation(this.kezd.get(i), this.vege.get(i));
            }
        }

        if (!this.szunnap.isEmpty()) {
            for (int i = 0; i < this.szunnap.size(); i++) {
                if (this.szunnap.get(i).isBefore(mikortol)
                        && this.ledolgoz.get(i).compareTo(mikortol) >= 0) {
                    this.szunet -= 1;
                } else if (this.szunnap.get(i).isAfter(mikortol)
                        && this.ledolgoz.get(i).compareTo(mikortol) <= 0) {
                    this.szunet += 1;
                }
            }
        }
        return daysBetweenExcludeWeekends(mikortol, this.vakacioElsoNapja.minusDays(1)) - this.szunet;
    }

    public LocalDate stringToDate(String input) {
        if (input.equalsIgnoreCase("-")) {
            return null;
        } else {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
            LocalDate formatedDate = null;

            try {
                LocalDate date = LocalDate.parse(input, dtf);
                formatedDate = date;
            } catch (DateTimeParseException ex) {
                System.out.println("Nem megfelelő formátum.");
                System.exit(0);
            }
            return formatedDate;
        }
    }

    public boolean isWeekend(LocalDate day) {
        return day.getDayOfWeek().equals(DayOfWeek.SUNDAY)
                || day.getDayOfWeek().equals(DayOfWeek.SATURDAY);
    }

    public int calculateVacation(LocalDate kezd, LocalDate vege) {
        int days = 0;
        LocalDate actualDay = kezd.minusDays(1);
        while (actualDay.compareTo(vege) < 0) {
            actualDay = actualDay.plusDays(1);
            if (!isWeekend(actualDay)) {
                ++days;
            }
        }
        return days;
    }

    public int daysBetweenExcludeWeekends(LocalDate kezd, LocalDate vege) {
        int days = 0;
        LocalDate actualDay = kezd.minusDays(1);
        while (actualDay.isBefore(vege)) {
            actualDay = actualDay.plusDays(1);
            if (!isWeekend(actualDay)) {
                ++days;
            }
        }
        return days;
    }

    public Iskola() {
    }

    public Iskola(LocalDate vakacioElsoNapja) {
        this.vakacioElsoNapja = vakacioElsoNapja;
    }

    public void setSzunet(int szunet) {
        this.szunet = szunet;
    }

    public void setVakacioElsoNapja(LocalDate vakacioElsoNapja) {
        this.vakacioElsoNapja = vakacioElsoNapja;
    }

    public LocalDate getVakacioElsoNapja() {
        return this.vakacioElsoNapja;
    }

    public int getSzunet() {
        if (!this.kezd.isEmpty()) {
            for (int i = 0; i < this.kezd.size(); i++) {
                if (this.kezd.get(i).isBefore(NOW)) {
                    this.kezd.remove(i);
                    this.kezd.add(NOW);
                }

                this.szunet += daysBetweenExcludeWeekends(this.kezd.get(i), this.vege.get(i));
            }
        }

        if (!this.szunnap.isEmpty()) {
            for (int i = 0; i < this.szunnap.size(); i++) {
                if (this.szunnap.get(i).isBefore(NOW)
                        && this.ledolgoz.get(i).isAfter(NOW)) {
                    this.szunet -= 1;
                } else if (this.szunnap.get(i).isAfter(NOW)
                        && this.ledolgoz.get(i).isBefore(NOW)) {
                    this.szunet += 1;
                }
            }
        }
        return this.szunet;
    }

    public void athelyezMunkanap(LocalDate szunnap, LocalDate ledolgoz) {
        this.szunnap.add(szunnap);
        this.ledolgoz.add(ledolgoz);
    }

    public void addSzunet(LocalDate kezd, LocalDate vege) {
        this.kezd.add(kezd);
        this.vege.add(vege);

    }

}
