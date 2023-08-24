package demo9_5.demo_9_5_e10;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10,20);
        int b = random.nextInt(10,20);
        int c = random.nextInt(10,20);
        int d = random.nextInt(10,20);
        int e = random.nextInt(10,20);
        int maxNum = 0;
        String numName = "";
        System.out.println("a=" + a + ",b=" + b + ",c=" + c + ",d=" + d + ",e=" + e);
        if (a > b && a > c && a > d && a > e) {
            maxNum = a;
            numName = "a";
        } else if (b > a && b > c && b > d && b > e) {
            maxNum = b;
            numName = "b";
        } else if (c > a && c > b && c > d && c > e) {
            maxNum = c;
            numName = "c";
        } else if (d > a && d > b && d > c && d > e) {
            maxNum = d;
            numName = "d";
        } else if (e > a && e > b && e > c && e > d) {
            maxNum = e;
            numName = "e";
        }

        System.out.println("The biggest number is " + numName + ": " + maxNum);
    }
}
