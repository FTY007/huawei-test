package machine_test;

import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = reverseIntToString(num);
        System.out.println(s);

    }

    public static String reverseIntToString(Integer num){
        if (num < 0){
            return "请输入大于等于0的数";
        }
        String s = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.reverse().toString();
    }
}
