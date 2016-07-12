package item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by zhiqu on 7/12/16.
 */
public class PersonGoodImpl {

    /**
     * The starting and ending dates of the baby boom.
     */
    private static final Date BOOM_START;
    private static final Date BOOM_END;
    // Other fields, methods, and constructor omitted

    static {
        Calendar
            gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    private final Date birthDate;

    private PersonGoodImpl(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }
}
