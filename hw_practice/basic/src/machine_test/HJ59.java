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
        //统计每个字母出现个数
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            Integer count = hashMap.get(s);
            if (count == null){
                hashMap.put(s,1);
            }else{
                count+=1;
                hashMap.put(s,count);
            }
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        LinkedHashSet<Map.Entry<String, Integer>> linkedHashSet = new LinkedHashSet<>(entries);
        String key=null;
        boolean flag=false;
        for (Map.Entry<String, Integer> entry : linkedHashSet) {
            if (entry.getValue()==1){//存在个数只有一次的字母
                flag = true;
                key = entry.getKey();
                break;
            }
        }
        if (flag){
            return key;
        }else{
            return "-1";
        }
    }
}
