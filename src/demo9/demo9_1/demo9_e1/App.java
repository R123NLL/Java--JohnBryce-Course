package demo9.demo9_1.demo9_e1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next(); //Enter you first name
        System.out.println("Enter your last name");
        String lastName = scan.next(); //Enter your last name
        System.out.println("What city do you live in?");
        String cityName = scan.next(); //Enter the city you live in
        System.out.println("Enter your age");
        double yourAge = scan.nextDouble(); //Enter your age
        scan.close();

        System.out.printf("My name is %s %s, I'm %.1f years old and I live in %s city%n", firstName, lastName, yourAge, cityName); //Prints out a statement of your name age and city


    }
}
