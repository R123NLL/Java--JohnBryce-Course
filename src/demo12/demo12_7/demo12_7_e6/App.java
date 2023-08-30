package demo12.demo12_7.demo12_7_e6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, enter -999 to exit");
        int num = scanner.nextInt();
        int min = Integer.MAX_VALUE;

        while (num != -999) {

            if (num < min) {
                min = num;
            }
            System.out.println("Enter another number");
            num = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The smallest number is " + min);
    }
}
