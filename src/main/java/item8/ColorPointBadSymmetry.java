package item8;

import java.awt.*;

/**
 * Created by zhiqu on 7/18/16.
 */
public class ColorPointBadSymmetry extends Point {

    private final Color color;

    public ColorPointBadSymmetry(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates symmetry!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPointBadSymmetry)) {
            return false;
        }
        return super.equals(o) && ((ColorPointBadSymmetry) o).color == color;
    }
}
