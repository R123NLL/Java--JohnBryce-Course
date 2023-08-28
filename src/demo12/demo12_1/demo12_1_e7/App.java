package demo12.demo12_1.demo12_1_e7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scanner.nextInt();
        scanner.close();
        System.out.println("Here is all the even numbers inside that number's range");
        for (int i = 0; i <=num ; i++) {
            if (i%2==0)
                System.out.print(i+" ");
        }
    }
}
