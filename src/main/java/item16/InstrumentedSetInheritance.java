package item16;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhiqu on 8/8/16.
 */
// Broken - Inappropriate use of inheritance!
public class InstrumentedSetInheritance<E> extends HashSet<E> {

    // The number of attempted element insertions
    private int addCount = 0;

    public InstrumentedSetInheritance() {
    }

    public InstrumentedSetInheritance(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
