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
    void setVariables(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
    }
}
class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.setVariables(10, 5.3,8.1);
        System.out.println(c.area());
        System.out.println(c.circumference());
    }
}
