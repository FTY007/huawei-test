package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ55 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num;
        while ((num=reader.readLine())!=null){
            System.out.println(getSeven(num));
        }
    }

    public static Integer getSeven(String str){
        int num = Integer.parseInt(str);
        if (num>3000||num<0){
            return -1;
        }
        if (num<7){
            return 0;
        }
        int count=0;
        for (int i = 7; i <= num; i++) {
            if (i%7==0){
                count++;
            }else if (String.valueOf(i).contains("7")){
                count++;
            }
        }
        return count;
    }
}
