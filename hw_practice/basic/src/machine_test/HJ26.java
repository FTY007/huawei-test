package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HJ26 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=bufferedReader.readLine())!=null){
            System.out.println(sortString(input));
        }
    }

    public static String sortString(String input) {
        //输入
        char[] chars = input.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        //收集字母
        for (char c : chars) {
            if (Character.isLetter(c)){
                characterArrayList.add(c);
            }
        }
        //对字母集合排序，不区分大小写
        characterArrayList.sort(Comparator.comparingInt(Character::toLowerCase));
        //遍历输入集合
        StringBuilder stringBuilder = new StringBuilder();
        int start = 0;//排好序的集合开头
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                stringBuilder.append(characterArrayList.get(start++));
            }else{
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
