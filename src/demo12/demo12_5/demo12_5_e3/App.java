package demo12.demo12_5.demo12_5_e3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int num= random.nextInt(10,40);
        int a1=1,a2=1;

        System.out.println("Your lucky number is: "+num);
        for (int i = 2; i <= num; i++) {
            a1 = a2 - a1;
            a2 = a2 + a1;
        }
        System.out.println("The index number of your lucky number is fibo's sequence is: "+a2);
    }

}
