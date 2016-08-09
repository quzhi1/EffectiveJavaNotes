package item16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by zhiqu on 8/8/16.
 */
public class Item16Main {

    public static void main(String[] args) {
        // Failed inheritance case
        InstrumentedSetInheritance<String> s = new InstrumentedSetInheritance<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println("InstrumentedSetInheritance.getAddCount: " + s.getAddCount());

        // Composition-forwarding case
        InstrumentedSetForwarding<String> s1 = new InstrumentedSetForwarding<String>(new TreeSet<String>());
        InstrumentedSetForwarding<String> s2 = new InstrumentedSetForwarding<String>(new HashSet<String>());
        s1.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        s2.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println("InstrumentedSetForwarding1.getAddCount: " + s1.getAddCount());
        System.out.println("InstrumentedSetForwarding2.getAddCount: " + s2.getAddCount());

    }
}
