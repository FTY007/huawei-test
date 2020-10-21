import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ106 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        while ((inputString=bufferedReader.readLine())!=null){
            System.out.println(reverseString(inputString));
        }
    }

    private static String reverseString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        String reverseString = stringBuilder.reverse().toString();
        return reverseString;
    }

}
