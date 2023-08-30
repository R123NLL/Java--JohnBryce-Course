package demo12.demo12_7.demo12_7_e10;

public class App {
    public static void main(String[] args) {
        int num = 1;
        int fact = 1;

        while (num < 10) {
            if (num % 2 == 0) {
                for (int i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                System.out.println("The factorial of " + num + " is " + fact);
            }
            num++;
        }
    }
}