package auto.ryanair.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeStampUtility {
    public static String getTimeStampPrettyFormatted() {
        return new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    }
}