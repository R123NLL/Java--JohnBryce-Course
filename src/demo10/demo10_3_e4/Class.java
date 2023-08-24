package demo10.demo10_3_e4;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        int sum = a + b + c;
        int max=Math.max(a,Math.max(b,c));
        int min=Math.min(a,Math.min(b,c));



        System.out.println("The biggest number is: " +max);
        System.out.println("The smallest number in the power of 3 is: " +Math.pow(min,3));
        System.out.println("The middle number is: "+(sum-max-min));
    }
}
