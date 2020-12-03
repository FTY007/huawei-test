package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ90 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str= reader.readLine())!=null){
            boolean legalIp = isLegalIp(str);
            System.out.println(legalIp);
        }

    }

    public static boolean isLegalIp(String ip){
        String[] strings = ip.split(".");
        boolean flag=true;
        for (String str : strings) {
            if (str.contains("-")){
                flag = false;
                break;
            }
            int i = Integer.valueOf(str);
            if (255<i||i<0){
                flag=false;
            }
        }
        return flag;
    }
}
