package demo_9_3.demo9_3_e2;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello you are about to get 3 random numbers: ");
        double a = Math.random() * 10;
        double b = Math.random() * 10;
        double c = Math.random() * 10;
        System.out.println("The first number is: " + (int)a + " the second number is "
                + (int)b + " the third number is " + (int)c);
        int sum =(int)a+(int)b+(int)c;
        int avg= sum/3;
        System.out.println("And their average is: "+avg);
    }
}
