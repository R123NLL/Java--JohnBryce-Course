package demo9.demo9_1.demo9_e7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        if (a > b) {
            if (a > c) {
                System.out.println("Number " + a + " is the highest number");
            } else System.out.println("Number " + c + " is the highest number");

        } else System.out.println("Number " + b + " is the highest number");

    }
}
