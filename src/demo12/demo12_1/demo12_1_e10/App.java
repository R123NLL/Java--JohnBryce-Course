package demo12.demo12_1.demo12_1_e10;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int max= random.nextInt(100);
        int den= random.nextInt(100);

        if (den>max){
            int tmp=0;
            tmp=max;
            max=den;
            den=tmp;
        }
        System.out.println("max="+max+",den="+den);
        for (int i = 1; i <=max ; i++) {

            if (i%den==0)
                System.out.print(i+" ");

        }
    }
}
