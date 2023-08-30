package demo12.demo12_7.demo12_7_e5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, enter -999 if you want to exit");
        int num = scanner.nextInt();
        int max = Integer.MIN_VALUE;

        while (num != -999) {

            if (num > max)
                max = num;
            System.out.println("Enter another num");
            num = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The biggest number is: " + max);

    }
}
