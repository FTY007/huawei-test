package machine_test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HJ23 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in)));
        String input;
        while ((input=bufferedReader.readLine())!=null){
            System.out.println(remove(input));
        }
    }

    public static String remove(String word){
        char[] chars = word.toCharArray();
        //统计每个字母个数
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (char c : chars) {
            int count = 1;
            if (hashMap.get(c) == null) {
                hashMap.put(c, count);
            } else {
                count++;
                hashMap.put(c, count);
            }
        }
        //最小次数
        Collection<Integer> integers = hashMap.values();
        Integer minIndex = Collections.min(integers);
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            if (!hashMap.get(c).equals(minIndex)){//不是最小次数即可
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
