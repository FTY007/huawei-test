package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HJ99 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str= reader.readLine())!=null){
            int i = Integer.parseInt(str);
            Integer count = getCount(i);
            System.out.println(count);
        }
    }

    public static Integer getCount(Integer n){
        int count=0;
        for (int i = 0; i <=n; i++) {
            int square = i*i;
            String str = String.valueOf(square);
            String s = String.valueOf(i);
            String substring = str.substring(str.length()-s.length());
            if (s.equals(substring)){
                count++;
                System.out.println(s);
            }
        }
        return count;
    }
}
