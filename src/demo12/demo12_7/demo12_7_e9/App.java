package demo12.demo12_7.demo12_7_e9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        scanner.close();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }


        for (int i = 1; i <= a; i++) { //colum loop
            for (int j = 1; j <= b; j++) { // row loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
