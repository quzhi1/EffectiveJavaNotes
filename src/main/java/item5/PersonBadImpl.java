package item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by zhiqu on 7/12/16.
 */
public class PersonBadImpl {

    private final Date birthDate;

    private PersonBadImpl(Date birthDate) {
        this.birthDate = birthDate;
    }
    // Other fields, methods, and constructor omitted

    /**
     * DON'T DO THIS! The isBabyBoomer method unnecessarily creates a new Calendar, TimeZone, and two Date instances
     * each time it is invoked.
     */
    public boolean isBabyBoomer() {
        // Unnecessary allocation of expensive object
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone(" GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }
}
