package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ33 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ip;
        while ((ip= reader.readLine())!=null){
            String numString = reader.readLine();
            System.out.println(toLong(ip));
            System.out.println(toIP(numString));
        }
    }

    public static long toLong(String ip){
        String[] strings = ip.split("\\.");
        StringBuilder builder = new StringBuilder();
        //192.168.1.1 string>int>binaryString>int
        for (String s : strings) {
            int i = Integer.parseInt(s);
            String binaryString = Integer.toBinaryString(i);
            if (binaryString.length()<8){
                String prefix="";
                for (int j = 0; j < 8 - binaryString.length(); j++) {
                    prefix=prefix+"0";
                }
                binaryString=prefix+binaryString;
            }
            builder.append(binaryString);
        }
        return Long.parseLong(builder.toString(),2);
    }

    public static String toIP(String num){
        try{
            long i = Long.parseLong(num);
            String binaryString = Long.toBinaryString(i);
            //补齐32位
            if (binaryString.length()<32){
                String prefix = "";
                for (int j = 0; j < 32-binaryString.length(); j++) {
                  prefix = prefix+"0";
                }
                binaryString=prefix+binaryString;
            }
            StringBuilder builder = new StringBuilder();
            while (binaryString.length()>=8){
                //截取前8位
                String substring = binaryString.substring(0,8);
                int parseInt = Integer.parseInt(substring, 2);
                builder.append(parseInt).append(".");
                //截取9位及以后
                binaryString = binaryString.substring(8);
            }
            //去掉最后的.
            return builder.deleteCharAt(builder.length()-1).toString();
        }catch (Exception e){
            return null;
        }
    }
}
