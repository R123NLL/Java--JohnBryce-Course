package demo12.demo12_3.demo12_3_e8;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(0, 10000);
        int oppo = 0;
        int original = num;
        System.out.println("Your lucky number is: " + num);
        while (num > 0) {
            oppo = oppo * 10 + num % 10;
            num /= 10;
        }
        System.out.println("The opposite number of " + original + " is " + oppo);
    }
}
