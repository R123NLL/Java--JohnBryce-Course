package demo14.demo14_1.demo14_1_e7;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        int min = 100;
        System.out.println("Random num array");
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(10, 99);
            arr[i] = num;

            if (arr[i] < min) {
                min = arr[i];
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The min number is: " + min);
    }
}
