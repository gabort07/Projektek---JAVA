package pkg2002_lemondasidij;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Szallas {

    private LocalDateTime erkezes;

    public LocalDateTime inputControll(String input) {
        LocalDateTime arrival = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
        try {
            LocalDate date = LocalDate.parse(input, dtf);
            arrival = date.atTime(14, 0, 0, 0);
        } catch (DateTimeParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            System.exit(0);
        }
        return arrival;
    }

    public int getVisszajaroSzazalek(LocalDateTime mikor) {

        if (mikor.plusMonths(1).isBefore(this.erkezes)) {
            return 100;
        } else if (daysCounter(mikor) >= 3) {
            return 90;
        } else if (daysCounter(mikor)>= 1) {
            return 50;
        } else {
            return 0;
        }

    }

    public int daysCounter(LocalDateTime cancel) {
        int days = 0;
        LocalDateTime oneDay = cancel;
        while (!this.erkezes.isBefore(oneDay.plusHours(24))) {      //1
            do {
                oneDay = oneDay.plusDays(1);   //2
            } while (isWeekend(oneDay) && isThirdDay(this.erkezes)); //2
            days++;                                          //3     
        }
        return days;
    }

    public boolean isWeekend(LocalDateTime day) {
        return day.getDayOfWeek().equals(DayOfWeek.SUNDAY)
                || day.getDayOfWeek().equals(DayOfWeek.SATURDAY);
    }

    public boolean isThirdDay(LocalDateTime arrival) {
        return !arrival.isAfter(LocalDate.now().atTime(14, 0, 0, 0).plusDays(3));
    }

    public LocalDateTime getErkezes() {
        return erkezes;
    }

    public void setErkezes(LocalDateTime erkezes) {
        this.erkezes = erkezes.withHour(14).withMinute(0).withSecond(0).withNano(0);
    }

    public Szallas(LocalDateTime erkezes) {
        this.erkezes = erkezes.withHour(14).withMinute(0).withSecond(0).withNano(0);
    }

    public Szallas() {
    }

}
