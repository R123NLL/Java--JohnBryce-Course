package demo14.demo14_1.demo14_1_e8;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        int sum = 0;
        System.out.println("Random num array");
        System.out.println("----------------");

        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(10, 99);
            arr[i] = num;
            sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of all these numbers is: "+sum);
    }
}
