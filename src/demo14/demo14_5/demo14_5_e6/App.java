package demo14.demo14_5.demo14_5_e6;

public class App {
    public static void main(String[] args) {
        int[] arr = {1 , 2 ,  5 ,  1 ,  6 ,  1 ,  5 , 4 , 8};
        int[] res=new int[10];
        int k=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            boolean isExist=false;
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    isExist=false;
                    break;
                }
            }

            if (!isExist){
                res[k]=arr[i];
                k++;
            }
        }

        for (int i = 0; i < res.length ; i++) {
            System.out.print(res[i]+" ");

        }
        }

}
