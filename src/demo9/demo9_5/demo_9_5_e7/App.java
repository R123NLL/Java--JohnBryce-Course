package demo9.demo9_5.demo_9_5_e7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        double aPow = Math.pow(a, 2);
        double bPow = Math.pow(b, 2);
        double cPow = Math.pow(c, 2);
        System.out.println("The number a is: "+a+" and it's pow is: "+(int)aPow);
        System.out.println("The number a is: "+b+" and it's pow is: "+(int)bPow);
        System.out.println("The number a is: "+c+" and it's pow is: "+(int)cPow);

    }
}
