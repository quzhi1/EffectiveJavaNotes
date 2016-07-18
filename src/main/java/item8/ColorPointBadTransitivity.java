package item8;

import java.awt.*;

/**
 * Created by zhiqu on 7/18/16.
 */
public class ColorPointBadTransitivity extends Point {

    private final Color color;

    public ColorPointBadTransitivity(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates transitivity!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }

        // If o is a normal Point, do a color-blind comparison
        if (!(o instanceof ColorPointBadTransitivity)) {
            return o.equals(this);
        }

        // o is a ColorPointBadTransitivity; do a full comparison
        return super.equals(o) && ((ColorPointBadTransitivity) o).color == color;
    }
}
