package demo14.demo14_1.demo14_1_e10;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;
        double avg = 0.0;
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Random num array");
        System.out.println("----------------");

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(1, 100);
            arr[i] = num;
            sum = sum + arr[i];

            if (arr[i] < min) {
                min = arr[i];
                minIndex = i + 1;
            } else if (arr[i] > max) {
                max = arr[i];
                maxIndex = i + 1;
            }
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        avg = sum / (arr.length * 1.0);
        System.out.println();
        System.out.println("Max num:" + max + " it's index number is " + maxIndex);
        System.out.println("Min num:" + min + " it's index number is " + minIndex);
        System.out.println("The sum is:" + sum);
        System.out.println("The average is:" + avg);
        System.out.println("The sum of all the even numbers is:" + evenSum);
        System.out.println("The sum of all the odd numbers is:" + oddSum);

    }
}
