package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null) {
            if ("".equals(str)) {
                System.out.println(str);
            } else {
                divideStr(str);
            }
        }
    }

    public static void divideStr(String str) {
        //长度大于等于八
        while (str.length() > 8) {
            System.out.println(str.substring(0, 8));//前八位
            str = str.substring(8);
        }
        //长度等于八
        if (str.length() == 8) {
            System.out.println(str);
        }
        if (str.length() < 8) {
            //长度小于八
            String zero = "";
            for (int i = 0; i < 8 - str.length(); i++) {
                zero += "0";
            }
            str = str + zero;
            System.out.println(str);
        }
    }
}
