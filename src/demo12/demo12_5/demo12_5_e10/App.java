package demo12.demo12_5.demo12_5_e10;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100, 200);
        System.out.println("num="+num);

        for (int i = 1; i <= num; i++) {
            int dig=i;
            dig=dig/10;
            if (i % 7 == 0 || dig % 10 == 7 || i%10==7 ) {
                System.out.print("BOOM! ");
            } else System.out.print(i+" ");

        }
    }
}