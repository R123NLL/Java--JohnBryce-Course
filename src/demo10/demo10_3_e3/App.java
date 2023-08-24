package demo10.demo10_3_e3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        double salary= random.nextInt(5000,6000);
        System.out.println("Your salary is: "+salary);

        if (salary*1.10<6000)
            salary=salary*1.10;
        else salary=salary*1.05;

        System.out.println("Your new salary after raise is: "+(int)salary);
    }
}
