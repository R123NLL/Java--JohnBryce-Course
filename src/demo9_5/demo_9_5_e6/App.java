package demo9_5.demo_9_5_e6;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter a player's name: ");
        String playerName = scan.next();
        System.out.println("Please enter the name of the team: ");
        String teamName = scan.next();
        System.out.println("Please enter the player's age: ");
        double playerAge = scan.nextDouble();
        scan.close();
        int goalScore = random.nextInt(150, 1000);

        if (goalScore > 600) {
            System.out.println("WOW!");
        }

        System.out.println("Player name: " + playerName);
        System.out.println("Team name: " + teamName);
        System.out.println("Player age: " + playerAge);
        System.out.println("Number of goals: " + goalScore);


    }
}
