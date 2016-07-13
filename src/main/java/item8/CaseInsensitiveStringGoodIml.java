package item8;

/**
 * Created by zhiqu on 7/12/16.
 */
// Broken - violates symmetry!
public final class CaseInsensitiveStringGoodIml {

    private final String s;

    public CaseInsensitiveStringGoodIml(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    // Broken - violates symmetry!
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveStringGoodIml && ((CaseInsensitiveStringGoodIml) o).s.equalsIgnoreCase(s);
    }
}