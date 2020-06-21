package pkg19_2_lemondasidij;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LemondasiDij {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         

        SimpleDateFormat form = new SimpleDateFormat("yyyy.MM.dd.");
        Calendar arrival = Calendar.getInstance();
        try {
            Date date = form.parse(sc.nextLine());
            arrival.setTime(date);
            arrival.set(Calendar.HOUR_OF_DAY, 14);
            arrival.set(Calendar.MINUTE, 0);
            arrival.set(Calendar.SECOND, 0);
            arrival.set(Calendar.MILLISECOND, 0);
        } catch (ParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            System.exit(0);
        }

        payBack(daysTillArrival(arrival, oneDayBefore()));
    }
    
    static void payBack(int days) {
        if (days >= 30) {
            System.out.println("100% jár vissza.");
        } else if (days > 3) {
            System.out.println("90% jár vissza.");
        } else if (days >= 1) {
            System.out.println("50% jár vissza.");
        } else {
            System.out.println("0% jár vissza.");
        }
    }
    
    static int daysTillArrival(Calendar arrival, Calendar oneDay) {
        int days= 0;
        while (isArrivalAfter(arrival, oneDay)) {      //1
            do {
                oneDay.add(Calendar.DAY_OF_MONTH, 1);   //2
            } while (isWeekend(oneDay) && isThirdDay(arrival)); //2
            days++;                                          //3     
        }
        return days;
    }

    static boolean isWeekend(Calendar arrival) {
        return (arrival.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || arrival.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
    }

    static boolean isArrivalAfter(Calendar arrival, Calendar oneDay) {
        return arrival.compareTo(oneDay) >= 0;
    }

    static boolean isThirdDay(Calendar arrival) {

        Calendar thirdDay = Calendar.getInstance();
        thirdDay.add(Calendar.DAY_OF_WEEK, 3);
        thirdDay.set(Calendar.HOUR_OF_DAY, 14);
        thirdDay.set(Calendar.MINUTE, 0);
        thirdDay.set(Calendar.SECOND, 0);
        thirdDay.set(Calendar.MILLISECOND, 0);
        return arrival.compareTo(thirdDay) <= 0;
    }
    
    static Calendar oneDayBefore() {
        Calendar oneDay = Calendar.getInstance();
        oneDay.add(Calendar.HOUR_OF_DAY, 24);
        oneDay.set(Calendar.MINUTE, 0);
        oneDay.set(Calendar.SECOND, 0);
        oneDay.set(Calendar.MILLISECOND, 0);
        return oneDay;
    }

}
