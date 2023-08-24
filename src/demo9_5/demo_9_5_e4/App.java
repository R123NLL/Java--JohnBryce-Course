package demo9_5.demo_9_5_e4;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(1, 100);
        int b = random.nextInt(1, 100);
        int sum = a + b;
        int avg = sum / 2;

        System.out.println("Number a is: " + a + " and number b is: " + b);
        if (a > b) {
            System.out.println("The biggest number is a: " + a);
        } else if (a < b) {
            System.out.println("The biggest number is b: " + b);
        }
        if (a < b) {
            System.out.println("The smallest number is a: " + a);
        } else if (b < a) {
            System.out.println("The smallest number is b: " + b);
        }
        System.out.println("Their sum is: " + sum);
        System.out.println("Their average is: " + avg);
        if (sum % 2 == 0) {
            System.out.println("The sum is even");
        } else System.out.println("The sum is odd");
    }
}
