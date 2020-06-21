package pkg1903_vakacio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Vakacio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Melyik a nyári vakáció első napja? (yyyy.MM.dd. formátumban) ");
        Calendar firstDayOfVacation = vacationsCheckSet(sc.next());
        Calendar today = Calendar.getInstance();

        int schoolDays = daysCounter(today, firstDayOfVacation);
        
                
        System.out.println("Évközi szünetek felvitele:");
        boolean[] exit = {false, false};

        do {
            System.out.print("Melyik az évközbeni szünet első napja? (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");
            Calendar midYearVacationFirstDay = vacationsCheckSet(sc.next());

            if (midYearVacationFirstDay == null) {
                exit[0] = true;
                break;
            }else if (midYearVacationFirstDay.before(today)) {
                midYearVacationFirstDay = today;
            }

            System.out.print("Melyik az évközbeni szünet utolsó napja? (yyyy.MM.dd. formátumban) ");
            Calendar midYearVacationLastDay = vacationsCheckSet(sc.next());

            if (midYearVacationLastDay == null) {
                exit[0] = true;
                break;
            }else if (midYearVacationLastDay.before(today)) {
                midYearVacationFirstDay = today;
            }
            System.out.println(schoolDays);

            schoolDays -= daysCounter(midYearVacationFirstDay, midYearVacationLastDay);

        } while (!exit[0]);
        

        System.out.println("Munkanap áthelyezések:");
        do {
            System.out.print("Melyik munkanap lesz szünet? (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");
            Calendar hollydayOnBusinnesDay = vacationsCheckSet(sc.next());

            if (hollydayOnBusinnesDay == null) {
                exit[1] = true;
                break;
            } else if (hollydayOnBusinnesDay.compareTo(today) >=0) {
                schoolDays -= 1;
            }
            

            System.out.print("Melyik szünnapon kell cserébe dolgozni? (yyyy.MM.dd. formátumban) ");
            Calendar workOnHollyday = vacationsCheckSet(sc.next());

            if (workOnHollyday == null) {
                exit[1] = true;
                break;
            } else if (workOnHollyday.compareTo(today) >= 0) {
                schoolDays += 1;
            }
            

        } while (!exit[1]);

        System.out.print("Hátralévő iskolai napok száma a mai nappal együtt: ");
        System.out.println(schoolDays);

    }

    static SimpleDateFormat inputForm = new SimpleDateFormat("yyyy.MM.dd.");

    public static Calendar vacationsCheckSet(String input) {
        if ("-".equals(input)) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        try {
            Date date = inputForm.parse(input);
            cal.setTime(date);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);

        } catch (ParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            System.exit(0);
        }
        return cal;
    }

    static int daysCounter(Calendar countedDay, Calendar lastDay) {
        int days = 0;
        while (isDayBefore(countedDay, lastDay)) {          //1
            do {
                countedDay.add(Calendar.DAY_OF_MONTH, 1);   //2
            } while (isWeekend(countedDay));                 //2
            days++;                                         //3
        }
        return days;
    }

    static boolean isWeekend(Calendar day) {
        return (day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || day.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY);
    }

    static boolean isDayBefore(Calendar countedDay, Calendar lastDay) {
        return countedDay.compareTo(lastDay) <= 0;
    }

    

}
