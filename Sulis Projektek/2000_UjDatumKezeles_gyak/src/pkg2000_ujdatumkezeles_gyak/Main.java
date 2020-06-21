package pkg2000_ujdatumkezeles_gyak;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime then = LocalDateTime.of(2015, Month.FEBRUARY, 14, 13, 45);
        System.out.println(now);
        System.out.println(then);

        // Tagok lekérdezése
        System.out.println(now.getYear());
        System.out.println(now.get(ChronoField.MINUTE_OF_DAY));

        // A LocalDateTime-ból egy másik, megváltozott objektum létrehozása
        LocalDateTime uj = now.withHour(0); // Az óra 0-ra van állítva
        LocalDateTime uj2 = uj.withMinute(0);
        System.out.println(uj2);

        LocalDateTime ujx = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(ujx);

        // ebből LocalDate objektum készítése
        LocalDate day = now.toLocalDate();
        LocalDate day2 = LocalDate.from(now);
        System.out.println(day);
        System.out.println(day2);

        // Matekozás - lánocolás
        LocalDate cantwait = now.plusWeeks(2).minusDays(2).toLocalDate();
        System.out.println(cantwait);

        // Repülési idő példa
        LocalDateTime takeoff = LocalDateTime.of(2015, Month.MAY, 23, 13, 45);
        LocalDateTime landing = LocalDateTime.of(2015, Month.MAY, 23, 16, 5);

        Duration dur = Duration.between(takeoff, landing);
        System.out.println(dur);

        LocalTime start = LocalTime.of(13, 45);
        LocalTime end = LocalTime.of(16, 5);
        Duration dur2 = Duration.between(start, end);
        System.out.println(dur2);

        // Instant
        Instant ins = Instant.now();
        System.out.println(ins);
        System.out.println(ins.getEpochSecond());

        Instant nextRound = Instant.ofEpochSecond(1_500_000_000);
        System.out.println(nextRound);

        LocalDateTime dt = LocalDateTime.ofInstant(ins, ZoneId.systemDefault());
        System.out.println(dt);

        Duration d = Duration.between(ins, nextRound);
        System.out.println("Dur. " + d);

        // LocalDateTime felruházása ZoneOffset vagy ZoneId értékekkel
        ZoneId bp = ZoneId.of("Europe/Budapest");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime bpTime = dt.atZone(bp);     // Felruházzuk időzónainformációval
        ZonedDateTime tokyoTime = bpTime.withZoneSameInstant(tokyo);    // Átváltjuk egy másik időzónába
        System.out.println(bpTime);
        System.out.println(tokyoTime);
        System.out.println(bpTime.isEqual(tokyoTime));

        ZoneOffset bpOff = ZoneOffset.ofHours(2);
        ZoneOffset otherOff = ZoneOffset.ofHoursMinutes(9, 30);
        OffsetDateTime bpOffTime = dt.atOffset(bpOff);
        OffsetDateTime otherOffTime = bpOffTime.withOffsetSameInstant(otherOff);
        System.out.println(bpOffTime);
        System.out.println(otherOffTime);
        System.out.println(bpOffTime.isEqual(otherOffTime));

        // Temporal adjuster
        LocalDate today = LocalDate.now();
        // A hónap második vasárnapja
        LocalDate a = today.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        System.out.println(a);
        // A kövi év első napja
        LocalDate b = today.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(b);

        // Dátum formázás
        System.out.println(today.format(DateTimeFormatter.ISO_DATE));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yy/MM/dd")));
        // try-catch
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy.MM.dd.");
        String read = "2015.01.02";
        try {
            LocalDate readDate = LocalDate.parse(read, dtf);
            System.out.println(readDate);
        } catch (DateTimeParseException ex) {
            System.out.println("Hiba: " + ex.getMessage());
        }

        Period szunet = Period.between(LocalDate.of(2019, Month.DECEMBER, 10),
                LocalDate.of(2019, Month.DECEMBER, 18));
        Duration szunet1 = Duration.between(LocalDateTime.of(2019, Month.DECEMBER, 10, 0, 0),
                LocalDateTime.of(2019, Month.DECEMBER, 18, 0, 0));

        System.out.println(szunet.getDays());
        System.out.println(szunet.getUnits());

//        if(szunet.minusDays(DayOfMonth.SATURDAY)) {
//            
//        } else {
//        }
//        
    }

}
