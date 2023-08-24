package demo_9_3.demo9_3_e4;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 30;
        int max = 80;
        int randomInRange = random.nextInt(max - min + 1) + min;
        System.out.println("This is your random number between 30 and 80: " + randomInRange);
        if (randomInRange%2==0)
            System.out.println("This number is even");
        else System.out.println("This number is odd");
    }
}
