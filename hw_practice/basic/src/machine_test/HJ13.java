package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=reader.readLine())!=null) {
            System.out.println(getReverse(line));
        }
    }

    public static String getReverse(String line) {
        String[] strings = line.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            String s = strings[i];
            builder.append(s).append(" ");
        }
        return builder.toString().trim();
    }
}
