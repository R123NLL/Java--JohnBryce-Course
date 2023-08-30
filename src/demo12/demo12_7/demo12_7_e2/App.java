package demo12.demo12_7.demo12_7_e2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, enter a negative to stop");
        int num = scanner.nextInt();
        int sum = 0;
        double avg = 0;
        int count = 0;

        while (num > 0) {
            sum = sum + num;
            System.out.println("Enter another num");
            num = scanner.nextInt();
            count++;
        }
        scanner.close();
        if (count == 0) {
            System.out.println("Syntax error- cannot divide by zero");
        } else {
            avg = (((double) sum / count));
            System.out.println("The average of all the number is: " + avg);
        }

    }
}
