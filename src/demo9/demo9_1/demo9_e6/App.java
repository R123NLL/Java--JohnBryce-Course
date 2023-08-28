package demo9.demo9_1.demo9_e6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name= scan.next();
        scan.close();

        if(name.startsWith("m")) {
            System.out.println("The name: " + name + " starts with lowercase m");

        }else System.out.println(name+" Does not starts with lowercase m");


    }
}