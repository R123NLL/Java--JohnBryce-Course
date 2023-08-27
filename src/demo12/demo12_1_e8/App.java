package demo12.demo12_1_e8;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int num= random.nextInt(50,100);
        System.out.println("Your lucky number is: "+num);

        for (int i = 1; i <=num ; i++) {
            System.out.print(i+" ");
            
        }
    }
}
