package demo10.demo10_3_e5;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int salary = random.nextInt(0, 120_000);
        double tax = 0;
        String taxRate = null;

        if (0 <= salary && salary <= 23000) {
            tax = salary * 0.1;
            taxRate="10%";
        } else if (23000 < salary && salary <= 50000) {
            tax = salary * 0.2;
            taxRate="20%";
        } else if (50000 < salary && salary <= 100_000) {
            tax = salary * 0.3;
            taxRate="30%";
        } else if (100_000<salary) {
            tax=salary*0.4;
            taxRate="40%";
        }
        System.out.println("Your bruto salary is: "+salary+" shekels");
        System.out.println("Your tax rate is: "+taxRate+" out of "+salary+" so it's "+tax);
        System.out.println("Yout net is: "+(salary-tax));

    }
}
