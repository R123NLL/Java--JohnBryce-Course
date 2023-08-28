package demo9.demo9_1.demo9_e4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it's odd or even: ");
        int num = scan.nextInt(); //Enter a number
        scan.close();
        if (num % 2 == 0) {
            System.out.println("This number is even!"); //In case the number was even
        } else {
            System.out.println("This number is odd!"); //In case the number was odd
        }

    }
}
