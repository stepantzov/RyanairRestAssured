package auto.ryanair.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeStamp {
    public static String getTimeStampFormatted() {
        Date currentDate = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, 3);

        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }
}