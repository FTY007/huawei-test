package machine_test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HJ21 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in)));
        String input;
        while ((input=bufferedReader.readLine())!=null){
            System.out.println(encryptKey(input));
        }
    }

    public static String encryptKey(String password){
        if (password.length()>100){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        //小写字母对应关系
        HashMap<Character[], String> stringHashMap = new HashMap<>();
        Set<Character[]> keySet = stringHashMap.keySet();
        stringHashMap.put(new Character[]{'a', 'b', 'c'}, "2");
        stringHashMap.put(new Character[]{'d', 'e', 'f'},"3");
        stringHashMap.put(new Character[]{'g', 'h', 'i'},"4");
        stringHashMap.put(new Character[]{'j', 'k', 'l'},"5");
        stringHashMap.put(new Character[]{'m', 'n', 'o'},"6");
        stringHashMap.put(new Character[]{'p', 'q', 'r','s'},"7");
        stringHashMap.put(new Character[]{'t', 'u', 'v'},"8");
        stringHashMap.put(new Character[]{'w', 'x', 'y','z'},"9");

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            //1.大写字母替换为小写并后移一位
            if ('A'<=c&&c<='Z'){
                if (c=='Z'){
                    stringBuilder.append("a");
                }else {
                    String newKey = String.valueOf((char)(c + 1)).toLowerCase();
                    stringBuilder.append(newKey);
                }
            }
            //2.小写字母替换成数字
            for (Character[] characters : keySet) {
                if (List.of(characters).contains(c)){
                    stringBuilder.append(stringHashMap.get(characters));
                }
            }
            //3.数字不变换
            if ('0'<=c&&c<='9'){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
