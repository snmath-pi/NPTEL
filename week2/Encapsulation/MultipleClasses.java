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
}
class Main {
    public static void main(String[] args) {
        Box B = new Box();
        Circle c = new Circle();
        c.x = 3.0; c.y = 4.0; c.r = 5.0;
        B.l = 10.0; B.b = 12.0; B.h =1.34;
        System.out.println("Circumference" + c.circumference());
        System.out.println("Area" + c.area());
        System.out.println("AreaBox" + B.area());
        System.out.println("Volume" + B.volume());
    }
}
