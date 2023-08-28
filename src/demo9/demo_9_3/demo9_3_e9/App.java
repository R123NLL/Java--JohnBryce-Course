package demo9.demo_9_3.demo9_3_e9;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random=new Random();
        int circleRadius= random.nextInt(3,10);
        double radiusArea=circleRadius*circleRadius;
        double circleArea=Math.PI*radiusArea;
        double circlePerimeter=Math.PI*2*circleRadius;

        System.out.println("The circle radius is :"+(int)circleRadius);
        System.out.println("The circle area is :"+(int)circleArea);
        System.out.println("The circle perimeter is :"+(int)circlePerimeter);


    }
}
