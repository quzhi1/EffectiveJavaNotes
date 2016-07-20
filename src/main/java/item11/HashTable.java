package item11;

/**
 * Created by zhiqu on 7/20/16.
 */
public class HashTable {

    private Entry[] buckets;

    @Override
    public HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] != null) {
                    // Cam be recursive, but potential stack overflow
                    result.buckets[i] = buckets[i].deepCopyIterative();
                }
            }
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    private static class Entry {

        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        // Recursively copy the linked list headed by this Entry
        Entry deepCopyRecursive() {
            return new Entry(key, value, next == null ? null : next.deepCopyRecursive());
        }

        // Iteratively copy the linked list headed by this Entry
        Entry deepCopyIterative() {
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next) {
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            }
            return result;
        }
    }

}
