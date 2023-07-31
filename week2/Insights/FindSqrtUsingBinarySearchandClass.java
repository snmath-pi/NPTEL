import java.util.*;

class Calculator {
    public double prt(double y) {
        double lo = 0, hi = 1000;
        while(hi-lo >= 1e-8) {
            double mid = lo + (hi-lo) /2;
            if(mid * mid <= y) {
                lo = mid;
            } else hi = mid;
        }
        return lo;

    }
    double i;
    double x = prt(i);
    double u = prt(45);


}

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.i = 67.0;
        System.out.println(c.u);
        System.out.println("The square root of" + c.i + "is " + c.prt(c.i));
    }
}
