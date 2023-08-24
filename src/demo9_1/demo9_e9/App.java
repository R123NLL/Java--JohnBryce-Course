package demo9_1.demo9_e9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to quit? ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        scan.close();
        if (answer.length() == 1 && answer.contains("n") || answer.contains("y")) {
            if (answer.contains("n"))
                System.out.println("It's great you decided to stay!");
            else if (answer.contains("y"))
                System.out.println("Thank you and goodbye!");
        }
        else System.out.println("Wrong input,BYE!");

    }
}