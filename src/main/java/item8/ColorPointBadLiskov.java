package item8;

import java.awt.*;

/**
 * Created by zhiqu on 7/18/16.
 */
public class ColorPointBadLiskov extends Point {

    private final Color color;

    public ColorPointBadLiskov(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates Liskov substitution principle (page 40)
    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

}
