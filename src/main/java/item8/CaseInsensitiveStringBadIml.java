package item8;

/**
 * Created by zhiqu on 7/12/16.
 */
// Broken - violates symmetry!
public final class CaseInsensitiveStringBadIml {

    private final String s;

    public CaseInsensitiveStringBadIml(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    // Broken - violates symmetry!
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveStringBadIml) {
            return s.equalsIgnoreCase(((CaseInsensitiveStringBadIml) o).s);
        }
        if (o instanceof String) // One-way interoperability!
        {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }
}