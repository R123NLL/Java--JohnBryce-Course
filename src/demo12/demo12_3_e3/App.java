package demo12.demo12_3_e3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt(1,7);// random number betwwen 1 and 7
        int i=1; //while loop index
        int sum=1;//factorial sum
        System.out.println("Your lucky number is: "+num);

        while(i<=num){
            System.out.print(i+" ");
            sum=sum*i;
            i++;
        }
        System.out.println();
        System.out.println("factorial sum of "+num+" is:"+sum);

    }
}
