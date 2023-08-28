package demo12.demo12_5.demo12_5_e4;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10, 40);
        int a1 = 1, a2 = 1;

        System.out.println("Your lucky number is: " + num);
        System.out.println("All the even number up to " + num + ":");

        for (int i = 2; i <= num; i++) {

            if (a2 % 2 == 0)
                System.out.print(a2 + " ");

            a1 = a2 - a1;
            a2 = a2 + a1;
        }
    }
}
