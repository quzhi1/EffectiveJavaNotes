package item21;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhiqu on 8/17/16.
 */
public class Item21Main {

    public static void main(String[] args) {
        String[] stringArray1 = {"HUUUUUUUUUUUGE", "short", "very long"};
        Arrays.sort(stringArray1, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println(Arrays.toString(stringArray1));

        String[] stringArray2 = {"HUUUUUUUUUUUGE", "short", "very long"};
        Arrays.sort(stringArray2, StringLengthComparator.INSTANCE);
        System.out.println(Arrays.toString(stringArray2));
    }

}