package demo16.demo16_1;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        //e1
//        System.out.println("EX1");
//
//        printName();
//        printName();
//
//        //e2
//        System.out.println("EX2");
//
//        evenNum();
//        evenNum();
//        evenNum();
//
//        //e3
//        System.out.println("EX3");
//        f1();
//        System.out.println("____________");
//        f2();
//        System.out.println("____________");
//        f3();
//        System.out.println("____________");
//
//          //e4
//          System.out.println("EX4");
//          short a = 100;
//          short b = 80;
//          short c = 90;
//          short d = 70;
//          short e = 99;
////        System.out.println(avg(a, b, c, d, e));
////        System.out.println("Enter 5 numbers");
////        a = scanner.nextShort();
////        b = scanner.nextShort();
////        c = scanner.nextShort();
////        d = scanner.nextShort();
////        e = scanner.nextShort();
////        System.out.println(avg(a, b, c, d, e));

//
//        //e5
//        System.out.println("EX5");
//        System.out.println(randomNumInRange(10, 5));
//        System.out.println(randomNumInRange(5, 10));
//        System.out.println(randomNumInRange(2, 3));
//        System.out.println(randomNumInRange(1, 100));

//        //e6
//        System.out.println("EX6");
//        System.out.println(maxInt(3, 6, 9));
//        System.out.println("enter 3 numbers");
//        int a1 = scanner.nextInt();
//        int b1 = scanner.nextInt();
//        int c1 = scanner.nextInt();
//        System.out.println(maxInt(a1, b1, c1));
//
//        //e7
        //System.out.println("EX7");
//        System.out.println("Enter a number");
//        int a2 = scanner.nextInt();
//        System.out.println(a2 + " is " + isPrime(a2));
//        System.out.println("Enter a number");
//        int b2 = scanner.nextInt();
//        System.out.println(b2 + " is " + isPrime(b2));
//        System.out.println("Enter a number");
//        int c2 = scanner.nextInt();
//        System.out.println(c2 + " is " + isPrime(c2));


//        //e8
        //System.out.println("EX8");
//        int[] arr = new int[100];
//        for (int i = 0; i < arr.length; i++) {
//            int num = random.nextInt(-200,200);
//            arr[i] = num;
//        }
//        printArr(arr);
//        System.out.println("sum=" + sumOfArr(arr));
//        System.out.println("avg=" + avgOfArr(arr));
//        System.out.println("max=" + maxNumArr(arr));
//        System.out.println("min=" + minNumArr(arr));
//        System.out.println("max's index=" + maxIndexArr(arr));
//        System.out.println("min's index=" + minIndexArr(arr));
//        System.out.println("num of evens=" + numOfEvenInArr(arr));
//        System.out.println("num of odds=" + numOfOddInArr(arr));
//        System.out.println("does the num exist? "+numIsExist(arr,15));
//        System.out.println(" num's index="+ numIndexInArr(arr,15));

        block(10);
        System.out.println();


    }

    //e1
    public static void printName() {
        System.out.println("Denis Shatik");
    }

    //e2
    public static void evenNum() {
        int i = 2;
        while (i <= 200) {
            System.out.print(i + " ");
            i = i + 2;
        }
        System.out.println();
    }

    //e3
    public static void f3() {
        System.out.println("f3");
    }

    public static void f2() {
        System.out.println("f2");
        f3();
    }

    public static void f1() {
        System.out.println("f1");
        f2();
    }

    //e4
    public static double avg(short a, short b, short c, short d, short e) {
        short sum = (short) (a + b + c + d + e);
        double avg = sum / (5 * 1.0);

        return avg;
    }

    //e5
    public static int randomNumInRange(int min, int max) {
        Random random = new Random();

        if (min > max) {
            int tmp = 0;
            tmp = min;
            min = max;
            max = tmp;
        }

        return random.nextInt(min, max);

    }


    //e6
    public static int maxInt(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;

    }

    //e7
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //e8
    public static void printArr(int[] arr) {   //a
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int sumOfArr(int[] arr) {     //b
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static double avgOfArr(int[] arr) {   //c
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / (arr.length * 1.0);
        return avg;
    }

    public static int maxNumArr(int[] arr) {      //d
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minNumArr(int[] arr) {     //e
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxIndexArr(int[] arr) {   //f
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int minIndexArr(int[] arr) {      //g
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int numOfEvenInArr(int[] arr) {   //h
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int numOfOddInArr(int[] arr) {   //i
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean numIsExist(int[] arr, int num) { //j
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int numIndexInArr(int[] arr, int num) {  //k
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i + 1;
            }
        }
        return index;
    }


    public static void block(int side) {
        for (int i = 1; i <= side; i++) {
            if (i == 1 || i == side) {
                for (int j = 0; j < side; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            } else {
                System.out.print(" * ");
                for (int j = 1; j <side-1 ; j++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
                System.out.println();
            }

        }

    }


}







