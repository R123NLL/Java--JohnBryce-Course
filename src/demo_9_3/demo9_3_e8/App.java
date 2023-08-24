package demo_9_3.demo9_3_e8;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        int rectangleLength = random.nextInt(0,100);
        int rectangleWidth = random.nextInt(0,100);
        int rectangleArea = rectangleLength * rectangleWidth;
        int rectanglePerimeter = (rectangleLength + rectangleWidth) * 2;

        if (rectangleLength > rectangleWidth) {
            System.out.println("Rectangle's length: " + rectangleLength);
            System.out.println("Rectangle's width: " + rectangleWidth);
            System.out.println("Rectangle's area: " + rectangleArea);
            System.out.println("Rectangle's perimeter: " + rectanglePerimeter);
        } else System.out.println("This is not a rectangle...");
    }
}