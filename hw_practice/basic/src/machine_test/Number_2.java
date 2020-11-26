package machine_test;

import java.util.Scanner;

public class Number_2 {
    public static void main(String[] args){
        //1.输入
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String singlechar = scanner.nextLine();
        int count = 0;
        //3.循环
        for (int i = 0; i < line.length(); i++) {
            //遍历字符串为单个char,再转换成字符串格式,比较
            if (String.valueOf(line.charAt(i)).equalsIgnoreCase(singlechar)){
                count ++;
            }
        }
        //4.输出
        System.out.println(count);
    }
}
