import java.util.Scanner;

public class Main {
    public static boolean chk(int a, int b) {
        return a > b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == b) {
            System.out.println("both are equal");
            System.exit(0);
        }
        System.out.println(chk(a, b) ? a + " is bigger" : b + " is bigger");
    }
}
