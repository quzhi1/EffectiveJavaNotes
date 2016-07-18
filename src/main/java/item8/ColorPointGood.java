package item8;

import java.awt.*;

/**
 * Created by zhiqu on 7/18/16.
 */
public class ColorPointGood {

    // Item 16 "Favor composition over inheritance."
    private final Point point;
    private final Color color;

    public ColorPointGood(int x, int y, Color color) {
        if (color == null) {
            throw new NullPointerException();
        }
        point = new Point(x, y);
        this.color = color;
    }

    /**
     * Returns the point-view of this color point.
     */
    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPointGood)) {
            return false;
        }
        ColorPointGood cp = (ColorPointGood) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
