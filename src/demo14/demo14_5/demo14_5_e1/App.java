package demo14.demo14_5.demo14_5_e1;

public class App {
    public static void main(String[] args) {

        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};
        int[] arr3 = new int[10];
        int k = 0;

        for (int i = 0; i < arr1.length ; i++) {
            boolean isExist=false;
                for (int j = 0; j < arr2.length ; j++) {

                    if (arr1[i]==arr2[j]){
                        isExist=true;
                        break;
                    }
                }
         if (!isExist){
             arr3[k]=arr1[i];
             k++;
         }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}