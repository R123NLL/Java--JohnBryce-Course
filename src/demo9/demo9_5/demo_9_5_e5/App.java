package demo_9_5_e5;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int a= random.nextInt(200,750);
        int b= random.nextInt(200,750);
        int c= random.nextInt(200,750);

        System.out.println("The three numbers are a: "+a+",b: "+b);
    }
}
