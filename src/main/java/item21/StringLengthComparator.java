package item21;

import java.util.Comparator;

/**
 * Created by zhiqu on 8/17/16.
 */
class StringLengthComparator implements Comparator<String> {

    public static final StringLengthComparator INSTANCE = new StringLengthComparator();

    private StringLengthComparator() {
    }

    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}