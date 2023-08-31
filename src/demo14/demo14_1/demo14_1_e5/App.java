package demo14.demo14_1.demo14_1_e5;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int arr[]=new int[10];
        System.out.println("Random num array:");
        System.out.println("-----------------");
        for (int i = 0; i < arr.length ; i++) {
            int num= random.nextInt(10,99);
            arr[i]=num;
            System.out.print(arr[i]+" ");
        }
    }
}
