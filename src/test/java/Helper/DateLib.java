package Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLib {

    public static int getCurrentDateAsInt() {
        Date currDate = new Date();
        SimpleDateFormat onlyDate = new SimpleDateFormat("d");
        return Integer.parseInt(onlyDate.format(currDate));
    }

    public static String getCurrentDateAsString() {
        Date currDate = new Date();
        SimpleDateFormat onlyDate = new SimpleDateFormat("d");
        return onlyDate.format(currDate);

    }
}