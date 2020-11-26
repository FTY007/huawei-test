package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HJ59 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=reader.readLine())!=null){
            String first = getFirst(input);
            System.out.println("第一个不重复的字母为："+first);
            System.out.println("其索引是："+input.indexOf(first));
        }

    }

    public static String getFirst(String str) {

    }}
