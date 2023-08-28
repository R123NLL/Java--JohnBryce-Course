package demo12.demo12_5.demo12_5_e9;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(5, 100);
        int b = random.nextInt(5, 100);
        int a1 = 1, a2 = 1;
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int evenMax=0;

        System.out.println("start : " + start);
        System.out.println("end : " + end);

        while (a2 < start) {
            a2 = a2 + a1;
            a1 = a2 - a1;

            if (a2%2==0){
                evenMax=a2;
            }
        }
        System.out.print(a2);

        while (a2 < end) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            if (a2 <= end) {
                System.out.print("," + a2);
            }
            if (a2%2==0){
                evenMax=a2;
            }else evenMax=0;
        }
        System.out.println();
        System.out.println("The largest even number is: "+evenMax);
    }
}
