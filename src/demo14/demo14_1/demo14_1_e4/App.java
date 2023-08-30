package demo14.demo14_1.demo14_1_e4;

public class App {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,3,2,1,9,5,1,1,9};
        int count3=0;
        int count1=0;
        int count2or5=0;

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
            if (arr[i]==3){
                count3++;
            } else if (arr[i]==1) {
                count1++;
            } else if (arr[i]==2 || arr[i]==5) {
                count2or5++;
            }
        }
        System.out.println();
        System.out.println("number 3 appears "+count3+" times");
        System.out.println("number 1 appears "+count1+" times");
        System.out.println("numbers 2 or 5 appearing "+count2or5+" times");
    }
}
