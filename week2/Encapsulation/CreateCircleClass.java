import java.util.*;
class Circle {
    double x, y; // coordinates of the center
    double r; // The radius
    double circumference() {
        return 2 * 3.14159 * r;
    }
    double area() {
        return 3.14159 * r * r;
    }
}
class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 0; c.y = 0.0; c.r = 5.0;
        System.out.println(c.circumference());
        System.out.println(c.area());
    }
}
