package demo10_3.demo10_3_e1.demo10_3_e4;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int maxNum = 0;
        int minNum = 0;

        if (a > b && a > c) {
            maxNum = a;
            minNum = Math.min(b, c);
            //minNum=Math.pow(minNum,3);
        } else if (b > c) {
            maxNum = b;
            minNum = Math.min(a, c);
        } else {
            maxNum = c;
            minNum = Math.min(a, b);
        }

        System.out.println("Number a is the biggest number: " + maxNum);
    }
}
