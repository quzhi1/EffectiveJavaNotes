package item6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by zhiqu on 7/12/16.
 */
public class MemoryLeakStack {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private Object[] elements;
    private int size = 0;

    public MemoryLeakStack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * Problem: The objects that were popped off the stack will not be garbage collected, even if the program using the
     * stack has no more references to them. This is because the stack maintains obsolete references to these objects.
     */
    public Object popBadImpl() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    /**
     * Fix: null out references once they become obsolete.
     *
     * But this is still not enough. The best way to eliminate an obsolete reference is to let the variable that
     * contained the reference fall out of scope.
     */
    public Object popGoodImpl() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
