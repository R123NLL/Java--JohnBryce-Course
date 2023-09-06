package demo14.demo14_3.demo14_3_e10;

public class App {
    public static void main(String[] args) {
        int[] arr =new int[100];
        int index=0;
        int currentEven=2;

        while(index< arr.length){
            arr[index]=currentEven;
            currentEven+=2;
            index++;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
