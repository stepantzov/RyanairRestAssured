package auto.ryanair.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeStamp {
    public static String getTimeStampFormatted() {
        return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    }
}