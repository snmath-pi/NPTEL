// used to prevent name collisions
import java.util.*;

class Box {
    double l;
    double b;
    double h;

    double area() {
        return 2 * (l * b + b * h + h * l);
    }
    double volume() {
        return l * b * h;
    }
}
class Circle {
    double x, y, r;
    double circumference() {
        return 2 * Math.PI * r;
    }
    double area() {
        return Math.PI * r * r;
    }

    // now let's set parameters directly
    Circle (double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
class Main {
    public static void main(String[] args) {

        Circle c = new Circle(1, 2, 6.4);

        System.out.println(c.area());
        System.out.println(c.circumference());
    }
}
