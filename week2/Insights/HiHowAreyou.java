import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi ");

        if (args.length > 0) {
            System.out.print(args[0]);
        } else {
            System.out.print("stranger");
        }

        System.out.print(", How are you?");
    }
}
