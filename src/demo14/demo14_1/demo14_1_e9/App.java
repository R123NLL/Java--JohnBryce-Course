package demo14.demo14_1.demo14_1_e9;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        int sum = 0;
        double avg = 0;

        System.out.println("Random num array");
        System.out.println("----------------");

        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(10, 99);
            arr[i] = num;
            sum = sum + arr[i];
            System.out.print(arr[i] + " ");
        }
        avg = sum / (arr.length * 1.0);
        System.out.println();
        System.out.println("The sum of all those numbers is: " + sum);
        System.out.println("The average of all those numbers is: " + avg);

    }
}
