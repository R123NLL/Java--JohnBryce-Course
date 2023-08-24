package demo10_3.demo10_3_e1;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(0, 100);

        if (num > 50)
            System.out.println("Big");
        if (num < 50)
            System.out.println("Small");
        if (num == 50)
            System.out.println("Bingo");
    }
}
