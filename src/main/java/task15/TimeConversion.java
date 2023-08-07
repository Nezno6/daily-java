// TASK: https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

package task15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {

    public String timeConversionTo24HourFormat(String timeIn12Hour) throws ParseException {
        timeIn12Hour = timeIn12Hour.replace(" ", "");
        DateFormat time12HourFormat = new SimpleDateFormat("hh:mm:ssa");
        DateFormat time24HourFormat = new SimpleDateFormat("HH:mm:ss");
        long date = time12HourFormat.parse(timeIn12Hour).getTime();
        return time24HourFormat.format(date);
    }
}
