import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonSubSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1;
        while ((s1=bufferedReader.readLine())!=null){
            String s2 = bufferedReader.readLine();
            System.out.println(getCommonSubSequence(s1, s2));
        }
    }

    public static String getCommonSubSequence(String s1,String s2){
        String shortString = "";
        String longString = "";
        if (s1.length()>s2.length()){
             shortString = s2;
             longString = s1;
        }else {
            shortString = s1;
            longString = s2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < shortString.length(); i++) {
            String s = String.valueOf(shortString.charAt(i));
            if (longString.contains(s)){
                stringBuilder.append(s);
            }
        }
        return stringBuilder.toString();
    }
}
