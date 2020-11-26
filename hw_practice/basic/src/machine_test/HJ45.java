package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HJ45 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int num = reader.read();
        /*for (int i = 0; i < num; i++) {*/
            String word = reader.readLine();
            System.out.println(getSsore(word));
    }

    public static Integer getSsore(String word){
            LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = Character.toLowerCase(word.charAt(i));
                String s = String.valueOf(c);
                if (hashMap.get(s)==null){
                    hashMap.put(s,1);
                }else{
                    count++;
                    hashMap.put(s,count);
                }
            }
            ArrayList<Integer> values = (ArrayList<Integer>) hashMap.values();
            Collections.sort(values);
            int startScore = 26;
            int totalScore = 0;
            for (Integer value : values) {
                totalScore+= startScore*value;
                startScore--;
            }
         return totalScore;
    }
}
