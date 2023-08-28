package demo9.demo_9_3.demo9_3_e7;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println("Your number is: " + randomNum);
        if (randomNum > 50) {
            System.out.println("The number is grater than 50");
        } else System.out.println("The number is lesser than 50");
    }
}
