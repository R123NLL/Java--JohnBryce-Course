package demo14.demo14_3.demo14_3_e7;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[50];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        System.out.println("Random num array");
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(0, 100);

            arr[i] = num;
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i+1;
            } else if (arr[i] < min) {
                min = arr[i];
                minIndex = i+1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The max num is: " + max + " and it's index num is " + maxIndex);
        System.out.println("The min num is: " + min + " and it's index num is " + minIndex);
    }
}
