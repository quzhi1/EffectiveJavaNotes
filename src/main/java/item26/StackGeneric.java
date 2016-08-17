package item26;

/**
 * Created by zhiqu on 8/17/16.
 */
// Initial attempt to generify Stack = won’t compile!

import java.util.EmptyStackException;

public class StackGeneric<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] elements;
    private int size = 0;

    // This cast is correct because the array we're creating
    // is of the same type as the one passed in
    @SuppressWarnings("unchecked")
    public StackGeneric() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        // ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    // no changes in isEmpty or ensureCapacity
}