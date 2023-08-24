package demo10.demo10_3_e2;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(0, 100);

        if (num > 50)
            System.out.println("Big");
        else if (num < 50) {
            System.out.println("Small");
        } else System.out.println("Bingo");
    }
}
