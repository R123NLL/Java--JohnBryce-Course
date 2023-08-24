package demo10.demo10_3_e7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        scanner.close();
        System.out.println("The year is " + year);

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("This year is leap year");
        }else System.out.println("This year is not leap year");

    }
}
