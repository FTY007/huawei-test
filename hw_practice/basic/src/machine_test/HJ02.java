package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str= reader.readLine())!=null){
            String letter = reader.readLine();
            System.out.println(getCount(str,letter));
        }
    }

    public static Integer getCount(String str,String letter){
        Integer count=0;
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (letter.equalsIgnoreCase(s)){
                count++;
            }
        }
        return count;
    }
}
