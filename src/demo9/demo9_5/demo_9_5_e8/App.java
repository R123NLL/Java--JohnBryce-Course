package demo9.demo9_5.demo_9_5_e8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This app is calculating your BMI");
        System.out.println();
        System.out.println("Please enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height in cm: ");
        int height = scanner.nextInt();
        double heightInMeters = (double) height / 100;
        scanner.close();
        double bmiResult = weight / (heightInMeters * heightInMeters);
        System.out.println("Your BMI result is: " + bmiResult);

    }//End of main method
}//End of class App
