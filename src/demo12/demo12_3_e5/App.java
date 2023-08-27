package demo12.demo12_3_e5;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(0, 10000);
        System.out.println("Your lucky number is: " + num);
        int dig = 0;
        int original=num;

        while(num>0){
            num=num/10;
            dig++;
        }

        System.out.println("The number of digits in " + original + " is:" + dig);
    }
}
