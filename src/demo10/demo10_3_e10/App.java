package demo10.demo10_3_e10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        double age = scanner.nextDouble();

        String message = (age > 21) ? "You can enter" : "You cannot enter";
        System.out.println(message);
    }
}
