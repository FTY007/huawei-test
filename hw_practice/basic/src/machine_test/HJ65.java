package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class HJ65 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str= reader.readLine())!=null){
            String str2 = reader.readLine();
            System.out.println(maxSubString(str, str2));
        }
    }

    //最长公共子字符串
    public static String maxSubString(String str1,String str2){
        String shortStr;
        String longStr;
        if (str1.length()>=str2.length()){
            longStr=str1;
            shortStr=str2;
        }else{
            longStr=str2;
            shortStr=str1;  
        }
        //遍历短字符串的所有子串
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        for (int start = 0; start < shortStr.length(); start++) {
            for (int end = start+1; end <=shortStr.length() ; end++) {
                strings.add(shortStr.substring(start,end));
            }
        }
        System.out.println(strings);
        String maxStr = "";
        for (String s : strings) {
            if (longStr.contains(s)){
                if (s.length()== maxStr.length()||s.length()< maxStr.length()){//当前字符串长度相同或短就跳过
                    continue;
                }else {
                    maxStr=s;
                }
            }
        }
        return maxStr;
    }
}
