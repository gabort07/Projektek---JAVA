

import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Period;
import static org.joda.time.format.ISODateTimeFormat.dateTime;

public class JodaTime {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Date date = new Date();

        DateTime most = new DateTime();
        DateTime spec1 = new DateTime(2014, 11, 29, 9, 15);
        DateTime fromJDK1 = new DateTime(cal);
        DateTime fromJDK2 = new DateTime(date);

        DateTime dt = DateTime.now().withTimeAtStartOfDay().plusDays(1);

        //Duration//
        Interval itv = new Interval(startDateTime, endDateTime);
        Duration dur = itv.toDuration();
        Duration dur2 = new Duration(startDateTime, endDateTime);

        //Period//
        Interval itv = new Interval(startDateTime, endDateTime);
        Period per = itv.toPeriod();
        Period per2 = new Period(startDateTime, endDateTime);
        Period per3 = per.withDays(n);

        //�talak�t�s Duration �s Period k�z�tt//
        Duration dur = per.toDurationFrom(dateTime); /* megadjuk a tartom�nyelej�t */
        Duration dur2 = per.toDurationTo(dateTime); /* megadjuk a tartom�nyv�g�t */
        Period per = dur.toPeriodFrom(dateTime); /* megadjuk a tartom�nyelej�t */
        Period per = dur.toPeriodTo(dateTime); /* megadjuk a tartom�ny v�g�t*/
    }
}
