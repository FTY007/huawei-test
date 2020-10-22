package machine_test;

import java.util.Scanner;

public class HJ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(reverseString(inputString));
    }

    public static String reverseString(String str){
        if (str.length()<1000){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                stringBuilder.append(str.charAt(i));
            }
            return stringBuilder.reverse().toString();
        }
        return null;
    }
}
