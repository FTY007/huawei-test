package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ34 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=bufferedReader.readLine())!=null){
            char[] chars = input.toCharArray();
            Arrays.sort(chars);
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : chars) {
                String s = String.valueOf(c);
                stringBuilder.append(s);
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
