package demo14.demo14_3.demo14_3_e6;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int arr[]=new int[10];
        int sum=0;
        double avg=0;
        int count=0;

        System.out.println("Random num array");
        for (int i = 0; i < arr.length ; i++) {
            int num= random.nextInt(0,100);
            arr[i]=num;

            if(arr[i]%2!=0){
                sum=sum+arr[i];
                System.out.print(arr[i]+" ");
                count++;
            }
        }

        avg=sum/(count*1.0);
        System.out.println();
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+avg);
    }
}
