package demo14.demo14_3.demo14_3_e8;

public class App {
    public static void main(String[] args) {
        int arr[]=new int[15];
        int a1=1;
        int a2=1;
        arr[0]=a1;
        arr[1]=a2;
        
        System.out.print(arr[0]+" "+arr[1]+" ");
        for (int i = 2; i < arr.length ; i++) {
            a2=a2+a1;
            a1=a2-a1;
            arr[i]=a2;
            System.out.print(arr[i]+" ");
        }
    }
}
