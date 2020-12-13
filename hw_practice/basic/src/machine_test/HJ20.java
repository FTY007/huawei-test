package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=reader.readLine())!=null) {
            System.out.println(checkKey(line));
        }
    }

    /*密码要求:
        1.长度超过8位
        2.包括大小写字母.数字.其它符号,以上四种至少三种
        3.不能有相同长度大于2的子串重复
    **/
    public static String checkKey(String key){
        if (key==null||key.length()<=8){
            return "NG";
        }
        int lowerCase=0;
        int upperCase=0;
        int letter=0;
        int other=0;
        char[] charArray = key.toCharArray();
        for (char c : charArray) {
            if (Character.isLowerCase(c)){
                lowerCase=1;
            }else if (Character.isUpperCase(c)){
                upperCase=1;
            }else if (Character.isDigit(c)){
                letter=1;
            }else {
                other=1;
            }
        }
        if (lowerCase+upperCase+letter+other<3){
            return "NG";
        }
        for (int i = 0; i < key.length()-2; i++) {
            String s = key.substring(i, i + 3);
            String substring = key.substring(i + 1);
            if (substring.contains(s)){
                return "NG";
            }
        }
        return "OK";
    }
}
