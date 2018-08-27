package auto.ryanair.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeStamp {
    private static final int FLIGHTDATE = 4;

    public static String getTimeStampFormatted() {
        Date currentDate = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, FLIGHTDATE);

        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }
}