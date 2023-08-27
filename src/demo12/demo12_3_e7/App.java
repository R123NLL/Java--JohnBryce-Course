package demo12.demo12_3_e7;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(0, 10000);
        System.out.println("Your lucky number is: " + num);
        int rightDig = 0;
        int original=num;

        while(num>0){
            rightDig=num%10;
            num=num/10;
        }

        System.out.println("The number of digits in " + original + " is:" + rightDig);
    }

}
