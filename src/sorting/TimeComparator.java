package sorting;

import java.util.Comparator;

/**
 * TimeComparator compares two Time2 objects.
 *
 * @author BCIT
 * @version 2024
 */
public class TimeComparator implements Comparator<Time> {

    /**
     * Compares the two Time2 arguments.
     * @param time1 a Time2
     * @param time2 a Time2
     * @return an int where 0 means they are the same
     *                      - means time1 < time2
     *                      + means time1 > time2
     */
    @Override
    public int compare(final Time time1, final Time time2) {
        int hourCompare = time1.getHour() - time2.getHour();
        if (hourCompare != 0) {
            return hourCompare;
        }
        int minuteCompare = time1.getMinute() - time2.getMinute();
        if (minuteCompare != 0) {
            return minuteCompare;
        }
        return time1.getSecond() - time2.getSecond();
    }
}
