package demo9_1.demo9_e10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        float age = scan.nextFloat();
        scan.close();
        if (age>=18)
            System.out.println("You are above 18 years old");
        else System.out.println("You are younger than 18");

    }
}
