package demo14.demo14_3.demo14_3_e9;

public class App {
    public static void main(String[] args) {
        int arr[] = new int[15];
        int a1 = 1;
        int a2 = 1;
        arr[0] = a1;
        arr[1] = a2;
        int evenSum = 0;
        int oddSum = 2;

        System.out.print(arr[0] + " " + arr[1] + " ");
        for (int i = 2; i < arr.length; i++) {
            a2 = a2 + a1;
            a1 = a2 - a1;
            arr[i] = a2;
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int maxSum = 0;
        if (evenSum > oddSum) {
            maxSum = evenSum;
        } else {
            maxSum = oddSum;
        }
        System.out.println("The sum of the evens:"+evenSum);
        System.out.println("The sum of the odds:"+oddSum);
        System.out.println("The biggest sum is:"+maxSum);

    }

}
