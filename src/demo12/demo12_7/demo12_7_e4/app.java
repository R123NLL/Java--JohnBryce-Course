package demo12.demo12_7.demo12_7_e4;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, to exit enter 0");
        int num = scanner.nextInt();
        boolean flag = true;

        while (num != 0)

            for (int i = 2; i <num; i++) {
                if (num %i == 0) {
                    flag = false;
                    break;
                } else if (flag) {
                    System.out.println(num + " is prime");
                } else System.out.println(num + " is not prime");

                System.out.println("Enter another number");
                num = scanner.nextInt();
                flag=true;
            }
    }
}