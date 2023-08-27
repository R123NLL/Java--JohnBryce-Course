package demo12.demo12_1_e9;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(50, 100);
        int b = random.nextInt(50, 100);

        if (a > b) { //Swap method
            int tmp = 0;
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println("Your lucky numbers are, a: " + a + " and b: " + b);

        for (int i = a; i <=b; i++) {

            System.out.print(i+" ");

        }
    }
}
