package demo14.demo14_1.demo14_1_e3;

public class App {
    public static void main(String[] args) {
        String name = "Sara Shara Shir Cameach";
        char[] nameArr = new char[name.length()];
        int count = 0;

        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = name.charAt(i);
            if (nameArr[i] == 'a' || nameArr[i] == 'e' ||
                    nameArr[i] == i || nameArr[i] == 'o' || nameArr[i] == 'u'){
                count++;
            }
            System.out.print(nameArr[i]+" ");
        }
        System.out.println();
        System.out.println("The amount of aeiou characters is:"+count );

    }
}
