package item20;

/**
 * Created by zhiqu on 8/17/16.
 */
class Circle extends Figure {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * (radius * radius);
    }
}
