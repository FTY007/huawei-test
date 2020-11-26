package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ46 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        while ((word=reader.readLine())!=null){
            int k = Integer.parseInt(reader.readLine());
            System.out.println( getSubString(word,k));
        }
    }

    public static String getSubString(String  str,Integer k){
        StringBuilder stringBuilder = new StringBuilder(str);
        String substring = stringBuilder.substring(0, k);
        return substring;
    }
}
