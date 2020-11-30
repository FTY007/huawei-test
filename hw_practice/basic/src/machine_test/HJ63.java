package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ63 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str= reader.readLine())!=null){
            int i = Integer.parseInt(reader.readLine());
            System.out.println(getMaxRatio(str, i));
        }
    }

    public static String getMaxRatio(String str,Integer length){
        double maxRatio=0.0;
        String result="";
        //字符串长度小于等于给定长度时直接返回
        if (length>=str.length()){
            return str;
        }
        for (int i = 0; i < str.length()-length; i++) {
            String substring = str.substring(i, i + length);
            double ratio = getRatio(substring);
            if (ratio>maxRatio){
                maxRatio = ratio;
                result = substring;
            }
        }
        return result;
    }

    //计算G、C的比例
    public static double getRatio(String str){
        double count=0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j)=='G'||str.charAt(j)=='C'){
                count++;
            }
        }
        return count / str.length();
    }
}
