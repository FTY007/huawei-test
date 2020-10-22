package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HJ10{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=reader.readLine())!=null){
            System.out.println(getNum(input));
        }
    }

    public static Integer getNum(String input){
        HashMap<String,Integer> stringHashMap = new HashMap<String,Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)<= 127){
                String key = String.valueOf(input.charAt(i));
                int count=0;
                    if (stringHashMap.get(key)==null){
                        stringHashMap.put(key, 1);
                    }else {
                        count++;
                        stringHashMap.put(key,count);
                    }
            }
        }
        return stringHashMap.size();
    }
}