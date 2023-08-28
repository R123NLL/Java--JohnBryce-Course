package demo9.demo9_1.demo9_e3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 floating numbers");
        float a = scan.nextFloat(); //First number
        float b = scan.nextFloat(); //Second number
        float c = scan.nextFloat(); //Third number
        scan.close();
        float sum = a + b + c; //Sum of those 3 numbers
        float avg = sum / 3; //Average of those 3 numbers
        System.out.println("The average of those three numbers is: " + avg); //Prints the answer

    }
}
