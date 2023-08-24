package demo9_5.demo_9_5_e2;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(0, 100);
        int b = random.nextInt(0, 100);
        int sum = a + b;
        int avg = sum / 2;

        System.out.println("Number a is: " + a);
        System.out.println("Number b is: " + b);
        System.out.println("Their sum is " + sum);
        System.out.println("Their average is " + avg);
        System.out.println("a%10 is: " + a % 10);
        System.out.println("b%10 is: " + b % 10);
        System.out.println("Rectangle area of a and b is: " + a * b);
        System.out.println("Rectangle perimeter of a and b is: " + (a + b) * 2);
    }
}
