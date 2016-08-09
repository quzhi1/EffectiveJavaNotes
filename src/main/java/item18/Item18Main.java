package item18;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by zhiqu on 8/9/16.
 */
public class Item18Main {

    public static void main(String[] args) {

    }

    // Concrete implementation built atop skeletal implementation
    static List<Integer> intArrayAsList(final int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        return new AbstractList<Integer>() {
            public Integer get(int i) {
                return a[i]; // Autoboxing (Item 5)
            }

            @Override
            public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val; // Auto-unboxing
                return oldVal; // Autoboxing
            }

            public int size() {
                return a.length;
            }
        };
    }


}
