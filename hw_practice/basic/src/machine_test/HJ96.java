package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ96 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str= reader.readLine())!=null){
            System.out.println(addStar(str));
        }
    }
    //未完成
    public static String addStar(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            char c = str.charAt(i);

        }
        return stringBuilder.toString();
    }
}
