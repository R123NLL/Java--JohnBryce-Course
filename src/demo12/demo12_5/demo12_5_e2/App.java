package demo12.demo12_5.demo12_5_e2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        int index = scanner.nextInt();
        scanner.close();
        int a1 = 1;
        int a2 = 1;

        for (int i = 2; i <= index; i++) {
            a1 = a2 - a1;
            a2 = a2 + a1;
        }
        System.out.println("Your index number of fibo's sequence is: " + a2);

    }
}
