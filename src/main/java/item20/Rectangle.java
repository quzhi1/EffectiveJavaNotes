package item20;

/**
 * Created by zhiqu on 8/17/16.
 */
class Rectangle extends Figure {

    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}