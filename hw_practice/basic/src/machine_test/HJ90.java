package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ90 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null) {
            boolean legalIp = isLegalIp(str);
            if (legalIp) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isLegalIp(String ip){
        String[] strings = ip.split("\\.");
        if (strings.length!=4){
            return false;
        }

        boolean flag=true;
        for (String str : strings) {
            if (str.contains("-")){
                flag = false;
                break;
            }
            int i = Integer.parseInt(str);
            if (255<i||i<0){
                flag=false;
            }
        }
        return flag;
    }
}
