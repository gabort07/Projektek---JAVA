package date.calendar.stb.gykorlas;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author gabesz
 */
public class DateCalendarStbGykorlas {

//    public static DateFormat dateformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendar maiNapAdatbazisbol = Calendar.getInstance();

        maiNapAdatbazisbol.set(Calendar.HOUR_OF_DAY, 0);
        maiNapAdatbazisbol.set(Calendar.MINUTE, 0);
        maiNapAdatbazisbol.set(Calendar.SECOND, 0);
        maiNapAdatbazisbol.set(Calendar.MILLISECOND, 0);

        Calendar ma = Calendar.getInstance();

        ma.set(Calendar.HOUR_OF_DAY, 0);
        ma.set(Calendar.MINUTE, 0);
        ma.set(Calendar.SECOND, 0);
        ma.set(Calendar.MILLISECOND, 0);

        if (ma.equals(maiNapAdatbazisbol)) {
            System.out.println("Mai nap!");
        }
        System.out.println();

        // Matek
        Calendar plusTenDays = Calendar.getInstance();
        plusTenDays.add(Calendar.DAY_OF_MONTH, +10);
        System.out.println(plusTenDays.get(Calendar.DAY_OF_MONTH));

        Calendar minusTenDays = Calendar.getInstance();
        minusTenDays.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println(minusTenDays.get(Calendar.DAY_OF_MONTH));
        System.out.println();

        //Stringbe konvertál
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date nowDate = new Date();
        sdf.format(nowDate);
        Calendar nowCal = Calendar.getInstance();
        sdf.format((nowCal.getTime()));

        // Stringben adott adatot értelmez
        //System.out.print("Kérem a születési évet ÉV.HÓNAP.NAP formátumban: ");
        String szul = "1988.07.23";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");

        try {
            Date dateSzul = sdf1.parse(szul);
            System.out.println("Sikerült a konvertálás   "+szul);
            
        } catch (ParseException ex) {
            System.out.println("Nem sikerült átkonvertálni!");
            System.out.println(ex);
        }
        
        
        System.out.println("Dátum String-ben");
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println();
        System.out.println("Dátum long-ban:");
        System.out.println(date.getTime());
        System.out.println();
        System.out.println("Január a 0-dik hónap, mostani:");
        System.out.println(date.getMonth());
        System.out.println();
        System.out.println("1900-at nekünk kell hozzáadni az aktuális évhez:");
        System.out.println(date.getYear());
        System.out.println();
        System.out.println("A hét hányadik napja, Date-ben:");
        System.out.println(date.getDay());
        System.out.println();
        System.out.println("Formatált kiíratás:");
        SimpleDateFormat sdf2= new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf2.format(date));
        
        
        
    }

//        String dob ="23/06/2016";
//        
//        if(valDOB(dob)){
//            System.out.println("Valid");
//        }else {
//            System.out.println("Not Valid");
//        }
//        
//        
//    }
//    
//    public static boolean valDOB(String DOB){
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        Date BOD = null;
//        df.setLenient(false);
//        
//        try{
//            BOD = df.parse(DOB);
//            return true;
//        }
//        
//        catch (Exception ex){
//            return false;
//        }
//    }
//      long ts = System.currentTimeMillis();
//        System.out.println(ts);
//        
//      Date now = new Date();
//        System.out.println(now); 
//        System.out.println(dateformatter.format(now)) ;
//        
//        System.out.println();
//      
//        
//      Calendar cal = new GregorianCalendar();
//      cal.set(Calendar.MILLISECOND, 0);
//      cal.set(Calendar.SECOND, 0);
//      cal.set(Calendar.MINUTE, 0);
//      cal.set(Calendar.HOUR, 0);
//      
//      cal.setTimeZone(TimeZone.getTimeZone("EST"));
//      System.out.println(cal.getTime());
//      System.out.println(dateformatter.format(cal.getTime()));
//        
//       System.out.println();
//        
//        
//      Date today = new Date();
//      dateformatter.setTimeZone(TimeZone.getTimeZone("UTC"));
//      
//        System.out.println(dateformatter.format(today));
//    }
}
