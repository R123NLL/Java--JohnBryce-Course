package demo12.demo12_7.demo12_7_e1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive num, to stop enter a negative");
        int num = scanner.nextInt();
        int sum = 0;

        while (num > 0) {
            sum = sum + num;
            System.out.println("Enter another num");
            num = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The sum of all the number is: " + sum);
    }
}
