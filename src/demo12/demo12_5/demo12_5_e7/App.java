package demo12.demo12_5.demo12_5_e7;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10, 40);
        int a1 = 1, a2 = 1;
        int sum = 0;
        double avg = 0;

        System.out.println("Your lucky number is: " + num);

        for (int i = 1; i <= num; i++) {
            System.out.print(a2 + " ");
            sum = sum + a2;
            a1 = a2 - a1;
            a2 = a2 + a1;
        }
        avg = (double) sum / num;
        System.out.println();
        System.out.println("The sum of all the fibo's sequence" +
                " until you lucky number is: " + sum);
        System.out.println("And the average is: " + avg);
    }
}
