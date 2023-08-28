package demo9.demo9_1.demo9_e5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name= scan.next();
        scan.close();

        if(name.startsWith("M")) {
            System.out.println("The name: " + name + " starts with capital M");

        }else System.out.println(name+" Does not starts with capital M");


    }
}
