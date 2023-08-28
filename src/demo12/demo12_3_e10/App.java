package demo12.demo12_3_e10;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(0, 100000);
        int oppo = 0;
        int original = num;
        int rightDig = 0;
        int leftDig = 0;
        int numDig = num;
        int digSum = 0;
        int count = 0;
        System.out.println("Your lucky number is: " + num);

        rightDig = num % 10;     //right digit

        while (numDig > 0) {     //left digit
            leftDig = numDig % 10;
            numDig = numDig / 10;
        }

        while (num > 0) {    //opposite number
            oppo = oppo * 10 + num % 10;
            digSum = digSum + num % 10;
            num /= 10;
            count++;
        }


        System.out.println("The opposite number of " + original + " is " + oppo);
        System.out.println("The most right digit of that number is: " + rightDig);
        System.out.println("The most left digit of that number is: " + leftDig);
        System.out.println("The sum of those number is: " + digSum);
        System.out.println("The number of digits in that number is: " + count);

        if (oppo == original) //checks if it's palindrome
            System.out.println("Yes this is a palindrome");
        else System.out.println("No this is not a palindrome");


    }


}



