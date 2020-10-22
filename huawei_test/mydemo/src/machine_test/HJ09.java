package machine_test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class HJ09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int anInt = scanner.nextInt();
            System.out.println(getReverse(anInt));
        }
    }
    //整数反转去重
    public static Integer getReverse(Integer input){
        String inputString = String.valueOf(input);
        String reverseString = "";
        for (int i = inputString.length()-1; i >=0 ; i--) {
            reverseString+=inputString.charAt(i);
        }
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < reverseString.length(); i++) {
            stringLinkedHashSet.add(String.valueOf(reverseString.charAt(i)));
        }
        String resultString = "";
        for (int i = 0; i < stringLinkedHashSet.size(); i++) {
            resultString+=stringLinkedHashSet.toArray()[i];
        }
        return Integer.parseInt(resultString);
    }
}
