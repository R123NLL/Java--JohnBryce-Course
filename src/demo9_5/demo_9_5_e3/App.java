package demo9_5.demo_9_5_e3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int time= random.nextInt(100,350);
        int hours=time/60;
        int minutes=time%60;

        System.out.println("The random number is: "+time);
        System.out.println("and the time in hours and minutes is "+hours+":"+minutes);
    }
}
