package machine_test;

import java.util.Scanner;

public class GetLastWord_1 {
    public static void main(String[] args) {
        //1.输入
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //2.先判断
        if (line!=null&&line.length()<=5000){
            //3.拆分成数组
            String[] words = line.split(" ");
            String lastWord = words[words.length - 1];
            //4.输出
            System.out.println("最后一个单词长度为:"+lastWord.length());
            System.out.println("最后一个单词是:"+lastWord);
        }
    }
}
