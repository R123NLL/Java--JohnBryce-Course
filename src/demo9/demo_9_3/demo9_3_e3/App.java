package demo9.demo_9_3.demo9_3_e3;

public class App {
    public static void main(String[] args) {
        double num = Math.random() * 100;

        System.out.println("The number you got is: " + (int) num);
        if ((int) num % 2 == 0)
            System.out.println("This number is even");
        else System.out.println("This number is odd");

    }
}
