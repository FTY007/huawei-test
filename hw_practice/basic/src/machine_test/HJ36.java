package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class HJ36 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password;
        String key;
        while (true){
            key = reader.readLine();
            password = reader.readLine();
            System.out.println(encrypt(key, password));
        }
    }

    //特殊加密
    private static String encrypt(String key,String password){
        //1.对key去重
        char[] chars = key.toCharArray();
        LinkedHashSet<Character> keySet = new LinkedHashSet<Character>();//原始key
        LinkedHashSet<Character> upperKeySet = new LinkedHashSet<Character>();//大写key
        for (char c : chars) {
            keySet.add(c);//原始key去重
            upperKeySet.add(Character.toUpperCase(c));//大写key去重
        }
        //2.生成旧字母表集合
        char[] oldChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Character[] characters = new Character[oldChars.length];
        for (int i = 0; i < oldChars.length; i++) {
            characters[i]=oldChars[i];//改成包装类
        }
        List<Character> charactersList = Arrays.asList(characters);//变为大写字母数组
        //3.新字母表集合
        upperKeySet.addAll(charactersList);//此时均为大写加密字母表
        ArrayList<Character> upperKeyList = new ArrayList<>(upperKeySet);//set变为list
        for (int i = keySet.size(); i < upperKeyList.size(); i++) {
            keySet.add(upperKeyList.get(i));//原始key+补齐的大写去重字母
        }
        ArrayList<Character> keyList = new ArrayList<>(keySet);//转成list方便查询
        //4.密码加密
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {//遍历原始密码
            Character c = password.charAt(i);
            if (Character.isUpperCase(c)){//大写字母
                int index = charactersList.indexOf(c);
                resultBuilder.append(keyList.get(index));
            }else if (Character.isLowerCase(c)){//小写字母
                //先变成大写从旧字母表里查询index
                int index = charactersList.indexOf(Character.toUpperCase(c));
                //根据index从新字母表里查，转换成小写
                char lowerCase = Character.toLowerCase(keyList.get(index));
                resultBuilder.append(lowerCase);
            }else if (c.toString().equals(" ")){//为空
                resultBuilder.append(c);
            }
        }
        return resultBuilder.toString();
    }
}
