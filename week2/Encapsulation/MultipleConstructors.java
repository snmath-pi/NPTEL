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

class OverloadedCircle {
    double x, y, r;
    OverloadedCircle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    OverloadedCircle(double r) {
        this.r = r; x =0; y =0;
    }
    OverloadedCircle(OverloadedCircle C) {
        x = C.x; y = C.y; r = C.r;
    }
    OverloadedCircle() {
        x =  0; y=0;r=1;
    }
    double circumference() {
        return 2 * Math.PI * r;
    }
    double area() {
        return Math.PI * r * r;
    }
}
class Main {
    public static void main(String[] args) {

        OverloadedCircle c1 = new OverloadedCircle(1, 2, 12.12);
        OverloadedCircle c2 = new OverloadedCircle(4.5);
        OverloadedCircle c3 = new OverloadedCircle(c1);
        OverloadedCircle c4 = new OverloadedCircle();
        System.out.println("Area1" + c1.area());
        System.out.println("Area2" + c2.area());
        System.out.println("Area3" + c3.area());
        System.out.println("Area4" + c4.area());
    }
}
