package machine_test;

import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        //1.输入一个int类型的数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //2.转换成二进制字符串
        String s = Integer.toBinaryString(num);
        //StringBuilder stringBuilder = new StringBuilder(s);
        //3.对“1”计数
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1'){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
