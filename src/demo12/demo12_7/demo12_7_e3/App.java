package demo12.demo12_7.demo12_7_e3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, to exit enter 0");
        int num = scanner.nextInt();
        long factorial=1;

        while(num!=0){
            factorial=1;
            for (int i = 1; i <=num ; i++) {
                factorial=factorial*i;
            }
            System.out.println("The factorial of "+num+" is "+factorial);
            System.out.println("Enter another number");
            num = scanner.nextInt();
        }

    }
}
