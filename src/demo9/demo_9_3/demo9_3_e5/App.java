package demo9.demo_9_3.demo9_3_e5;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 200;
        int max = 750;
        int a = random.nextInt(max - min + 1) + min;
        int b = random.nextInt(max - min + 1) + min;
        int c = random.nextInt(max - min + 1) + min;
        System.out.println("The numbers are a=" + a + ",b=" + b + ",c=" + c);
        if (a > b && a > c) {
            System.out.println("The biggest number is a: " + a);
        } else if (c > a && c > b) {
            System.out.println("The biggest number is c: " + c);
        } else System.out.println("The biggest number is b: " + b);

    }
}
