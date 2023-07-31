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
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.x = 0; c1.y = 0.0; c1.r = 5.0;
        c2.x = 0; c2.y = 0; c2.r = 7.8;
        System.out.println("c1: " + c1.circumference());
        System.out.println("c2: " + c2.circumference());
        System.out.println(c1.area());
        System.out.println(c2.area());
    }
}
