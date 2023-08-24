package demo10.demo10_3_e9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month");
        int month = scanner.nextInt();
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        scanner.close();

        switch (month) {
            case 1, 3, 5, 7, 10, 12 -> System.out.println("31 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29 days");
                } else System.out.println("28 days");
            }
            default -> System.out.println("Invalid input");
        }//end of switch method

    }//end of main method
}//end of App class