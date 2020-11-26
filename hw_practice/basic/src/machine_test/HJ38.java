package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ38 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String hight;
        String times;
        while ((hight=reader.readLine())!=null&&(times=reader.readLine())!=null){
            System.out.println(calculate(hight, times)[0]);
            System.out.println(calculate(hight, times)[1]);
        }
    }
    public static Double[] calculate(String strHight,String strTimes){
        double hight = Double.parseDouble(strHight);
        int times = Integer.parseInt(strTimes);
        double lastHight = hight*Math.pow(0.5, times);
        double lengh=0.0;
        while (times>0){
            lengh = lengh + hight + hight/2;
            hight= hight/2;
            times--;
        }
        lengh = lengh - lastHight;
        return new Double[]{lengh,lastHight};
    }
}
