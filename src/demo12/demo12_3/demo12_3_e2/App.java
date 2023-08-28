package demo12.demo12_3.demo12_3_e2;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int num= random.nextInt(1,7);
        int sum=1;

        System.out.println("Your lucky number is: "+num);

        for (int i = num; i >=1 ; i--) {
            System.out.print(i+" ");
            sum=sum*i;
        }
        System.out.println();
        System.out.println("The sum of the factorial of num is: "+sum);
    }
}
