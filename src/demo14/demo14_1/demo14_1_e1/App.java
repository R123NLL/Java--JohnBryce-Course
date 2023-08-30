package demo14.demo14_1.demo14_1_e1;

public class App {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','a','b','d','r','c'};
        int aCount=0;
        int cCount=0;

        System.out.print("[ ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
            if (arr[i]=='a'){
                aCount++;
            }else if (arr[i]=='c'){
                cCount++;
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println("The number of times that a appears is "+aCount);
        System.out.println("The number of times that a or c  are appearing is "+(cCount+aCount));
    }
}
