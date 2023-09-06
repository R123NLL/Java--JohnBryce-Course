package demo14.demo14_3.demo14_3_e1;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int arr[]=new int[10];
        System.out.println("Random num array");
        for (int i = 0; i < arr.length ; i++) {
            int num= random.nextInt(0,100);
            arr[i]=num;
            System.out.println(arr[i]);
        }
    }
}
