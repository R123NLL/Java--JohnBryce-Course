package demo14.demo14_1.demo14_1_e2;

public class App {
    public static void main(String[] args) {
        String name = "John Bryce";
        char[] nameArr = new char[name.length()];
        int count=0;
        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = name.charAt(i);
            if (Character.valueOf(nameArr[i]) == 'a' || Character.valueOf(nameArr[i]) == 'e' ||
                    Character.valueOf(nameArr[i]) == 'i' || Character.valueOf(nameArr[i]) == 'o' ||
                    Character.valueOf(nameArr[i]) == 'u'){
                count++;
            }
            System.out.print(nameArr[i]+" ");
        }
        System.out.println();
        System.out.println("The amount of aeiou characters is:"+count );
    }

}
