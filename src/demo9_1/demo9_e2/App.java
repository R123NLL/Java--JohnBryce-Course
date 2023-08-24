package demo9_1.demo9_e2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = scan.nextInt(); //First number
        int b = scan.nextInt(); //Second number
        int c = scan.nextInt(); //Third number
        scan.close();
        int sum = a + b + c; //Sum of those 3 numbers
        System.out.println("The sum of those 3 numbers is " + sum); //Prints the answer
    }
}
