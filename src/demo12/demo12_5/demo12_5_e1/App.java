package demo12.demo12_5.demo12_5_e1;

public class App {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        for (int i = 1; i <= 30; i++) {
            System.out.print(a2 + " ");
            a1 = a2 - a1;
            a2 = a2 + a1;
        }


    }
}
